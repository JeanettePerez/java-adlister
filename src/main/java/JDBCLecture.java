    import java.sql.*;

    import com.mysql.cj.jdbc.Driver;
public class JDBCLecture {
  public static void main(String[] args) {
// ...
    try {
      DriverManager.registerDriver(new Driver());
    Connection connection = DriverManager.getConnection(
      "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
      "jeanette",
      "codeup"
    );
      Statement statement = connection.createStatement();
      ResultSet rs = statement.executeQuery("SELECT * FROM albums");
      while (rs.next()) {
        System.out.println("rs.getLong(id) " + rs.getLong("id"));
        System.out.println(rs.getString(2));
      }


    } catch (SQLException throwables) {
      throwables.printStackTrace();
    }
  }
}
