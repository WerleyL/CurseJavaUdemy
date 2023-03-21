import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.println(" Name:");
        String name = sc.nextLine();
        System.out.println("price");
        double price = sc.nextDouble();

        Produto product = new Produto(name, price);
        System.out.println("Data " + product);
        System.out.println("Enter the number of products to be added in stock ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);


        System.out.println("uptaded data " + product);
        System.out.println("Enter the number of products to be removed in stock ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("uptaded data 2 :" + product);
        sc.close();
    }
}