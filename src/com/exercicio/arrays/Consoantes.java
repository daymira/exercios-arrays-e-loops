package com.exercicio.arrays;

/*  Faça um Programa que leia um vetor de 6 caracteres,

   e diga quantas consoantes foram lidas. Imprima as consoantes.*/

import java.util.Arrays;
import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] vetor = new String[6];
        String[] consoantes = new String[6];
        int count = 0;
        int consoante= 0;
        String letra = null;


        for (int i = 0; i < vetor.length; i++){
            System.out.println("Digite uma letra: ");
            letra = sc.nextLine();
            vetor[i] = letra;
            if (!(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i") | letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))){
                consoantes[i] = letra;
                consoante++;
            }
            count++;

        }
        System.out.println("Consoantes: " + consoante + Arrays.toString(consoantes));
        System.out.println("Lista de caracteres: " + Arrays.toString(vetor)); //transforma a lista em uma string.

    }
}
