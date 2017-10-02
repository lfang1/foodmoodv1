/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationcntl;

import foodmoodstatscntl.FoodMoodStatsCntl;
import java.util.Date;
import notification.Notification;
import notificationview.NotificationView;
/**
 *
 * @author siqitang
 */

public class NotificationCntl {
     private FoodMoodStatsCntl controller;
     private Notification nmsg;    
     
     /**
      * this is the default constructor
      */
     public NotificationCntl(){
        System.out.println("NotificationCntl is called");
     }
  
     /**
      * this constructor will display the notifications
      * @param controller
      * @param nmsg 
      */
     public NotificationCntl(FoodMoodStatsCntl controller, Notification nmsg){
        this.controller = controller;
        this.nmsg = nmsg;
        System.out.println("NotificationCntl is called");
     }

     /**
      * This constructor will handle when user create notification
      * @return 
      */
    public Notification createNotification (Date time, String memo) {
        Notification nmsg = new Notification(time, memo);
        System.out.println("createNotification is called");
        return nmsg;
    }

}
