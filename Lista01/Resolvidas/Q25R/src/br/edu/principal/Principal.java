package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double custo, convite, qtd;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o custo de uma peça teatral: ");
		custo = sc.nextDouble();
		System.out.print("Digite o valor do convite: ");
		convite = sc.nextDouble();
		qtd = custo / convite;
		System.out.print("A quantidade de convites que devem ser vendidos para alcançar a quantidade de custo do teatro: "+qtd);	

	}

}
