package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;
import com.mysql.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{
  private Connection connection;

  public MySQLUsersDao(Config config) {
    try {
      DriverManager.registerDriver(new Driver());
      connection = DriverManager.getConnection(
        config.getUrl(),
        config.getUser(),
        config.getPassword()
      );
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public User findByUsername(String username) {
    String findQuery = "SELECT * FROM users WHERE username = ?";
    try {
      PreparedStatement stmt = connection.prepareStatement(findQuery);
      stmt.setString(1,username);
      return extractUser(stmt.executeQuery());
    } catch (SQLException e) {
      throw new RuntimeException("Error finding user by username");
    }
  }

  @Override
  public Long insert(User user) {
    String insertQuery = "INSERT INTO users(username, email, password) VALUES(?,?,?)";
    PreparedStatement stmt = null;
    try {
      stmt = connection.prepareStatement(insertQuery);
      stmt.setString(1, user.getUsername());
      stmt.setString(2, user.getEmail());
      stmt.setString(3, user.getPassword());
      stmt.executeUpdate();
      ResultSet rs = stmt.getGeneratedKeys();
      rs.next();
      return rs.getLong(1);
    } catch (SQLException e) {
      throw new RuntimeException("Error creating User");
    }
  }

  private User extractUser(ResultSet rs) throws SQLException {
    if (!rs.next()){
      return null;
    }
    return new User(
      rs.getLong("id"),
      rs.getString("username"),
      rs.getString("email"),
      rs.getString("password")
    );

  }
}
