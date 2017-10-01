
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.ArrayList;

/**
 *
 * @author siqitang
 */

public class UserList {
    private ArrayList<User> userList;
    
    /**
     * This is the default constructor for the UserList class. This 
     * class is a list where all the profile information
     */
    public UserList() {
        userList = new ArrayList<User>();
    }
    
    /**
     * This method adds a user's profile into the list of entries.
     * @param profile the profile to be added into the user's account
     */
    public void addProfile(User profile) {
        
    }
    /**
     * This method finds and returns a user searched for 
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     * @return The user that has been requested
     */
    public User findUser (int index) {
        User user = userList.get(index);
        return user;
    }
    
    /**
     * This method deletes an entry requested by the user or application itself.
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     */
    public void deleteProfile (int index) {
        
    }
    
}