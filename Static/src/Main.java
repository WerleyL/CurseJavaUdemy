import util.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter radius: ");
        double radius = sc.nextDouble();

        double c = Calculator.circuference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n ", c);
        System.out.printf("Volume:  %.2f%n ", v);
        System.out.printf("PI value:  %.2f%n ", Calculator.PI);


    }
}