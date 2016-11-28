package com.pressassociation.test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import java.util.ArrayList;
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
    List<String> result = new ArrayList<>();
    //if given string is less than the limit thats a line so return
    if(text.length() <= limit){
      result.add(text);
      return result;
    }
    /*Splitter is the simplest approach as it consists of methods that perform everything for you
      i.e.setting the limit for the split, triming the results to get rid of white spaces and then
      it places each result in the given list using the splitToList method
    */
    result = Splitter.fixedLength(limit).trimResults(CharMatcher.whitespace()).splitToList(text);
    return result;
    /*Alternative routes can be taken to achieve the same thing but will require more linse of code than using a
     splitter. For example a BreakIterator can be utilised. By setting its boundaries and returning the substring
      */
  }
}
