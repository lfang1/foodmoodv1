/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

import java.util.Date;

/**
 *
 * @author rdb5279
 */
public class Food {
    
    private String foodType;
    private double calories;
    private int foodID;
    
    public Food () {
        
    }
    
    /**
     * This is a constructor for the Food class.
     * @param food the food consumed (includes everything digested besides
     * medications and street drugs)
     * @param theCalories amount of calories in the food
     */
    public Food (String food, double theCalories){
        foodType = food;
        calories = theCalories;
    }
    
    
    /**
     * @return the foodType
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * @param foodType the foodType to set
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    /**
     * @return the calories
     */
    public double getCalories() {
        return calories;
    }

    /**
     * @param calories the calories to set
     */
    public void setCalories(double calories) {
        this.calories = calories;
    }
    
    /**
     * @return the foodID
     */
    public int getFoodID() {
        return foodID;
    }

    /**
     * @param foodID the foodID to set
     */
    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }
    
    @Override
    public String toString () {
        String entry = foodType + " | " + calories + " | " + foodID;
        return entry;
    }

    
}
