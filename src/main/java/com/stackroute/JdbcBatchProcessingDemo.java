package com.stackroute;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcBatchProcessingDemo {
    public void batchProcess() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "test");
            connection.setAutoCommit(false);
            Statement statement = connection.createStatement();
            statement.addBatch("insert into user values('kumar',28,'m')");
            statement.addBatch("insert into user values('shankar',29,'m')");
            statement.executeBatch();
            connection.commit();
            connection.close();
        } catch (SQLException E) {
            E.printStackTrace();
        }
    }
}
