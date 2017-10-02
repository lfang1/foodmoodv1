/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilecntl;

import foodmoodstatscntl.FoodMoodStatsCntl;
import user.User;

/**
 *
 * @author siqitang
 */
public class UserProfileCntl {
     private FoodMoodStatsCntl controller;
     private User user;     
     private double weight;
     private double height;
     private int age;
     

     public UserProfileCntl(FoodMoodStatsCntl controller){
         this.controller = controller;
     }
     
     public UserProfileCntl (FoodMoodStatsCntl controller, User profile) {
        this.controller = controller;
        this.user = profile;
    }

    public User createProfile (String username, String password, double weight, 
                double height, int age) {
        User profile = new User(username, password, weight, height, age);
        return profile;
    }

}