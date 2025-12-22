package mean;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double number1 = scanner.nextDouble();

    System.out.print("Enter the second number: ");
    double number2 = scanner.nextDouble();

    System.out.print("Enter the third number: ");
    double number3 = scanner.nextDouble();

    System.out.print("Enter the fourth number: ");
    double number4 = scanner.nextDouble();

    double arithmeticMean = Mean.round(Mean.arithmeticMean(number1, number2, number3, number4), 4);
    double geometricMean = Mean.round(Mean.geometricMean(number1, number2, number3, number4), 4);
    double harmonicMean = Mean.round(Mean.harmonicMean(number1, number2, number3, number4), 4);

    System.out.println("Arithmetic Mean: " + arithmeticMean);
    System.out.println("Geometric Mean: " + geometricMean);
    System.out.println("Harmonic Mean: " + harmonicMean);

    scanner.close();
  }
}
