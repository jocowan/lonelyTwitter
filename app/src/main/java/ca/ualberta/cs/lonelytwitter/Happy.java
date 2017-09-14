package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcowan on 9/13/17.
 */

public class Happy extends Mood {
    public Happy(String currentMood){
        super(currentMood);
    }

    public Happy(String currentMood, Date date){
        super(currentMood, date);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.TRUE;
    }
}
