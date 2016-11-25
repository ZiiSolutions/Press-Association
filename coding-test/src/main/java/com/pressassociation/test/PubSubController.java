package com.pressassociation.test;

import com.pressassociation.test.interfaces.Dispatcher;

import java.util.Set;

import static java.util.Objects.requireNonNull;

/**
 * Implements an object that functions as pub/sub controller that could be used to back a web frontend.
 * <p>
 * The dispatcher is a given implementation that handles all of the actual dispatching to users logic.
 * <p>
 * A user may have any number of subscriptions to keywords, when an article that matches at least one of their
 * keywords is published then they should be (via the dispatcher) sent the article.
 * <p>
 * A user may subscribe or unsubscribe to keywords at any time.
 */
public class PubSubController {

  private final Dispatcher dispatcher;

  /**
   * Constructor for the pub/sub controller.
   *
   * @param dispatcher  the article dispatcher
   */
  public PubSubController(Dispatcher dispatcher) {
    this.dispatcher = requireNonNull(dispatcher, "dispatcher must not be null");
  }

  /**
   * Add a subscription (by keyword) for a user.
   *
   * @param user    the user to add the subscription to
   * @param keyword the keyword for the subscription
   * @return        whether a new subscription has been added, will return false if already subscribed
   */
  public boolean addUserSubscription(String user, String keyword) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }

  /**
   * Remove a subscription (by keyword) for a user.
   *
   * @param user    the user to remove the subscription from
   * @param keyword the keyword for the subscription
   * @return        whether a subscription has been removed, will return false if not already subscribed
   */
  public boolean removeUserSubscription(String user, String keyword) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }

  /**
   * Determine whether there is a subscription (by keyword) for a user.
   *
   * @param user    the user to check the subscription for
   * @param keyword the keyword for the subscription
   * @return        whether the user is currently has the given subscription
   */
  public boolean isUserSubscribed(String user, String keyword) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }

  /**
   * Publish an article to all users that are subscribed to the {@link Set} of keywords associated with this
   * article.
   *
   * @param keywords  the associated keywords
   * @param article   the article to publish
   */
  public void publishArticle(Set<String> keywords, String article) {
    throw new UnsupportedOperationException("This function has yet to be implemented");
  }
}
