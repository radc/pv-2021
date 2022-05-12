/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220512_aulapv;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author ruhan
 */
public class JanelaSemLayout extends JFrame {
    
    JLabel personagem;
    JButton t1,t2;
    int x, y;
    
    JanelaSemLayout(){
        
        t1 = new JButton("Helena");
        t2 = new JButton("Brenda");
        t1.setBounds(10, 10, 200, 40);
        t2.setBounds(50, 50, 200, 40);
        
        add(t1);
        add(t2);
        
        setSize(1000,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        x = 0;
        y = 0;
        
        setLayout(null);
        
        ImageIcon icon = new ImageIcon("pac.png"); 
        personagem = new JLabel();
        personagem.setIcon(icon);        
        
        personagem.setLocation(x,y);
        personagem.setSize(256,256);
        
        addKeyListener(new Teclado());
        add(personagem);
        
        setVisible(true);
        
        Timer t;
        t = new Timer(1000,new Teste());
        t.start();
    }
    
    private class Teste implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            if(x > 1000) x = 0;
            
            x += 5;
            personagem.setLocation(x, y);
            
            Random rand = new Random();
            
            t1.setLocation(rand.nextInt(950), rand.nextInt(400));
            t2.setLocation(rand.nextInt(950), rand.nextInt(400));
            
        }
        
    }
    
    private class Teclado implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {   
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                x = x + 10;
                personagem.setLocation(x, y);
            }
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                x = x - 10;
                personagem.setLocation(x, y);
            }
            if(e.getKeyCode() == KeyEvent.VK_UP){
                y = y - 10;
                personagem.setLocation(x, y);
            }
            if(e.getKeyCode() == KeyEvent.VK_DOWN){
                y = y + 10;
                personagem.setLocation(x, y);
            }
            
            
        }

        @Override
        public void keyReleased(KeyEvent e) {
            
        }
        
    }
    
}
