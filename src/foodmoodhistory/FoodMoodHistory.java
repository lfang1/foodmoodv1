/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodhistory;

import food.FoodList;
import mood.MoodList;

/**
 *
 * @author Le
 */
public class FoodMoodHistory {
    
    private int myUserID;
    private FoodList myFoodList;
    private MoodList myMoodList;
    
    /**
     * This is the default constructor.
     * @param theUserID A int representing the userID 
     */
    public FoodMoodHistory(int theUserID) {
        
        myUserID = theUserID;
        //FIXME: myFoodList and myMoodList should be filled with actual data.
        myFoodList = new FoodList();
        myMoodList = new MoodList();
        
    }
    
    /**
     * Get the FoodList of the user.
     * @return An ArrayList of Food class representing the FoodList of the user.
     */
    public FoodList getFoodList() {
        
        return myFoodList;
        
    }
    
    /**
     * Get the MoodList of the user.
     * @return An ArrayList of Mood class representing the MoodList of the user.
     */
    public MoodList getMoodList() {
        
        return myMoodList;
        
    }
    
}