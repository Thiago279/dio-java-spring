package br.com.dio.persistence.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class ConnectionConfig {

    public static Connection getConnection() throws SQLException{
        var connection = DriverManager.getConnection("jdbc:mysql://localhost/Board", "root", "Tsct2@@2");
        connection.setAutoCommit(false);
        return connection;
    }

}
