/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.lang.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Entrance extends JFrame implements ActionListener {
    

    JFrame f1;
    JLabel id,l3;
    JButton b1;
    Entrance(){
    f1=new JFrame("Employee Management System");
    f1.setBackground(null);
    f1.setLayout(null);
    ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Project//School.jpg"));
    Image i2=i1.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
    ImageIcon i3=new ImageIcon(i2);
    JLabel l2=new JLabel(i3);
    l2.setBounds(100,60,700,400);
    f1.add(l2);
    
    f1.setBackground(Color.DARK_GRAY);
    b1=new JButton("Click here to Continue");
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(300,500,200,70);
    f1.add(b1);
    b1.addActionListener(this);
    id=new JLabel();
    id.setBounds(100, 10, 40, 100);
    id.setLayout(null);
    JLabel lid=new JLabel("School Management System");
    lid.setBounds(280,3,500,40);
    lid.setFont(new Font("Arial",Font.PLAIN,30));
    lid.setForeground(Color.red);
    id.add(lid);
    f1.add(lid);
    JLabel lid2=new JLabel("--------------------------------------");
     lid2.setFont(new Font("Arial",Font.PLAIN,30));
    lid2.setBounds(280,20,500,40);
    f1.add(lid2);
    f1.getContentPane().setBackground(Color.WHITE);
    f1.setVisible(true);
    f1.setBounds(100,100,1000,1000);
    while(true){
    lid.setVisible(false);
    try{
    Thread.sleep(400);
    }catch(Exception e){}
    lid.setVisible(true);
    try{
    Thread.sleep(500);
    }catch(Exception e){}
    }
  
    
    }
    public void actionPerformed(ActionEvent e){
    if(e.getSource().equals(b1)){
    f1.setVisible(false);
    Form f=new Form();
    f.setVisible(true);
    }
    
    }
    public static void main(String args[]){
    Entrance e1=new Entrance();
    }
}

/**
 *
 * @author User
 */

