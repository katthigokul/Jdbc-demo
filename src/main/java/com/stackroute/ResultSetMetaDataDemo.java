package com.stackroute;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public void resultMetaData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "test");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user");
            ResultSetMetaData resultSetMetaData=resultSet.getMetaData();
            System.out.println(resultSetMetaData.getTableName(1));
            System.out.println(resultSetMetaData.getColumnCount());
        } catch (
                SQLException E) {
            E.printStackTrace();
        }
    }

}
