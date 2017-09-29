/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author siqitang
 */
public class User {
    private String username;
    private String password;
    private double weight;
    private double height;
    private int age;

    /**
     * This is a constructor for UserProfileEntry. The user should enter a
     * username and a password for the account, as well as their weight, height
     * and age information.
     * 
     * @param username The username for this profile
     * @param password The password for this profile
     * @param weight The weight of the user
     * @param height The height of the user
     * @param age The age of the user
     */
    public User(String username, String password, double weight, 
                double height, int age)
    {
        this.username = username;
        this.password = password;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    
    /**
     * 
     * @return the username entered
     */
    public String getUsername(){
        return username;
    }
    /**
     * 
     * @param username the username that needs to be set
     */
    public void setUsername(String username){
        this.username = username;
    }
    
    /**
     * 
     * @return the password entered
     */
    public String getPassword(){
        return password;
    }
    
    /**
     * 
     * @param password the password that needs to be set
     */
    public void setPassword(String password){
        this.password = password;
    }
    
    /**
     * 
     * @return the weight information
     */
    public double getWeight(){
        return weight;
    }
    /**
     * 
     * @param weight the password that needs to be set
     */
    public void setWeight(double weight){
        this.weight = weight;
    }
    
    /**
     * 
     * @return the height information 
     */
    public double getHeight(){
        return height;
    }
    
    /**
     * 
     * @param height the weight that needs to be set
     */
    public void setHeight(double height){
        this.height = height;
    }
    
    /**
     * 
     * @return the age information
     */
    public int getAge(){
        return age;
    }
    
    /**
     * 
     * @param age the age that needs to be set
     */
    public void setAge(int age){
        this.age = age;
    }
}
