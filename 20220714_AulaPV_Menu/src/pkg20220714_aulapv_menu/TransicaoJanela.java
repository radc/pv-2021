/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220714_aulapv_menu;

import javax.swing.JFrame;

/**
 *
 * @author ruhan
 */
public class TransicaoJanela extends JFrame{
    
    public TransicaoJanela(){
        super("Janela 2");
        
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);        
    }
    
}
