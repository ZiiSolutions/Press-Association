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

  @Test
  public void testIsPalindrome_PA() {
    assertThat(palindrome.isPalindrome("PA")) //not palindrome
            .isFalse();
  }

  @Test
  public void testIsPalindromeUpperCase_LEVEL() {
    assertThat(palindrome.isPalindrome("LEVEL"))
            .isTrue();
  }

  @Test
  public void testIsPalindromeMixedCase_LeVeL() {
    assertThat(palindrome.isPalindrome("LeVeL"))
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationFullStop_level() {
    assertThat(palindrome.isPalindrome(".l.e.v.el")) //full stop
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationComma_level() {
    assertThat(palindrome.isPalindrome(",l,e,v,,el")) //comma s
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationExclamation_level() {
    assertThat(palindrome.isPalindrome("!l!e!v!!!el")) // exclamation mark
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationQuestion_level() {
    assertThat(palindrome.isPalindrome("???l?e?v?el?")) //question mark
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationSemiColon_level() {
    assertThat(palindrome.isPalindrome(";;;;l;eve;l;")) //semi colon
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationColon_level() {
    assertThat(palindrome.isPalindrome("::leve::::l")) //colon
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationDash_level() {
    assertThat(palindrome.isPalindrome("_l___ev_e_l_")) //dash
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationHyphen_level() {
    assertThat(palindrome.isPalindrome("-le-vel--")) //hyphen
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationSquareBrackets_level() {
    assertThat(palindrome.isPalindrome("]]l]e]vel[]")) // square brackets
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationParentheses_level() {
    assertThat(palindrome.isPalindrome("()leve()l))")) // parentheses
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationApostrphe_level() {
    assertThat(palindrome.isPalindrome("'''le'vel''")) // apostrophe
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationQuotation_level() {
    assertThat(palindrome.isPalindrome("\"\"\"lev\"el\"\"")) // quotation marks
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationEllipses_level() {
    assertThat(palindrome.isPalindrome("...leve...l......")) // ellipses
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationAsterisk_level() {
    assertThat(palindrome.isPalindrome("***leve***l*")) // asterisk
            .isTrue();
  }

  @Test
  public void testIsPalindromePunctuationCurlyBrackets_level() {
    assertThat(palindrome.isPalindrome("}{}}level}{")) // curly brackets
            .isTrue();
  }

  @Test
  public void testIsPalindromeAllPunctuation_level() {
    assertThat(palindrome.isPalindrome("***...\"\"...\"l...,e.!?)v()??\"e,,l\"\"{]]]l'ev'{}el{]}*")) // test with all punctuation in one string
            .isTrue();
  }

  @Test
  public void testIsPalindromeAllPunctuationAllCase_level() {
    assertThat(palindrome.isPalindrome("level***...\"\"...\"l...,E.!?)v()??\"e,,l\"\"{]]]l'Ev'{}eL{]}*LEVEL")) // test with all punctuation all case in one string
            .isTrue();
  }

  @Test
  public void testIsPalindromeAllPunctuation_pae() {
    assertThat(palindrome.isPalindrome("***...\"\"...\"p...a,e.!?)()??\"p,,a\"\"{]]]e'pa'{}e{]}*")) // test with all punctuation in one string
            .isFalse();
  }

  @Test
  public void testIsPalindromeAllPunctuationAllCase_PAE() {
    assertThat(palindrome.isPalindrome("pae***...\"\"...\"P...,A.!?)v()??\"e,,l\"\"{]]]l'Pa'{}e{]}*PAE")) // test with all punctuation all case in one string
            .isFalse();
  }

  @Test
  public void testIsPalindromeDigit() {
     assertThat(palindrome.isPalindrome("12Level12"))
             .isFalse();
    assertThat(palindrome.isPalindrome("121"))
            .isTrue();
    assertThat(palindrome.isPalindrome("A121A"))
            .isTrue();
  }

  @Test(expected = NullPointerException.class)
  public void testForExceptionOverflow() {
    palindrome.isPalindrome(null);
  }

  @Test
  public void testIsPalindrome_whiteSpace() {
    assertThat(palindrome.isPalindrome(" "))
            .isFalse();
  }




}
