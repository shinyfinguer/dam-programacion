package mean;

public class Mean {
  public static double arithmeticMean(double a, double b, double c, double d) {
    return (a + b + c + d) / 4;
  }

  public static double geometricMean(double a, double b, double c, double d) {
    return Math.pow((a * b * c * d), 1.0 / 4);
  }

  public static double harmonicMean(double a, double b, double c, double d) {
    return 4 / (1 / a + 1 / b + 1 / c + 1 / d);
  }

  public static double round(double num, int dec) {
    return Math.round(num * Math.pow(10.0, dec)) / Math.pow(10.0, dec);
  }

}
