package triangle;

import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a base: ");
    double base = scanner.nextDouble();
    System.out.print("Enter a height: ");
    double height = scanner.nextDouble();

    double area = round(area(height, base), 4);
    System.out.println("Area of trinagle is: " + area);

    scanner.close();
  }

  public static double area(double h, double b) {
    return (b * h) / 2;
  }

  public static double round(double num, int dec) {
    return Math.round(num * Math.pow(10.0, dec)) / Math.pow(10.0, dec);
  }
}