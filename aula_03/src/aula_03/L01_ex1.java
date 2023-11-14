package aula_03;

import java.util.Scanner;

public class L01_ex1 {
	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numeroA, numeroB, numeroC;
		
		System.out.println("Digite o número A:");
		numeroA = leia.nextInt();
		
		System.out.println("Digite o número B:");
		numeroB = leia.nextInt();
		
		System.out.println("Digite o número C:");
		numeroC = leia.nextInt();
		
		
		if ((numeroA + numeroB) > numeroC) {
			System.out.printf("A soma de A + B é maior do que C ");
		} else if ((numeroA + numeroB) < numeroC) {
			System.out.printf("A soma de A + B é menor do que C ");

		} else if((numeroA + numeroB) == numeroC) {
			System.out.printf(" A soma de A + B é igual a C ");
	
	}

}
}