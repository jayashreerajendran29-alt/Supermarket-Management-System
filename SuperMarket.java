import java.util.ArrayList;
import java.util.Scanner;

// ==========================================================
// PRODUCT CLASS
// OOPS CONCEPT: CLASS, ENCAPSULATION, CONSTRUCTOR
// ==========================================================
class Product {

    // OOPS CONCEPT: ENCAPSULATION
    private int productId;
    private String productName;
    private double price;
    private int stock;

    // OOPS CONCEPT: CONSTRUCTOR
    Product(int productId, String productName, double price, int stock) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
    }

    // OOPS CONCEPT: GETTER METHODS
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // OOPS CONCEPT: SETTER METHOD
    public void setStock(int stock) {
        this.stock = stock;
    }

    public void displayProduct() {
        System.out.printf("%-10d %-25s %-10.2f %-10d%n",
                productId, productName, price, stock);
    }
}


// ==========================================================
// PRODUCT MANAGEMENT
// ==========================================================
class ProductManagement {

    // OOPS CONCEPT: AGGREGATION
    // ArrayList stores Product objects
    ArrayList<Product> products = new ArrayList<>();

    // Add sample products
    public void loadProducts() {
products.add(new Product(101, "Milk", 50.0, 50));
products.add(new Product(102, "Curd", 40.0, 40));
products.add(new Product(103, "Butter", 60.0, 30));
products.add(new Product(104, "Cheese", 120.0, 25));
products.add(new Product(105, "Paneer", 90.0, 35));
products.add(new Product(106, "Ghee", 650.0, 20));
products.add(new Product(107, "Yogurt", 35.0, 40));
products.add(new Product(108, "Fresh Cream", 80.0, 25));
products.add(new Product(109, "Biscuits", 30.0, 70));
products.add(new Product(110, "Rice 1kg", 65.0, 100));
products.add(new Product(111, "Sugar 1kg", 48.0, 90));
products.add(new Product(112, "Salt 1kg", 22.0, 120));
products.add(new Product(113, "Tea Powder", 220.0, 35));
products.add(new Product(114, "Coffee Powder", 180.0, 30));
products.add(new Product(115, "Noodles", 45.0, 55));
products.add(new Product(116, "Pasta", 80.0, 40));
products.add(new Product(117, "Honey", 250.0, 20));
products.add(new Product(118, "Jam", 160.0, 30));
products.add(new Product(119, "Apple", 180.0, 30));
products.add(new Product(120, "Orange", 100.0, 40));

products.add(new Product(121, "Banana", 60.0, 50));
products.add(new Product(122, "Mango", 120.0, 35));
products.add(new Product(123, "Grapes", 90.0, 40));
products.add(new Product(124, "Watermelon", 80.0, 25));
products.add(new Product(125, "Papaya", 70.0, 30));
products.add(new Product(126, "Pomegranate", 150.0, 25));
products.add(new Product(127, "Guava", 75.0, 35));
products.add(new Product(128, "Pineapple", 100.0, 30));
products.add(new Product(129, "Potato 1kg", 45.0, 100));
products.add(new Product(130, "Tomato 1kg", 50.0, 90));
products.add(new Product(131, "Onion 1kg", 55.0, 100));
products.add(new Product(132, "Carrot 1kg", 60.0, 70));
products.add(new Product(133, "Beans 1kg", 80.0, 50));
products.add(new Product(134, "Cabbage", 40.0, 45));
products.add(new Product(135, "Cauliflower", 55.0, 40));
products.add(new Product(136, "Brinjal", 50.0, 60));
products.add(new Product(137, "Spinach", 30.0, 50));
products.add(new Product(138, "Green Peas", 90.0, 40));
products.add(new Product(139, "Cucumber", 45.0, 55));
products.add(new Product(140, "Capsicum", 75.0, 45));

products.add(new Product(141, "Bread", 45.0, 50));
products.add(new Product(142, "Bun", 30.0, 40));
products.add(new Product(143, "Cake", 250.0, 20));
products.add(new Product(144, "Cookies", 80.0, 50));
products.add(new Product(145, "Chocolate", 50.0, 80));
products.add(new Product(146, "Toffee", 5.0, 200));
products.add(new Product(147, "Lollipop", 5.0, 150));
products.add(new Product(148, "Chips", 30.0, 100));
products.add(new Product(149, "Popcorn", 40.0, 60));
products.add(new Product(150, "Namkeen", 70.0, 50));
products.add(new Product(151, "Mixture", 80.0, 50));
products.add(new Product(152, "Murukku", 100.0, 40));
products.add(new Product(153, "Samosa", 20.0, 60));
products.add(new Product(154, "Puffs", 25.0, 50));
products.add(new Product(155, "Donut", 60.0, 30));
products.add(new Product(156, "Ice Cream", 120.0, 35));
products.add(new Product(157, "Kulfi", 50.0, 40));
products.add(new Product(158, "Ice Cream Cone", 40.0, 45));
products.add(new Product(159, "Brownie", 100.0, 25));
products.add(new Product(160, "Muffin", 70.0, 30));

products.add(new Product(161, "Coca Cola", 45.0, 80));
products.add(new Product(162, "Pepsi", 45.0, 80));
products.add(new Product(163, "Sprite", 45.0, 70));
products.add(new Product(164, "Fanta", 45.0, 70));
products.add(new Product(165, "Mineral Water", 20.0, 150));
products.add(new Product(166, "Lemon Juice", 40.0, 60));
products.add(new Product(167, "Mango Juice", 50.0, 60));
products.add(new Product(168, "Orange Juice", 50.0, 60));
products.add(new Product(169, "Apple Juice", 60.0, 50));
products.add(new Product(170, "Energy Drink", 120.0, 40));
products.add(new Product(171, "Green Tea", 180.0, 30));
products.add(new Product(172, "Badam Milk", 80.0, 40));
products.add(new Product(173, "Lassi", 50.0, 50));
products.add(new Product(174, "Milkshake", 100.0, 35));
products.add(new Product(175, "Cold Coffee", 90.0, 40));
products.add(new Product(176, "Coconut Water", 60.0, 45));
products.add(new Product(177, "Buttermilk", 30.0, 60));
products.add(new Product(178, "Soda", 35.0, 70));
products.add(new Product(179, "Tonic Water", 60.0, 40));
products.add(new Product(180, "Chocolate Milk", 70.0, 35));

products.add(new Product(181, "Washing Powder", 180.0, 40));
products.add(new Product(182, "Dish Wash", 100.0, 50));
products.add(new Product(183, "Floor Cleaner", 150.0, 35));
products.add(new Product(184, "Toilet Cleaner", 130.0, 30));
products.add(new Product(185, "Glass Cleaner", 120.0, 30));
products.add(new Product(186, "Hand Wash", 90.0, 50));
products.add(new Product(187, "Hand Sanitizer", 100.0, 50));
products.add(new Product(188, "Bath Soap", 45.0, 100));
products.add(new Product(189, "Shampoo", 180.0, 50));
products.add(new Product(190, "Conditioner", 200.0, 40));
products.add(new Product(191, "Toothpaste", 100.0, 60));
products.add(new Product(192, "Toothbrush", 50.0, 80));
products.add(new Product(193, "Hair Oil", 150.0, 40));
products.add(new Product(194, "Face Wash", 180.0, 35));
products.add(new Product(195, "Body Lotion", 220.0, 30));
products.add(new Product(196, "Talcum Powder", 120.0, 45));
products.add(new Product(197, "Hair Comb", 40.0, 70));
products.add(new Product(198, "Tissue Paper", 80.0, 60));
products.add(new Product(199, "Paper Napkin", 60.0, 70));
products.add(new Product(200, "Toilet Paper", 100.0, 50));

products.add(new Product(201, "Notebook", 60.0, 100));
products.add(new Product(202, "Pen", 10.0, 200));
products.add(new Product(203, "Pencil", 8.0, 200));
products.add(new Product(204, "Eraser", 5.0, 150));
products.add(new Product(205, "Sharpener", 10.0, 100));
products.add(new Product(206, "Marker", 30.0, 80));
products.add(new Product(207, "Highlighter", 40.0, 70));
products.add(new Product(208, "Glue", 30.0, 80));
products.add(new Product(209, "Scissors", 70.0, 50));
products.add(new Product(210, "Ruler", 20.0, 100));
products.add(new Product(211, "File", 50.0, 60));
products.add(new Product(212, "Stapler", 100.0, 40));
products.add(new Product(213, "Stapler Pins", 25.0, 80));
products.add(new Product(214, "Calculator", 250.0, 30));
products.add(new Product(215, "A4 Sheets", 300.0, 40));
products.add(new Product(216, "Color Pencils", 80.0, 50));
products.add(new Product(217, "Sketch Pens", 100.0, 40));
products.add(new Product(218, "Drawing Book", 90.0, 50));
products.add(new Product(219, "Water Bottle", 150.0, 45));
products.add(new Product(220, "Lunch Box", 250.0, 30));

    }

