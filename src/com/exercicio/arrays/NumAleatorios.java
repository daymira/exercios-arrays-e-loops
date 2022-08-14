package com.exercicio.arrays;


import java.util.Arrays;
import java.util.Random;

/* N�meros Aleat�rios: Fa�a um Programa que leia 20 n�meros inteiros 
  aleat�rios (entre 0 e 100) armazene-os num vetor. 
  Ao final, mostre os n�meros e seus sucessores.*/

public class NumAleatorios {
	public static void main(String[] args) {
		int[] numeros = new int[20];
		Random random = new Random();
	
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = random.nextInt(100);
	
		}
		System.out.println("N�meros Aleat�rios: " + Arrays.toString(numeros));

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
