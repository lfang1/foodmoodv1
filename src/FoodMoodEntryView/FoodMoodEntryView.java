/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodEntryView;

import FoodMoodEntryCntl.FoodMoodEntryCntl;

/**
 *
 * @author Ray
 */
public class FoodMoodEntryView {
    
    private FoodMoodEntryCntl myController;
    /**
     * This is the default constructor for the LandingPageView. 
     */
    public FoodMoodEntryView () {

    }
    
    /**
     * This controller will be initialized as the corresponding FoodEntryCntl.
     * This constructor will initialize the UI with blank text fields by 
     * default. All UI interactions will be handled by private methods/variables
     * and by the parent controller on the backend.
     * @param controller the parent controller (FoodMoodEntryCntl)
     */
    public FoodMoodEntryView (FoodMoodEntryCntl controller) {
        myController = controller;
    }
}
