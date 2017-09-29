/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchfoodmood;

/**
 *
 * @author Chawa
 */
public class FoodMoodResearchCntl {
    
     private FoodMoodResearch myRes;
     private FoodResearchUI foodUI;
     private MoodResearchUI moodUI;
     
     
     /**
     *  This is the default constructor for the FoodMoodResearchCntl class.
     */
    public FoodMoodResearchCntl(){
        myRes = new FoodMoodResearch();
        foodUI = new FoodResearchUI();
        moodUI = new MoodResearchUI();
        
        
    }
    
    /*
    * Research by food catagory.
    */
      public void FoodResearchUI(){
        
        foodUI.printOutFoodResearchUI();
        
    }
      
      /*
      * Reserach by mood catagory.
      */
      public void MoodResearchUI(){
        
        moodUI.printOutMoodResearchUI();
        
    }
      /*
      * Reserach by food catagory.
      */
      public FoodMoodResearch getResearchResult(){
          return myRes;
      }
}
