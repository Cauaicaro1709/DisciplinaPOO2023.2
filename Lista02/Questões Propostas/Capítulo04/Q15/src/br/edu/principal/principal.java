package br.edu.principal;
import java.util.Scanner;
import java.lang.String;
public class principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 

		System.out.print("Informe o tipo de investimento (1 para Poupança, 2 para Fundos de renda fixa): "); 

		int tipoInvestimento = scanner.nextInt(); 

		System.out.print("Informe o valor do investimento: ");
		 double valorInvestimento = scanner.nextDouble(); 
		double rendimentoMensal = 0.0; 

		if (tipoInvestimento == 1) { rendimentoMensal = valorInvestimento * 0.03;
		 } else if (tipoInvestimento == 2) { rendimentoMensal = valorInvestimento * 0.04; } 
		else { System.out.println("Tipo de investimento inválido. Use 1 para Poupança ou 2 para Fundos de renda fixa."); System.exit(1);
		 } 
		double valorCorrigido = valorInvestimento + rendimentoMensal; 
		System.out.println("O valor corrigido após um mês de investimento é: " + valorCorrigido); 
		scanner.close();

}
}
