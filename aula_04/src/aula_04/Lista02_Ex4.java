package aula_04;

import java.util.Scanner;

public class Lista02_Ex4 {

	static Scanner leia = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
		int idgen, dev, back=0, mCTFront=0, hCTMobM40=0, nbFullMen30=0, total=0;
		float media, idade, sidade=0;
		
		String continua = "S";

		while(continua.equalsIgnoreCase("S")) {
			
			System.out.println("Digite a sua idade: ");
			idade = leia.nextFloat();
			
			sidade += idade;
			
			do {
			
			System.out.println("Digite sua identidade de gênero \n 1- Mulher Cis \n 2-Homem Cis \n 3-Não Binário \n  4-Mulher Trans \n 5-Homem Trans \n 6-Outros : ");
			idgen = leia.nextInt();
			
			System.out.println("Pessoa Desenvolvedora: \n 1-Backend \n 2-Frontend \n 3-Mobile \n  4-Fullstack : ");
			dev = leia.nextInt();
					
			} while (idgen < 1 || idgen > 6);
				
			
			//Quantas pessoas gostam de futebol
			if ((idgen >= 1) && dev == 1)
				back ++;	
			
			//Quantas pessoas gostam de vôlei e são maiores de 18 anos
			if ((idgen == 1 || idgen == 4) && dev == 2)
				mCTFront ++;	
			
			//Quantas pessoas gostam de basquete e são menores de 18 anos
			if ((idgen == 2 || idgen == 5) &&  (dev == 3) && (idade > 40))
				hCTMobM40 ++;
			
			//Quantas pessoas gostam de basquete e são menores de 18 anos
			if ((idgen == 3) && (dev == 4) && (idade < 30))
				nbFullMen30 ++;
			
			//Quantas pessoas gostam de basquete e são menores de 18 anos
			if (idgen <= 6)
				total ++;
			
	
			System.out.println("Deseja continuar (S/N)? ");
			leia.skip("\\R");
			continua = leia.nextLine().toUpperCase();
		}
		

		media = (sidade / total);

		System.out.println("Total de pessoas desenvolvedoras Backend: " + back);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mCTFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + hCTMobM40);
		System.out.println("Total de pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + nbFullMen30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + total);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.2f", media);
		

		
}

}
