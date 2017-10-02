/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcntl;

import food.Food;
import foodmoodstatscntl.FoodMoodStatsCntl;
import foodview.FoodView;

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
        System.out.println("FoodCntl initialized");
        myController = controller;
        FoodView view = new FoodView(this);
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
        System.out.println("FoodCntl initialized");
        myController = controller;
        entry = theEntry;
        FoodView view = new FoodView(this, entry);
    }
    
    /**
     * This method will submit a Food with the information entered
     * into the view. The FoodMoodEntry will be added to the user's list or the 
     * local data's list of entries.
     * @param foodType taken from views text box
     * @param calories taken from views text box
     */
    public void submitEntry (String foodType, double calories) {
        System.out.println("submitEntry went through");
        Food newEntry = new Food(foodType, calories);
        System.out.println("Entry to be added: " + newEntry.toString());
        myController.getFoodMoodStats().getFoodList().addEntry(newEntry);
    }
    
    /**
     * This method will cancel the Food submission and bring the user 
     * back to the landing page.
     */
    public void cancelEntry () {
        System.out.println("Close FoodView and return to FoodMoodStatsView");
    }
}
