/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodEntryCntl;

import FoodMoodEntry.FoodMoodEntry;
import LandingPageCntl.LandingPageCntl;

/**
 *
 * @author Ray
 */
public class FoodMoodEntryCntl {
    
    private LandingPageCntl myController;
    private FoodMoodEntry myEntry;
    
 
    /**
     * This is the default constructor for FoodMoodEntryCntl. This will 
     * initialize the FoodMoodView and set the parent controller. This 
     * constructor will handle the creation of a FoodMoodEntry.
     * @param controller the parent controller
     */
    public FoodMoodEntryCntl (LandingPageCntl controller) {
        myController = controller;
    }
    
    /**
     * This is a constructor for FoodMoodEntryCntl. This will initialize the 
     * FoodMoodView,set the parent controller, and set the text fields 
     * of the view to match those already entered in the original entry. This 
     * constructor will handle the updates of a FoodMoodEntry.
     * @param controller the parent controller
     * @param entry the original entry to be updated
     */
    public FoodMoodEntryCntl (LandingPageCntl controller, 
            FoodMoodEntry entry) {
        myController = controller;
        myEntry = entry;
    }
    
    /**
     * This method will submit a FoodMoodEntry with the information entered
     * into the view. The FoodMoodEntry will be added to the user's list or the 
     * local data's list of entries.
     * @return the FoodMoodEntry to be added to the user's list
     */
    public FoodMoodEntry submitEntry () {
        FoodMoodEntry newEntry = new FoodMoodEntry();
        return newEntry;
    }
    
    /**
     * This method will cancel the FoodMoodEntry submission and bring the user 
     * back to the landing page.
     */
    public void cancelEntry () {
        
    }
}
