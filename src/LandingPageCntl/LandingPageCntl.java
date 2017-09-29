/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LandingPageCntl;

import FoodMoodEntry.*;
import java.util.Date;

/**
 *
 * @author Ray
 */
public class LandingPageCntl {
    
    private String myUser;
    private FoodMoodEntryList myEntryList;
    private FoodMoodEntryList myDateEntryList;
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
    /**
     * This is a LandingPageCntl constructor. It will initialize the 
     * LandingPageView, pull up the selected date's entries, and control actions
     * performed on that interface. The date is automatically selected as the 
     * current date. In this case, the entry list will be pulled from the user's 
     * profile and the date's entry list will be pulled by a private method.
     */
    public LandingPageCntl(String user) {
        myUser = user;
    }
    /**
     * This method will be called to update the list of entries shown on the 
     * landing page in case the user has switched the selected date.
     */
    private void setDateEntries () {
        
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to add a new FoodMoodEntry on the LandingPageView. Thus, this 
     * will initialize the FoodMoodEntryCntl class to start that sequence.
     */
    public void addEntry () {
        
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to edit an existing FoodMoodEntry on the LandingPageView. Thus, 
     * this will initialize the FoodMoodEntryCntl class to start that sequence 
     * with the selected entry's information pre-written in the text fields.
     * @param entry the entry to be edited
     */
    public void editEntry(FoodMoodEntry entry) {
        
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to delete an existing FoodMoodEntry on the LandingPageView. Thus, 
     * this will delete the entry from the user's entry list.
     * @param entry 
     */
    public void deleteEntry (FoodMoodEntry entry) {
        
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view the history of entries in list form. Thus, this will 
     * initialize the FoodMoodStatsCntl.
     */
    public void openFoodMoodStats () {
        
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view notifications or edit notification settings. Thus, 
     * this will initialize the NotificationCntl.
     */
    public void openNotifications () {
        
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view user's profile settings. Thus, this will 
     * initialize the ProfileCntl.
     */
    public void openUserProfileSettings () {
        
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view food recommendations. Thus, this will 
     * initialize the FoodRecommendationCntl.
     */
    public void openFoodRecommendations () {
        
    }
    /**
     * @return the list of all user entries
     */
    public FoodMoodEntryList getMyEntryList() {
        return myEntryList;
    }

    /**
     * @param myEntryList the list of all user entries to set
     */
    public void setMyEntryList(FoodMoodEntryList myEntryList) {
        this.myEntryList = myEntryList;
    }

    /**
     * @return the list of entries for the selected date
     */
    public FoodMoodEntryList getMyDateEntryList() {
        return myDateEntryList;
    }

    /**
     * @param myDateEntryList the list of entries for the selected date to set
     */
    public void setMyDateEntryList(FoodMoodEntryList myDateEntryList) {
        this.myDateEntryList = myDateEntryList;
    }

    /**
     * @return the selected date
     */
    public Date getMyDate() {
        return myDate;
    }

    /**
     * @param myDate the selected date to set
     */
    public void setMyDate(Date myDate) {
        this.myDate = myDate;
    }
}
