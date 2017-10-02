/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodcorrelationcntl;

import foodmoodcorrelation.FoodMoodCorrelation;

/**
 *
 * @author Le
 */
public class FoodMoodCorrelationCntl {
    
    private FoodMoodCorrelation myFoodMoodCorrelation;
    
    public FoodMoodCorrelationCntl() {
        
    }
    
    /**
     * This is the default constructor.
     * @param newFoodMoodCorrelation A FoodMoodCorrelation class instance assigned to myFoodMoodCorrelation.
     */
    public FoodMoodCorrelationCntl(FoodMoodCorrelation newFoodMoodCorrelation) {
        
        myFoodMoodCorrelation = newFoodMoodCorrelation;
        
    }
    
    /**
     * Return a double representing mood to food type coefficient.
     * @return 
     */
    public double getMoodToFoodTypeCorrelation() {
        
        return myFoodMoodCorrelation.getMoodToFoodTypeCorrelation();
        
    }
    
    /**
     * Return a double representing mood to food calories coefficient.
     * @return 
     */
    public double getMoodToFoodCaloriesCorrelation() {
        
        return myFoodMoodCorrelation.getMoodToFoodCaloriesCorrelation();
        
    }
    
}