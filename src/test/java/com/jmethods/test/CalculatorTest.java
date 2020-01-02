package com.jmethods.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for Calculator.
 *
 * @author Sai Pullabhotla
 *
 */
public class CalculatorTest {

  /**
   * Test method for {@link Calculator#add(int, int)}.
   */
  @Test
  public void testAdd() {
    int result = Calculator.add(3, 4);
    assertEquals(8, result);
  }

}
