package com.pressassociation.test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Palindrome}.
 */
public class PalindromeTest {

  private Palindrome palindrome;

  @Before
  public void setUp() {
    palindrome = new Palindrome();
  }

  @Test
  public void testIsPalindrome_abba() {
    assertThat(palindrome.isPalindrome("abba"))
        .isTrue();
  }
}
