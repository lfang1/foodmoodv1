/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodEntry;

import java.util.ArrayList;

/**
 *
 * @author Ray
 */
public class FoodMoodEntryList {
    
    private ArrayList<FoodMoodEntry> FoodMoodEntryList;
    
    /**
     * This is the default constructor for the FoodMoodEntryList class. This 
     * class is a list where all the FoodMoodEntry logs are stored.
     */
    public FoodMoodEntryList () {
        FoodMoodEntryList = new ArrayList<FoodMoodEntry>();
    }
    
    /**
     * This method adds a user's log into the list of entries.
     * @param entry the FoodMoodEntry to be added into the user's list.
     */
    public void addEntry(FoodMoodEntry entry) {
        
    }
    
    /**
     * This method finds and returns an entry searched for by the user or 
     * application itself.
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     * @return The user entry that has been requested
     */
    public FoodMoodEntry findEntry (int index) {
        FoodMoodEntry entry = new FoodMoodEntry();
        return entry;
    }
    
    /**
     * This method deletes an entry requested by the user or application itself.
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     */
    public void deleteEntry (int index) {
        
    }
    
    /**
     * This method will print out a history of the user's entries (utilizing the
     * toString() method in each individual entry)
     * @return a more readable view of the user's history of entries
     */
    public String toString () {
        String entryList = "";
        return entryList;
    }
}
