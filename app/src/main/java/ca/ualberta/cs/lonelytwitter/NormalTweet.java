package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by watts1 on 9/15/16.
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }


    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     * @param date    the date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }
    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
