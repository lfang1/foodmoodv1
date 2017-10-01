/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodstats;

import food.FoodList;
import mood.MoodList;

/**
 *
 * @author rdb5279
 */
public class FoodMoodStats {
    
    private FoodList foodList;
    private MoodList moodList;
    
    /**
     * This is the default constructor for the FoodMoodStats class. This 
     * class is where all FoodList and MoodList are stored.
     */
    public FoodMoodStats () {
        
    }
    
    /**
     * This method will print out a history of the user's entries (utilizing the
     * toString() method in each individual entry)
     * @return a more readable view of the user's history of entries
     */
    @Override
    public String toString () {
        String entryList = "";
        return entryList;
    }

    /**
     * @return the foodList
     */
    public FoodList getFoodList() {
        return foodList;
    }

    /**
     * @param foodList the foodList to set
     */
    public void setFoodList(FoodList foodList) {
        this.foodList = foodList;
    }

    /**
     * @return the moodList
     */
    public MoodList getMoodList() {
        return moodList;
    }

    /**
     * @param moodList the moodList to set
     */
    public void setMoodList(MoodList moodList) {
        this.moodList = moodList;
    }
}
