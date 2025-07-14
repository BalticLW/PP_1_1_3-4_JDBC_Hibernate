package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/sys";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "0102030911Sa";
    private static Connection connection;
    private static void initializeConnection() {
        //Statement statement;
        //ResultSet resultSet;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            //statement = connection.createStatement();
            //resultSet = statement.executeQuery("select * from users");
            //while (resultSet.next()) {}
            if (!connection.isClosed()) {
                System.out.println("connected");
            }
        } catch (SQLException e) {
            System.err.println(e + "no connetion");
        }
    }
    public static Connection getConnection() {
        if (connection == null) {
            initializeConnection();
        }
        return connection;
    }
}
