package aula_05;

import java.util.Scanner;

public class Ex1_Vetores {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();

	    if (numero <= 0 || numero>11) 
        	System.out.println("O número " + numero + " não foi encontrado!");

	    else
	    for (int indice = 0; indice < vetor.length; indice ++) {
	  System.out.println("O número " + vetor[indice] + " está localizado na posição: " + indice);
		  
			
	}

}
}