    // Display products
    public void displayProducts() {

        System.out.println("\n================ PRODUCT LIST ================");
        System.out.printf("%-10s %-25s %-10s %-10s%n",
                "ID", "Product Name", "Price", "Stock");
        System.out.println("-----------------------------------------------");

        for (Product p : products) {
            p.displayProduct();
        }
    }

    // Search product
    public Product searchProduct(int id) {

        for (Product p : products) {

            if (p.getProductId() == id) {
                return p;
            }
        }

        return null;
    }

    // Add new product
    public void addProduct(Scanner sc) {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Stock: ");
        int stock = sc.nextInt();

        products.add(new Product(id, name, price, stock));

        System.out.println("Product added successfully!");
    }

    // Update stock
    public void updateStock(Scanner sc) {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product p = searchProduct(id);

        if (p != null) {

            System.out.print("Enter New Stock: ");
            int stock = sc.nextInt();

            p.setStock(stock);

            System.out.println("Stock updated successfully!");

        } else {

            System.out.println("Product not found!");
        }
    }
}


// ==========================================================
// ORDER ITEM CLASS
// OOPS CONCEPT: CLASS AND ENCAPSULATION
// ==========================================================
class OrderItem {

    private Product product;
    private int quantity;

    OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return product.getPrice() * quantity;
    }
}


