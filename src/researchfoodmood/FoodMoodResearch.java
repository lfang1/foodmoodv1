/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchfoodmood;
import FoodMoodCorrelation.FoodMoodCorrelation;
import chartfoodmood.FoodMoodChart;
/**
 *
 * @author Chawa
 */
public class FoodMoodResearch {
    
    private FoodMoodCorrelation myCorrelation;
    private FoodMoodChart myChart;
    private int food; //food from research input
    
    /*
    * This is the default constructor for the FoodMoodResearch class.
    */
    public FoodMoodResearch(){
        
    }
    
    /**
     * Return food mood correlation result.
     */
    public FoodMoodCorrelation researchCorrelation(int food){
        return myCorrelation;
       
    }
    
    /**
     * Return food mood chart result.
     */
    public FoodMoodChart researchChart(int food){
        return myChart;
    }
}
