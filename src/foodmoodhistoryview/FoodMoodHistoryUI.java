/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodhistoryview;

import foodmoodhistorycntl.FoodMoodHistoryCntl;

/**
 *
 * @author Le
 */
public class FoodMoodHistoryUI {
    
    private FoodMoodHistoryCntl myFoodMoodHistoryCntl;
    private String foodHistory;
    private String moodHistory;
    
    /**
     * This is the default constructor.
     * @param newFoodMoodHistoryCntl A FoodMoodHistoryCntl assigned to myFoodMoodHistoryCntl.
     */
    public FoodMoodHistoryUI(FoodMoodHistoryCntl newFoodMoodHistoryCntl) {
        
        myFoodMoodHistoryCntl = newFoodMoodHistoryCntl;
        foodHistory = "";
        moodHistory = "";
    }
    
    /**
     * Print out the food and mood history of the user.
     */
    public void updateFoodMoodHistory() {
        
        foodHistory = myFoodMoodHistoryCntl.getFoodHistory().toString();
        moodHistory = myFoodMoodHistoryCntl.getMoodHistory().toString();
        
        System.out.println("Your food history: " + foodHistory);
        System.out.println("Your mood history: " + moodHistory);
        
    }
    
}