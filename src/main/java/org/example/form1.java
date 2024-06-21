package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton btnOK;
    public JPanel mainPanel;
    private JLabel nombreLbl;
    private JButton btnBO;
    private JTextField SaludoTXT;
    private JButton btnC;

    public form1() {
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreLbl.setText("Hola mundo");
            }
        });
        btnBO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreLbl.setText("");
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nombreLbl.setText(SaludoTXT.getText());
            }
        });
    }

    public void createUIComponents(){

    }
}
