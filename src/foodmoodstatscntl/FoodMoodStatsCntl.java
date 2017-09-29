/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodstatscntl;

import java.util.Date;

/**
 *
 * @author rdb5279
 */
public class FoodMoodStatsCntl {
    
    private String myUser;
    private FoodMoodStats myFoodMoodStats;
    private Date myDate;
    
    /**
     * This is the default LandingPageCntl constructor. It will initialize the 
     * LandingPageView, pull up the selected date's entries, and control actions
     * performed on that interface. The date is automatically selected as the 
     * current date. In this case, the entry list will be pulled from the app's 
     * local history and the date's entry list will be pulled by a private 
     * method.
     */
    public LandingPageCntl () {
        
    }
    
}
