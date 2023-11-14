package aula_06;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EstruturaDados_Fila {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		int opcao;
		String nome;
		
		while(true) {
		System.out.println("************************************************");
		System.out.println("                                                ");
		System.out.println("       1 - Adicionar Cliente na Fila            ");
		System.out.println("       2 - Listar todos os Clientes             ");
		System.out.println("       3 - Retirar Cliente da Fila              ");
		System.out.println("       0 - Sair                                 ");
		System.out.println("                                                ");
		System.out.println("************************************************");
		System.out.println("Entre com a opção desejada:");
	
		opcao = leia.nextInt();
	
		if (opcao == 0) {
			System.out.println("Programa Finalizado!");
			System.exit(0);
		}
		
		switch(opcao) {
		
		case 1:
			System.out.println("Digite o nome do cliente: ");
			leia.skip("\\R");
			nome = leia.nextLine();
			
			fila.add(nome);
			System.out.println("Cliente foi adicionado na fila!");
		
			break;
			
		case 2:
			System.out.println("Lista de todos os cliente na fila: ");
			Iterator<String> iFila = fila.iterator();
			
			while(iFila.hasNext())
				System.out.println(iFila.next());
			
			break;
			
		case 3:
			if(fila.isEmpty())
				System.out.println("A fila está vazia!");
			else {
				fila.remove();
				//ou  fila.poll();
				System.out.println("O cliente foi chamado!");
			}
			break;
			
		default:
			System.out.println("Opção Inválida.");
			break;
		
		}
		
	}

}
}
