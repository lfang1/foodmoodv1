/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcntl;

import food.Food;
import foodmoodstatscntl.FoodMoodStatsCntl;

/**
 *
 * @author rdb5279
 */
public class FoodCntl {
    
    private FoodMoodStatsCntl myController;
    private Food entry;
    
 
    /**
     * This is the default constructor for FoodCntl. This will 
     * initialize the FoodView and set the parent controller. This 
     * constructor will handle the creation of a Food.
     * @param controller the parent controller
     */
    public FoodCntl (FoodMoodStatsCntl controller) {
        myController = controller;
    }
    
    /**
     * This is a constructor for FoodCntl. This will initialize the 
     * FoodView,set the parent controller, and set the text fields 
     * of the view to match those already entered in the original entry. This 
     * constructor will handle the updates of a Food.
     * @param controller the parent controller
     * @param theEntry the original entry to be updated
     */
    public FoodCntl (FoodMoodStatsCntl controller,Food theEntry) {
        myController = controller;
        entry = theEntry;
    }
    
    /**
     * This method will submit a Food with the information entered
     * into the view. The FoodMoodEntry will be added to the user's list or the 
     * local data's list of entries.
     * @return the FoodMoodEntry to be added to the user's list
     */
    public Food submitEntry () {
        Food newEntry = new Food();
        return newEntry;
    }
    
    /**
     * This method will cancel the Food submission and bring the user 
     * back to the landing page.
     */
    public void cancelEntry () {
        
    }
}
