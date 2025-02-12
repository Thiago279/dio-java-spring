package br.com.dio.persistence.migration;

import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.SQLException;


import static br.com.dio.persistence.config.ConnectionConfig.getConnection;

public class MigrationStrategy {

    public MigrationStrategy(Connection connection) {
        this.connection = connection;
    }
    public final Connection connection;

    public MigrationStrategy() throws SQLException {
        this.connection = getConnection();
    }

    public void executeMigration() {
        var originalOut = System.out;
        var originalErr = System.err;

        try (var fos = new FileOutputStream("liquibase.log");
             var printStream = new PrintStream(fos)) {

            System.setOut(printStream);
            System.setErr(printStream);

            try (Connection connection = getConnection()) {
                var jdbcConnection = new JdbcConnection(connection);
                var liquibase = new Liquibase(
                        "db/changelog/db.changelog-master.yml",
                        new ClassLoaderResourceAccessor(),
                        jdbcConnection
                );

                liquibase.update();
            } catch (SQLException | LiquibaseException e) {
                e.printStackTrace();
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Restaura saída padrão
            System.setOut(originalOut);
            System.setErr(originalErr);
        }
    }
}