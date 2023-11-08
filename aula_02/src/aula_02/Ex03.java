package aula_02;

import java.util.Scanner;

public class Ex03 {
	
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
	
		float salariob, adnot, hex, desc, sliq;
		
		System.out.println("Digite o valor do salário bruto: ");
		salariob = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adnot = leia.nextFloat();
		
		System.out.println("Digite as horas extras: ");
		hex = leia.nextFloat();
		
		System.out.println("Digite o valor do desconto: ");
		desc = leia.nextFloat();
		
		sliq = ((salariob + adnot + (hex * 5) - desc));
		
		System.out.println("Seu salário líquido é: " + sliq);
		
	}

}
