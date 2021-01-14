package com.mycompany.guifruitatwork;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 *
 * @author Mhsaf
 */
public class customer {
    private String id;
    private String name;
    private String address;
    private String tel;

    public customer() {   // make a virtual Customers for functions like Search and remove
        System.out.println("virtual customer is ready");
    }

    public customer(String name, String address, String tel) {
        this.address = address;
        this.tel = tel;
        this.name = name;
        this.id = Id_Generator.generator(12);
    }

    /**
     * add a Customer into the db
     *
     * @return 0 if OK else -1
     * @throws java.sql.SQLException
     */
    public void addtoDB() throws SQLException {
        DB db = new DB();
        String make_table = "CREATE TABLE IF NOT EXISTS customers(id VARCHAR(12) primary key," +
                            " name VARCHAR(50)," +
                            " address VARCHAR(75)," +
                            " tel VARCHAR(20));";
        db.update(make_table);
        String query = "INSERT INTO customers (id, name, address, tel) VALUE ('" + id + "','" + name + "','" + address + "'," + tel + ")";
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully added");
        }


    }

    /**
     * remove a Customer from db
     * @param name
     */
    public void remove(String name) throws SQLException {
        DB db = new DB();
        String query = "DELETE FROM customers WHERE name='" + name + "';";
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully removed");
        }
    }

    public String[] search(String name) throws SQLException {
        String[] data = new String[4];
        DB db = new DB();
        String query = "SELECT * FROM customers WHERE name='" + name + "';";
        try (Statement stmt = db.make_connection()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                data[0] = rs.getString("id");
                data[1] = rs.getString("name");
                data[2] = rs.getString("address");
                data[3] = rs.getString("tel");
                return data;
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
    public String search_id (String name){
        DB db = new DB();
        String query = "SELECT * FROM customers WHERE name='" + name + "';";
        try (Statement stmt = db.make_connection()) {
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()){
                return rs.getString("id");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    /**
     * if a Customer need to modify
     */
    public int modify(String id, String new_name, String new_address, String new_tel) throws SQLException {
        DB db = new DB();
        Statement stmt = db.make_connection();
        String query = "UPDATE customers " +
                "SET name='" + new_name + "'" +
                ", address='" + new_address + "'" + ", tel='" + new_tel +
                "' WHERE " +
                "id = '" + id + "';";
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully modified");
            return 1;
        }
        return 0;
    }
    
    public static void main(String[] args) throws SQLException {
        customer mahbod = new customer();
        System.out.println(mahbod.search_id("allen"));
                }
}













