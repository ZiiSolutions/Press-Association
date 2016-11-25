package com.pressassociation.test;

import java.util.List;

/**
 * Implements an object that will wrap text into lines of text no longer than a given limit (unless the line consists
 * of a single word that has a length greater than the line limit).
 * <p>
 * Carriage return (CR) and line feed (LF) characters should break lines.
 */
public class WordWrapper {

  /**
   * Wraps text to a maximum line length (unless a single word is longer than the limit, in which case the line
   * shall consist of only that word).
   * <p>
   * Text is wrapped only on a block of whitespace (as defined by {@link Character#isWhitespace}) which shall not be
   * preserved.
   * <p>
   * Text should be split on CR, LF and CRLF.
   * <p>
   * Supplementary characters are not supported, behaviour if included is not defined.
   *
   * @param text  the text to be word wrapped into lines
   * @param limit the maximum number of character allowed
   * @return
   */
  public List<String> wrap(String text, int limit) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }
}
