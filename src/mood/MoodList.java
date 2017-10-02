/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mood;

import java.util.ArrayList;

/**
 *
 * @author rdb5279
 */
public class MoodList {
    private ArrayList<Mood> moodList;
    
    /**
     * This is the default constructor for the MoodList class. This 
     * class is a list where all the Mood logs are stored.
     */
    public MoodList () {
        System.out.println("MoodList initialized");
        moodList = new ArrayList<Mood>();
    }
    
    /**
     * This method adds a user's log into the list of entries.
     * @param entry the FoodMoodEntry to be added into the user's list.
     */
    public void addEntry(Mood entry) {
        System.out.println("addEntry went through");
        int index, lastEntryIndex;
        if (moodList.get(0) == null) index = 1;
        else {
            lastEntryIndex = moodList.get(moodList.size()-1).getMoodID();
            index = lastEntryIndex+1;
        }
        entry.setMoodID(index);
        moodList.add(entry);
        System.out.println("Food being added: " + moodList.toString());
    }
    
    /**
     * This method finds and returns an entry searched for by the user or 
     * application itself.
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     * @return The user entry that has been requested
     */
    public Mood findEntry (int index) {
        System.out.println("findEntry went through");
        for (int i = 0; i < moodList.size(); i++) {
            if (index == moodList.get(i).getMoodID()) {
                index = moodList.get(i).getMoodID();
                break;
            }
        }
        Mood entry = moodList.get(index);
        System.out.println("Entry is + " + entry.toString());
        return entry;
    }
    
    /**
     * This method deletes an entry requested by the user or application itself.
     * @param index This is a temporary variable until we figure out how we will
     * find a specific entry from the list.
     */
    public void deleteEntry (int index) {
        System.out.println("deleteEntry went through");
        for (int i = 0; i < moodList.size(); i++) {
            if (index == moodList.get(i).getMoodID()) {
                index = moodList.get(i).getMoodID();
                break;
            }
        }
        moodList.remove(index);
        System.out.println(moodList.toString());
    }
    
    /**
     * This method will print out a history of the user's entries (utilizing the
     * toString() method in each individual entry)
     * @return a more readable view of the user's history of entries
     */
    @Override
    public String toString () {
        String entryList = "";
        for (int i = 0; i < moodList.size(); i++) {
            entryList = moodList.get(i).toString() + "\n";
        }
        
        return entryList;
    }
}
