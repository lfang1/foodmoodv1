/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodhistory;

import java.util.ArrayList;

/**
 *
 * @author Le
 */
public class FoodMoodHistory {
    
    private ArrayList<Food> myFoodList;
    private ArrayList<Mood> myMoodList;
    
    /** 
     * This is the default constructor.
     */
    public FoodMoodHistory(ArrayList<Food> foodList, ArrayList<Mood> moodList) {
        
        myFoodList = foodList;
        myMoodList = moodList;
                
    }
     
}
