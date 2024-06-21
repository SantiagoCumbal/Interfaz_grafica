package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public JPanel panel1;
    private JButton btnS;
    private JButton btnM;
    private JButton btnR;
    private JButton btnD;
    private JTextField numero1;
    private JTextField numero2;
    private JLabel Respuesta;

    public Calculadora() {
        btnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int suma=numero1V+numero2V;
                Respuesta.setText(suma+"");
            }
        });
        btnR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int resta=numero1V-numero2V;
                Respuesta.setText(resta+"");
            }
        });
        btnM.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int numero1V=Integer.parseInt(numero1.getText());
                int numero2V=Integer.parseInt(numero2.getText());
                int multi=numero1V*numero2V;
                Respuesta.setText(multi+"");
            }
        });
        btnD.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double numero1V=Integer.parseInt(numero1.getText());
                double numero2V=Integer.parseInt(numero2.getText());
                if(numero2V==0){
                    Respuesta.setText("NO EXISTE DIVISION PARA 0");
                } else{
                    double divi=numero1V/numero2V;
                    Respuesta.setText(divi+"");
                }
            }
        });
    }
}
