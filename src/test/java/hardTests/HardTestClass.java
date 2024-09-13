package hardTests;

import application.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Tag;


public class HardTestClass {

  Calculator calc = new Calculator();

  @Test
  public void testAddMultipleValues() {
    int actualResult = calc.addMultipleValues(1, 2, 3, 7, 5);
    assertEquals(18, actualResult);
  }

  @Test
  public void testDivideByZero() {
    int actualResult = calc.divideByZero(10, 0);
    assertEquals(-100, actualResult);
  }



}
