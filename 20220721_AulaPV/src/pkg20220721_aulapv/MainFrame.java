/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220721_aulapv;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ruhan
 */
public class MainFrame extends JFrame {

    JButton b1, b2;
    JPanel p1, p2, pBotoes;
    int telaAtual;

    public MainFrame() {
        super("Janela com Paineis");

        configJanela();
        constroiPaineis();
        defLayoutInternoFrame();
        insereBotoesPainel();
        defPainelInicial();
        defAcoesBotoes();
    }

    private void configJanela() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void constroiPaineis() {
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(new JLabel("Imagem de um Golfinho andando de Skate"));
        p1.setBackground(Color.PINK);

        
        //P2 REMOVE
        
        pBotoes = new JPanel();
        FlowLayout flBotoes = new FlowLayout();
        flBotoes.setAlignment(FlowLayout.RIGHT);
        pBotoes.setLayout(flBotoes);
        pBotoes.setBackground(Color.cyan);
    }

    private void defLayoutInternoFrame() {
        setLayout(new BorderLayout());

        add(pBotoes, BorderLayout.SOUTH);

    }

    private void insereBotoesPainel() {
        b1 = new JButton("B1");
        b2 = new JButton("B2");

        pBotoes.add(b1);
        pBotoes.add(b2);
    }

    private void defPainelInicial() {
        add(p1, BorderLayout.CENTER);
        telaAtual = 1;
    }

    private void defAcoesBotoes() {

        b1.addActionListener(
                evt -> {
                    if (telaAtual == 1) {
                        return;
                    }

                    p1 = new JPanel();
                    p1.setLayout(new FlowLayout());
                    p1.add(new JLabel("Imagem de um Golfinho andando de Skate"));
                    p1.setBackground(Color.PINK);
                    
                    remove(p2);
                    add(p1, BorderLayout.CENTER);
                    telaAtual = 1;
                    revalidate();                    
                }
        );

        b2.addActionListener(
                evt -> {
                    if (telaAtual == 2) {
                        return;
                    }
                    
                    p2 = new JPanel();
                    p2.setLayout(new FlowLayout());
                    p2.add(new JLabel("Outra coisa"));
                    p2.setBackground(Color.yellow);
                    
                    remove(p1);                    
                    add(p2, BorderLayout.CENTER);
                    telaAtual = 2;
                    revalidate();
                });
    }

}
