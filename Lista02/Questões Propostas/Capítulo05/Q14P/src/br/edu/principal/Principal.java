package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeOtimo = 0;
        int quantidadeRegular = 0;
        int quantidadeBom = 0;
        int totalIdadesOtimo = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Informe a idade do espectador " + i + ": ");
            int idade = scanner.nextInt();

            System.out.print("Informe a opinião (3 - ótimo, 2 - bom, 1 - regular): ");
            int opiniao = scanner.nextInt();

            if (opiniao == 3) {
                quantidadeOtimo++;
                totalIdadesOtimo += idade;
            } else if (opiniao == 1) {
                quantidadeRegular++;
            } else if (opiniao == 2) {
                quantidadeBom++;
            } else {
                System.out.println("Opinião inválida. Use 3 para ótimo, 2 para bom ou 1 para regular.");
                i--; // Reverte o incremento do loop para repetir a entrada.
            }
        }

        double mediaIdadesOtimo = (double) totalIdadesOtimo / quantidadeOtimo;
        double percentagemBom = (double) quantidadeBom / 15 * 100;

        System.out.println("Média das idades das pessoas que responderam ótimo: " + mediaIdadesOtimo);
        System.out.println("Quantidade de pessoas que responderam regular: " + quantidadeRegular);
        System.out.println("Percentagem de pessoas que responderam bom: " + percentagemBom + "%");

        scanner.close();
    }
}