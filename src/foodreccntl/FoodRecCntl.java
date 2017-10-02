/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodreccntl;

import userprofilecntl.UserProfileCntl;
import foodmoodcorrelation.FoodMoodCorrelation;
import foodmoodstatscntl.FoodMoodStatsCntl;
import foodrecview.FoodRecView;
import user.*;

/**
 *
 * @author siqitang
 */
public class FoodRecCntl {
    private FoodRecView view;
    private FoodMoodCorrelation foodMoodCorrelation;
    
    public FoodRecCntl () {
        view = new FoodRecView(this);
    }
    
}