/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bubblesort;

/**
 * Programa que Organiza um Vetor com o Efeito Burble Sort
 * @author Matheus Eloy
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vetor = {5,3,2,4,7,1,0,6};

        // Monta o Objeto passando Vetor
        BubbleSortBean BubbleSortBean = new BubbleSortBean();
        BubbleSortBean.setVetor(vetor);

        // Passa o Objeto para organização Bubble Sort
        BubbleSort.preparaVetor(BubbleSortBean);
        vetor = BubbleSortBean.getVetor();

        // mostra resultado organizado
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(" "+vetor[i]);
        }
    }
}
