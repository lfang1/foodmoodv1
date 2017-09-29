/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LandingPageView;

import FoodMoodEntry.FoodMoodEntryList;
import LandingPageCntl.LandingPageCntl;

/**
 *
 * @author Ray
 */
public class LandingPageView {
    
    private LandingPageCntl myController;
    /**
     * This is the default constructor for the LandingPageView. 
     */
    public LandingPageView () {

    }
    
    /**
     * The controller will be initialized as the corresponding LandingPageCntl. 
     * This constructor will initialize the UI with the current date by default.
     * All UI interactions will be handled by private methods/variables and by 
     * the parent controller on the backend.
     * @param controller the parent controller (LandingPageCntl)
     */
    public LandingPageView (LandingPageCntl controller) {
        myController = controller;
    }
    
}
