package aula_04;

import java.util.Scanner;

public class Lista03_Ex5 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {

		int numero, soma=0 ;
		
			
			do {
				System.out.println("Digite um número: ");
				numero = leia.nextInt();
				
				if (numero >= 0) 
					
				soma += numero; 
			
			}
			
			while(numero != 0);
			
		System.out.println("A soma dos números positivos é: " + soma);
		
}

}
