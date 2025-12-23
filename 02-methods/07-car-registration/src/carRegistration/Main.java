package carRegistration;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final CarRegistration carRegistration = new CarRegistration();

    System.out.print("Enter Spanish car registration: ");
    String registration = scanner.next();

    System.out.println("Number: " + carRegistration.getNumber(registration));
    System.out.println("Letters: " + carRegistration.getLetters(registration));

    System.out.print("Enter Spanish car registration 1: ");
    String registration1 = scanner.next();

    System.out.print("Enter Spanish car registration 2: ");
    String registration2 = scanner.next();

    System.out.println("Are the same? " + carRegistration.compare(registration1, registration2));

    scanner.close();
  }
}
