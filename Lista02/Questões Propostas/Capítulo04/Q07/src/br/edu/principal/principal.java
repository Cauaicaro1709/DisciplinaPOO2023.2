package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do salário: ");
        double salario = sc.nextDouble();
        
        // Verifica se o funcionário tem direito ao aumento
        if (salario < 500.00) {
            double salarioReajustado = salario + (salario * 0.30);
            System.out.printf("O novo salário reajustado é R$ %.2f", salarioReajustado);
        } else {
            System.out.println("O funcionário não tem direito ao aumento.");
        }
        
        sc.close();
    }


	}


