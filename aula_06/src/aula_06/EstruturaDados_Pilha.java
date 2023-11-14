package aula_06;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class EstruturaDados_Pilha {

		static Scanner leia = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			Stack<String> pilha = new Stack<String>();
			
			int opcao;
			String nome;
			
			while(true) {
			System.out.println("************************************************");
			System.out.println("                                                ");
			System.out.println("       1 - Adicionar livro na pilha             ");
			System.out.println("       2 - Listar todos os livros               ");
			System.out.println("       3 - Retirar livro da pilha               ");
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
				System.out.println("Digite o nome do livro: ");
				leia.skip("\\R");
				nome = leia.nextLine();
				
				pilha.push(nome);
				System.out.println("Livro adicionado na pilha!");
				break;
				
			case 2:
				System.out.println("Lista de livros na pilha: ");
				Iterator<String> iPilha = pilha.iterator();
				
				while(iPilha.hasNext())
					System.out.println(iPilha.next());
				break;
				
			case 3:
				if(pilha.isEmpty())
					System.out.println("A pilha está vazia!");
				else {
					pilha.pop();
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
				
			default:
				System.out.println("Opção Inválida.");
				break;
			
			}
			
		}

	}
	}
