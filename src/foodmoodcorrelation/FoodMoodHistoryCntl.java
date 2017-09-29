/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodCorrelation;

import FoodMoodEntry.FoodMoodEntry;
import java.util.ArrayList;

/**
 *
 * @author Le
 */
public class FoodMoodHistoryCntl {
    
    private FoodMoodHistory foodHistory;
    
    /**
     * This is the default constructor for FoodMoodHistoryCntl class.
     * @param foodMoodHistory 
     */
    public FoodMoodHistoryCntl(FoodMoodHistory foodMoodHistory) {              
        
        this.foodHistory = foodHistory;
        
    }
    
    /**
     * Returns food history.
     * @return An ArrayList of the FoodMoodEntry class
     */
    public ArrayList<FoodMoodEntry> getFoodHistory() {
        
        return foodHistory.getFoodHistory();
        
    }
    
    
}
