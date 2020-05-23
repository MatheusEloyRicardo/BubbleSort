/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bubblesort;

/**
 * Classe para Calculo de Bubble Sort
 * @author Matheus Eloy
 */
public class BubbleSort {

    /**
     * Função que organiza Vetor
     * @return 
     */
    public static void preparaVetor(BubbleSortBean bubbleSort) {
        int [] vetor = bubbleSort.getVetor();
        int auxiliar = 0;

        // laço para percorrer e comparar valores do vetor
        for (int i = 0; i < vetor.length; i++) {

            // laço dentro de laço com uma repetição a menos
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    auxiliar = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = auxiliar;
                }
            }
        }

        bubbleSort.setVetor(vetor);
    }
}
