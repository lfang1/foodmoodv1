/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodstatsview;

import foodmoodstatscntl.FoodMoodStatsCntl;
import mood.MoodList;
import food.FoodList;

/**
 *
 * @author rdb5279
 */
public class FoodMoodStatsView {
    
    private FoodMoodStatsCntl myController;
    private FoodList dateFoodList;
    private MoodList dateMoodList;
    /**
     * This is the default constructor for the LandingPageView. 
     */
    public FoodMoodStatsView () {

    }
    
    /**
     * The controller will be initialized as the corresponding FoodMoodStatsCntl. 
     * This constructor will initialize the UI with the current date by default.
     * All UI interactions will be handled by private methods/variables and by 
     * the parent controller on the backend.
     * @param controller the parent controller (LandingPageCntl)
     * @param theDateFoodList the particular date's Food entries
     * @param theDateMoodList the particular date's Mood entries
     */
    public FoodMoodStatsView (FoodMoodStatsCntl controller, 
            FoodList theDateFoodList, MoodList theDateMoodList) {
        myController = controller;
        dateFoodList = theDateFoodList;
        dateMoodList = theDateMoodList;
    }
    
}
