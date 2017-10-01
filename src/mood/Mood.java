/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mood;

/**
 *
 * @author rdb5279
 */
public class Mood {
    
    private String moodType;
    private double moodRating;
    private int moodID;
    
    /**
     * This is the default constructor for the Mood class.
     */
    public Mood () {
        
    }
    
    /**
     * This is a constructor for the Mood class. 
     * @param mood the mood logged with the food consumed
     * @param theMoodRating a rating for the strength of mood (between 1 and 5)
     */
    public Mood (String mood, double theMoodRating){
        moodType = mood;
        moodRating = theMoodRating;
    }
    
    /**
     * @return the moodType
     */
    public String getMoodType() {
        return moodType;
    }

    /**
     * @param moodType the moodType to set
     */
    public void setMoodType(String moodType) {
        this.moodType = moodType;
    }

    /**
     * @return the moodRating
     */
    public double getMoodRating() {
        return moodRating;
    }

    /**
     * @param moodRating the moodRating to set
     */
    public void setMoodRating(double moodRating) {
        this.moodRating = moodRating;
    }

    /**
     * @return the moodID
     */
    public int getMoodID() {
        return moodID;
    }

    /**
     * @param moodID the moodID to set
     */
    public void setMoodID(int moodID) {
        this.moodID = moodID;
    }
    
    @Override
    public String toString() {
        String entry = moodType + " | " + moodRating + " | " + moodID;
        return entry;
    }
    
}
