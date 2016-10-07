package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * Created by xizi on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList(){

    }

    /**
     * Has tweet boolean.
     *
     * @param tweet the tweet
     * @return the boolean
     */
    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
        //tweet.getDate();
    }

    /**
     * Add.
     *
     * @param tweet the tweet
     */
    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Already in list");
        }else{
            tweets.add(tweet);
        }
    }

    /**
     * Delete.
     *
     * @param tweet the tweet
     */
    public void delete(Tweet tweet){
        tweets.remove(tweet);
        Date date1 = new Date();
        //date1.compareTo()
    }

    /**
     * Get tweet tweet.
     *
     * @param index the index
     * @return the tweet
     */
    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    /**
     * Get tweets array list.
     *
     * @return the array list
     */
    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets);
        return tweets;
    }

    /**
     * Get count int.
     *
     * @param tweets the tweets
     * @return the int
     */
    public int getCount(ArrayList<Tweet> tweets){
        return tweets.size();

    }

}
