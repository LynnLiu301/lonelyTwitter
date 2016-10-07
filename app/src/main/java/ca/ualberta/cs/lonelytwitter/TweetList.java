package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * Created by xizi on 9/29/16.
 */
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public TweetList(){

    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
        //tweet.getDate();
    }

    public void add(Tweet tweet){
        if (tweets.contains(tweet)){
            throw new IllegalArgumentException("Already in list");
        }else{
            tweets.add(tweet);
        }
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
        Date date1 = new Date();
        //date1.compareTo()
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets);
        return tweets;
    }

    public int getCount(ArrayList<Tweet> tweets){
        return tweets.size();

    }

}
