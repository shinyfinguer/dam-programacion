package temperature;

public class Temperature {
  public float c2f(float c) {
    return c * 9 / 5 + 32;
  }

  public float f2c(float f) {
    return (f - 32) * 5 / 9;
  }
}
