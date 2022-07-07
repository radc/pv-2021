/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220607_aulapv_proj2;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public class PainelEsquerdo extends JPanel {
    
    JTextField x,y,w,h;
    
    public PainelEsquerdo(){
        
        setLayout(new FlowLayout());
        add(new JLabel("x"));
        x = new JTextField(50);
        add(x);
        add(new JLabel("y"));
        y = new JTextField(50);
        add(y);
        add(new JLabel("w"));
        w = new JTextField(50);
        add(w);
        add(new JLabel("h"));
        h = new JTextField(50);
        add(h);
        
        this.setBackground(Color.red);
    
    }
    
}
