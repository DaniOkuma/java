package aula_03;

import java.util.Scanner;

public class L02_ex1 {
	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		int produto, quantidade, valor, vtotal;
		System.out.println("Produto: ");
		System.out.println("1 - Cachorro Quente - R$10,00");
		System.out.println("2 - X-Salada - R$15,00");
		System.out.println("3 - X-Bacon - R$18,00");
		System.out.println("4 - Bauru - R$12,00");
		System.out.println("5 - Refrigerante - R$8,00");
		System.out.println("6 - Suco de laranja - R$13,00");
		System.out.print("\nDigite o código do produto: ");
		produto = leia.nextInt();
		System.out.print("Digite a quantidade: ");
		quantidade = leia.nextInt();
		switch(produto) {
		case 1:
			valor = 10;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = Cachorro Quente, Valor total = R$%s", + vtotal);
			break;
		case 2:
			valor = 15;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = X-Salada, Valor total = R$%s ", + vtotal);
			break;
		case 3:
			valor = 18;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = X-Bacon ,Valor total = R$%s", + vtotal);
			break;
		case 4:
			valor = 12;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = Bauru, Valor total = R$%s ", + vtotal);
			break;
		case 5:
			valor = 8;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = Refrigerante, Valor total = R$%s ", + vtotal);
			break;
		case 6:
			valor = 13;
			vtotal = (valor * quantidade);
			System.out.printf("Produto = Suco de laranja, Valor total = R$%s ", + vtotal);
			break;
		default:
			System.out.println("Produto inválido");
		}
	}

}
