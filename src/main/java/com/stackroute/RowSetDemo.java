package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class RowSetDemo {
    public void getData() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:mysql://localhost:3306/user");
            rowSet.setUsername("root");
            rowSet.setPassword("test");
            rowSet.setCommand("select * from user");
            rowSet.execute();
            while (rowSet.next()) {
                System.out.println(rowSet.getString(1));
                System.out.println(rowSet.getString(2));
                System.out.println(rowSet.getString(3));
                System.out.println("");
            }
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }
}
