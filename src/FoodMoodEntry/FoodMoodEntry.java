/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodEntry;

/**
 *
 * @author Ray
 */
public class FoodMoodEntry {
    
    private String myFood;
    private String myMood;
    private int myMoodRating;
    private String myLocation;
    private long myTime;
    private String myPeople;
    private String myComment;
    
    /**
     * This is the default constructor for the FoodMoodEntry class.
     */
    public FoodMoodEntry () {
        
    }
    
    /**
     * This is a constructor for the FoodMoodEntry class. The user 
     * will be required to enter at lest the food or mood, which will be checked
     * by the FoodMoodEntryCntl before creating a mood. All parameters not set 
     * user will be set to null.
     * @param food the food consumed (includes everything digested besides
     * medications and street drugs)
     * @param mood the mood logged with the food consumed
     * @param moodRating a rating for the strength of mood (between 1 and 5)
     * @param location location the food was consumed
     * @param time time the food was consumed
     * @param people people the food was consumed with
     * @param comment user's comment about the entry
     */
    public FoodMoodEntry (String food, String mood, int moodRating, 
            String location, long time, String people, String comment){
        myFood = food;
        myMood = mood;
        myMoodRating = moodRating;
        myLocation = location;
        myTime = time;
        myPeople = people;
        myComment = comment;
    }
    
    
    /**
     * @return the entry's food consumed
     */
    public String getMyFood() {
        return myFood;
    }

    /**
     * @param myFood the food consumed to set
     */
    public void setMyFood(String myFood) {
        this.myFood = myFood;
    }

    /**
     * @return the entry's mood
     */
    public String getMyMood() {
        return myMood;
    }

    /**
     * @param myMood the mood to set
     */
    public void setMyMood(String myMood) {
        this.myMood = myMood;
    }

    /**
     * @return the entry's mood rating
     */
    public int getMyMoodRating() {
        return myMoodRating;
    }

    /**
     * @param myMoodRating the mood rating to set
     */
    public void setMyMoodRating(int myMoodRating) {
        this.myMoodRating = myMoodRating;
    }

    /**
     * @return the location the food was consumed
     */
    public String getMyLocation() {
        return myLocation;
    }

    /**
     * @param myLocation the location the food was consumed to set
     */
    public void setMyLocation(String myLocation) {
        this.myLocation = myLocation;
    }

    /**
     * @return the time that food was consumed
     */
    public long getMyTime() {
        return myTime;
    }

    /**
     * @param myTime the time that food was consumed to set
     */
    public void setMyTime(long myTime) {
        this.myTime = myTime;
    }

    /**
     * @return the people the food was consumed with
     */
    public String getMyPeople() {
        return myPeople;
    }

    /**
     * @param myPeople the people the food was consumed with to set
     */
    public void setMyPeople(String myPeople) {
        this.myPeople = myPeople;
    }

    /**
     * @return the user's comment
     */
    public String getMyComment() {
        return myComment;
    }

    /**
     * @param myComment the user's comment to set
     */
    public void setMyComment(String myComment) {
        this.myComment = myComment;
    }
    
    /**
     * This method prints out the entry into a more readable String format with 
     * all known parameters displayed for the user.
     * @return the entry in readable String format.
     */
    @Override
    public String toString () {
        String entry = "";
        return entry;
    }
}
