package relationals;

public class Relationals {
  public static void main(String[] args) {
    int x = 3;
    int y = 2;
    boolean b1 = false;
    boolean b2 = true;

    int z = (x + 4 * y) % 3; // 2
    boolean bool = (x > y && !b1) || (x == y); // true
    int q = ((y + x / 2) % 2) * 5; // 5
    boolean bool2 = b1 && (x > 0 || !(y < 5)); // false
    boolean bool3 = !(b1 && !b2); // true
    boolean bool4 = b1 && b2 || x > y / 2; // true

    System.out.println(z);
    System.out.println(bool);
    System.out.println(q);
    System.out.println(bool2);
    System.out.println(bool3);
    System.out.println(bool4);

    int amount = 10;
    boolean isBetween = amount >= 15 && amount <= 100;
    System.out.println(isBetween);

    amount = 15;
    System.out.println(amount >= 15 && amount <= 100);

    amount = 20;
    System.out.println(amount >= 15 && amount <= 100);

    amount = 100;
    System.out.println(amount >= 15 && amount <= 100);

    amount = 500;
    System.out.println(amount >= 15 && amount <= 100);
  }
}
