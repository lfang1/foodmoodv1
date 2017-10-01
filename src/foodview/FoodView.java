/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodview;

import food.Food;
import foodcntl.FoodCntl;
/**
 *
 * @author rdb5279
 */
public class FoodView {
    
    private FoodCntl myController;
    private Food entry;
    /**
     * This is the default constructor for the FoodView. 
     */
    public FoodView () {

    }
    
    /**
     * This controller will be initialized as the corresponding FoodCntl.
     * This constructor will initialize the UI with blank text fields by 
     * default. All UI interactions will be handled by private methods/variables
     * and by the parent controller on the backend.
     * @param controller the parent controller (FoodCntl)
     */
    public FoodView (FoodCntl controller) {
        myController = controller;
    }
    /**
     * The controller will be initialized as the corresponding FoodCntl. 
     * This constructor will initialize the UI with the text fields filled by 
     * the previously entered data from the corresponding entry to be updated.
     * All UI interactions will be handled by private methods/variables
     * and by the parent controller on the backend.
     * @param controller the parent controller (FoodCntl)
     * @param theEntry the selected entry to update
     */
    public FoodView (FoodCntl controller,Food theEntry) {
        myController = controller;
        entry = theEntry;
    }
}
