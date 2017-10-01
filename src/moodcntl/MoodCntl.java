/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodcntl;

import mood.Mood;
import foodmoodstatscntl.FoodMoodStatsCntl;

/**
 *
 * @author rdb5279
 */
public class MoodCntl {
    
    private FoodMoodStatsCntl myController;
    private Mood entry;
    
 
    /**
     * This is the default constructor for MoodCntl. This will 
     * initialize the MoodView and set the parent controller. This 
     * constructor will handle the creation of a Food.
     * @param controller the parent controller
     */
    public MoodCntl (FoodMoodStatsCntl controller) {
        myController = controller;
    }
    
    /**
     * This is a constructor for MoodCntl. This will initialize the 
     * MoodView,set the parent controller, and set the text fields 
     * of the view to match those already entered in the original entry. This 
     * constructor will handle the updates of a Food.
     * @param controller the parent controller
     * @param theEntry the original entry to be updated
     */
    public MoodCntl (FoodMoodStatsCntl controller,Mood theEntry) {
        myController = controller;
        entry = theEntry;
    }
    
    /**
     * This method will submit a Mood with the information entered
     * into the view. The Mood will be added to the user's list or the 
     * local data's list of entries.
     * @return the Mood to be added to the user's list
     */
    public Mood submitEntry () {
        Mood newEntry = new Mood();
        return newEntry;
    }
    
    /**
     * This method will cancel the Mood submission and bring the user 
     * back to the landing page.
     */
    public void cancelEntry () {
        
    }
}
