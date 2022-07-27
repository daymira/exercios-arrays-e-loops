package com.exercicios.loops;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
  O usuário deve informar de qual numero ele deseja ver a tabuada.*/

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;
        int calculo;

        System.out.println("Informe o número ao qual deseja saber a tabuada: ");
        numero = sc.nextInt();
        System.out.println("Tabuada de " + numero);

        for (int i = 1; i <= 10; i++){
            calculo = numero * i;
            System.out.println(numero + " X " + i + ": " + calculo);

        }

    }

}
