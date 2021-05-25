
import java.io.Serializable;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream;

public class Program4 { 
    public static void main(String[] args) { 
        Order o1 = new Order(2255, "Laptop", "John"); 
        Order o2 = new Order(2512, "Mobile", "Mark"); 
        try { 
            FileOutputStream f = new FileOutputStream(new File("myOrders.txt")); 
            ObjectOutputStream o = new ObjectOutputStream(f); 
            o.writeObject(o1); 
            o.writeObject(o2); 
            o.close(); 
            f.close(); 
            FileInputStream fi = new FileInputStream(new File("myOrders.txt")); 
            ObjectInputStream oi = new ObjectInputStream(fi); 
            Order or1 = (Order) oi.readObject(); 
            Order or2 = (Order) oi.readObject(); 
            System.out.println(or1.toString()); 
            System.out.println(or2.toString()); 
            oi.close(); 
            fi.close(); 
            
        } 
        catch (FileNotFoundException e) { 
            System.out.println("File not found"); 
            
        } 
        catch (IOException e) { 
            System.out.println("Error initializing stream"); 
            
        } 
        catch (ClassNotFoundException e) { 
            e.printStackTrace(); 
        } 

    } 
    
}

class Order implements Serializable { 
    private static final long serialVersionUID = 1L; 
    private int orderId;
    private String productName; 
    private String customerName; 
    Order() { 
    }; 
    Order(int orderId, String productName, String customerName) { 
        this.orderId = orderId; 
        this.productName = productName; 
        this.customerName = customerName; 
    } 
    
    public String toString() { 
        return  "OrderId: " + orderId + "\nProductName:" + productName ; 
    } 
    
}
