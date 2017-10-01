/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodstatscntl;

import java.util.Date;
import foodmoodstats.FoodMoodStats;
import food.Food;
import mood.Mood;
/**
 *
 * @author rdb5279
 */
public class FoodMoodStatsCntl {
    
    private String user;
    private FoodMoodStats foodMoodStats;
    private FoodMoodStats foodMoodDateStats;
    private Date date;
    
    /**
     * This is the default FoodMoodStatsCntl constructor. It will initialize the 
     * FoodMoodStatsView, pull up the selected date's entries, and control actions
     * performed on that interface. The date is automatically selected as the 
     * current date. In this case, the entry list will be pulled from the app's 
     * local history and the date's entry list will be pulled by a private 
     * method.
     */
    public FoodMoodStatsCntl () {
        
    }
    
    /**
     * This is a FoodMoodStatsCntl constructor. It will initialize the 
     * FoodMoodStatsView, pull up the selected date's entries, and control actions
     * performed on that interface. The date is automatically selected as the 
     * current date. In this case, the entry list will be pulled from the user's 
     * profile and the date's entry list will be pulled by a private method.
     * @param theUser the user whose data will be pulled/pushed for the app
     */
    public FoodMoodStatsCntl(String theUser) {
        user = theUser;
    }
    
    /**
     * This method will be called to update the list of entries shown on the 
     * landing page in case the user has switched the selected date.
     */
    private void setDateEntries () {
        
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to add a new Food on the FoodMoodStatsView. Thus, this 
     * will initialize the FoodCntl class to start that sequence.
     */
    public void addFoodEntry () {
        
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to edit an existing Food on the FoodMoodStatsView. Thus, 
     * this will initialize the FoodCntl class to start that sequence 
     * with the selected entry's information pre-written in the text fields.
     * @param entry the entry to be edited
     */
    public void editFoodEntry(Food entry) {
        
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to delete an existing Food on the FoodMoodStatsView. Thus, 
     * this will delete the entry from the user's entry list.
     * @param entry 
     */
    public void deleteFoodEntry (Food entry) {
        
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to add a new Mood on the FoodMoodStatsView. Thus, this 
     * will initialize the MoodCntl class to start that sequence.
     */
    public void addMoodEntry () {
        
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to edit an existing Mood on the FoodMoodStatsView. Thus, 
     * this will initialize the MoodCntl class to start that sequence 
     * with the selected entry's information pre-written in the text fields.
     * @param entry the entry to be edited
     */
    public void editMoodEntry(Mood entry) {
        
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to delete an existing Mood on the FoodMoodStatsView. Thus, 
     * this will delete the entry from the user's entry list.
     * @param entry 
     */
    public void deleteMoodEntry (Mood entry) {
        
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
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the foodMoodStats
     */
    public FoodMoodStats getFoodMoodStats() {
        return foodMoodStats;
    }

    /**
     * @param foodMoodStats the foodMoodStats to set
     */
    public void setFoodMoodStats(FoodMoodStats foodMoodStats) {
        this.foodMoodStats = foodMoodStats;
    }

    /**
     * @return the foodMoodDateStats
     */
    public FoodMoodStats getFoodMoodDateStats() {
        return foodMoodDateStats;
    }

    /**
     * @param foodMoodDateStats the foodMoodDateStats to set
     */
    public void setFoodMoodDateStats(FoodMoodStats foodMoodDateStats) {
        this.foodMoodDateStats = foodMoodDateStats;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }
    
}
