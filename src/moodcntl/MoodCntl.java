/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodcntl;

import mood.Mood;
import foodmoodstatscntl.FoodMoodStatsCntl;
import moodview.MoodView;

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
     * constructor will handle the creation of a Mood.
     * @param controller the parent controller
     */
    public MoodCntl (FoodMoodStatsCntl controller) {
        System.out.println("MoodCntl initialized");
        myController = controller;
        MoodView view = new MoodView(this);
    }
    
    /**
     * This is a constructor for MoodCntl. This will initialize the 
     * MoodView,set the parent controller, and set the text fields 
     * of the view to match those already entered in the original entry. This 
     * constructor will handle the updates of a Mood.
     * @param controller the parent controller
     * @param theEntry the original entry to be updated
     */
    public MoodCntl (FoodMoodStatsCntl controller,Mood theEntry) {
        System.out.println("MoodCntl initialized");
        myController = controller;
        entry = theEntry;
        MoodView view = new MoodView(this, entry);
    }
    
    /**
     * This method will submit a Mood with the information entered
     * into the view. The FoodMoodEntry will be added to the user's list or the 
     * local data's list of entries.
     * @param moodType taken from views text box
     * @param calories taken from views text box
     */
    public void submitEntry (String moodType, double calories) {
        System.out.println("submitEntry went through");
        Mood newEntry = new Mood(moodType, calories);
        System.out.println("Entry to be added: " + newEntry.toString());
        myController.getFoodMoodStats().getMoodList().addEntry(newEntry);
    }
    
    /**
     * This method will cancel the Mood submission and bring the user 
     * back to the landing page.
     */
    public void cancelEntry () {
        System.out.println("Close MoodView and return to FoodMoodStatsView");
    }
}
