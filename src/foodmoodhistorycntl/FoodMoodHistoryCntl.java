/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodhistorycntl;

import food.FoodList;
import foodmoodhistory.FoodMoodHistory;
import mood.MoodList;

/**
 *
 * @author Le
 */
public class FoodMoodHistoryCntl {
    
    private FoodMoodHistory myFoodMoodHistory;
    
    /**
     * This is the default constructor.
     * @param userID An int representing the userID.
     */
    public FoodMoodHistoryCntl(int userID) {
        
        myFoodMoodHistory = new FoodMoodHistory(userID);
        
    }
    
    /**
     * Get the food history of the user.
     * @return A FoodList representing the food history.
     */
    public FoodList getFoodHistory() {
        
        return myFoodMoodHistory.getFoodList();
        
    }
    
    /**
     * Get the mood history of the user
     * @return A MoodList representing the mood history.
     */
    public MoodList getMoodHistory() {
        
        return myFoodMoodHistory.getMoodList();
        
    }
    
    
    
}