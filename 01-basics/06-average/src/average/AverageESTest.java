/*
* AverageESTest.java 15 Sept 2024
*
*
* ©Copyright 2024 Joan Sèculi <jseculi@escoladeltreball.org>
*
* This is free software, licensed under the GNU General Public License v3.
* See http://www.gnu.org/licenses/gpl.html for more information.
*/
package average;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AverageESTest {

  private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUp() {
    // Redirect System.out to capture the output
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  public void tearDown() {
    // Restore the original System.out
    System.setOut(originalOut);
  }

  @Test
  public void testAverageUK() {
    // Run the main method of AverageUK
    AverageES.main(null);

    // Expected average rounded to 3 decimals
    // String expectedOutput = "Average: 266.955" + System.lineSeparator();

    // Verify that the output matches the expected average
    // assertEquals(expectedOutput, outputStream.toString(), "The average
    // calculation is incorrect.");

    String expectedOutput2 = "Average: 266.955";

    // Check output does not contains more than 3 decimals
    assertEquals(outputStream.toString().contains("266.95502"), false,
        () -> "The average calculation does not contains 3 decimals.");

    // Verify that the output matches the expected average

    assertEquals(outputStream.toString().contains(expectedOutput2), true,
        () -> "The average calculation is incorrect.");

  }

  // Test to count the occurrences of the word "float" in the source file
  @Test
  public void testOnlyOneFloatVariableDeclared() throws IOException {
    // Path to the AverageES.java file
    String filePath = "src/average/AverageES.java";

    // Read the source file content
    String sourceCode = new String(Files.readAllBytes(Paths.get(filePath)));

    // Remove comments from the source code (both single-line and multi-line
    // comments)
    String cleanedSourceCode = removeComments(sourceCode);

    // Count occurrences of the word "float"
    long floatCount = cleanedSourceCode.lines()
        .filter(line -> line.contains("float "))
        .count();

    // Assert that only one float is declared
    assertEquals(1, floatCount, "There should only be one float variable declared in the AverageES class.");
  }

  @Test
  public void test3decimals() {

    // Run the main method of AverageUK
    AverageUK.main(null);

    // Get the result, removing "Average: "
    // trim() also removes newlines
    String result = outputStream.toString().trim().substring(9, outputStream.toString().trim().length());

    // Regular expression to check up to 3 decimal places
    // A number that can have a negative sign (-?).
    // An optional decimal part with up to 3 digits ((\\.\\d{1,3})?).
    // Optional trailing whitespace or newlines at the end (\\s*).

    String decimalPattern = "^-?\\d+(\\.\\d{1,3})?$";

    // Assert that the result matches the pattern
    assertTrue(result.matches(decimalPattern));
    // , () -> "The result should have up to 3 decimal places.");

  }

  // Helper method to remove comments from the source code
  private String removeComments(String code) {
    // Remove multi-line comments (including those spanning multiple lines)
    code = code.replaceAll("/\\*[^*]*(?:\\*(?!/)[^*]*)*\\*/", "");
    // Remove single-line comments (//...)
    code = code.replaceAll("//.*", "");
    return code;
  }

}