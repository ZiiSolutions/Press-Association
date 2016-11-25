package com.pressassociation.test;

/**
 * Implements an object that removes subsequent duplicate items from an array whilst preserving order.
 */
public class Deduplicator {

  /**
   * Given an array of {@link Comparable} objects remove any subsequent duplicate items whilst causing no reordering
   * of the remaining elements.
   * <p>
   * For Example:
   * <pre>
   *   removeDuplicates([4, 1, 2, 1, 3, 2, 5, 4]) === [4, 1, 2, 3, 5]
   * </pre>
   *
   * @param inputArray  the input array to be de-duped
   * @param <T>         the type of the array
   * @return            an array that does not contain any duplicates
   */
  public <T extends Comparable<T>> T[] removeDuplicates(T[] inputArray) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }
}