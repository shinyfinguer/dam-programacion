package discount;

public class Discount {
  public float discount(float price, float discount) {
    return price - (price * discount / 100);
  }
}
