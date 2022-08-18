package com.exercicios.loops;

import java.util.Scanner;

/* Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
 mostrando uma mensagem de erro e voltando a pedir as informações.
 */

public class UsuarioSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuario;
		String senha;
		String entrada;
		
	    System.out.println("Digite seu nome de usuário: ");
		usuario = sc.nextLine();
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine();
		
		while (usuario.equals(senha)) {
			
			System.out.println("A senha não pode ser igual ao nome de usuario.");
			System.out.println("Digite seu nome de usuário: ");
			usuario = sc.nextLine();
			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();
		}
		System.out.println("Usuário: " + usuario);
		System.out.println("Deseja visualizar sua senha (s/n): " );
		entrada = sc.nextLine();
	
	    if (entrada.equalsIgnoreCase("s")) {
	    	System.out.println("Senha: " + senha);
	    }else {
	    	System.out.println("Obrigado.");
	    }
		
		
	}
	
}

