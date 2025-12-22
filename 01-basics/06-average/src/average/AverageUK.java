package average;

import java.util.Locale;
import java.util.Scanner;

public class AverageUK {
  public static void main(String[] args) {
    String string = "34 45 670 120 24 50.50 100.25 125.30 1250.15 250.35";

    Scanner scanner = new Scanner(string);
    scanner.useLocale(Locale.UK);

    float total = scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total += scanner.nextFloat();
    total /= 10;

    // System.out.println("Average: " + total);
    // System.out.println("Average: " + Math.round(total * 1000) / 1000.0);
    System.out.printf(Locale.UK, "Average: %.3f", total);

    scanner.close();
  }
}
