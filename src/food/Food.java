/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food;

/**
 *
 * @author rdb5279
 */
public class Food {
    
    private String myFood;
    
    /**
     * This is a constructor for the Food class.
     * @param food the food consumed (includes everything digested besides
     * medications and street drugs)
     */
    public Food (String food){
        myFood = food;
    }

    /**
     * @return the myFood
     */
    public String getMyFood() {
        return myFood;
    }

    /**
     * @param myFood the myFood to set
     */
    public void setMyFood(String myFood) {
        this.myFood = myFood;
    }
    
    
}
