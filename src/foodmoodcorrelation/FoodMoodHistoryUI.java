/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FoodMoodCorrelation;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Le
 */
public class FoodMoodHistoryUI extends JFrame {
    
    private JPanel mainPanel;
    private JTextArea displayArea;
    
    /**
     * This is the default constructor for the FoodMoodHistoryUI class.
     */
    public FoodMoodHistoryUI() {
        
        super("View Food History");
        initializeFoodMoodHistoryUI();
        printFoodHistory();
    }
    
    /**
     * Initialize FoodMoodHistoryUI
     */
    public void initializeFoodMoodHistoryUI() {
        
        mainPanel = new JPanel();
        displayArea = new JTextArea(); 
        
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
                
        c.fill = GridBagConstraints.BOTH;
        c.gridx = 40;
        c.gridy = 30;
        c.gridwidth = 800;
        c.gridheight = 600;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(20, 20, 20, 20);
        mainPanel.add(displayArea, c);
        
        setContentPane(mainPanel);
        
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }
    
    /**
     * Print out food history.
     */
    public void printFoodHistory() {
        
        
    }

}
