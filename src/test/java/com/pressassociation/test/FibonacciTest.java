package com.pressassociation.test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Fibonacci}.
 */
public class FibonacciTest {

  private Fibonacci fib;

  @Before
  public void setUp() {
    fib = new Fibonacci();
  }

  @Test
  public void testGet_zero() {
    assertThat(fib.get(0))
        .isEqualTo(0);
  }

  @Test
  public void testGet_one() {
    assertThat(fib.get(1))
        .isEqualTo(1);
  }

  @Test
  public void testGet_2(){
    assertThat(fib.get(2))
            .isEqualTo(1);
  }

  @Test
  public void testGet_3(){
    assertThat(fib.get(3))
            .isEqualTo(2);
  }

  @Test
  public void testGet_7(){
    assertThat(fib.get(7))
            .isEqualTo(13);
  }

  @Test
  public void testGet_46(){
    assertThat(fib.get(46))
            .isEqualTo(1836311903);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForExceptionNegativeValue() {
    fib.get(-1);                                        //to see if an exception is thrown when given negative value
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForExceptionOverflow() {
    fib.get(Integer.MAX_VALUE+1);
  }





}
