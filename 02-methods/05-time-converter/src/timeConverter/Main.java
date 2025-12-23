package timeConverter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final TimeConverter time = new TimeConverter();

    System.out.print("Enter number of days: ");
    int days = scanner.nextInt();

    System.out.print("Enter number of hours: ");
    int hours = scanner.nextInt();

    System.out.print("Enter number of minutes: ");
    int minutes = scanner.nextInt();

    System.out.print("Enter number in seconds: ");
    int seconds = scanner.nextInt();

    System.out.println("dToS: " + time.dToS(days) + " seconds");
    System.out.println("hToS: " + time.hToS(hours) + " seconds");
    System.out.println("mToS: " + time.mToS(minutes) + " seconds");
    System.out.println("msToS: " + time.msToS(minutes, seconds) + " seconds");
    System.out.println("hmsToS: " + time.hmsToS(hours, minutes, seconds) + " seconds");
    System.out.println("dhmsToS: " + time.dhmsToS(days, hours, minutes, seconds) + " seconds");
  }
}
