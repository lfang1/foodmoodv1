/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodview;

import mood.Mood;
import moodcntl.MoodCntl;
/**
 *
 * @author rdb5279
 */
public class MoodView {
    
    private MoodCntl myController;
    private Mood entry;
    /**
     * This is the default constructor for the MoodView. 
     */
    public MoodView () {

    }
    
    /**
     * This controller will be initialized as the corresponding MoodCntl.
     * This constructor will initialize the UI with blank text fields by 
     * default. All UI interactions will be handled by private methods/variables
     * and by the parent controller on the backend.
     * @param controller the parent controller (FoodCntl)
     */
    public MoodView (MoodCntl controller) {
        myController = controller;
    }
    /**
     * The controller will be initialized as the corresponding MoodCntl. 
     * This constructor will initialize the UI with the text fields filled by 
     * the previously entered data from the corresponding entry to be updated.
     * All UI interactions will be handled by private methods/variables
     * and by the parent controller on the backend.
     * @param controller the parent controller (FoodCntl)
     * @param theEntry the selected entry to update
     */
    public MoodView (MoodCntl controller,Mood theEntry) {
        myController = controller;
        entry = theEntry;
    }
}
