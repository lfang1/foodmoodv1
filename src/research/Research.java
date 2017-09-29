/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package research;
import foodmoodcorrelation.FoodMoodCorrelation;
import foodmoodchart.FoodMoodChart;
import food.FoodList;

/**
 *
 * @author Chawa
 */
public class Research {
    private FoodMoodCorrelation correlation;
    private FoodMoodChart chart;
    private FoodList food; 
    
    /*
    * This is the default constructor for the FoodMoodResearch class.
    */
    public Research(){
        
    }
    
    /**
     * Return food mood correlation result.
     */
    public FoodMoodCorrelation researchCorrelation(FoodList food){
        return correlation;
       
    }
    
    /**
     * Return food mood chart result.
     */
    public FoodMoodChart researchChart(FoodList food){
        return chart;
    }
    
    
}
