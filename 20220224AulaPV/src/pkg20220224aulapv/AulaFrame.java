/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220224aulapv;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public class AulaFrame extends JFrame {
    
    private JTextField tfLogin;
    private JPasswordField pfSenha;
    private JButton bOk;
    
    public AulaFrame(){
        super("Acesso do Usuário");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.setSize(400,300);
        
        tfLogin = new JTextField();
        tfLogin.setColumns(30);
        add(tfLogin);
        
        pfSenha = new JPasswordField();
        pfSenha.setColumns(30);
        add(pfSenha);
        
        bOk = new JButton("Logar");
        HandlerBotao hb = new HandlerBotao();
        bOk.addActionListener(hb);
        add(bOk);        
    }
    
    private class HandlerBotao implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String str = AulaFrame.this.tfLogin.getText();
            JOptionPane.showMessageDialog(null,"Usuário Logado: " + str);
            
        }
        
    }
    
}
