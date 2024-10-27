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
public class Campeonato {
    
    public static void main(String[] args) {
             String[][] times = {
            {"Botafogo", "64"},
            {"Palmeiras", "61"},
            {"Fortaleza", "57"},
            {"Flamengo", "54"},
            {"Internacional", "52"},
            {"São Paulo", "51"},
            {"Bahia", "46"},
            {"Cruzeiro", "44"},
            {"Atlético-MG", "41"},
            {"Vasco da Gama", "40"},
            {"Grêmio", "38"},
            {"Criciúma", "37"}
        };

        // Ordenando o array em ordem decrescente com base nos pontos
        Arrays.sort(times, (time1, time2) -> Integer.parseInt(time2[1]) - Integer.parseInt(time1[1]));

        StringBuilder classificacao = new StringBuilder("Classificação do Campeonato Brasileiro (Ordem Decrescente de Pontos):\n");
        for (int i = 0; i < times.length; i++) {
            classificacao.append((i + 1) + "º ").append(times[i][0]).append(" - ").append(times[i][1]).append(" pontos\n");
        }
        
        JOptionPane.showMessageDialog(null, classificacao.toString());
    }
}
