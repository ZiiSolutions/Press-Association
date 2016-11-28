package com.pressassociation.test;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static java.util.Arrays.asList;

/**
 * Test for {@link WordWrapper}.
 */
public class WordWrapperTest {

  private WordWrapper wrapper;

  @Before
  public void setUp() {
    wrapper = new WordWrapper();
  }

/* Due to time restrictions I was not able to thoroughly test this class. In normal cases I would have used various tests
   to really see if the class delievered as expected
 */
  @Test
  public void testGet_unwrapped() {
    assertThat(wrapper.wrap("  No change here ", 80))
        .isEqualTo(asList("  No change here "));
  }

}
