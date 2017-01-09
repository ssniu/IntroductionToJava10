import java.sql.*;

public class TestDatabaseMetaData{
  public static void main(String[] args)
  throws SQLException, ClassNotFoundException{
    //Load the JDBC driver
    Class.forName("com.mysql.jdbc.Driver");
    System.out.println("Driver loaded");

    //Connect to a database
    Connection connection = DriverManage.getConnection(
    "jdbc:mysql://localhost/javabook", "scott", "tiger"
    );
    System.out.println("Database connected");

    DatabaseMetaData dbMetaData = connection.getMetaData();
    System.out.println("database URL: " + dbMetaData.getURL());
    System.out.println("database username:" + dbMetaData.getUserName());
    System.out.println("database product name: " + dbMetaData.getDatabaseProductName());
    System.out.println("database product name: " + dbMetaData.getDatabaseProductVersion());
    System.out.println("database product name: " + dbMetaData.getDriverName());
    System.out.println("database product name: " + dbMetaData.getDriverVersion());
    System.out.println("database product name: " + dbMetaData.getDriverMajorVersion());
    System.out.println("database product name: " + dbMetaData.getDriverMinorVersion());
    System.out.println("database product name: " + dbMetaData.getMaxConnections());
    System.out.println("database product name: " + dbMetaData.getMaxTableNameLength());
    System.out.println("database product name: " + dbMetaData.getMaxColumnsInTable());

    connection.close();
  }
}
