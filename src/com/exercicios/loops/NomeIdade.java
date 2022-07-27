package com.exercicios.loops;

/*Faça um programa que leia conjuntos de dois valores,
 primeiro representando nome e o segundo representando a idade.
 Parar inserindo o valor 0 no campo nome.* /
 */

import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;

        while(true) {
            System.out.println("Nome: ");
            nome = sc.next();
            if (nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = sc.nextInt();
        }
    }
}
