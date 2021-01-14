import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

/** the Class make/remove a customer add/delete them into/of
 * the db if important have a modify func to modify a existed
 * Customer **/

public class Customer {

    private String id;
    private String name;
    private String address;
    private String tel;

    public Customer() {   // make a virtual Customers for functions like Search and remove
        System.out.println("virtual customer is ready");
    }

    public Customer(String name, String address, String tel) {
        this.address = address;
        this.tel = tel;
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    /**
     * add a Customer into the db
     *
     * @return 0 if OK else -1
     */
    public void addtoDB() throws SQLException {
        DB db = new DB();
        String make_table = "CREATE TABLE IF NOT EXISTS baskets(id VARCHAR(50) primary key," +
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
     */
    public void remove(String name) throws SQLException {
        DB db = new DB();
        String query = "DELETE FROM customers WHERE name='" + name + "';";
        if (db.update(query) == 1) {
            System.out.println("Customer is successfully removed");
        }
    }

    public void search(String name) throws SQLException {
        DB db = new DB();
        String query = "SELECT * FROM customers WHERE name='" + name + "';";
        Statement stmt = db.make_connection();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()) {
            System.out.println("ID = " + rs.getString("id"));
            System.out.println("NAME = " + rs.getString("name"));
            System.out.println("ADDRESS = " + rs.getString("address"));
            System.out.println("TEL = " + rs.getString("tel"));
        }
        stmt.close();
    }

    /**
     * if a Customer need to modify
     */
    public void modify(String old_name, String new_name, String new_address, String new_tel) throws SQLException {
        String id = null;
        DB db = new DB();
        String query = "SELECT * FROM customers WHERE name='" + old_name + "';";
        Statement stmt = db.make_connection();
        ResultSet rs = stmt.executeQuery(query);
        while (rs.next()){
            id = rs.getString("id");
            System.out.println(id);
        }
        stmt.close();
        if (id == null){
            System.out.println("Customer not found");
        }
        else {
            query = "UPDATE customers " +
                    "SET name='" + new_name + "'" +
                    ", address='" + new_address + "'" + ", tel='" + new_tel +
                    "' WHERE " +
                    "id = '" + id + "';";
            System.out.println(query);
            if (db.update(query) == 1) {
                System.out.println("Customer is successfully modified");
            }
        }
    }


    public static void main(String[] args) throws SQLException {
        Customer mahbod = new Customer();
        mahbod.addtoDB();
    }

}