package com.exercicio.arrays;


import java.util.Arrays;
import java.util.Random;

/* Números Aleatórios: Faça um Programa que leia 20 números inteiros 
  aleatórios (entre 0 e 100) armazene-os num vetor. 
  Ao final, mostre os números e seus sucessores.*/

public class NumAleatorios {
	public static void main(String[] args) {
		int[] numeros = new int[20];
		Random random = new Random();
	
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);
	
		}
		System.out.println("Números Aleatórios: " + Arrays.toString(numeros));

		System.out.print("        Sucessores: " );
		for (int numero: numeros) {
			System.out.print(numero + 1 + ", ");
		}
		
		System.out.print("\n       Antecessores: " );
		for (int numero: numeros) {
			System.out.print(numero - 1 + ", ");
		}

	}

}
