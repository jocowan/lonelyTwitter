package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by jcowan on 9/13/17.
 */

public class Sad extends Mood{
    public Sad(String currentMood){
        super(currentMood);
    }
    public Sad(String currentMood, Date date){
        super(currentMood, date);
    }

    @Override
    public Boolean isHappy(){
        return Boolean.FALSE;
    }
}
