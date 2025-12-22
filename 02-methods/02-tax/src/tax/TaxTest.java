/*
* TaxTest.java 30 Sept 2024
*
*
* ©Copyright 2024 Joan Sèculi <jseculi@escoladeltreball.org>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package tax;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TaxTest {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 11;

  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

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

    // Restore the original System.out
    System.setOut(originalOut);
  }

  @Test
  @Order(1)
  void testMain() {

  }

  @Test
  @Order(2)
  void testPrintTax() {

    float actualTax = Tax.taxValue();
    // Arrange
    // Save the current System.out
    PrintStream originalOut = System.out;
    // Create a stream to hold the output
    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    // Redirect System.out to the ByteArrayOutputStream
    System.setOut(new PrintStream(outContent));

    // Act
    Tax.printTax();

    String expected = "TAX = " + actualTax;

    if (!outContent.toString().trim().contains(expected)) {
      out += "Test taxValue method => Error, if TAX = 21, this method should print \"TAX = 21\"" + "\n";
      total += 1;
    }

    // Assert
    assertEquals(outContent.toString().trim().contains(expected), true);

    // Reset System.out to its original state
    // System.setOut(originalOut);

  }

  @Test
  @Order(3)
  void testTaxValue() {

    if (Tax.TAX != Tax.taxValue()) {
      out += "Test taxValue method => Error reading TAX." + "\n";
      total += 1;
    }

    assertEquals(Tax.TAX, Tax.taxValue());

  }

  @Test
  @Order(4)
  void testTax() {

    if (73.5 != round(Tax.tax(350), (byte) 2)) {
      out += "Test tax method => Error, for price = 350, tax should be 73.5 " + "\n";
      total += 1;
    }

    if (21.0 != round(Tax.tax(100), (byte) 2)) {
      out += "Test tax method => Error, for price = 100, tax should be 21 " + "\n";
      total += 1;
    }
    if (263.57 != round(Tax.tax(1255.1f), (byte) 2)) {
      out += "Test tax method => Error, for price = 1255.1, tax should be 263.57 " + "\n";
      total += 1;
    }
    assertEquals(73.5, Tax.tax(350), 0.01);
    assertEquals(21, Tax.tax(100), 0.01);
    assertEquals(263.57, Tax.tax(1255.1f), 0.01);

  }

  @Test
  @Order(5)
  void testTotal() {

    if (423.5 != round(Tax.total(350), (byte) 2)) {
      out += "Test total method => Error, for price = 350, total should be 73.5 " + "\n";
      total += 1;
    }

    if (121.0 != round(Tax.total(100), (byte) 2)) {
      out += "Test total method => Error, for price = 100, total should be 121 " + "\n";
      total += 1;
    }
    if (1518.67 != round(Tax.total(1255.1f), (byte) 2)) {
      out += "Test total method => Error, for price = 1255.1, total should be 1518.67 " + "\n";
      total += 1;
    }

    assertEquals(423.5, Tax.total(350), 0.01);
    assertEquals(121, Tax.total(100), 0.01);
    assertEquals(1518.67, Tax.total(1255.1f), 0.01);

  }

  @Test
  @Order(6)
  void testApplyDiscount() {

    if (297.5 != round(Tax.applyDiscount(350, 15), (byte) 2)) {
      out += "Test applyDiscount method => Error, for price = 350, discount should be 73.5 " + "\n";
      total += 1;
    }

    if (85 != round(Tax.applyDiscount(100, 15), (byte) 2)) {
      out += "Test applyDiscount method => Error, for price = 100, discount should be 85 " + "\n";
      total += 1;
    }
    if (1066.835 != round(Tax.applyDiscount(1255.1f, 15), (byte) 3)) {
      out += "Test applyDiscount method => Error, for price = 1255.1, discount should be 1066.835 " + "\n";
      total += 1;
    }

    assertEquals(297.5, Tax.applyDiscount(350, 15), 0.01);
    assertEquals(85, Tax.applyDiscount(100, 15), 0.01);
    assertEquals(1066.835, Tax.applyDiscount(1255.1f, 15), 0.01);

  }

  @Test
  @Order(7)
  void testModifyTax() {
    Tax.modifyTax(22.2f);

    if (22.2f != Tax.taxValue()) {
      out += "Test modifyTax method => Error, this method should change the value of TAX." + "\n";
      total += 1;
    }

    assertEquals(Tax.TAX, Tax.taxValue());

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