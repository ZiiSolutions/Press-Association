package com.pressassociation.test;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.util.Arrays.array;

/**
 * Tests for {@link Deduplicator}.
 */
public class DeduplicatorTest {

  private Deduplicator deduplicator;

  @Before
  public void setUp() {
    deduplicator = new Deduplicator();
  }

  @Test
  public void testRemoveDuplicates_strings() {
    assertThat(deduplicator.removeDuplicates(array("a", "b", "c")))
        .isEqualTo(array("a", "b", "c"));
  }

  @Test
  public void testRemoveDuplicates_duplicateStrings() {
    assertThat(deduplicator.removeDuplicates(array("a", "b","b", "c")))
            .isEqualTo(array("a", "b", "c"));
  }

  @Test
  public void testRemoveDuplicates_ints() {
    assertThat(deduplicator.removeDuplicates(array(1, 2, 3, 4)))
            .isEqualTo(array(1, 2, 3, 4));
  }

  @Test
  public void testRemoveDuplicates_duplicateInts() {
    assertThat(deduplicator.removeDuplicates(array(1, 2,2, 3,1, 4)))
        .isEqualTo(array(1, 2, 3, 4));
  }

  @Test
  public void testRemoveDuplicates_Characters() {
    assertThat(deduplicator.removeDuplicates(array('a','b','c')))
            .isEqualTo(array('a','b','c'));
  }

  @Test
  public void testRemoveDuplicates_duplicateCharacters() {
    assertThat(deduplicator.removeDuplicates(array('a','b','b','c','b')))
            .isEqualTo(array('a','b','c'));
  }




}
