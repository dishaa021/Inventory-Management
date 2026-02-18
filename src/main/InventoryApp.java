package main;

import dto.Product;
import service.ProductService;

import java.util.Scanner;

public class InventoryApp {

    public static void main(String[] args) {

        ProductService service = new ProductService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Inventory Management ===");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product Quantity");
            System.out.println("3. Delete Product");
            System.out.println("4. View All Products");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    service.addProduct(new Product(name, qty, price));
                    break;

                case 2:
                    System.out.print("Product ID: ");
                    int id = sc.nextInt();
                    System.out.print("New Quantity: ");
                    int newQty = sc.nextInt();
                    service.updateProduct(id, newQty);
                    break;

                case 3:
                    System.out.print("Product ID: ");
                    service.deleteProduct(sc.nextInt());
                    break;

                case 4:
                    service.viewProducts().forEach(p ->
                        System.out.println(
                            p.getId() + " | " + p.getName() + 
                            " | Qty: " + p.getQuantity() + 
                            " | Price: " + p.getPrice()
                        )
                    );
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
