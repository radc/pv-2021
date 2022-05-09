/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220310_aulapv_imc;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ruhan
 */
public class IMCFrame extends JFrame {
    private JLabel labelAltura;
    private JLabel labelPeso;
    
    private JTextField tfAltura;
    private JTextField tfPeso;
    
    private JButton bCalcular;
    
    //Construtor
    public IMCFrame(){
        super("Calculador de IMC");
        
        setSize(400, 130);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());
        
        labelAltura = new JLabel("Altura: ");
        add(labelAltura);
        
        tfAltura = new JTextField();
        tfAltura.setColumns(25); //AQUIIIII
        add(tfAltura);
        
        labelPeso = new JLabel("Peso: ");
        add(labelPeso);
        
        tfPeso = new JTextField();
        tfPeso.setColumns(25); //AQUIIIII
        add(tfPeso);
        
        bCalcular = new JButton("Calcular");
        bCalcular.addActionListener(new AcaoBotao());
        add(bCalcular);
        
    }
    
    //Classe Privada Interna
    private class AcaoBotao implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String alturaString, pesoString;
            double altura, peso, imc;
                        
            alturaString = IMCFrame.this.tfAltura.getText();
            altura = Double.parseDouble(alturaString);
            
            pesoString = IMCFrame.this.tfPeso.getText();
            peso = Double.parseDouble(pesoString);
            
            imc = peso / (altura * altura);
            
            JOptionPane.showMessageDialog(null, "Seu IMC é: " +imc);
        }
        
    }
}
