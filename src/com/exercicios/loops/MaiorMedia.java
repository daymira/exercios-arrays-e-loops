package com.exercicios.loops;
/*Faça um programa que leia 5 números e informe o maior número
e a média desses números.*/

import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int maior = 0;
        int media = 0;
        int contador = 0;

        do {
            System.out.println("Número: ");
            numero = sc.nextInt();
            media = media + numero;

            if(numero > maior) maior = numero;
            contador += 1;

        } while (contador < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + media / 5);

    }
}
