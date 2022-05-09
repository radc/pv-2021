/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220414_aulapv_radiobutton;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 *
 * @author ruhan
 */
public final class Janela extends JFrame{
    JRadioButton rbQ1a, rbQ1b, rbQ1c, rbQ1d, rbQ2[];
    ButtonGroup bgQ1,bgQ2;
    
    public Janela(){
        super("Questionário");        
        this.setLayout(new FlowLayout());
        
        bgQ1 = new ButtonGroup();
        this.add(new JLabel("1 - Qual seu animal preferido?"));
               
        
        rbQ1a = new JRadioButton("Cachorro");
        bgQ1.add(rbQ1a);
        this.add(rbQ1a);
        
        rbQ1b = new JRadioButton("Gato");
        bgQ1.add(rbQ1b);
        this.add(rbQ1b);
        
        rbQ1c = new JRadioButton("Periquito");
        bgQ1.add(rbQ1c);
        this.add(rbQ1c);
        
        rbQ1d = new JRadioButton("Ratatul");
        bgQ1.add(rbQ1d);
        this.add(rbQ1d);
        
        
        rbQ2 = new JRadioButton[4];
        String pergQ2[] = {"25%","50%","33%","10%"};
        
        bgQ2 = new ButtonGroup();
        this.add(new JLabel("2 - Qual as chances de acertar?"));
        for (int i = 0; i < 4; i++) {
           rbQ2[i] = new JRadioButton(pergQ2[i]);
           bgQ2.add(rbQ2[i]);
           this.add(rbQ2[i]);
        }
        
        this.setSize(640,480);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
}
