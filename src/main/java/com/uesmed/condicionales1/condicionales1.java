/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.uesmed.condicionales1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Alexis
 */
public class condicionales1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: ")); 
        if (numero == dato){
            JOptionPane.showInternalMessageDialog(null,"El numero es 5.");
        }
        else {
          JOptionPane.showMessageDialog(null,"El dato es distinto a 5");
        }
    }
    
}
