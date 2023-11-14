package aula_06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Lista01_Ex3 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		Set<Integer> numeros = new HashSet<Integer>();
		Integer numero;
		
		System.out.println("Digite 10 números inteiros não repetidos: ");
		 for (Integer indice = 0; indice < 10; indice ++) {
			 numero = leia.nextInt();
			 numeros.add(numero); }
		 
		 Iterator<Integer> iNumeros = numeros.iterator();
	
		System.out.println("Listar dados do set:");
		
		 while(iNumeros.hasNext())
			 System.out.println(iNumeros.next());
	}

}
