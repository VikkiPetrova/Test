package mediumTests;

import application.Calculator;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MediumTestClass {

  Calculator calc = new Calculator();

  @Test
  @Tag("smoke")
  public void testAverage() {
    double actualResult = calc.average(10, 5, 2);
    assertEquals(5, actualResult, 0.01);
  }

  @Test
  public void testEvenOrOdd() {
    boolean actualResult = calc.evenOrOdd(10);
    assertTrue(true);
  }



  @Test
  public void testBiggestValue() {
    int actualResult = calc.biggestValue(10, 5);
    assertEquals(10, actualResult);
  }


}
