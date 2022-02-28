/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3hge;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.*;
import java.awt.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Giorg
 */
public class PageLaunch implements ActionListener{
    
         JButton buttn = new JButton("Εκκίνηση");
         JPanel panel = new JPanel();
         
         
     
      
      PageLaunch(){
          
            FrameExtend fframe = new FrameExtend();
 
          buttn.setBounds(100,250,200,40);
          buttn.setFocusable(false);
          
          buttn.addActionListener(this);
          

          fframe.add(buttn);
       
       
      }

    
       
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==buttn) {
             
            DataProcessing proc = new DataProcessing();
            proc.setVisible(true);
            
        }
         
        
    }
      
      
      
      
}
