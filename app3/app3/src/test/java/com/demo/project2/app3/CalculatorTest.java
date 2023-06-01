package com.demo.project2.app3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
  
  @Test
  public void testSum() {
    int result = Calculator.sum(2, 3);
    assertEquals(5, result);
  }
  
  @Test
  public void testSumWithNegativeNumbers() {
    int result = Calculator.sum(-5, 10);
    assertEquals(5, result);
  }
  
  // Add more test cases for different scenarios
  

@Test
public void testsubtract(){
int result=Calculator.subtract(10,3);
assertEquals(7, result);
}
}