// ==========================================================
// ORDER MANAGEMENT
// ==========================================================
class OrderManagement {

    ArrayList<OrderItem> orderItems = new ArrayList<>();

    ProductManagement productManagement;

    OrderManagement(ProductManagement productManagement) {
        this.productManagement = productManagement;
    }

    // Create order
    public void createOrder(Scanner sc) {

        System.out.print("Enter Product ID: ");
        int id = sc.nextInt();

        Product product = productManagement.searchProduct(id);

        if (product == null) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        if (quantity <= 0) {
            System.out.println("Invalid quantity!");
            return;
        }

        if (quantity > product.getStock()) {
            System.out.println("Insufficient stock!");
            return;
        }

        orderItems.add(new OrderItem(product, quantity));

        product.setStock(product.getStock() - quantity);

        System.out.println("Product added to order successfully!");
    }

    // Display order
    public void displayOrder() {

        if (orderItems.size() == 0) {
            System.out.println("No items in the order.");
            return;
        }

        System.out.println("\n================ ORDER DETAILS ================");

        System.out.printf("%-10s %-20s %-10s %-10s%n",
                "ID", "Product", "Quantity", "Amount");

        System.out.println("-----------------------------------------------");

        for (OrderItem item : orderItems) {

            System.out.printf("%-10d %-20s %-10d %-10.2f%n",
                    item.getProduct().getProductId(),
                    item.getProduct().getProductName(),
                    item.getQuantity(),
                    item.getAmount());
        }
    }

    public double calculateTotal() {

        double total = 0;

        for (OrderItem item : orderItems) {
            total += item.getAmount();
        }

        return total;
    }
}


// ==========================================================
// BILLING MANAGEMENT
// ==========================================================
class BillingManagement {

    // OOPS CONCEPT: METHOD
    public double calculateTax(double amount) {

        double tax = amount * 0.05;

        return tax;
    }

    public void generateBill(OrderManagement order) {

        double subtotal = order.calculateTotal();

        if (subtotal == 0) {
            System.out.println("No items to generate bill.");
            return;
        }

        double tax = calculateTax(subtotal);

        double total = subtotal + tax;

        System.out.println("\n==============================================");
        System.out.println("             SUPERMARKET BILL");
        System.out.println("==============================================");

        order.displayOrder();

        System.out.println("----------------------------------------------");

        System.out.printf("Subtotal       : ₹%.2f%n", subtotal);
        System.out.printf("GST (5%%)       : ₹%.2f%n", tax);
        System.out.printf("Grand Total    : ₹%.2f%n", total);

        System.out.println("==============================================");
    }
}


// ==========================================================
// PAYMENT ABSTRACTION
// OOPS CONCEPT: ABSTRACTION
// ==========================================================
abstract class Payment {

    protected double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    // OOPS CONCEPT: ABSTRACT METHOD
    abstract void pay();
}


// ==========================================================
// CASH PAYMENT
// OOPS CONCEPT: INHERITANCE
// ==========================================================
class CashPayment extends Payment {

    CashPayment(double amount) {
        super(amount);
    }

