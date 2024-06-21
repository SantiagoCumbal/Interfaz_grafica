package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio {
    public JPanel PanelP;
    private JButton btnOK;
    private JButton btnBO;
    private JTextField contraseña;
    private JTextField nombre;
    private JLabel Advertencia;

    public Inicio() {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (nombre.getText()=="Santiago"){
                    if (contraseña.getText()==""){
                        Advertencia.setText("Ingreso correctamente");
                    } else{
                        Advertencia.setText("Credenciales Incorrectas");
                    }
                }else{
                    Advertencia.setText("Credenciales Incorrectas");
                }
            }
        });
    }
}
