package realsOperations;

import java.util.Scanner;

public class RealsOperations {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int number1 = scanner.nextInt();

    System.out.print("Enter the second number: ");
    int number2 = scanner.nextInt();

    System.out.println("Add : " + add(number1, number2));
    System.out.println("Substract : " + subtract(number1, number2));
    System.out.println("Multiply : " + multiply(number1, number2));
    System.out.println("Divide : " + divide(number1, number2));
    System.out.println("Modul : " + modul(number1, number2));
    System.out.println("Power : " + power(number1, number2));
    System.out.println("Maximun : " + maximum(number1, number2));
    System.out.println("Minimum : " + minimum(number1, number2));

    scanner.close();
  }

  public static double add(double x, double y) {
    return x + y;
  }

  public static double subtract(double x, double y) {
    return x - y;
  }

  public static double multiply(double x, double y) {
    return x * y;
  }

  public static double divide(double x, double y) {
    return x / y;
  }

  public static double modul(double x, double y) {
    return x % y;
  }

  public static double power(double x, double y) {
    return Math.pow(x, y);
  }

  public static double maximum(double x, double y) {
    return Math.max(x, y);
  }

  public static double minimum(double x, double y) {
    return Math.min(x, y);
  }

  public double round(double num, int dec) {
    return Math.round(num * Math.pow(10.0, dec)) / Math.pow(10, dec);
  }
}
