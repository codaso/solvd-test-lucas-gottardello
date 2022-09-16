package com.lucas.solvd.testingSqlWithJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class test {
    public static void main(String[] args) throws SQLException {
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost:3306/olympic_games_db_2";

        //credentials
        final String USER = "root";
        final String PASS = "CODO4450!!";

        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            PreparedStatement st = connection.prepareStatement("INSERT INTO Sports (name) VALUES ('Hockey')");
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            e.getMessage();
        } finally {
            if (connection != null) {
                if (!connection.isClosed()) {
                    connection.close();
                }
            }
        }
    }
}
