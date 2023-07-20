/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tut.ac.za.ui;

import java.awt.Color;
import static java.awt.image.ImageObserver.PROPERTIES;
import javax.swing.JFrame;
import static javax.swing.JFrame.setDefaultLookAndFeelDecorated;

/**
 *
 * @author LISWO
 */
public class MyFrame1 extends JFrame{

    public MyFrame1() {
         setTitle("Tsumbo Masutha");
        setDefaultLookAndFeelDecorated(true);
        setSize(250,350);
        setResizable(true);
        setVisible(true);
        setForeground(Color.red);
        setDefaultCloseOperation(PROPERTIES);
    }
    
}
