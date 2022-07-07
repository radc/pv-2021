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
import javax.swing.JButton;

/**
 *
 * @author ruhan
 */
public class PainelEsquerdo extends JPanel {
    
    JTextField x,y,w,h;
    JButton bOk;
    
    JLabel refObj; 
    
    public void setRefObj(JLabel ref){
        this.refObj = ref;
    }
    
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
        
        bOk = new JButton("OK");
        
        bOk.addActionListener(
        e -> {
            int xi, yi, wi, hi;
            xi = Integer.parseInt(x.getText());
            yi = Integer.parseInt(y.getText());
            wi = Integer.parseInt(w.getText());
            hi = Integer.parseInt(h.getText());
            
            refObj.setLocation(xi, yi);
            refObj.setSize(wi,hi);
            
            
        }
        );
        
        
        add(bOk);
        
        this.setBackground(Color.red);
    
    }
    
}
