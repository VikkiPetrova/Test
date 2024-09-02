package simpleTests;

import application.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;


public class SimpleTestClass {

  Calculator calc = new Calculator();

  @Test
  @Tag("regression")
  public void testAddTwoPositiveValues() {
    int actualResult = calc.add(10, 5);
    assertEquals(15, actualResult);
  }

  @Test
  public void testMultiplyTwoPositiveValues() {
    int actualResult = calc.multiplication(10, 5);
    assertEquals(50, actualResult);
  }

  @Test
  public void testDivisionTwoPositiveValues() {
    int actualResult = calc.division(10, 5);
    assertEquals(2, actualResult);
  }

  @Test
  public void testSubtractionTwoPositiveValues() {
    int actualResult = calc.subtraction(10, 5);
    assertEquals(5, actualResult);
  }
  //add tests for new methods (multiply, division, subtraction, square root, x^2)
@Test
  public void testSquareRoot() {
    double actualResult = calc.squareRoot(100);
    assertEquals(10, actualResult, 0.01);
}

@Test
  public void testXSquared() {
    double actualResult = calc.xSquared(10);
    assertEquals(100, actualResult, 0.01);
}

}
