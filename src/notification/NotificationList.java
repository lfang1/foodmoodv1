/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notification;

import java.util.ArrayList;

/**
 *
 * @author siqitang
 */
public class NotificationList{
    private ArrayList<Notification> NotificationList;
    
    /**
     * This is the default constructor for the NotificationList class. This 
     * class is a list where all the Notifications are stored.
     */
    public NotificationList() {
        NotificationList = new ArrayList<Notification>();
    }
    
    /**
     * This method adds a user's notificaiton into the list of entries.
     * @param entry the NotificationEntry to be added into the user's 
     * notification list.
     */
    public void addNotification(Notification entry) {
        
    }
    
}
    