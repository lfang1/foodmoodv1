
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author siqitang
 */
public class Notification {
    private Date time;
    private String memo;

    /**
     * This is a constructor for UserProfileEntry.Users should enter the time
     * and their memo message.
     * 
     * @param time The notification time that user wants
     * @param memo The notification message
     */
    public Notification(Date time, String memo)
    {
        this.time = time;
        this.memo = memo;
    }

    /**
     * 
     * @return the time entered
     */
    public Date getTime(){
        return time;
    }

    /**
     * 
     * @param time set the time
     * @throws ParseException 
     */
    public void setTime(int time) throws ParseException{
        this.time = new SimpleDateFormat("HH:mm:ss")
                          .parse(Integer.toString(time));
    }    
    
    /**
     * 
     * @return the memo entered
     */
    public String getMemo(){
        return memo;
    }
    
    /**
     * 
     * @param memo the password that needs to be set
     */
    public void setMemo(String memo){
        this.memo = memo;
    }
}