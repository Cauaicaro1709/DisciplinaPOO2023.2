package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 Double sal, novosal;
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Digite seu sal�rio:");
		 sal = sc.nextDouble();
		 novosal = sal + sal * 25/100;
		 System.out.print("Seu novo sal�rio �:"+ novosal);
	}

}
