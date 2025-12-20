package power;

import java.util.Locale;

public class Power {
  public static void main(String[] args) {
    byte force = 125;
    byte distance = 37;
    byte time = 12;

    double _force = 125;
    double _distance = 37;
    double _time = 12;

    System.out.println("P (no decimals) = " + (force * distance / time));
    System.out.println("P (with decimals) = " + (_force * _distance / _time));
    System.out.printf(Locale.UK, "P (with 2 decimals) = %.2f", (_force * _distance / _time));
  }
}
