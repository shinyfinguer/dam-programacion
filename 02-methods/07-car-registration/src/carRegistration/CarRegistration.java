package carRegistration;

public class CarRegistration {
  public int getNumber(String str) {
    return Integer.parseInt(str.substring(0, 4));
  }

  public String getLetters(String str) {
    return str.substring(4).toUpperCase();
  }

  public boolean compare(String str1, String str2) {
    return str1.equalsIgnoreCase(str2);
  }
}
