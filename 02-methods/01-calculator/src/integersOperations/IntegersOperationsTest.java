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
package integersOperations;

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
class IntegersOperationsTest {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 24;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {
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

    if (IntegersOperations.add(4, 6) != 10) {
      out += "Add method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.add(-4, 6) != 2) {
      out += "Add method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.add(1250, 35678) != 36928) {
      out += "Add method is not correct\n";
      total += 1;
    }
    assertEquals(10, IntegersOperations.add(4, 6));
    assertEquals(2, IntegersOperations.add(-4, 6));
    assertEquals(36928, IntegersOperations.add(1250, 35678));

  }

  @Test
  @Order(2)
  void testSubtract() {
    if (IntegersOperations.subtract(4, 6) != -2) {
      out += "Subtract method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.subtract(-4, 6) != -10) {
      out += "Subtract method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.subtract(1250, 35678) != -34428) {
      out += "Subtract method is not correct\n";
      total += 1;
    }

    assertEquals(-2, IntegersOperations.subtract(4, 6));
    assertEquals(-10, IntegersOperations.subtract(-4, 6));
    assertEquals(-34428, IntegersOperations.subtract(1250, 35678));

  }

  @Test
  @Order(3)
  void testMultiply() {

    if (IntegersOperations.multiply(4, 6) != 24) {
      out += "Multiply method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.multiply(-4, 6) != -24) {
      out += "Multiply method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.multiply(1250, 35678) != 44597500) {
      out += "Multiply method is not correct\n";
      total += 1;
    }

    assertEquals(24, IntegersOperations.multiply(4, 6));
    assertEquals(-24, IntegersOperations.multiply(-4, 6));
    assertEquals(44597500, IntegersOperations.multiply(1250, 35678));

  }

  @Test
  @Order(4)
  void testDivide() {

    if (IntegersOperations.divide(40, 4) != 10) {
      out += "Divide method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.divide(-40, 6) != -6) {
      out += "Divide method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.divide(35678, 12) != 2973) {
      out += "Divide method is not correct\n";
      total += 1;
    }

    assertEquals(10, IntegersOperations.divide(40, 4));
    assertEquals(-6, IntegersOperations.divide(-40, 6));
    assertEquals(2973, IntegersOperations.divide(35678, 12));

  }

  @Test
  @Order(5)
  void testModul() {

    if (IntegersOperations.modul(40, 4) != 0) {
      out += "Modul method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.modul(-40, 6) != -4) {
      out += "Modul method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.modul(35678, 12) != 2) {
      out += "Modul method is not correct\n";
      total += 1;
    }

    assertEquals(0, IntegersOperations.modul(40, 4));
    assertEquals(-4, IntegersOperations.modul(-40, 6));
    assertEquals(2, IntegersOperations.modul(35678, 12));

  }

  @Test
  @Order(6)
  void testPower() {
    if (IntegersOperations.power(40, 4) != 2560000) {
      out += "Power method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.power(-20, 6) != 64000000) {
      out += "Power method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.power(2, 12) != 4096) {
      out += "Power method is not correct\n";
      total += 1;
    }

    assertEquals(2560000, IntegersOperations.power(40, 4));
    assertEquals(64000000, IntegersOperations.power(-20, 6));
    assertEquals(4096, IntegersOperations.power(2, 12));

  }

  @Test
  @Order(7)
  void testMaximum() {

    if (IntegersOperations.maximum(40, 4) != 40) {
      out += "Maximum method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.maximum(-20, 6) != 6) {
      out += "Maximum method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.maximum(2, 12) != 12) {
      out += "Maximum method is not correct\n";
      total += 1;
    }
    assertEquals(40, IntegersOperations.maximum(40, 4));
    assertEquals(6, IntegersOperations.maximum(-20, 6));
    assertEquals(12, IntegersOperations.maximum(2, 12));

  }

  @Test
  @Order(8)
  void testMinimum() {

    if (IntegersOperations.minimum(40, 4) != 4) {
      out += "Minimum method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.minimum(-20, 6) != -20) {
      out += "Minimum method is not correct\n";
      total += 1;
    }
    if (IntegersOperations.minimum(2, 12) != 2) {
      out += "Minimum method is not correct\n";
      total += 1;
    }

    assertEquals(4, IntegersOperations.minimum(40, 4));
    assertEquals(-20, IntegersOperations.minimum(-20, 6));
    assertEquals(2, IntegersOperations.minimum(2, 12));

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