/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220512_aulapv;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ruhan
 */
public class JanelaBorder extends JFrame{
    JButton jb1,jb2,jb3,jb4,jb5;
    BorderLayout layout;
    
    JanelaBorder(){
        jb1 = new JButton("JB1");
        jb2 = new JButton("JB2");
        jb3 = new JButton("JB3");
        jb4 = new JButton("JB4");
        jb5 = new JButton("JB5");
        
        layout = new BorderLayout(10,10);
        setLayout(layout);
        
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        add(jb1,BorderLayout.NORTH);
        add(jb2,BorderLayout.SOUTH);
        add(jb3,BorderLayout.EAST);
        add(jb4,BorderLayout.WEST);
        add(jb5,BorderLayout.CENTER);
        
        setVisible(true);
        
    }
}
