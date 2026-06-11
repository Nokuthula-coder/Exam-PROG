/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.furniturestoragereport;

/**
 *
 * @author Student
 */
public class FurnitureStorageReport {

    public static void main(String[] args) {
        
        // Use single dimensional array for years and Towns
        String[] years = {"YEAR 1", "YEAR 2"};
        
        String[] towns = {"CAPETOWN","DURBAN", "PORT ELIZABETH"};
        
        // 2D array for travel agency data: row= years, cols=Town
        int[][] town ={
            {90, 15, 50},// YEAR 1: Cape town, Durban , port Elizabeth
            {125, 50, 91}// YEAR 2: Capetown,Durban,Port Elizabeth
                
        };
        
        // Create object using interface reference - polymorphism
        FurnitureStorage ps = new FurnitureStorage();
        
        // Calculate and display summary using interface methods
        int total = ps.TotalCustomers(town);
        double average = ps.AverageCustomers(town);
        String [] most = ps.MostPopularTown(town);
        String [] least = ps.LeastPopularTown(town);
        
        //Print report summary matching sample format
        System.out.println("FURNITURE STORAGE REPORT  - 2026");
        System.out.println("------------------------------");
        System.out.println("Total Customers : "   + total);
        System.out.println("Average Customers: "  + Math.round(average));
        System.out.println("Town with most customers : "  + most);
        System.out.println("Town with less customers: "  + least);
      
    }
}
     
    // loop through 2D array to sum all quarters for all years
    @Override 
    public int TotalCustomers(int[][] furnitureStorage){
        int total= 0;
        
        for (int row= 0; row < furnitureStorage.length; row++){
            for (int col = 0; col < furnitureStorage [row].length; col++){
                total += FurnitureStorage[row][col];
     
            }
        }
        return total;
        
    }
    
    // Uses TotalSales method then divides by number of elements
    @Override
    public double AverageCustomers(int[][] FurnitureStorage){
        
        int total= TotalCustomers(FurnitureStorage);
        int count = 0;
        
        for (int row = 0; row < FurnitureStorage.length; row++){
            count += FurnitureStorage[row].length;
            
        }
        return (double)total/count;
        
    }
    
    // Loops through 2D array to find highest value
    @Override
    public int TownWithMostCustomers(int [][] FurnitureStorage){
        int max =FurnitureStorage [0][0];
        
        for (int row = 0; row <FurnitureStorage.length; row++){
            for (int col = 0; col < FurnitureStorage[row].length; col++){
                
                if(FurnitureStorage[row][col] > max) {
                    max = FurnitureStorage[row][col];   
                }
            }
        }
         return max;
         
    }
    
    // Loops through 2D array to find lowest vale
    @Override
    public int TownWithLeastCustomers(int[][] FurnitureStorage){
        
        int min = FurnitureStorage[0][0];
         for (int row = 0; row < FurnitureStorage.length; row++){
             for (int col = 0; col<FurnitureStorage[row].length; col++){
                 
                 if (FurnitureStorage[row][col] < min){
                     min = FurnitureStorage[row][col];
                     
                 }
             }
         }
          return min;
    }



