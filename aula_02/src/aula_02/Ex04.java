package aula_02;

import java.util.Scanner;

public class Ex04 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		float numero1, numero2, numero3, numero4, resultado;
		
		System.out.println("Digite o número 1");
		numero1 = leia.nextFloat();
		
		System.out.println("Digite o número 2");
		numero2 = leia.nextFloat();
		
		System.out.println("Digite o número 3");
		numero3 = leia.nextFloat();
		
		System.out.println("Digite o número 4");
		numero4 = leia.nextFloat();
		
		resultado = ((numero1 * numero2) - (numero3 * numero4));
		
		System.out.println("A diferença é:" + resultado);
		
	}

}
