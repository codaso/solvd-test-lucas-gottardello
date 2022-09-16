package com.lucas.solvd.testingSqlWithJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Connexion {
    private static String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static String DB_URL = "jdbc:mysql://localhost:3306/olympic_games_db_";
    //credenciales
    private static String USER = "root";
    private static String PASSWORD = "CODO4450!!";

    public static void main(String[] args) throws SQLException {


        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            PreparedStatement st = connection.prepareStatement("INSERT INTO Countries (name) VALUES (HOLA)");
            st.executeUpdate();
            st.close();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                if (!connection.isClosed()) {
                    connection.close();
                }
            }
        }
    }

}
