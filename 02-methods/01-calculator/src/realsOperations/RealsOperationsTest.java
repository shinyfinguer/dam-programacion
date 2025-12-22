/*
 * IntegersOperationsTest.java 9 Sept 2023
 *
 *
 * \u00A9 Copyright 2023 Joan S�culi
 * Email: jseculi@escoladeltreball.org
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package realsOperations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class RealsOperationsTest2 {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 21;

  static RealsOperations rO;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
    rO = new RealsOperations();
  }

  @AfterAll
  static void tearDownAfterClass() throws Exception {

  }

  @BeforeEach
  void setUp() throws Exception {
  }

  @AfterEach
  void tearDown() throws Exception {
  }

  @Test
  @Order(1)
  void testAdd() {

    if (rO.round(rO.add(4.55, 6.78), (byte) 10) != 11.33) {
      out += "Test add method => 4.55 + 6.78 should be 11.33, but it is actually "
          + rO.round(rO.add(4.55, 6.78), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.add(-4.55, 6.55), (byte) 10) != 2.00) {
      out += "Test add method => -4.55 + 6.55 should be 2.00, but it is actually "
          + rO.round(rO.add(-4.55, 6.55), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.add(1250.3444, 35678.272), (byte) 10) != 36928.6164) {
      out += "Test add method => 1250.3444 + 35678.272 should be 36928.6164, but it is actually "
          + rO.round(rO.add(1250.3444, 35678.272), (byte) 10) + "\n";
      total += 1;
    }

    assertEquals(11.33, rO.add(4.55, 6.78), 0.01);
    assertEquals(2.00, rO.add(-4.55, 6.55), 0.01);
    assertEquals(36928.6164, rO.add(1250.3444, 35678.272), 0.0001);

    assertEquals(3.6931E11, rO.add(1.253E10, 3.5678E11));
    assertEquals(4.81E10f, rO.add(1.25E10f, 3.56E10f), 0.01E10f);

  }

  @Test
  @Order(2)
  void testSubtract() {

    if (rO.round(rO.subtract(4.55, 6.78), (byte) 10) != -2.23) {
      out += "Test subtract method => 4.55 - 6.78 should be -2.23, but it is actually "
          + rO.round(rO.subtract(4.55, 6.78), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.subtract(-4.55, 6.78), (byte) 10) != -11.33) {
      out += "Test subtract method => -4.55 - 6.78 should be -11.33, but it is actually "
          + rO.round(rO.subtract(-4.55, 6.78), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.subtract(1250.3444, 35678.272), (byte) 10) != -34427.9276) {
      out += "Test subtract method => 1250.3444 - 35678.272 should be -34427.9276, but it is actually "
          + rO.round(rO.subtract(1250.3444, 35678.272), (byte) 10) + "\n";
      total += 1;
    }

    assertEquals(-2.23, rO.subtract(4.55, 6.78), 0.01);
    assertEquals(-11.33, rO.subtract(-4.55, 6.78), 0.01);
    assertEquals(-34427.9276, rO.subtract(1250.3444, 35678.272), 0.0001);

  }

  @Test
  @Order(3)
  void testMultiply() {

    if (rO.round(rO.multiply(4.55, 6.78), (byte) 10) != 30.849) {
      out += "Test multiply method => 4.55 * 6.78 should be 30.849, but it is actually "
          + rO.round(rO.multiply(4.55, 6.78), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.multiply(-4.55, 6.78), (byte) 10) != -30.849) {
      out += "Test multiply method => -4.55 * 6.78 should be -30.849, but it is actually "
          + rO.round(rO.multiply(-4.55, 6.78), (byte) 10) + "\n";
      total += 1;
    }

    assertEquals(30.849, rO.multiply(4.55, 6.78), 0.001);
    assertEquals(-30.849, rO.multiply(-4.55, 6.78), 0.01);
    assertEquals(44610127.596877, rO.multiply(1250.3444, 35678.272), 0.000001E8);

  }

  @Test
  @Order(4)
  void testDivide() {

    if (rO.round(rO.divide(40.5, 4), (byte) 10) != 10.125) {
      out += "Test divide method => 40.5 / 4 should be 10.125, but it is actually "
          + rO.round(rO.divide(40.5, 4), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.divide(-40, 6), (byte) 10) != -6.6666666667) {
      out += "Test divide method => -40 / 6 should be -6.6666666667, but it is actually "
          + rO.round(rO.divide(-40, 6), (byte) 10) + "\n";
      total += 1;
    }
    if (rO.round(rO.divide(35678, 12), (byte) 10) != 2973.1666666667) {
      out += "Test divide method => 35678 / 12 should be 2973.1666666667, but it is actually "
          + rO.round(rO.divide(35678, 12), (byte) 10) + "\n";
      total += 1;
    }

    assertEquals(10.125, rO.divide(40.5, 4), 0.001);
    assertEquals(-6.667, rO.divide(-40, 6), 0.001);
    assertEquals(2973.1667, rO.divide(35678, 12), 0.0001);

  }

  @Test
  @Order(5)
  void testPower() {

    if (rO.power(40.5, 4) != 2690420.0625) {
      out += "Test power method => 40.5 ^ 4 should be 2690420.0625, but it is actually " + rO.power(40.5, 4) + "\n";
      total += 1;
    }
    if (rO.power(-20.2, 3) != -8242.408) {
      out += "Test power method => -20.2 ^ 3 should be -8242.408, but it is actually " + rO.power(-20.2, 3) + "\n";
      total += 1;
    }
    if (rO.power(2.5, 6) != 244.140625) {
      out += "Test power method => 2.5 ^ 12 should be 244.140625, but it is actually " + rO.power(2.5, 6) + "\n";
      total += 1;
    }

    assertEquals(2690420.0625, rO.power(40.5, 4), 1.0001);
    assertEquals(-8242.408, rO.power(-20.2, 3), 0.001);
    assertEquals(59604.644775391, rO.power(2.5, 12), 0.000000001);

    assertEquals(1, rO.power(100, 0));

  }

  @Test
  @Order(6)
  void testMaximum() {

    if (rO.maximum(40.55, 4.67) != 40.55) {
      out += "Test maximum method => 40.5 and 4.67 should be 40.55, but it is actually " + rO.maximum(40.5, 4.67)
          + "\n";
      total += 1;
    }
    if (rO.maximum(-20.2, 6.78) != 6.78) {
      out += "Test maximum method => -20.2 and 6.78 should be 6.78, but it is actually " + rO.maximum(-20.2, 6.78)
          + "\n";
      total += 1;
    }
    if (rO.maximum(2.5, 12.76) != 12.76) {
      out += "Test maximum method => 2.5 and 12.76 should be 12.76, but it is actually " + rO.maximum(2.5, 12.76)
          + "\n";
      total += 1;
    }

    assertEquals(40.55, rO.maximum(40.55, 4.67));
    assertEquals(6.78, rO.maximum(-20.2, 6.78));
    assertEquals(12.76, rO.maximum(2.5, 12.76));

  }

  @Test
  @Order(7)
  void testMinimum() {

    if (rO.minimum(40.55, 4.67) != 4.67) {
      out += "Test minimum method => 40.5 and 4.67 should be 4.67, but it is actually " + rO.minimum(40.5, 4.67) + "\n";
      total += 1;
    }
    if (rO.minimum(-20.2, 6.78) != -20.2) {
      out += "Test minimum method => -20.2 and 6.78 should be -20.2, but it is actually " + rO.minimum(-20.2, 6.78)
          + "\n";
      total += 1;
    }
    if (rO.minimum(2.5, 12.76) != 2.5) {
      out += "Test minimum method => 2.5 and 12.76 should be 2.5, but it is actually " + rO.minimum(2.5, 12.76) + "\n";
      total += 1;
    }

    assertEquals(4.67, rO.minimum(40.55, 4.67));
    assertEquals(-20.2, rO.minimum(-20.2, 6.78));
    assertEquals(2.5, rO.minimum(2.5, 12.76));

  }

  @Test
  @Order(100)
  public void testFinal() {

    if (out.equalsIgnoreCase("")) {
      out += "TEST RESULTS: \n\n";
      out += "All tests have been successfully run!\n\n";
      out += "Total number test: " + TESTS + "\n";
      out += "Total number test failed: " + total + "\n";
      out += "Coverage successfully: 100%";
      System.out.println(out);
    } else {
      System.out.println("TEST RESULTS: \n");
      System.out.println("The following tests have failed: \n");

      System.out.println(out);
      System.out.println("\nTotal number test: " + TESTS);
      System.out.println("Total number test failed: " + total);

      double success = round(100.0 - ((double) total / TESTS * 100.0), 2);
      System.out.println("Coverage successfully: " + success + "%");

    }

  }

  public double round(double num, int dec) {
    return Math.round(num * Math.pow(10.0, dec)) / Math.pow(10, dec);
  }

}