    // OOPS CONCEPT: METHOD OVERRIDING
    @Override
    void pay() {

        System.out.println("\nPayment Method : Cash");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Payment Successful!");
    }
}


// ==========================================================
// UPI PAYMENT
// OOPS CONCEPT: INHERITANCE
// ==========================================================
class UPIPayment extends Payment {

    UPIPayment(double amount) {
        super(amount);
    }

    // OOPS CONCEPT: METHOD OVERRIDING
    @Override
    void pay() {

        System.out.println("\nPayment Method : UPI");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("UPI Payment Successful!");
    }
}


// ==========================================================
// CARD PAYMENT
// OOPS CONCEPT: INHERITANCE
// ==========================================================
class CardPayment extends Payment {

    CardPayment(double amount) {
        super(amount);
    }

    // OOPS CONCEPT: METHOD OVERRIDING
    @Override
    void pay() {

        System.out.println("\nPayment Method : Card");
        System.out.println("Amount Paid    : ₹" + amount);
        System.out.println("Card Payment Successful!");
    }
}


// ==========================================================
// PAYMENT MANAGEMENT
// ==========================================================
class PaymentManagement {

    public void makePayment(Scanner sc, double amount) {

        System.out.println("\n========== PAYMENT MANAGEMENT ==========");
        System.out.println("1. Cash");
        System.out.println("2. UPI");
        System.out.println("3. Card");

        System.out.print("Select Payment Method: ");
        int choice = sc.nextInt();

        Payment payment;

        // OOPS CONCEPT: POLYMORPHISM
        if (choice == 1) {

            payment = new CashPayment(amount);

        } else if (choice == 2) {

            payment = new UPIPayment(amount);

        } else if (choice == 3) {

            payment = new CardPayment(amount);

        } else {

            System.out.println("Invalid payment method!");
            return;
        }

        // POLYMORPHIC METHOD CALL
        payment.pay();
    }
}


// ==========================================================
// SALES CLASS
// ==========================================================
class Sale {

    private int saleId;
    private double amount;
    private String paymentMethod;

    Sale(int saleId, double amount, String paymentMethod) {

        this.saleId = saleId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public void displaySale() {

        System.out.printf("%-10d %-15.2f %-15s%n",
                saleId, amount, paymentMethod);
    }
}


// ==========================================================
// SALES MANAGEMENT
// ==========================================================
class SalesManagement {

    ArrayList<Sale> sales = new ArrayList<>();

    int saleId = 1;

    public void addSale(double amount, String paymentMethod) {

        Sale sale = new Sale(saleId, amount, paymentMethod);

        sales.add(sale);

        saleId++;

        System.out.println("Sale recorded successfully!");
    }

    public void displaySales() {

        if (sales.size() == 0) {

            System.out.println("No sales available.");
            return;
        }

        System.out.println("\n================ SALES REPORT ================");

        System.out.printf("%-10s %-15s %-15s%n",
                "Sale ID", "Amount", "Payment");

        System.out.println("-----------------------------------------------");

        for (Sale s : sales) {

            s.displaySale();
        }

        System.out.println("-----------------------------------------------");

        double totalSales = 0;

        for (Sale s : sales) {
            // Total calculated using sale information
        }

        System.out.println("Total Number of Sales : " + sales.size());
    }
}


// ==========================================================
// MAIN CLASS
// ==========================================================
public class SuperMarket{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // OOPS CONCEPT: OBJECT CREATION
        ProductManagement productManagement =
                new ProductManagement();

        OrderManagement orderManagement =
                new OrderManagement(productManagement);

        BillingManagement billingManagement =
                new BillingManagement();

        PaymentManagement paymentManagement =
                new PaymentManagement();

        SalesManagement salesManagement =
                new SalesManagement();

        // Load sample products
        productManagement.loadProducts();

        int choice;

