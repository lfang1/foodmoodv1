///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package foodmoodchart;
//import java.util.Locale;
//import javax.swing.JFrame;
//import org.jfree.chart.ChartFactory;
//import org.jfree.chart.ChartPanel;
//import org.jfree.chart.JFreeChart;
//import org.jfree.chart.plot.PiePlot3D;
//import org.jfree.data.general.DefaultPieDataset;
//import org.jfree.data.general.PieDataset;
//import org.jfree.util.Rotation;
//
///**
// *
// * @author Chawa
// */
//public class FoodMoodChart extends JFrame{
//    
//        
//    
//        /**
//     * This is the default constructor for the FoodMoodCorrelation class.
//     */
//    
//    public FoodMoodChart(String title,String chartTitle){
//        PieDataset dataset = createDataset();
//        JFreeChart chart = getChart(dataset,chartTitle);
//        ChartPanel chartPanel = new ChartPanel(chart);
//        chartPanel.setPreferredSize(new java.awt.Dimension(500,300));
//        setContentPane(chartPanel);
//        
//    }
//
//    
//    
//    private PieDataset createDataset(){
//        DefaultPieDataset result = new DefaultPieDataset();
//        result.setValue("Haha", 65);
//        result.setValue("Hehe", 15);
//        result.setValue("Huhu", 20);
//        return result;
//    }
//    
//    
//    private JFreeChart getChart(PieDataset dataset,String title){
//        JFreeChart chart = ChartFactory.createPieChart3D(title, dataset, true, true,false);
//        PiePlot3D plot = (PiePlot3D) chart.getPlot();
//        plot.setStartAngle(90);
//        plot.setDirection(Rotation.CLOCKWISE);
//        plot.setForegroundAlpha(1f);
//        return chart;
//    }
//    /*
//    *Return food mood chart
//    */
//    public void getFoodMoodChart(){     
//
//        
//    }
//    
//    /*
//    Pick precise data from good correlation relationship to create the chart
//    */
////    public void pickChartData(){
////        
////    }
//
//    
//    
//}