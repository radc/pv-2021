/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220607_aulapv_proj2;

import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ruhan
 */
public class MainFrame extends JFrame {
    //Dois paineis p1 e p2
    
    public MainFrame(){
        
        setSize(1200,600); //definir tamanho 1200 x 600
        setResizable(false); //resizable false
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        
        // grid layout
        GridLayout layout = new GridLayout(1,2);
        setLayout(layout);
        
        PainelEsquerdo pe = new PainelEsquerdo();
        add(pe,0);        
        add(new JPanel(), 1); 
        
    }
    
}
