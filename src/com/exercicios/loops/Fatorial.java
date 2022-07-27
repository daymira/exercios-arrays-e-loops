package com.exercicios.loops;

/*Faça um programa que calcule o fatorial de um número inteiro fornecido
pelo usuário.
Ex.: 5!=5.4.3.2.1=120*/

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        int calculo = 0;
        int fatorial = 1;

        System.out.println("De qual número deseja saber o fatorial: ");
        numero = sc.nextInt();

        System.out.print(numero + "!= ");
        for (int i = numero; i >= 1; i--){
            calculo = i;
            fatorial = fatorial * i;
            System.out.print(calculo + " ");

        }
        System.out.print("= " + fatorial);

    }

}
