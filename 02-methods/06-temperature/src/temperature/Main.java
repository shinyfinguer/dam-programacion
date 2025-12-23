package temperature;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final Temperature temperature = new Temperature();

    System.out.print("Enter the degrees in Celsius: ");
    float celsius = scanner.nextFloat();
    System.out.println("The degrees in Fahrenheits is: " + temperature.c2f(celsius) + "ºF");

    System.out.print("Enter the degrees in Fahrenheits: ");
    float fahrenheits = scanner.nextFloat();
    System.out.println("The degrees in Celsius is: " + temperature.f2c(fahrenheits) + "ºC");

    scanner.close();
  }
}
