package integersOperations;

import java.util.Scanner;

public abstract class IntegersOperations {
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

  public static int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int divide(int x, int y) {
    return x / y;
  }

  public static int modul(int x, int y) {
    return x % y;
  }

  public static double power(int x, int y) {
    return Math.pow(x, y);
  }

  public static int maximum(int x, int y) {
    return Math.max(x, y);
  }

  public static int minimum(int x, int y) {
    return Math.min(x, y);
  }

}
