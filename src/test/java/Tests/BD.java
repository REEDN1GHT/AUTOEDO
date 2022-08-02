package Tests;

import java.sql.*;

public class BD {
    Connection connection;
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        try {


            String dbURL = "jdbc:sqlserver://172.31.2.101:1433;database=budget22";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(dbURL, "Autotest", "Autotest111");

        }
        catch (Exception ex){
            System.out.println("Подключиться к базе данных не удалось");
         System.out.println(ex);
         System.exit(-1);
    }
        return connection;
    }



    public void closeConnect() throws SQLException {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }
}
