package com.pressassociation.test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.pressassociation.test.interfaces.Dispatcher;
import java.util.ArrayList;
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
  //Responsible for holding all subscriptions details i.e. users + keywords
  private Multimap<String, String> subscriptionsMultimap = ArrayListMultimap.create();

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
    //If subscription doesn't exist and given values are not null then adds the subscription
    if (!subscriptionsMultimap.containsEntry(keyword,user) & (user!=null & keyword!=null)){
      subscriptionsMultimap.put(keyword, user);
      return true;
    }
    return false;
  }

  /**
   * Remove a subscription (by keyword) for a user.
   *
   * @param user    the user to remove the subscription from
   * @param keyword the keyword for the subscription
   * @return        whether a subscription has been removed, will return false if not already subscribed
   */
  public boolean removeUserSubscription(String user, String keyword) {
   //Given subscription exists then it will remove it otherwise it will not and returns false
   if (subscriptionsMultimap.containsEntry(keyword, user)){
     subscriptionsMultimap.remove(keyword, user);
     return true;
   }
   return false;
  }

  /**
   * Determine whether there is a subscription (by keyword) for a user.
   *
   * @param user    the user to check the subscription for
   * @param keyword the keyword for the subscription
   * @return        whether the user is currently has the given subscription
   */
  public boolean isUserSubscribed(String user, String keyword) {
    //Multimap checked to see if subscription exists if it does then returns true other wise false
    if(subscriptionsMultimap.containsEntry(keyword, user)){
      return  true;
    }
    return false;
  }

  /**
   * Publish an article to all users that are subscribed to the {@link Set} of keywords associated with this
   * article.
   *
   * @param keywords  the associated keywords
   * @param article   the article to publish
   */
  public void publishArticle(Set<String> keywords, String article) {
    //List contains names of those the article shall be dispatched
    ArrayList<String> userDispatchList  = new ArrayList<>();
    //casting set to array so it can be indexed in a loop
    String[] keywordList = keywords.toArray(new String[keywords.size()]);

    for(int i = 0; i < keywordList.length; i++){
      //if the keyword has subscription then add name of user(s) to userDispatchList
      if (subscriptionsMultimap.containsKey(keywordList[i])){
        userDispatchList.addAll(subscriptionsMultimap.get(keywordList[i]));
      }
    }
    //dispatches published article to all subscribed users
   dispatcher.dispatch(userDispatchList, article);
  }
}
