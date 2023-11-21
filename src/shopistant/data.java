/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shopistant;


import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset; 
import org.jfree.data.category.DefaultCategoryDataset; 
import org.jfree.ui.ApplicationFrame; 
import org.jfree.ui.RefineryUtilities; 

public class data extends ApplicationFrame {
   
   public data( String applicationTitle , String chartTitle ) {
      super( applicationTitle );        
      JFreeChart barChart = ChartFactory.createBarChart(
         chartTitle,           
         "Products",            
         "Quantity",            
         createDataset(),          
         PlotOrientation.VERTICAL,           
         true, true, false);
         
      ChartPanel chartPanel = new ChartPanel( barChart );        
      chartPanel.setSize(new java.awt.Dimension( 560 , 367 ) );        
      setContentPane( chartPanel ); 
   }
   
   private CategoryDataset createDataset( ) {
      final String soap = "soap";        
      final String shampoo = "shampoo";        
      final String lays = "lays";    
      final String surfexcel= "surfexcel";    
      final String pasta = "pasta";    
      final String paneer = "paneer";    
      final String mutton_masala= "mutton masala";    
      final String Aashirvad = "Aashirvad";   
      //final String cream = "cream";    
      final String cream = "cream"; 
      final String maida = "maida";    
      final String products = "Products";        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( 25.0 , soap , products );        
    
      dataset.addValue( 30.0 , shampoo , products );        
     
      dataset.addValue( 15.0 ,lays , products ); 
      dataset.addValue( 15.0 ,surfexcel , products ); 
      dataset.addValue( 15.0 ,pasta , products ); 
      dataset.addValue( 15.0 ,paneer, products ); 
      dataset.addValue( 15.0 , mutton_masala , products ); 
      dataset.addValue( 15.0 ,Aashirvad , products ); 
      dataset.addValue( 15.0 ,maida , products ); 
      dataset.addValue( 15.0 ,cream , products ); 
                

      return dataset; 
   }
   
   public static void main( String[ ] args ) {
     data chart = new data("inventory statistics", 
         "Shoplytics");
            
      RefineryUtilities.centerFrameOnScreen( chart ); 
      chart.setSize(800,800);
      chart.setVisible( true ); 
   }
}