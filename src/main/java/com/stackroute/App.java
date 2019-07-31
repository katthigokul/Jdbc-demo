package com.stackroute;
/*
*JDBC conncection Tasks
 */
public class App {
    public static void main(String[] args) {

        JdbcBasicDemo jdbc = new JdbcBasicDemo();
        jdbc.displayUser();

        //GetUserByName
        jdbc.getUserByName("gokul");

        //DatabaseMetaData

        DatabaseMetaDataDemo databaseMetaDataDemo = new DatabaseMetaDataDemo();
        databaseMetaDataDemo.dBMetaData();

        //ResultSet

        ResultSetMetaDataDemo resultSetMetaDataDemo = new ResultSetMetaDataDemo();
        resultSetMetaDataDemo.resultMetaData();

        //RowSet

        RowSetDemo rowSetDemo = new RowSetDemo();
        rowSetDemo.getData();

        //JDBC Batch processing

        JdbcBatchProcessingDemo jdbcBatchProcessingDemo = new JdbcBatchProcessingDemo();
        jdbcBatchProcessingDemo.batchProcess();

        //JDBC Transaction

        JdbcTransactionDemo jdbcTransactionDemo = new JdbcTransactionDemo();
        jdbcTransactionDemo.jdbcTransaction();
    }
}
