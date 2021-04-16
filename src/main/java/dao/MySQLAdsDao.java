package dao;

import com.mysql.cj.jdbc.Driver;
import models.Ad;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
  private Connection connection = null;

  public MySQLAdsDao(Config config) {
    try {
      DriverManager.registerDriver(new Driver());
      connection = DriverManager.getConnection(
        config.getUrl(),
        config.getUser(),
        config.getPassword()
      );
    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }

  }

  @Override
  public List<Ad> all() {
    Statement statement = null;
    try {
      statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("SELECT * FROM ads");
      return createAdsFromResults(resultSet);
    } catch (SQLException e) {
      throw new RuntimeException("Error connecting to the database" , e);
    }

  }

  @Override
  public Long insert(Ad ad) {
    try {
      Statement statement = connection.createStatement();
      statement.executeUpdate(createInsertQuery(ad), Statement.RETURN_GENERATED_KEYS);
      ResultSet resultSet = statement.getGeneratedKeys();
      resultSet.next();
      return resultSet.getLong(1);
    } catch (SQLException throwables) {
      throw new RuntimeException("Error retrieving all ads", throwables);
    }
  }

  private String createInsertQuery(Ad ad) {
    return "INSERT INTO ads(user_id, title, description) VALUES "
      + "(" + ad.getUserId() + ","
      + ad.getTitle() + ","
      + ad.getDescription() + ")";
  }

  private Ad extractAd(ResultSet resultSet) throws SQLException {
    return new Ad(
      resultSet.getLong("id"),
      resultSet.getLong("user_id"),
      resultSet.getString("title"),
      resultSet.getString("description")
    );
  }

  private List<Ad> createAdsFromResults(ResultSet resultSet) throws SQLException {
    List<Ad> ads = new ArrayList<>();
    while (resultSet.next()) {
      ads.add(extractAd(resultSet));
    }
    return ads;
  }
}
