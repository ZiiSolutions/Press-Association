package com.pressassociation.test;

import javax.annotation.Nullable;

/**
 * Implements an object that can determine whether a {@link String} is a palindrome (ie same forward as backwards).
 */
public class Palindrome {

  /**
   * Determine whether a {@link String} is a palindrome.
   * <p>
   * A {@link String} is considered a palindrome if it is the same forwards as backwards ignoring the following:
   * <ul>
   *   <li>case</li>
   *   <li>punctuation</li>
   *   <li>whitespaces</li>
   * </ul>
   * In other words the only characters to be considered, regardless of case, are 'letters' and 'digits'.
   *
   * @param text  the text to be tested
   * @return      whether the given test is a palindrome, {@code null} is never a palindrome.
   */
  public boolean isPalindrome(@Nullable String text) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }
}
