/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.furniturestorage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 *
 * @author Student
 */
public class FurnitureStorage extends JFrame {
     //GUI Components
             
    private JComboBox<String> cbmDuration;
    private JTextField txtCustomername;
    private JTextField txtPrice;
    private JButton btnGenerate;


public FurnitureStorage() {
        super("Local Furniture Store");
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420, 320);
        setLocationRelativeTo(null);
 
       createMenuBar();
        
        // Input panel with GridLayout
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
 
        // Movie selection
        inputPanel.add(new JLabel("Duration:"));
        cbmDuration = new JComboBox<>(new String[]{"3", "9", "12"});
        inputPanel.add(cbmDuration);
 
        // Customer Name
        inputPanel.add(new JLabel("Customer Name:"));
        txtCustomerName = new JTextField();
        inputPanel.add(txtCustomerName);
 
        // Ticket price
        inputPanel.add(new JLabel(" Price:"));
        txtPrice = new JTextField();
        inputPanel.add(txtPrice);
 
        // Button to proccess data
        inputPanel.add(new JLabel("")); // filler
        btnGenerate = new JButton("Process");
        inputPanel.add(btnGenerate);
 
       inputPanel.add(new JLabel("")); // filler
        btnGenerate = new JButton("Save");
        inputPanel.add(btnGenerate);
        
        // Add panels to frame
        add(inputPanel, BorderLayout.NORTH);
        
 
        // Button logic
        btnGenerate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                procesData();
            }
        
 
        });
 
        // Finalize window
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private void createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setJMenuBar(menuBar);
    }
 
    private void buildUI() {
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
 
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
 
        JButton loadButton = new JButton("Load Product Data");
        JButton saveButton = new JButton("Save Product Data");
 
      
        } 
       
  
    public static void main(String[] args) {
        
    }
