
package com.mycompany.guifruitatwork;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class basket {

    private String id;
    private String customers_id;
    private int weight;
    private int number;
    private String model; // Busi, Basic, Duo, ...
    private List<Map<String, Float>> fruit_values = new ArrayList<>();  //to identify which fruit combination

    public basket(){
        System.out.println("virtual basket is ready");
    }
    public basket(String customers_id, int weight,String model, int number) {
        this.id = Id_Generator.generator(10);
        this.customers_id = customers_id;
        this.weight = weight;
        this.model = model;
        this.number = number;
    }
    public int addtoDB(String date) throws SQLException {
        DB db = new DB();
        String make_table = "CREATE TABLE IF NOT EXISTS baskets(id VARCHAR(10) primary key," +
                            " customers_id VARCHAR(12)," +
                            " weight INT," +
                            " number INT," +
                            "model VARCHAR(10));";
        db.update(make_table);
        String query = "INSERT INTO baskets (id, customers_id, weight, number, model) VALUE ('" + id +
                        "','" + customers_id + "','"+ weight + "','" + number +"','" + model + "');";
        System.out.println(query);
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully added");
        }
        order ord = new order();
        if (ord.add_basket_to_order(customers_id, id, date)==1){
            return 1;
        }
        else{
            return 0;
        }
    }

    /**
     * remove a basket from db
     */
    public void remove(String customers_id) throws SQLException {
        DB db = new DB();
        String query = "DELETE FROM baskets WHERE customers_id='" + customers_id + "';";
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully removed");
        }
    }

    /** search a basket in DB */
    public void search(String customers_id) throws SQLException {
        DB db = new DB();
        String query = "SELECT * FROM baskets WHERE customers_id='" + customers_id + "';";
        Statement stmt = db.make_connection();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("ID = " + rs.getString("id"));
            System.out.println("Customers Id = " + rs.getString("customers_id"));
            System.out.println("Weight = " + rs.getString("weight"));
            System.out.println("Number = " + rs.getString("number"));
            System.out.println("Model = " + rs.getString("model"));
        }
    }
//
    /**
     * if a basket need to modify
     */
    public void modify(String customers_id, int new_weight, int new_number, String new_model) throws SQLException {
        DB db = new DB();
        String id = null;
        String query = "SELECT * FROM baskets WHERE customers_id='" + customers_id + "';";
        Statement stmt = db.make_connection();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()){
            id = rs.getString("id");
        }
        if (id == null){
            System.out.println("basket not found");
        }
        else {
            query = "UPDATE baskets " +
                    "SET weight='" + new_weight + "'" +
                    ", number='" + new_number + "'" + ", model='" + new_model +
                    "' WHERE " +
                    "id = '" + id + "';";
            if (db.update(query) == 1) {
                System.out.println("basket is successfully modified");
            }
        }
    }
    public static void main(String[] args) throws SQLException {
        basket nn = new basket("5f7e1923-23cf-4bb7-bda5-c3388ceb3280",8,"duo", 3);
        nn.modify("5f7e1923-23cf-4bb7-bda5-c3388ceb3280",5,2,"basic");

    }    
}






