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
}
