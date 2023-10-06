package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double num, i, f, a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um número:");
		num = sc.nextDouble();
		i = (int) num;
		f = num - i;
		a = Math.ceil(num);
		System.out.println("Parte inteira do número: "+ i );
		System.out.println(" Parte fracionada do número: "+f);
		System.out.print("arredondamento do número:" +a);

	}

}
