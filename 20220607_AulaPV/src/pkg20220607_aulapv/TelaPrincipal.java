/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220607_aulapv;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public class TelaPrincipal extends JFrame {
    JLabel lC1, lC2, lH;
    JTextField tfC1, tfC2, tfH;
    JButton bCalc;
    
    public TelaPrincipal(){
        super("Janela dos Campeões");
        
        setSize(280,180);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setLayout(new FlowLayout());
        
        lC1 = new JLabel("C1");
        add(lC1); //       
        tfC1 = new JTextField(20);
        add(tfC1); //       
        
        lC2 = new JLabel("C2");
        add(lC2);  //      
        tfC2 = new JTextField(20);
        add(tfC2); //
        
        lH = new JLabel("H");
        add(lH);
        tfH = new JTextField(20);
        tfH.setEditable(false);
        add(tfH);
        
        bCalc = new JButton("Calc");
        bCalc.addActionListener( 
            e -> {
                double c1, c2, h;
                c1 = Double.parseDouble(tfC1.getText());
                c2 = Double.parseDouble(tfC2.getText());
                
                h = Math.sqrt(c1*c1 + c2*c2);
                tfH.setText( Double.toString(h)  );
            }
        );
        add(bCalc);
        
        
    }
}
