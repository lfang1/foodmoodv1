/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodstatscntl;

import UserProfileCntl.UserProfileCntl;
import user.*;
import foodmoodstats.FoodMoodStats;
import food.Food;
import foodcntl.FoodCntl;
import foodmoodstatsview.FoodMoodStatsView;
import foodreccntl.FoodRecCntl;
import mood.Mood;
import moodcntl.MoodCntl;
import notificationcntl.NotificationCntl;
/**
 *
 * @author rdb5279
 */
public class FoodMoodStatsCntl {
    
    private User user;
    private FoodMoodStats foodMoodStats;
    private FoodMoodStatsView view;

    
    
    /**
     * This is a FoodMoodStatsCntl constructor. It will initialize the 
     * FoodMoodStatsView, pull up the selected date's entries, and control actions
     * performed on that interface. The date is automatically selected as the 
     * current date. In this case, the entry list will be pulled from the user's 
     * profile and the date's entry list will be pulled by a private method.
     */
    public FoodMoodStatsCntl() {
        if (user != null) 
            foodMoodStats = user.getFoodMoodEntries();
        else 
            foodMoodStats = new FoodMoodStats();
        view = new FoodMoodStatsView(this, foodMoodStats.getFoodList(), foodMoodStats.getMoodList());
    }
    
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to add a new Food on the FoodMoodStatsView. Thus, this 
     * will initialize the FoodCntl class to start that sequence.
     */
    public void addFoodEntry () {
        FoodCntl foodCntl = new FoodCntl(this);
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to edit an existing Food on the FoodMoodStatsView. Thus, 
     * this will initialize the FoodCntl class to start that sequence 
     * with the selected entry's information pre-written in the text fields.
     * @param index to find the food to be edited
     */
    public void editFoodEntry(int index) {
        Food entry = foodMoodStats.getFoodList().findEntry(index);
        FoodCntl foodCntl = new FoodCntl(this, entry);
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to delete an existing Food on the FoodMoodStatsView. Thus, 
     * this will delete the entry from the user's entry list.
     * @param index to find the food entry and remove it
     */
    public void deleteFoodEntry (int index) {
        foodMoodStats.getFoodList().deleteEntry(index);
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to add a new Mood on the FoodMoodStatsView. Thus, this 
     * will initialize the MoodCntl class to start that sequence.
     */
    public void addMoodEntry () {
        MoodCntl moodCntl = new MoodCntl(this);
    }
    /**
     * This method will be activated after the user hits the corresponding 
     * button to edit an existing Mood on the FoodMoodStatsView. Thus, 
     * this will initialize the MoodCntl class to start that sequence 
     * with the selected entry's information pre-written in the text fields.
     * @param index to find the entry to be edited
     */
    public void editMoodEntry(int index) {
        Mood entry = foodMoodStats.getMoodList().findEntry(index);
        MoodCntl moodCntl = new MoodCntl(this, entry);
    }
    
    /**
     * This method will be activated after the user hits the corresponding 
     * button to delete an existing Mood on the FoodMoodStatsView. Thus, 
     * this will delete the entry from the user's entry list.
     * @param index to find the entry to be deleted
     */
    public void deleteMoodEntry (int index) {
        foodMoodStats.getMoodList().deleteEntry(index);
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view notifications or edit notification settings. Thus, 
     * this will initialize the NotificationCntl.
     */
    public void openNotifications () {
        NotificationCntl notificationCntl = new NotificationCntl();
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view user's profile settings. Thus, this will 
     * initialize the ProfileCntl.
     */
    public void openUserProfileSettings () {
        UserProfileCntl userProfileCntl = new UserProfileCntl();
    }
    
    /**This method will be activated after the user hits the corresponding 
     * menu button to view food recommendations. Thus, this will 
     * initialize the FoodRecommendationCntl.
     */
    public void openFoodRecommendations () {
        FoodRecCntl foodRecCntl = new FoodRecCntl();
        
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
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

}
