package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
    public static Connection connectionDb() {
        Connection conn = null;
        try {
            String strClassName = "com.mysql.cj.jdbc.Driver";
            String dbName = "tp_java";
            String login = "root";
            String motdepasse = "";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName;
            Class.forName(strClassName);
            conn = DriverManager.getConnection(strUrl, login, motdepasse);
            return conn;
        } catch (ClassNotFoundException e) {
            System.err.println("Driver non chargé !");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
