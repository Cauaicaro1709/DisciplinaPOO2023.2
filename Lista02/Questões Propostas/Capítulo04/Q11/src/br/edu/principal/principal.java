package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salário atual: ");
        double salario = sc.nextDouble();
        double novoSalario = 0;
        double percentualAumento = 0;
        
        // Verifica em qual faixa de salário o funcionário se enquadra
        if (salario <= 300.00) {
            percentualAumento = 0.15;
        } else if (salario <= 600.00) {
            percentualAumento = 0.10;
        } else if (salario <= 900.00) {
            percentualAumento = 0.05;
        } else {
            percentualAumento = 0;
        }
        
        // Calcula o aumento e o novo salário
        double aumento = salario * percentualAumento;
        novoSalario = salario + aumento;
        
        System.out.printf("O valor do aumento é R$ %.2f e o novo salário é R$ %.2f\n", aumento, novoSalario);
        
        sc.close();
    

		 
		
	}

}
