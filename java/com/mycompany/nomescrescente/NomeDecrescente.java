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
public class NomeDecrescente {
    public static void main(String[] args) {
     String[] nomes = {"Victoria", "Gabrielle", "Beatriz", "Yasmim", "Jessica", "Esther", "Juliana", "Stefanny", "Souza", "Murillo", "Lucas", "Joaquim", 
    "Maria", "João", "Frederico"};
     Arrays.sort(nomes, Collections.reverseOrder());
     JOptionPane.showMessageDialog(null, "Nomes em ordem alfabética decrescente: " + Arrays.toString(nomes));
    }
}


