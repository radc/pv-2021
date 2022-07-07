/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220607_aulapv_proj2;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ruhan
 */
public class MainFrame extends JFrame {
    //Dois paineis p1 e p2
    JPanel pDireito;
    JLabel lObj;
    
    public MainFrame(){
        
        setSize(1200,600); //definir tamanho 1200 x 600
        setResizable(false); //resizable false
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit on close operation
        
        // grid layout
        GridLayout layout = new GridLayout(1,2);
        setLayout(layout);
        
        PainelEsquerdo pe = new PainelEsquerdo();
        add(pe,0);        
       
        pDireito = new JPanel();
        pDireito.setLayout(null);
        
        lObj = new JLabel();
        lObj.setSize(10, 10);
        lObj.setLocation(200, 200);
        lObj.setBackground(Color.BLUE);
        lObj.setOpaque(true);
        
        pDireito.add(lObj);
        add(pDireito,1);    
        
        pe.setRefObj(lObj);
        
    }
    
}
