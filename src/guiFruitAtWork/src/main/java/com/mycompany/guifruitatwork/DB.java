
package com.mycompany.guifruitatwork;

/**
 *
 * @author Mhsaf
 */
import java.sql.*;  // Using 'Connection', 'Statement' and 'ResultSet' classes in java.sql package

public class DB {
     private final String DB_URL;
    /** Database credentials */
    
    private final String USER;
    private final String PASS;

    public DB() {
        this.PASS = "123231312";
        this.USER = "ars";
        this.DB_URL = "jdbc:mysql://localhost/FruitAtWork?serverTimezone=UTC";
    }

    public Statement make_connection(){
        Connection conn;
         conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            System.out.println("Creating statement...");
            stmt = conn.createStatement();
        }catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return stmt;
    }
    public void close_connection(Statement stmt) throws SQLException {
        System.out.println("Closing the Connection to DB ....");
        try {
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public ResultSet execute (String query) throws SQLException {
        Statement stmt = make_connection();
        try {
            ResultSet rs =stmt.executeQuery(query);
            return rs;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    public int update (String query) throws SQLException {
        Statement stmt = make_connection();
        try {
            System.out.println("trying to update the DB");
            stmt.executeUpdate(query);
            System.out.println("finishing the Update process");
            return 1;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        close_connection(stmt);
        return 0;
    }
}

