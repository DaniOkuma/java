package aula_04;

import java.util.Scanner;

public class Lista01_Ex1 {


	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num1, num2;
		System.out.println("Digite o primeiro número do intervalo: ");
		
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo número do intervalo: ");
		
		num2 = leia.nextInt();
		
		if (num1 >= num2) {
			System.out.println("Intervalo inválido!");
		} else {
			
			System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");
			
			for (int x=num1; x <= num2; x++) {
			if (x%3 == 0 && x%5 == 0)
				System.out.printf("%d é múltiplo de 3 e 5. \n", x);
	
			
			
		}
		}


	}

}
