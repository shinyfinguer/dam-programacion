/*
 * TriangleTest.java 10 Sept 2023
 *
 *
 * \u00A9 Copyright 2023 Joan S�culi
 * Email: jseculi@escoladeltreball.org
 *
 * This is free software, licensed under the GNU General Public License v3.
 * See http://www.gnu.org/licenses/gpl.html for more information.
 */
package triangle;

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
class TriangleTest {

  private static String out = "";
  private static int total = 0;

  private static final int TESTS = 10;

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
  void testArea() {

    if (Triangle.area(23.55, 12.33) != 145.18575) {
      out += "Test area method => h=23.55, b=12.33, area should be 145.18575, but it is actually: "
          + Triangle.area(23.55, 12.33) + "\n";
      total += 1;
    }

    if (Triangle.area(5.55, 13.44) != 37.296) {
      out += "Test area method => h=5.55, b=13.44, area should be 37.296, but it is actually: "
          + Triangle.area(5.55, 13.44) + "\n";
      total += 1;
    }
    if (Triangle.area(8.333, 7.789) != 32.4528685) {
      out += "Test area method => h=8.333, b=7.789, area should be 32.4528685, but it is actually: "
          + Triangle.area(8.333, 7.789) + "\n";
      total += 1;
    }

    if (Triangle.area(6.1257, 6.6612) != 20.40225642) {
      out += "Test area method => h=6.1257, b=6.6612, area should be 20.40225642, but it is actually: "
          + Triangle.area(6.1257, 6.6612) + "\n";
      total += 1;
    }

    if (Triangle.area(3.33333, 5.51222) != 9.1870241463) {
      out += "Test area method => h=3.33333, b=5.51222, area should be 9.187, but it is actually: "
          + Triangle.area(3.33333, 5.51222) + "\n";
      total += 1;
    }

    assertEquals(145.1858, Triangle.area(23.55, 12.33), 0.0001);
    assertEquals(37.296, Triangle.area(5.55, 13.44), 0.0001);
    assertEquals(32.4529, Triangle.area(8.333, 7.789), 0.0001);
    assertEquals(20.4023, Triangle.area(6.1257, 6.6612), 0.0001);
    assertEquals(9.187, Triangle.area(3.33333, 5.51222), 0.0001);

  }

  @Test
  @Order(2)
  void testAreaRound() {

    if (Triangle.round(Triangle.area(23.55, 12.33), (byte) 4) != 145.1858) {
      out += "Test round method => h=23.55, b=12.33, area should be 145.1858, but it is actually: "
          + Triangle.round(Triangle.area(23.55, 12.33), (byte) 4) + "\n";
      total += 1;
    }

    if (Triangle.round(Triangle.area(5.55, 13.44), (byte) 4) != 37.296) {
      out += "Test round method => h=5.55, b=13.44, area should be 37.296, but it is actually: "
          + Triangle.round(Triangle.area(5.55, 13.44), (byte) 4) + "\n";
      total += 1;
    }
    if (Triangle.round(Triangle.area(8.333, 7.789), (byte) 4) != 32.4529) {
      out += "Test round method => h=8.333, b=7.789, area should be 32.4529, but it is actually: "
          + Triangle.round(Triangle.area(8.333, 7.789), (byte) 4) + "\n";
      total += 1;
    }

    if (Triangle.round(Triangle.area(6.1257, 6.6612), (byte) 4) != 20.4023) {
      out += "Test round method => h=6.1257, b=6.6612 - Area should be 20.4023, but it is actually: "
          + Triangle.round(Triangle.area(6.1257, 6.6612), (byte) 4) + "\n";
      total += 1;
    }

    if (Triangle.round(Triangle.area(3.33333, 5.51222), (byte) 4) != 9.187) {
      out += "Test round method => h=3.33333, b=5.51222, area should be 9.187, but it is actually: "
          + Triangle.round(Triangle.area(3.33333, 5.51222), (byte) 4) + "\n";
      total += 1;
    }

    assertEquals(145.1858, Triangle.round(Triangle.area(23.55, 12.33), (byte) 4));
    assertEquals(37.296, Triangle.round(Triangle.area(5.55, 13.44), (byte) 4));
    assertEquals(32.4529, Triangle.round(Triangle.area(8.333, 7.789), (byte) 4));
    assertEquals(20.4023, Triangle.round(Triangle.area(6.1257, 6.6612), (byte) 4));
    assertEquals(9.187, Triangle.round(Triangle.area(3.33333, 5.51222), (byte) 4));

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