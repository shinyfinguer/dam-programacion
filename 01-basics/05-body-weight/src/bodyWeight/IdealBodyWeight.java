package bodyWeight;

import java.util.Scanner;

public class IdealBodyWeight {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final int K_MAN = 4;
    final double K_WOMAN = 2.5;

    System.out.print("Enter your height in cm: ");
    short height = scanner.nextShort();
    System.out.print("Enter your age: ");
    byte age = scanner.nextByte();
    double lorentzMan = (height - 100) - ((double) height - 150) / 4 + ((double) age - 20) / K_MAN;
    lorentzMan = Math.round(lorentzMan * 100) / 100.0;
    double lorentzWoman = height - 100 - ((double) height - 150) / 4 + (age - 20) / K_WOMAN;
    lorentzWoman = Math.round(lorentzWoman * 100) / 100.0;

    System.out.println("Ideal Body Weight for Men = " + lorentzMan + "kg");
    System.out.println("Ideal Body Weight for Women = " + lorentzWoman + "kg");

    scanner.close();
  }
}