        do {

            System.out.println("\n");
            System.out.println("=================================================");
            System.out.println("        SUPERMARKET MANAGEMENT SYSTEM");
            System.out.println("=================================================");
            System.out.println("1. Product Management");
            System.out.println("2. Order Management");
            System.out.println("3. Billing Management");
            System.out.println("4. Payment Management");
            System.out.println("5. Sales Management");
            System.out.println("6. Exit");
            System.out.println("=================================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                // ==========================================
                // PRODUCT MANAGEMENT
                // ==========================================
                case 1:

                    int productChoice;

                    do {

                        System.out.println("\n========== PRODUCT MANAGEMENT ==========");
                        System.out.println("1. Display Products");
                        System.out.println("2. Add Product");
                        System.out.println("3. Search Product");
                        System.out.println("4. Update Stock");
                        System.out.println("5. Back");

                        System.out.print("Enter choice: ");
                        productChoice = sc.nextInt();

                        switch (productChoice) {

                            case 1:
                                productManagement.displayProducts();
                                break;

                            case 2:
                                productManagement.addProduct(sc);
                                break;

                            case 3:

                                System.out.print("Enter Product ID: ");
                                int id = sc.nextInt();

                                Product p =
                                        productManagement.searchProduct(id);

                                if (p != null) {

                                    System.out.println("\nProduct Found!");
                                    p.displayProduct();

                                } else {

                                    System.out.println("Product not found!");
                                }

                                break;

                            case 4:
                                productManagement.updateStock(sc);
                                break;

                            case 5:
                                System.out.println("Returning to main menu...");
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (productChoice != 5);

                    break;


                // ==========================================
                // ORDER MANAGEMENT
                // ==========================================
                case 2:

                    int orderChoice;

                    do {

                        System.out.println("\n========== ORDER MANAGEMENT ==========");
                        System.out.println("1. Add Product to Order");
                        System.out.println("2. Display Order");
                        System.out.println("3. Calculate Total");
                        System.out.println("4. Back");

                        System.out.print("Enter choice: ");
                        orderChoice = sc.nextInt();

                        switch (orderChoice) {

                            case 1:
                                orderManagement.createOrder(sc);
                                break;

                            case 2:
                                orderManagement.displayOrder();
                                break;

                            case 3:

                                System.out.printf(
                                        "Order Total : ₹%.2f%n",
                                        orderManagement.calculateTotal());

                                break;

                            case 4:
                                break;

                            default:
                                System.out.println("Invalid choice!");
                        }

                    } while (orderChoice != 4);

                    break;


                // ==========================================
                // BILLING MANAGEMENT
                // ==========================================
                case 3:

                    billingManagement.generateBill(orderManagement);

                    break;


                // ==========================================
                // PAYMENT MANAGEMENT
                // ==========================================
                case 4:

                    double total =
                            orderManagement.calculateTotal();

                    if (total == 0) {

                        System.out.println("Please create an order first.");

                    } else {

                        double tax =
                                billingManagement.calculateTax(total);

                        double grandTotal =
                                total + tax;

                        System.out.printf(
                                "Amount to Pay : ₹%.2f%n",
                                grandTotal);

                        paymentManagement.makePayment(
                                sc, grandTotal);
                    }

                    break;


                // ==========================================
                // SALES MANAGEMENT
                // ==========================================
                case 5:

                    int salesChoice;

                    do {

                        System.out.println("\n========== SALES MANAGEMENT ==========");
                        System.out.println("1. Record Sale");
                        System.out.println("2. Display Sales");
                        System.out.println("3. Back");

                        System.out.print("Enter choice: ");
                        salesChoice = sc.nextInt();

                        switch (salesChoice) {

                            case 1:

                                double saleAmount =
                                        orderManagement.calculateTotal();

                                if (saleAmount == 0) {

                                    System.out.println(
                                            "No order available.");

                                } else {

                                    System.out.println(
                                            "Select payment method:");

                                    System.out.println(
                                            "1. Cash");

                                    System.out.println(
                                            "2. UPI");

                                    System.out.println(
                                            "3. Card");

                                    System.out.print(
                                            "Enter choice: ");

                                    int payChoice =
                                            sc.nextInt();

                                    String method;

                                    if (payChoice == 1) {
                                        method = "Cash";
                                    } else if (payChoice == 2) {
                                        method = "UPI";
                                    } else if (payChoice == 3) {
                                        method = "Card";
                                    } else {
                                        System.out.println(
                                                "Invalid payment method.");
                                        break;
                                    }

                                    double tax =
                                            billingManagement
                                                    .calculateTax(saleAmount);

                                    double finalAmount =
                                            saleAmount + tax;

                                    salesManagement.addSale(
                                            finalAmount, method);
                                }

                                break;

                            case 2:
                                salesManagement.displaySales();
                                break;

                            case 3:
                                break;

                            default:
                                System.out.println(
                                        "Invalid choice!");
                        }

                    } while (salesChoice != 3);

                    break;


                // ==========================================
                // EXIT
                // ==========================================
                case 6:

                    System.out.println("\n=================================");
                    System.out.println(
                            "Thank You for Using Supermarket System!");
                    System.out.println("Visit Again!");
                    System.out.println("=================================");

                    break;


                default:

                    System.out.println(
                            "Invalid choice! Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}