package com.exercicio.arrays;

/* Faça um programa que leia um vetor de 5 números inteiros
    e mostre-os na ordem inversa.*/

import java.util.Arrays;
import java.util.Scanner;

public class OrdemInversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerosInt [] = new int [5];
        int numero = 0;

        for (int i = 0 ; i < numerosInt.length; i++){
            System.out.println("Digite um numero: ");
            numero = sc.nextInt();
            numerosInt[i] = numero;
        }

        System.out.println("\nLista original: " + (Arrays.toString(numerosInt)));

        System.out.print("Ordem inversa: ");
        for(int i = (numerosInt.length-1); i >= 0; i--){
            System.out.print(numerosInt[i] + " ");
        }

    }
}
