/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodmoodcorrelation;

import food.Food;
import foodmoodhistory.FoodMoodHistory;
import mood.Mood;

/**
 *
 * @author Le
 */
public class FoodMoodCorrelation {
    
    private FoodMoodHistory myFoodMoodHistory;
    private double moodToFoodTypeCorrelation;
    private double moodToFoodCaloriesCorrelation;
    
    /**
     * This is the default constructor.
     * @param newFoodMoodHistory  A FoodMoodHistory class instance assigned to myFoodMoodHistory.
     */
    public FoodMoodCorrelation(FoodMoodHistory newFoodMoodHistory) {
        
        myFoodMoodHistory = newFoodMoodHistory;
        
    }
    
    /**
     * Calculate mood rating to food type correlation
     * @param xs A int representing the food type.
     * @param ys A int representing the mood rating.
     */
     public void calculateMoodToFoodTypeCorrelation(int[] xs, int[] ys) {
        //TODO: check here that arrays are not null, of the same length etc

        double sx = 0.0;
        double sy = 0.0;
        double sxx = 0.0;
        double syy = 0.0;
        double sxy = 0.0;

        int n = xs.length;

        for(int i = 0; i < n; ++i) {
          double x = xs[i];
          double y = ys[i];

          sx += x;
          sy += y;
          sxx += x * x;
          syy += y * y;
          sxy += x * y;
        }

        // covariation
        double cov = sxy / n - sx * sy / n / n;
        // standard error of x
        double sigmax = Math.sqrt(sxx / n -  sx * sx / n / n);
        // standard error of y
        double sigmay = Math.sqrt(syy / n -  sy * sy / n / n);

        // correlation is just a normalized covariation
        moodToFoodTypeCorrelation = cov / sigmax / sigmay;
    
    }
    
    /**
     * Calculate mood rating to food calories correlation
     * @param xs A int representing the food calories.
     * @param ys A int representing the mood rating.
     */
    public void calculateMoodToFoodCaloriesCorrelation(int[] xs, int[] ys) {
        //TODO: check here that arrays are not null, of the same length etc

        double sx = 0.0;
        double sy = 0.0;
        double sxx = 0.0;
        double syy = 0.0;
        double sxy = 0.0;

        int n = xs.length;

        for(int i = 0; i < n; ++i) {
          double x = xs[i];
          double y = ys[i];

          sx += x;
          sy += y;
          sxx += x * x;
          syy += y * y;
          sxy += x * y;
        }

        // covariation
        double cov = sxy / n - sx * sy / n / n;
        // standard error of x
        double sigmax = Math.sqrt(sxx / n -  sx * sx / n / n);
        // standard error of y
        double sigmay = Math.sqrt(syy / n -  sy * sy / n / n);

        // correlation is just a normalized covariation
        moodToFoodCaloriesCorrelation = cov / sigmax / sigmay;
    
    }
    
    /**
     * Get mood rating to food type correlation.
     * @return A double representing mood to food type coefficient. 
     */
    public double getMoodToFoodTypeCorrelation() {
        
        return moodToFoodTypeCorrelation;
        
    }
    
    /**
     * Get mood rating to food calories correlation.
     * @return A double representing mood to food calories coefficient.
     */
    public double getMoodToFoodCaloriesCorrelation() {
        
        return moodToFoodCaloriesCorrelation;
        
    }
    
}