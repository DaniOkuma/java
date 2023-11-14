package aula_05;
import java.util.Scanner;

public class Ex4_Matrizes {
	
	static Scanner leia = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		float[][] notas = new float [10][4];
		float [] media = new float [10];
		float soma = 0.0f;
		
		for(int indiceI = 0; indiceI < notas.length; indiceI ++) {
			for(int indiceJ = 0; indiceJ < notas[indiceI].length; indiceJ ++) {
				System.out.println("Digite a " + (indiceJ + 1) + "ª nota do participante " + (indiceI +1) + ":");
				notas[indiceI][indiceJ] = leia.nextFloat();
				
		}
		}
	
	for (int indiceI = 0; indiceI < notas.length; indiceI ++) {
		for (int indiceJ = 0; indiceJ < notas[indiceI].length ; indiceJ ++) {
			soma += notas[indiceI][indiceJ];
		}
		
		media[indiceI] = soma/notas[indiceI].length;
		soma = 0.0f;
}
	for (int indice = 0; indice < media.length; indice ++)
		System.out.println("A média do participante " + (indice + 1 )  + " é: " + media[indice]);
	}
}
