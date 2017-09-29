/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodCorrelation;

import FoodMoodEntry.FoodMoodEntry;
import java.util.ArrayList;

/**
 *
 * @author Le
 */
public class FoodMoodHistory {
    
    ArrayList<FoodMoodEntry> foodHistory;
    
    /**
     * This is the default constructor for the FoodMoodHistory class.
     */
    public FoodMoodHistory() {
        
        
    }
    
    /**
     * Returns an ArrayList of FoodMoodEntry class as the food history 
     * @return 
     */
    public ArrayList<FoodMoodEntry> getFoodHistory() {
        
        return foodHistory;
        
    }   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
    public void writeOutFoodHistory(ArrayList<Food> foodHistory) {
        
        String dirPath = "data";
        String filePath = "data/foodhistory.ser";
        
        File checkDir = new File(dirPath);
        File checkFile = new File(filePath);
        
        if (!checkDir.exists()) {
            
            checkDir.mkdirs();
            
        }
        
        else {
            
//FIXME: Ask if delete orignal file before update it.
            
            if(checkFile.exists()) {
                
                checkFile.delete();
                                
            }
            
        }
        
        try {
            
            FileOutputStream fileOut = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(foodHistory);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is aved in " + filePath);
            
        }
        
        catch (IOException i) {
            
            i.printStackTrace();
            
        } 
        
    }

    public ArrayList<Food> readInFoodHistory() {
        
        String filePath = "data/foodhistory.ser";
        //Check if a foodhistory entry already exists
        File check = new File(filePath);
        boolean exists = check.exists();
        
        if (!exists) {
            
            return new ArrayList<>();
            
        }        
        
        try {
            
            FileInputStream fileIn = new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            foodHistory = (ArrayList<Food>) in.readObject();
            in.close();
            fileIn.close();;
            
        }
        
        catch (IOException i) {
            
            i.printStackTrace();
            
        }
        
        catch (ClassNotFoundException c) {
            
            System.out.println("foodhistory.ser not found");
            c.printStackTrace();
            
        }
        
        return foodHistory;
        
    }
*/
    
}
