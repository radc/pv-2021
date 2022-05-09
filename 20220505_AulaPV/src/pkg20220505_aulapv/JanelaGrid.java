/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220505_aulapv;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ruhan
 */
public class JanelaGrid extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    GridLayout layout;
    
    public JanelaGrid(){
        b1 = new JButton ("Botao 1");
        b2 = new JButton ("Botao 2");
        b3 = new JButton ("Botao 3");
        b4 = new JButton ("Botao 4");
        b5 = new JButton ("Botao 5");
        b6 = new JButton ("Botao 6");
        
        layout = new GridLayout(2,3,20,20);
        setLayout(layout);
        setSize(400,200);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
