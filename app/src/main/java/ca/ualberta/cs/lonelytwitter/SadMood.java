package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xizi on 9/15/16.
 */
public class SadMood extends Mood{

    public SadMood(String message){
        super(message);
    }

    public SadMood(String message, Date date){
        super(message,date);
    }

    @Override
    public String isMood(){
        return "SadMood";
    }
}
