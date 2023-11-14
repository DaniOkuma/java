package aula_05;

public class Vetores {

	public static void main(String[] args) {
		
		String[] pessoas = {"Luiza", "Aline", "Vinicius", "Antônio", "Vitor", "Samara"};
		
		float[] notas = new float[5];
		
		for (int indice = 0; indice < 6; indice ++)
		
		System.out.println("Posição " + (indice + 1) + " = " + pessoas[indice]);
		
		for (int indice = 0; indice < 5; indice ++)
			
		System.out.println("Posição " + indice + " = " + notas[indice]);


	}

}
