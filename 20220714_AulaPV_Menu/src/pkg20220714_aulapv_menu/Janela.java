/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220714_aulapv_menu;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author ruhan
 */
public class Janela extends JFrame{
    
    public Janela(){
        JMenu menuArquivo = new JMenu("Arquivo");
        menuArquivo.setMnemonic(
                'A'
        );
        
        JMenu menuFerramentas = new JMenu("Ferramentas");
        menuFerramentas.setMnemonic('F');
        
        
        JMenuItem alertaItem = new JMenuItem("Alerta");
        alertaItem.setMnemonic('a');
        menuArquivo.add(alertaItem);
        alertaItem.addActionListener(
            evt -> {
                JOptionPane.showMessageDialog(this, "Alerta");
            }
        );
        
        
        JMenuItem sairItem = new JMenuItem("Sair");
        sairItem.setMnemonic('S');        
        menuArquivo.add(sairItem);        
        sairItem.addActionListener(
            evt -> {
                dispose();
            }
        
        );
        
        
        JMenuItem trocaJanelaItem = new JMenuItem("Trocar...");
        menuFerramentas.add(trocaJanelaItem);
        trocaJanelaItem.addActionListener(
            evt -> {
                TransicaoJanela tj = new TransicaoJanela();
                this.setVisible(false);                
            }
        );
        
        JMenuBar barraSuperior = new JMenuBar();
        setJMenuBar(barraSuperior);
        barraSuperior.add(menuArquivo);
        barraSuperior.add(menuFerramentas);
        
        setSize(500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    
}
