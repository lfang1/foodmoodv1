/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartfoodmood;

/**
 *
 * @author Chawa
 */
public class FoodMoodChartCntl {
    
  private FoodMoodChart fmchart;
    private FoodMoodChartUI fmchartUI;
    
    /**
     * This is the default constructor for the FoodMoodCorrelationCntl class.
     */
    public FoodMoodChartCntl() {
        
        fmchart = new FoodMoodChart();
        fmchartUI = new FoodMoodChartUI();
        
    }
    
    /**
     * Returns the food mood chart.
     * @return A FoodMoodChart class representing the food mood chart.
     */
    public FoodMoodChart getFoodMoodChart() {
        
        return fmchart;
        
    }
    
    /**
     * Call the FoodMoodChartUI to print new food mood chart.
     */
    public void updateFoodMoodChartUI(){
        
        fmchartUI.printOutFoodMoodChart();
        
    }
    
}
