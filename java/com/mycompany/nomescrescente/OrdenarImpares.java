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
public class OrdenarImpares {
    
    public static void main(String[] args) {
        
        Integer[] numeros = new Integer[100];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100); // Gera números aleatórios de 0 a 99
        }
        Integer[] impares = Arrays.stream(numeros).filter(n -> n % 2 != 0).toArray(Integer[]::new);
        Arrays.sort(impares);
        
        JOptionPane.showMessageDialog(null, "Números ímpares em ordem crescente:\n" + Arrays.toString(impares));
    }
}
