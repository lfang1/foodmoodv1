/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notification;

import java.util.Date;
/**
 *
 * @author siqitang
 */
public class Notification {
    private String memo;
    private Date time;
    
    public Notification(String memo, Date time){
        this.memo = memo;
        this.time = time;
    }
    /**
     * 
     * @return get the memo for notification
     */
    public String getMemo(){
        return memo;
    }
    /**
     * 
     * @param username set the memo for notification
     */
    public void setMemo(String memo){
        this.memo = memo;
    }
    
    /**
     * 
     * @return get the time for notification
     */
    public Date getTime(){
        return time;
    }
    /**
     * 
     * @param username set the time for notification
     */
    public void setTime(Date time){
        this.time = time;
    }
}