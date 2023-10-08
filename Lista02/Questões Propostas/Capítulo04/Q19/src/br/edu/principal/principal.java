package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		 System.out.print("Digite a altura (em metros): ");
		 double altura = input.nextDouble();
		 System.out.print("Digite o sexo (M para masculino, F para feminino): "); 
		char sexo = input.next().charAt(0); 
		double pesoIdeal; if (sexo == 'M' || sexo == 'm') 
		{ pesoIdeal = (72.7 * altura) - 58; } 
		else if (sexo == 'F' || sexo == 'f') { 
			pesoIdeal = (62.1 * altura) - 44.7;
			} else { System.out.println("Sexo inválido. Por favor, digite M ou F.");
			
			return; 
			} System.out.println("O peso ideal é: " + pesoIdeal + " kg"); 
			
			input.close();
			}


     }

