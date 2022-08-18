package com.exercicios.loops;

import java.util.Scanner;

/* Fa�a um programa que leia um nome de usu�rio e a sua senha e n�o aceite a senha igual ao nome do usu�rio, 
 mostrando uma mensagem de erro e voltando a pedir as informa��es.
 */

public class UsuarioSenha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String usuario;
		String senha;
		String entrada;
		
	    System.out.println("Digite seu nome de usu�rio: ");
		usuario = sc.nextLine();
		System.out.println("Digite sua senha: ");
		senha = sc.nextLine();
		
		while (usuario.equals(senha)) {
			
			System.out.println("A senha n�o pode ser igual ao nome de usuario.");
			System.out.println("Digite seu nome de usu�rio: ");
			usuario = sc.nextLine();
			System.out.println("Digite sua senha: ");
			senha = sc.nextLine();
		}
		System.out.println("Usu�rio: " + usuario);
		System.out.println("Deseja visualizar sua senha (s/n): " );
		entrada = sc.nextLine();
	
	    if (entrada.equalsIgnoreCase("s")) {
	    	System.out.println("Senha: " + senha);
	    }else {
	    	System.out.println("Obrigado.");
	    }
		
		
	}
	
}

