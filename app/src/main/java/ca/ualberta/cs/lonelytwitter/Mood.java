package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcowan on 9/13/17.
 */

public abstract class Mood {
    private String currentMood;
    private Date date;

    public Mood(String currentMood){
        date = new Date();
        this.currentMood=currentMood;
    }
    public Mood(String currentMood, Date date){
        this.date = date;
        this.currentMood = currentMood;
    }

    public String getMood(){
        return this.currentMood;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isHappy();
}
