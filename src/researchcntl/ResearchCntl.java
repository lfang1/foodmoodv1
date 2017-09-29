/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchcntl;
import research.Research;

/**
 *
 * @author Chawa
 */
public class ResearchCntl {
         private Research research;
         
          /**
     *  This is the default constructor for the FoodMoodResearchCntl class.
     */
    public ResearchCntl(){
        research = new Research();
  
        
        
    }
    
    /*
    * Research by food catagory.
    */
      public void FoodResearch(){
        
       
        
    }
      
      /*
      * Reserach by mood catagory.
      */
      public void MoodResearch(){
        
        
        
    }
      /*
      * Reserach by food catagory.
      */
      public Research getResearchResult(){
          return research;
      }
}
