package tax;

import java.util.Scanner;

public class Tax {
  public static float TAX = 21.0f;

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    printTax();
    System.out.println("TAX value = " + taxValue());
    System.out.print("Enter price: ");
    float price = scanner.nextFloat();
    System.out.println("Tax = " + tax(price));
    System.out.println("Total = " + total(price));
    System.out.print("Enter discount: ");
    float discount = scanner.nextFloat();
    System.out.println("Price with discount = " + applyDiscount(price, discount));
    System.out.print("New value for tax: ");
    modifyTax(scanner.nextFloat());
    System.out.println("Tax = " + tax(price));
    System.out.println("Total = " + total(price));

    scanner.close();
  }

  public static void printTax() {
    System.out.println("TAX = " + TAX);
  }

  public static float taxValue() {
    return TAX;
  }

  public static float tax(float price) {
    return price * TAX / 100;
  }

  public static float applyDiscount(float price, float discount) {
    return price - (price * discount / 100);
  }

  public static float total(float price) {
    return price + tax(price);
  }

  public static void modifyTax(float tax) {
    TAX = tax;
  }
}
