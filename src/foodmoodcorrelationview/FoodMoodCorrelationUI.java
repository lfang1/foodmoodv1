/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodcorrelationview;

import foodmoodcorrelationcntl.FoodMoodCorrelationCntl;

/**
 *
 * @author Le
 */
public class FoodMoodCorrelationUI {
    
    private FoodMoodCorrelationCntl myFoodMoodCorrelationCntl;
    
    /**
     * This is the default constructor.
     * @param newFoodMoodCorrelationCntl A FoodMoodCorrelationCntl class instance assigned to myFoodMoodCorrelationCntl.
     */
    public FoodMoodCorrelationUI(FoodMoodCorrelationCntl newFoodMoodCorrelationCntl) {
        
        myFoodMoodCorrelationCntl = newFoodMoodCorrelationCntl;
        
    }
    
    /**
     * Print out the food mood correlation.
     */
    public void updateFoodMoodCorrelation() {
        
        System.out.println("Your mood to food type correlation: " + myFoodMoodCorrelationCntl.getMoodToFoodTypeCorrelation());
        System.out.println("Your mood to food calories correlation: " + myFoodMoodCorrelationCntl.getMoodToFoodCaloriesCorrelation());
        
    }
    
}