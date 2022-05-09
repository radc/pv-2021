/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20220505_aulapv;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ruhan
 */
public class JanelaFlow extends JFrame {
    JButton bLeft, bCenter, bRight;
    FlowLayout layout;
    Container container; //CONTAINER
    
    public JanelaFlow(){
        container = getContentPane(); //CONTAINER
        
        bLeft = new JButton("Left");
        bCenter = new JButton("Center");
        bRight = new JButton("Right");
        
        layout = new FlowLayout();
        setLayout(layout);
        
        setSize(400,75);
        
        add(bLeft);
        add(bCenter);
        add(bRight);
        
        bLeft.addActionListener(new LeftButtonDoRuhan());
        
        bCenter.addActionListener(e -> {
            this.layout.setAlignment(FlowLayout.CENTER);
            this.layout.layoutContainer(container);
        });
        
        bRight.addActionListener(e -> {
            this.layout.setAlignment(FlowLayout.RIGHT);
            this.layout.layoutContainer(container);
        });
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private class LeftButtonDoRuhan implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            //vai ser executado ao pressionar o left button
            JanelaFlow.this.layout.setAlignment(FlowLayout.LEFT);
            JanelaFlow.this.layout.layoutContainer(JanelaFlow.this.container);
        }
        
    }
    
}

