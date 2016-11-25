package com.pressassociation.test;

import com.pressassociation.test.interfaces.Dispatcher;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.MockitoAnnotations.initMocks;

/**
 * Tests for {@link PubSubController}.
 */
public class PubSubControllerTest {

  @Mock
  private Dispatcher mockDispatcher;

  private PubSubController controller;

  @Before
  public void setUp() {
    initMocks(this);

    controller = new PubSubController(mockDispatcher);
  }

  @Test
  public void testAddUserSubscription() {
    assertThat(controller.addUserSubscription("user", "keyword"))
        .isTrue();

    verifyNoMoreInteractions(mockDispatcher);
  }

  @Test
  public void testRemoveUserSubscription() {
    controller.addUserSubscription("user", "keyword");

    assertThat(controller.removeUserSubscription("user", "keyword"))
        .isTrue();

    verifyNoMoreInteractions(mockDispatcher);
  }

  @Test
  public void testIsUserSubscribed() {
    controller.addUserSubscription("user", "keyword");

    assertThat(controller.isUserSubscribed("user", "keyword"))
        .isTrue();

    verifyNoMoreInteractions(mockDispatcher);
  }

  @Test
  public void testPublishArticle() {
    controller.addUserSubscription("user", "keyword");

    controller.publishArticle(ImmutableSet.of("keyword"), "the article");

    verifyDispatcher("the article", ImmutableSet.of("user"));
    verifyNoMoreInteractions(mockDispatcher);
  }

  private void verifyDispatcher(String article, String... expectedUsers) {
    verifyDispatcher(article, ImmutableSet.copyOf(expectedUsers));
  }

  private void verifyDispatcher(String article, Set<String> expectedUsers) {
    //noinspection unchecked
    ArgumentCaptor<Collection<String>> captor = ArgumentCaptor.forClass(Collection.class);
    verify(mockDispatcher).dispatch(captor.capture(), eq(article));
    List<String> callUsers = ImmutableList.copyOf(captor.getValue());
    Set<String> uniqueCallUsers = ImmutableSet.copyOf(callUsers);

    assertThat(callUsers)
        .hasSameSizeAs(uniqueCallUsers);

    assertThat(uniqueCallUsers)
        .isEqualTo(expectedUsers);
  }
}
