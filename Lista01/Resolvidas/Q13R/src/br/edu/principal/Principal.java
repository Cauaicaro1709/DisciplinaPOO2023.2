package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Double pes, polegadas, jardas, milhas;
		Scanner sc = new Scanner(System.in);
		System.out.print("digite a quantidades de p�s: ");
		pes = sc.nextDouble();
		polegadas = pes * 12;
		jardas = pes / 3;
		milhas = jardas / 1.760;
		System.out.println("convers�o de p�s para polegadas �: "+polegadas);
		System.out.println("convers�o de p�s para jardas �: "+ jardas);
		System.out.println("convers�o de p�s para milhas �: "+ milhas);


	}

}
