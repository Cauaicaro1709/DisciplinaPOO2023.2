package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double number, quadrado, cubo, raiz2, raiz3;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero:");
		number = sc.nextDouble();
		quadrado = Math.pow(number,2);
		cubo = Math.pow(number,3);
		raiz2 = Math.sqrt(number);
		raiz3 = Math.cbrt(number); 
		System.out.println("Numero digitado foi: "+number);
		System.out.println("Seu numero ao quadrado �: "+quadrado);
		System.out.println("Seu numero ao cubo �: "+ cubo);
		System.out.println("A raiz quadrada do numero �: "+raiz2);
		System.out.println("A raiz cubica do numero �: "+raiz3);
	}

}
