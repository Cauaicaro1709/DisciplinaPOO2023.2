package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double sal, novo_sal, boni, aux;
		System.out.print("Digite seu salario:");
		sal = sc.nextDouble();
		if (sal<= 500) {
			boni = sal * 5/100;
		}else boni = 0;
		
		if (sal<=600) {
			aux = 150 ;
		}else aux = 100;
		novo_sal= sal + boni + aux;
		
		System.out.print("Seu novo salario ser� :" + novo_sal);
		
		
	}

}
