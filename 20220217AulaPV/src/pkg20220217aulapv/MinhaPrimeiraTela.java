/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220217aulapv;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public class MinhaPrimeiraTela extends JFrame {
    
    //Atributos
    private JLabel variavelLabel;
    private JTextField caixa;
    
    public MinhaPrimeiraTela(){
        this.setSize(300, 300); //Define o tamanho da janela
        this.setResizable(false); //Deixa o tamanho fixo
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Quando fechar a janela, parar de executar o código
        this.setLocationRelativeTo(null); //Centraliza a janela
        
        this.setLayout(new FlowLayout()); //Define o Layout da Janela para colocar os componentes
        
        this.variavelLabel = new JLabel(); //Inicializando o componente do tipo JLabel                
        this.variavelLabel.setText("Nome:"); //Definindo o texto do JLabel
        this.add(this.variavelLabel); //Add o JLabel na Janela
        
        String texto = JOptionPane.showInputDialog(null,"Digite seu nome");        
        this.caixa = new JTextField(); //Cria um campo de texto
        this.caixa.setColumns(10); //Diz o número de caracteres
        this.caixa.setText(texto);
        this.caixa.setEditable(false);
        this.add(this.caixa);
        
        this.setVisible(true); //Torna a janela com seus componentes visíveis
        
        
        
    }
    
}
