package br.edu.principal;
import java.util.Scanner;

public class principal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int codigoCliente;
        double totalInvestido = 0;
        double totalJurosPagos = 0;
        
        while (true) {
            System.out.print("Digite o código do cliente (ou <= 0 para sair): ");
            codigoCliente = sc.nextInt();
            
            if (codigoCliente <= 0) {
                break;
            }
            
            System.out.print("Digite o tipo de investimento (1-Poupança, 2-Poupança plus, 3-Fundos de renda fixa): ");
            int tipoInvestimento = sc.nextInt();
            
            System.out.print("Digite o valor investido: ");
            double valorInvestido = sc.nextDouble();
            
            double rendimentoMensal = 0;
            
            switch (tipoInvestimento) {
                case 1:
                    rendimentoMensal = valorInvestido * 0.015;
                    break;
                case 2:
                    rendimentoMensal = valorInvestido * 0.02;
                    break;
                case 3:
                    rendimentoMensal = valorInvestido * 0.04;
                    break;
                default:
                    System.out.println("Tipo de investimento inválido.");
            }
            
            totalInvestido += valorInvestido;
            totalJurosPagos += rendimentoMensal;
            
            System.out.println("Rendimento Mensal: " + rendimentoMensal);
        }
        
        System.out.println("Total Investido: " + totalInvestido);
        System.out.println("Total de Juros Pagos: " + totalJurosPagos);
        
        sc.close();
    }
}