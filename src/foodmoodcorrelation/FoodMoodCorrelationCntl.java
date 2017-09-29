/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodCorrelation;

/**
 *
 * @author Le
 */
public class FoodMoodCorrelationCntl {
    
    private FoodMoodCorrelation fmc;
    private FoodMoodCorrelationUI fmcUI;
    
    /**
     * This is the default constructor for the FoodMoodCorrelationCntl class.
     */
    public FoodMoodCorrelationCntl() {
        
        fmc = new FoodMoodCorrelation();
        fmcUI = new FoodMoodCorrelationUI();
        
    }
    
    /**
     * Returns the food mood correlation.
     * @return A FoodMoodCorrelation class representing the food mood correlation.
     */
    public FoodMoodCorrelation getFoodMoodCorrelation() {
        
        return fmc;
        
    }
    
    /**
     * Call the FoodMoodCorrelationUI to print new food mood correlation.
     */
    public void updateFoodMoodCorrelationUI(){
        
        fmcUI.printOutFoodMoodCorrelation();
        
    }
    
}
