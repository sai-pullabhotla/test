package com.jmethods.test;

/**
 * A simple calculator.
 *
 * @author Sai Pullabhotla
 *
 */
public class Calculator {

  /**
   * Hide the default constructor.
   */
  private Calculator() {
    // Do nothing
  }

  /**
   * Adds the given numbers.
   *
   * @param a
   *          first number
   * @param b
   *          second number
   * @return the sum of the two numbers.
   */
  public static int add(final int a, final int b) {
    return a + b;
  }

}
