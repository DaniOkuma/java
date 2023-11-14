package aula_06;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista01_Ex1 {

	
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList <String> cores = new ArrayList<String>();
		String cor;
		
		
		System.out.println("Digite a cor: ");
	
		 for (Integer indice = 0; indice < 5; indice ++) {
			 cor = leia.next();
			 cores.add(cor); }
		 
	System.out.println("Lista de todas as cores:");
	
	for (var color : cores)
		System.out.println(color);
		
	System.out.println("Ordem crescente das cores:");
	
	cores.sort (null);
	
	System.out.println(cores);
	
	}

}
