/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsCntl;

import FoodMoodEntry.FoodMoodEntryList;
import LandingPageCntl.LandingPageCntl;

/**
 *
 * @author Ray
 */
public class FoodMoodStatsCntl {
    
    private LandingPageCntl myController;
    private FoodMoodEntryList myEntryList;
    
    /**
     * This is the default constructor for FoodMoodStatsCntl.
     */
    public FoodMoodStatsCntl () {
        
    }
    
    /**
     * This constructor will initialize the FoodMoodStatsView and set the parent
     * controller. The history of entries displayed will be based on the 
     * FoodMoodEntryList pulled from the parent controller.
     * @param controller the parent controller (LandingPageCntl)
     * @param entryList the list of all entries (from local data or user data)
     */
    public FoodMoodStatsCntl (LandingPageCntl controller, 
            FoodMoodEntryList entryList) {
        myController = controller;
        myEntryList = entryList;
    }
    
    /**
     * This method will filter the history of user entries based upon how
     * the user has selected to filter. The myEntryList will be modified with 
     * private methods based upon which filter was selected.
     */
    public void filterEntries () {
        
    }
    /**
     * This method brings the user back to the landing page.
     */
    public void goBack () {
        
    }
}
