package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double sal, salreceber, imp;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor do seu sal�rio: ");
		sal = sc.nextDouble();
		imp = sal * 10/100;
		salreceber = sal + 50 - imp;
		System.out.print("O valor do seu sal�rio a receber �: "+salreceber);
	}

}
