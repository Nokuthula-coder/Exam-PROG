/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.furniturestoragereport;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Student
 */
public class FurnitureStorageReportIT {
    
    public FurnitureStorageReportIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of TotalCustomers method, of class FurnitureStorageReport.
     */
    @Test
    public void testTotalCustomers() {
        System.out.println("TotalCustomers");
        int[][] furnitureStorage = null;
        FurnitureStorageReport instance = new FurnitureStorageReport();
        int expResult = 0;
        int result = instance.TotalCustomers(furnitureStorage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AverageCustomers method, of class FurnitureStorageReport.
     */
    @Test
    public void testAverageCustomers() {
        System.out.println("AverageCustomers");
        int[][] FurnitureStorage = null;
        FurnitureStorageReport instance = new FurnitureStorageReport();
        double expResult = 0.0;
        double result = instance.AverageCustomers(FurnitureStorage);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TownWithMostCustomers method, of class FurnitureStorageReport.
     */
    @Test
    public void testTownWithMostCustomers() {
        System.out.println("TownWithMostCustomers");
        int[][] FurnitureStorage = null;
        FurnitureStorageReport instance = new FurnitureStorageReport();
        int expResult = 0;
        int result = instance.TownWithMostCustomers(FurnitureStorage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of TownWithLeastCustomers method, of class FurnitureStorageReport.
     */
    @Test
    public void testTownWithLeastCustomers() {
        System.out.println("TownWithLeastCustomers");
        int[][] FurnitureStorage = null;
        FurnitureStorageReport instance = new FurnitureStorageReport();
        int expResult = 0;
        int result = instance.TownWithLeastCustomers(FurnitureStorage);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
