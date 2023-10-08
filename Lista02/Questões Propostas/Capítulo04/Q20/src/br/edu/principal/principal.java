package br.edu.principal;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		
		int idade;
        String categoria;
          Scanner sc = new Scanner(System.in);     
        System.out.print("Digite sua idade:"); 
        idade = sc.nextInt();
        if(idade < 5) {   
            categoria = "Nadador muito jovem para ás categorias";  
        } else if(idade >= 5 && idade <= 7) {  
            categoria = "Infantil"; } 
          else if(idade >= 8 && idade<= 10) {  
            categoria = "Juvenil"; 
       } else if(idade >= 11 && idade <= 15) {  
           categoria = "Adolescente";
       } else if(idade >= 16 && idade <= 30) { 
           categoria = "Adulto"; 
       } else { 
            categoria = "Sénior";
       }  
        System.out.println("Categoria:"+categoria);
		
			}
}
