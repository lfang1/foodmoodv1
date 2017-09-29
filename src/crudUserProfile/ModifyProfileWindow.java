/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudUserProfile;

/**
 *
 * @author siqitang
 */
public class ModifyProfileWindow {
    private double weight;
    private double height;
    private int age;

     /**
     * This is a constructor for ModifyingProfileWindow
     * 
     * @param weight Update weight of the user
     * @param height Update height of the user
     * @param age Update age of the user
     */
    public ModifyProfileWindow(double weight, double height, int age)
    {
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    ModifyProfileWindow() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
