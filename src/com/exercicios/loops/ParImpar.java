package com.exercicios.loops;

/*Faça um programa que peça N números inteiros.
Calcule e mostre a quantidade de números pares e a
quantidade de números impares.*/

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int numerosPares = 0, numerosImpares = 0;

        System.out.println("Quantos números deseja digitar: ");
        quantNumeros = sc.nextInt();
        int contador = 0;


        do{
            System.out.println("Número: " );
            numero = sc.nextInt();

            if(numero % 2 == 0){
                numerosPares += 1;
            }else{
                numerosImpares += 1;
            }
            contador += 1;
        }while(contador < quantNumeros);

        System.out.println("Números Pares: " + numerosPares);
        System.out.println("Números Impares: " + numerosImpares);
    }

}
