package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double base, altura, �rea;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor da base: ");
		base = sc.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = sc.nextDouble();
		�rea =(base * altura)/2;
		System.out.print("O valor da �rea �: "+ �rea);

	}

}
