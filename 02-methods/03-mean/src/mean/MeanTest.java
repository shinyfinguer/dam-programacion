/*
 * MeanTest.java 10 Sept 2023
 *
 *
 * \u00A9 Copyright 2023 Joan S�culi
 * Email: jseculi@escoladeltreball.org
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package mean;

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
class MeanTest {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 8;

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
  void testAM() {

    if (Mean.round(Mean.arithmeticMean(10, 25, 32, 15), (byte) 4) != 20.5) {
      out += "Test arithmethicMean method => [10, 25, 32, 15] should be 20.5, but it is actually "
          + Mean.round(Mean.arithmeticMean(10, 25, 32, 15), (byte) 4) + "\n";
      total += 1;
    }
    if (Mean.round(Mean.arithmeticMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) != 14.3753) {
      out += "Test arithmethicMean method => [15.5, 16.32, 11.1213, 14.56] should be 14.3753, but it is actually "
          + Mean.round(Mean.arithmeticMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) + "\n";
      total += 1;
    }

    assertEquals(20.5, Mean.arithmeticMean(10, 25, 32, 15), 0.0001);
    assertEquals(14.3753, Mean.arithmeticMean(15.5, 16.32, 11.1213, 14.56), 0.0001);

    assertEquals(20.5, Mean.round(Mean.arithmeticMean(10, 25, 32, 15), (byte) 4));
    assertEquals(14.3753, Mean.round(Mean.arithmeticMean(15.5, 16.32, 11.1213, 14.56), (byte) 4));
  }

  @Test
  @Order(2)
  void testGM() {

    if (Mean.round(Mean.geometricMean(10, 25, 32, 15), (byte) 4) != 18.6121) {
      out += "Test geometricMean method => [10, 25, 32, 15] should be 18.6121, but it is actually "
          + Mean.round(Mean.geometricMean(10, 25, 32, 15), (byte) 4) + "\n";
      total += 1;
    }
    if (Mean.round(Mean.geometricMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) != 14.2263) {
      out += "Test geometricMean method => [15.5, 16.32, 11.1213, 14.56] should be 14.2263, but it is actually "
          + Mean.round(Mean.geometricMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) + "\n";
      total += 1;
    }

    assertEquals(18.6121, Mean.geometricMean(10, 25, 32, 15), 0.0001);
    assertEquals(14.2263, Mean.geometricMean(15.5, 16.32, 11.1213, 14.56), 0.0001);

    assertEquals(18.6121, Mean.round(Mean.geometricMean(10, 25, 32, 15), (byte) 4));
    assertEquals(14.2263, Mean.round(Mean.geometricMean(15.5, 16.32, 11.1213, 14.56), (byte) 4));
  }

  @Test
  @Order(3)
  void testHM() {

    if (Mean.round(Mean.harmonicMean(10, 25, 32, 15), (byte) 4) != 16.8126) {
      out += "Test harmonicMean method => [10, 25, 32, 15] should be 16.8126, but it is actually "
          + Mean.round(Mean.harmonicMean(10, 25, 32, 15), (byte) 4) + "\n";
      total += 1;
    }
    if (Mean.round(Mean.harmonicMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) != 14.0652) {
      out += "Test harmonicMean method => [15.5, 16.32, 11.1213, 14.56] should be 14.0652, but it is actually "
          + Mean.round(Mean.harmonicMean(15.5, 16.32, 11.1213, 14.56), (byte) 4) + "\n";
      total += 1;
    }

    assertEquals(16.8126, Mean.round(Mean.harmonicMean(10, 25, 32, 15), (byte) 4));
    assertEquals(14.0652, Mean.round(Mean.harmonicMean(15.5, 16.32, 11.1213, 14.56), (byte) 4));

    assertEquals(16.8126, Mean.harmonicMean(10, 25, 32, 15), 0.0001);
    assertEquals(14.0652, Mean.harmonicMean(15.5, 16.32, 11.1213, 14.56), 0.0001);
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