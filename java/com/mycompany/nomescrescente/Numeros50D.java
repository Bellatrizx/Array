/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomescrescente;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Jess
 */
public class Numeros50D {
    
    public static void main(String[] args) {
        
         Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50); // Gera números aleatórios de 0 a 49
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        
        JOptionPane.showMessageDialog(null, "Números em ordem decrescente:\n" + Arrays.toString(numeros));
        
    }
    
}
