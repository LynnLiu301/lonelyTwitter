package ca.ualberta.cs.lonelytwitter;

/**
 * Created by xizi on 9/15/16.
 */
public class NormalTweet extends Tweet implements Tweetable{
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
