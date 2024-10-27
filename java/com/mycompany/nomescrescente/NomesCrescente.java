/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomescrescente;

import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Jess
 */
public class NomesCrescente {

    public static void main(String[] args) {
      String[] nomes = {"Victoria", "Gabrielle", "Beatriz", "Yasmim", "Jessica", "Esther", "Juliana", "Stefanny", "Souza", "Murillo"};
      Arrays.sort(nomes);
      JOptionPane.showMessageDialog(null, "Nomes em ordem alfabética crescente: " + Arrays.toString(nomes));
    }
}
