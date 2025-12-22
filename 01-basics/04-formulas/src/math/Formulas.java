package math;

public class Formulas {
  public static void main(String[] args) {
    double a = 25.5;
    double g = 2.2;
    double b = 50.67;
    double h = Math.PI;
    int c = 2;
    double i = 33.3;
    double d = 10.5;
    int t = 90;
    double e = -2.5;
    int z = 45;
    double f = 13.6;

    double formula1 = (Math.sqrt(a) + (b / c)) / (d - (e / Math.pow(f, 2)));
    double formula2 = Math.pow(a, 2) / (b - c) + (d - e) / (f - g * h / i);
    double formula3 = (Math.pow(a, 2) - Math.pow(b, 3) - 4) / (3 * c) * Math.sin(Math.toRadians(t))
        * Math.cos(Math.toRadians(z));
    double formula4 = Math.pow(a + b, 2) / c - 3 * d / (e + f) - Math.log10(7 * g);

    System.out.println("Formula 1 = " + formula1);
    System.out.println("Formula 2 = " + formula2);
    System.out.println("Formula 3 = " + formula3);
    System.out.println("Formula 4 = " + formula4);
  }
}
