/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220323_aulapv_checkbox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public final class FrameCadastro extends JFrame {
    JLabel lNome, lEmail, lTelefone;
    JTextField tfNome, tfEmail, tfTelefone;
    JButton bCadastrar;
    
    JCheckBox cbWhats, cbMaior;
    
    //Construtor
    public FrameCadastro(){
        super("Cadastro");
        
        //Configurações da Janela            
        this.setSize(480, 480); //Definir tamanho
        this.setResizable(false);//Não deixar ser redimensionável
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Encerrar o processo quando fechar a janela
        this.setLocationRelativeTo(null);//Centralizar a janela na tela
                
        //Inicializar componentes e Adicionar na Tela
        this.setLayout(new FlowLayout());
        
        this.lNome = new JLabel("Nome: ");
        this.add(this.lNome);
        this.tfNome = new JTextField(30);        
        this.add(this.tfNome);
        
        this.lTelefone = new JLabel("Telefone: ");
        this.add(this.lTelefone);
        this.tfTelefone = new JTextField(23);
        this.add(this.tfTelefone);
        
        this.cbWhats = new JCheckBox("WhatsApp");
        this.add(this.cbWhats);
        
        this.lEmail = new JLabel("E-mail: ");
        this.add(this.lEmail);
        this.tfEmail = new JTextField(30);
        this.add(this.tfEmail);
        
        this.cbMaior = new JCheckBox("Sou maior de idade");
        this.add(this.cbMaior);
        
        this.bCadastrar = new JButton("Cadastrar");
        this.bCadastrar.addActionListener(new ButtonHandler()); //Add o listener para o bota
        this.add(this.bCadastrar); //Add o botão na janela
        
        //Deixar a janela visivel
        this.setVisible(true);
    }
    
    //Manuseador do Botao
    private class ButtonHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(FrameCadastro.this.cbMaior.isSelected()){
                JOptionPane.showMessageDialog(null, "Maior de idade");
            }else{
                JOptionPane.showMessageDialog(null, "Menor de idade");
            }
           
        }
        
    }
    
}
