/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodrec;

import foodmoodcorrelation.FoodMoodCorrelation;
import java.util.ArrayList;

/**
 *
 * @author siqitang
 */
public class FoodRecList {
    private ArrayList<FoodMoodCorrelation> arr;
    
    /**
     * This is the default constructor 
     */
    public FoodRecList () {
        arr = new ArrayList<FoodMoodCorrelation>();
    }
}