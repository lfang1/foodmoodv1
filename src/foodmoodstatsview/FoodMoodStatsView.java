/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodStatsView;

import FoodMoodStatsCntl.FoodMoodStatsCntl;

/**
 *
 * @author Ray
 */
public class FoodMoodStatsView {
    
    private FoodMoodStatsCntl myController;
    
    /**
     * This is the default constructor for the FoodMoodStatsView. 
     */
    public FoodMoodStatsView () {

    }
    
    /**
     * The controller will be initialized as the corresponding FoodMoodStatsCntl. 
     * This constructor will initialize the UI with the list of all 
     * FoodMoodEntrys from the user or local data's history.
     * All UI interactions will be handled by private methods/variables and by 
     * the parent controller on the backend.
     * @param controller the parent controller (FoodMoodStatsCntl)
     */
    public FoodMoodStatsView (FoodMoodStatsCntl controller) {
        myController = controller;
    }
}
