/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nomescrescente;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Jess
 */
public class Números50C {
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50); // Gera números aleatórios de 0 a 49
        }
        
        Arrays.sort(numeros);
        JOptionPane.showMessageDialog(null, "Números em ordem crescente:\n " + Arrays.toString(numeros));
    }
}
