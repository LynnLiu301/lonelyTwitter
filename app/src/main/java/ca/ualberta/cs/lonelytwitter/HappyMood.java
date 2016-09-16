package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xizi on 9/15/16.
 */
public class HappyMood extends Mood {

    public HappyMood(String message){
        super(message);
    }

    public HappyMood(String message, Date date){
        super(message,date);
    }

    @Override
    public String isMood(){
        return "HappyMood";
    }


}
