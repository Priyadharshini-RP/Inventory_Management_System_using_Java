import java.util.*; 
class Product { 
int id; 
String name; 
int quantity; 
double price; 
Product(int id, String name, int quantity, double price) { 
this.id = id; 
        this.name = name; 
        this.quantity = quantity; 
        this.price = price; 
    } 
    public String toString() { 
        return "ID: " + id + " | Name: " + name + 
               " | Quantity: " + quantity + 
               " | Price: " + price; 
    } 
} 
public class Main { 
    static HashMap<Integer, Product> stock = new HashMap<>(); 
    static int autoId = 1;   
    public static void addProduct(String name, int qty, double price) { 
        Product p = new Product(autoId, name, qty, price); 
        stock.put(autoId, p); 
        System.out.println("Product added with ID: " + autoId); 
        autoId++; 
    } 
    public static void displayProducts() { 
        if(stock.isEmpty()){ 
            System.out.println("Inventory is empty"); 
            return; 
        } 
        for(Product p : stock.values()){ 
            System.out.println(p); 
        } 
    } 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int choice = 0; 
        while(choice != 3){ 
            System.out.println("1 Add Product"); 
            System.out.println("2 Display Products"); 
            System.out.println("3 Exit"); 
            System.out.print("Enter choice: "); 
            choice = sc.nextInt(); 
            sc.nextLine(); 
            switch(choice){ 
                case 1: 
                    System.out.print("Enter Product Name: "); 
                    String name = sc.nextLine(); 
                    System.out.print("Enter Quantity: "); 
                    int qty = sc.nextInt(); 
                    System.out.print("Enter Price: "); 
                    double price = sc.nextDouble(); 
                    addProduct(name,qty,price); 
                    break; 
                case 2: 
                    displayProducts(); 
                    break; 
                case 3: 
                    System.out.println("Program Ended"); 
                    break; 
                default: 
                    System.out.println("Invalid choice"); 
            } 
        } 
    } 
} 