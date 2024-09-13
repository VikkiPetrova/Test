package mediumTests;

import application.Calculator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediumTestClass {

  Calculator calc = new Calculator();

  @Test
  @Tag("smoke")
  public void testAverage() {
    double actualResult = Math.round((calc.average(15, 5, 5)) * 100) / 100.0;
    assertEquals(8.33, actualResult, 0.00);
  }

  @Test
  public void testOdd() {
    assertFalse(calc.evenOrOdd(7));
  }

  @Test
  public void testEven() {
    assertTrue(calc.evenOrOdd(2));
  }


  @Test
  public void testBiggestValue() {
    int actualResult = calc.biggestValue(10, 5);
    assertEquals(10, actualResult);
  }


}
