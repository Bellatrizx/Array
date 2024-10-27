package com.mycompany.nomescrescente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Jess
 */
public class OrdenarPares {
    
    public static void main(String[] args) {
        
         Integer[] numeros = new Integer[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Gera números aleatórios de 0 a 99
        }
        Integer[] pares = Arrays.stream(numeros).filter(n -> n % 2 == 0).toArray(Integer[]::new);
        Arrays.sort(pares);
        
        JOptionPane.showMessageDialog(null, "Números pares em ordem crescente:\n" + Arrays.toString(pares));
    }
    
}
