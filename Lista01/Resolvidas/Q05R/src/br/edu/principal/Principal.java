package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double sal, perc, aumento, novosal;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu sal�rio: ");
		sal = sc.nextDouble();
		System.out.print("Digite seu percentual: ");
		perc = sc.nextDouble();
		aumento =  (sal * perc)/100;
		System.out.println("O valor do seu aumento foi de: "+ aumento);
		novosal = sal + aumento;
		System.out.println("Seu novo sal�rio �: "+ novosal);

	}

}
