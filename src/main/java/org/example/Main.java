package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Dialogos de entrada
        String primernumero= JOptionPane.showInputDialog("Introduzca el primer numero: ");
        String segundonumero= JOptionPane.showInputDialog("Introduzca el segundo numero: ");
        //String a int
        int numero1=Integer.parseInt(primernumero);
        int numero2=Integer.parseInt(segundonumero);
        int suma=numero1+numero2;
        int resta=numero1-numero2;
        int multiplicacion=numero1*numero2;
        int division=numero1/numero2;
        //
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+suma,"SUMA DE DOS ENTEROS",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la resta es: "+resta,"SUMA DE DOS ENTEROS",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es: "+multiplicacion,"SUMA DE DOS ENTEROS",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"El resultado de la division es: "+division,"SUMA DE DOS ENTEROS",JOptionPane.PLAIN_MESSAGE);

    }
}