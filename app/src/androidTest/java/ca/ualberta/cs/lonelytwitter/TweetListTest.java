package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by xizi on 9/29/16.
 * @author xizi
 * @since 1.4
 * @see  NormalTweet
 * @see java.io.BufferedInputStream
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public  TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.add(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnTweet = tweets.getTweet(0);
        assertEquals(returnTweet.getMessage(), tweet.getMessage());
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        Date date1 = new Date("2001/12/12");
        Date date2 = new Date("1990/11/11");
        Tweet tweet1 = new NormalTweet("a",date1);
        tweets.add(tweet1);
        Tweet tweet2 = new NormalTweet("b",date2);
        tweets.add(tweet2);

        ArrayList<Tweet> tweet_reuslt = tweets.getTweets();
        assertEquals(tweet_reuslt.get(0).getMessage(), "b");

    }
}
