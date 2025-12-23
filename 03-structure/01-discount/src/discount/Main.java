package discount;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final Discount discount = new Discount();

    System.out.println("MENU");
    System.out.println("1: Calculate discount");
    System.out.println("0: Quit");
    System.out.print("Choose menu option: ");
    byte option = scanner.nextByte();

    if (option == 1) {
      System.out.print("Enter price: ");
      float price = scanner.nextFloat();

      int i = 5;
      while (i <= 100) {
        System.out.printf("Discount %3d%%: %8.2f\n", i, discount.discount(price, i));
        i += 5;
      }
    }

    scanner.close();
  }
}
