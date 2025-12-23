/*
 * TimeConverterTest.java 10 Sept 2023
 *
 *
 * \u00A9 Copyright 2023 Joan S�culi
 * Email: jseculi@escoladeltreball.org
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package timeConverter;

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
class TimeConverterTest {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 6;

  TimeConverter tc = new TimeConverter();

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
  void testDToS() {

    if (tc.dToS(150) != 12960000) {
      out += "Test dToS method => 150 days should be 12960000 seconds, but it is actually " + tc.dToS(150) + "\n";
      total += 1;
    }
    if (tc.hToS(23) != 82800) {
      out += "Test hToS method => 23 hours should be 82800 seconds, but it is actually " + tc.hToS(23) + "\n";
      total += 1;
    }
    if (tc.mToS(45) != 2700) {
      out += "Test mToS method => 24 minutes should be 2700 seconds, but it is actually " + tc.mToS(45) + "\n";
      total += 1;
    }
    if (tc.msToS(45, 25) != 2725) {
      out += "Test msToS method => 24 minutes + 25 seconds should be 2725 seconds, but it is actually "
          + tc.msToS(45, 25) + "\n";
      total += 1;
    }
    if (tc.hmsToS(23, 45, 25) != 85525) {
      out += "Test hmsToS method => 23 hours + 45 minutes + 25 seconds should be 85525 seconds, but it is actually "
          + tc.hmsToS(23, 45, 25) + "\n";
      total += 1;
    }
    if (tc.dhmsToS(150, 23, 45, 25) != 13045525) {
      out += "Test dhmsToS method => 150 days + 23 hours + 45 minutes + 25 seconds should be 13045525 seconds, but it is actually "
          + tc.dhmsToS(150, 23, 45, 25) + "\n";
      total += 1;
    }

    assertEquals(12960000, tc.dToS(150));
    assertEquals(82800, tc.hToS(23));
    assertEquals(2700, tc.mToS(45));
    assertEquals(2725, tc.msToS(45, 25));
    assertEquals(85525, tc.hmsToS(23, 45, 25));
    assertEquals(13045525, tc.dhmsToS(150, 23, 45, 25));

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