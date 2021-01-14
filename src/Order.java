/**
 * this class represent a order with date of order. every order belongs to a customer
 */

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;


public class Order {

    private String id;
    private String customer_id;
    private String basket_id;
    private String date;

    public Order(String customer_id) {
        this.id = UUID.randomUUID().toString();
        this.customer_id = customer_id;
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        this.date = LocalDateTime.now().format(myFormatObj);
    }
    public void add_basket_to_order (String basket_id){
        this.basket_id = basket_id;
        System.out.println("Basket is successfully to Customer added");
        System.out.println("id= "+id+" Customer ID= "+customer_id+" Date= "+date+" Basket ID= "+basket_id+"");

    }
    public void addToDB () throws SQLException {
        DB db = new DB();
        String make_table = "CREATE TABLE IF NOT EXISTS orders(id VARCHAR(50) primary key," +
                " customer_id VARCHAR(50)," +
                " basket_id VARCHAR(50)," +
                " date VARCHAR(20));";
        db.update(make_table);
        String query = "INSERT INTO orders (id, customer_id, basket_id, date) VALUE ('" + id + "','" +
                customer_id + "','" + basket_id + "','" + date + "')";

        if (db.update(query) == 1) {
            System.out.println("order is successfully added");
        }
    }

    public static void main(String[] args) throws SQLException {
        Order new_order = new Order("5f7e1923-23cf-4bb7-bda5-c3388ceb3280");
        new_order.add_basket_to_order("5f7e1923-23cf-4bb7-bda5-c3388ceb3280");
        new_order.addToDB();
    }
}
