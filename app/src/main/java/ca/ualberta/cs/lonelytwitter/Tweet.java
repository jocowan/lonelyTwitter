package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcowan on 9/13/17.
 */

public abstract class Tweet implements Tweetable{
    private String message;
    private Date date;
    private Mood mood;

    public Tweet(String message){
        date = new Date();
        this.message = message;
    }

    public Tweet(String message, Date date){
        this.date = date;
        this.message = message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if(message.length()<140){
            this.message = message;
        }else{
            throw new TweetTooLongException();

        }
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public Date getDate() {
        return date;
    }

    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}

