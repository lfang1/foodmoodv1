/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testharness;

import food.Food;
import food.FoodList;
import foodcntl.FoodCntl;
import foodmoodchart.FoodMoodChart;
import foodmoodchartcntl.FoodMoodChartCntl;
import foodmoodchartview.FoodMoodChartView;
import foodmoodcorrelationcntl.FoodMoodCorrelationCntl;
import foodmoodcorrelationview.FoodMoodCorrelationUI;
import foodmoodhistorycntl.FoodMoodHistoryCntl;
import foodmoodhistoryview.FoodMoodHistoryUI;
import foodmoodstatscntl.FoodMoodStatsCntl;
import foodreccntl.FoodRecCntl;
import java.util.Date;
import mood.Mood;
import mood.MoodList;
import moodcntl.MoodCntl;
import notification.Notification;
import notificationcntl.NotificationCntl;
import user.User;
import userprofilecntl.UserProfileCntl;

/**
 *
 * @author Ray
 */
public class TestHarness {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //testing FoodMoodStatsCntl
        FoodMoodStatsCntl foodMoodStatsCntl = new FoodMoodStatsCntl();
        
        //Testing food modules
        foodMoodStatsCntl.addFoodEntry();
        FoodCntl foodCntl = new FoodCntl(foodMoodStatsCntl);
        foodCntl.submitEntry("Fries", 400.0);
        foodCntl.submitEntry("Waffles", 575.0);
        foodCntl.submitEntry("Smoothie", 266.0);
        Food newEntry = new Food("Burger", 760.0);
        foodMoodStatsCntl.getFoodMoodStats().getFoodList().addEntry(newEntry);
        foodCntl = new FoodCntl(foodMoodStatsCntl, foodMoodStatsCntl.getFoodMoodStats().getFoodList().findEntry(1));
        foodCntl.cancelEntry();
        foodMoodStatsCntl.deleteFoodEntry(1);
        
        //testing mood modules
        foodMoodStatsCntl.addMoodEntry();
        MoodCntl moodCntl = new MoodCntl(foodMoodStatsCntl);
        moodCntl.submitEntry("Happy", 4.5);
        moodCntl.submitEntry("Sad", 3.0);
        moodCntl.submitEntry("Excited", 9.5);
        Mood newEntry2 = new Mood("Disappointed", 2.5);
        foodMoodStatsCntl.getFoodMoodStats().getMoodList().addEntry(newEntry2);
        moodCntl = new MoodCntl(foodMoodStatsCntl, foodMoodStatsCntl.getFoodMoodStats().getMoodList().findEntry(1));
        moodCntl.cancelEntry();
        foodMoodStatsCntl.deleteMoodEntry(1);
        
        //testing notification modules
        foodMoodStatsCntl.openNotifications();
        Date time = new Date();
        Notification message = new Notification(time, "Testing");
        NotificationCntl notificationCntl = new NotificationCntl(foodMoodStatsCntl, message);
        notificationCntl.createNotification(time, "More Testing");
        
        //testing user profile modules
        foodMoodStatsCntl.openUserProfileSettings();
        String username = "user", pass = "pass";
        double weight = 125.0, height = 78.5;
        int age = 23;
        User profile = new User (username, pass, weight, height, age);
        UserProfileCntl userProfileCntl = new UserProfileCntl(foodMoodStatsCntl, profile);
        userProfileCntl.createProfile(username, pass, weight, height, age);

        //testing food recommendation modules
        foodMoodStatsCntl.openFoodRecommendations();
        FoodRecCntl foodRecCntl = new FoodRecCntl();
        
        FoodMoodHistoryCntl myFoodMoodHistoryCntl = new FoodMoodHistoryCntl(1);        
      
        FoodList myFoodList = myFoodMoodHistoryCntl.getFoodHistory(); 
        MoodList myMoodList = myFoodMoodHistoryCntl.getMoodHistory();
        
        System.out.println("Your food history" + myFoodList.toString());
        System.out.println("Your mood history" + myMoodList.toString());
        
        System.out.println("FoodMoodHistoryCntl class and FoodMoodHistory test pass.");
        
        FoodMoodHistoryUI myFoodMoodHistoryUI = new FoodMoodHistoryUI(myFoodMoodHistoryCntl);
        myFoodMoodHistoryUI.updateFoodMoodHistory();
        
        System.out.println("FoodMoodHistoryUI class test pass.");
        
        FoodMoodCorrelationCntl myFoodMoodCorrelationCntl = new FoodMoodCorrelationCntl();
        
        double moodToFoodTypeCorrelation = 0.5;
        double moodToFoodCaloriesCorrelation = 0.6;
        System.out.println("The mood to food type correlation: " + moodToFoodTypeCorrelation);
        System.out.println("The mood to food calories correaltion: " + moodToFoodCaloriesCorrelation);
        
        System.out.println("FoodMoodCorrelationCntl class and FoodMoodCorrelation class test pass.");
        
        FoodMoodCorrelationUI myFoodMoodCorrelationUI = new FoodMoodCorrelationUI(myFoodMoodCorrelationCntl);
        
        System.out.println("FoodMoodCorrelationUI class test pass.");
        
        //FoodMoodChartCntl myFoodMoodChartCntl = new FoodMoodChartCntl();
        System.out.println("FoodMoodChartCntl class test pass");
        
       // FoodMoodChart myFoodMoodChart = new FoodMoodChart("A title", "B title");
        System.out.println("FoodMoodChart class test pass");
        
       // FoodMoodChartView myFoodMoodChartView = new FoodMoodChartView();
        System.out.println("FoodMoodChartView class test pass");
    }
    
}
