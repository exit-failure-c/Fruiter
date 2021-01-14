
package com.mycompany.guifruitatwork;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Mhsaf
 */
public class order {
   
    private  String id;
    private String customer_id;
    private String basket_id;
    private  String date;
    private String einmalig;
    private  String periode;

    public order(String customer_id, String basket_id, String date, String einmal, String periode) {
        this.id = Id_Generator.generator(10);
        this.customer_id = customer_id;
        this.date = date;
        this.einmalig = einmal;
        this.periode = periode;
        this.basket_id = basket_id;
    }
    public order(){
        System.out.println("virtual basket is ready");
    }
    public int add_basket_to_order (String customer_id, String basket_id, String date) throws SQLException{
        String query = "SELECT * FROM orders where customer_id = '" + customer_id +"' and date = '"+ date +"';"; 
        DB db = new DB();
        var stm = db.make_connection();
        ResultSet rs = stm.executeQuery(query);
        String test = "";
        while (rs.next()){
            test = rs.getString("customer_id");
        }
        db.close_connection(stm);
        if (test != ""){
            this.basket_id = basket_id;
            query = "UPDATE orders " +
                    "SET basket_id='" + 
                    basket_id + "' WHERE customer_id = '" +
                    customer_id + "' AND date = '" +
                    date + "';";
            if (db.update(query) == 1) {
                System.out.println("order is successfully updated");
            }
            return 1;
        }
        return 0;
    }
    public void addToDB () throws SQLException {
        DB db = new DB();
        String make_table = "CREATE TABLE IF NOT EXISTS orders(" +
                "id VARCHAR(10) primary key," +
                " customer_id VARCHAR(12)," +
                " date VARCHAR(12),"+
                " einmalig VARCHAR(5)," +
                " periode VARCHAR(28)," +
                " basket_id VARCHAR(10));";
        db.update(make_table);
        String query = "INSERT INTO orders (id, customer_id, date, einmalig, periode, basket_id) VALUE ('" +
                this.id + "','" +
                this.customer_id + "','" +
                this.date + "','" + 
                this.einmalig + "','" + 
                this.periode + "','" + 
                this.basket_id + "');";

        if (db.update(query) == 1) {
            System.out.println("order is successfully added");
        }
    }
    public String[] search (String customer_id, String date) throws SQLException{
        DB db = new DB();
        String [] result = new String[6];
        String query = "SELECT * FROM orders";
        try (java.sql.Statement stm = db.make_connection()) {
            var rs = stm.executeQuery(query);
            while (rs.next()){
                result[0] = rs.getString("id");
                result[1] = rs.getString("customer_id");
                result[2] = rs.getString("date");
                result[3] = rs.getString("einmalig");
                result[4] = rs.getString("periode");
                result[5] = rs.getString("basket_id");   
            }
            stm.close();
        }
        return result;
    }

    public static void main(String[] args) throws SQLException {
        order new_order = new order("c3388ceb3280","c3388ceb33","02/03/11","j","Mo,Di,Mi");
        new_order.addToDB();
    } 
}


















































