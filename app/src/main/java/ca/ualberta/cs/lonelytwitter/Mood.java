package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by xizi on 9/15/16.
 */
public abstract class Mood {
    private String message;
    private Date date;

    public Mood(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Mood(String message, Date date){
        this.message = message;
        this.date = date;
    }

    public abstract  String isMood();

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }
}
