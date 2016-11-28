package com.pressassociation.test.interfaces;

import java.util.Collection;

/**
 * Interface for message dispatcher.
 * <p>
 * No implementation is required.
 */
public interface Dispatcher {

  /**
   * Dispatch an article to a number of users.
   * <p>
   * This method is thread-safe and return quickly after accepting the request to dispatch.
   *
   * @param users   the users to set the article to
   * @param article the article to dispatch
   */
  void dispatch(Collection<String> users, String article);
}
