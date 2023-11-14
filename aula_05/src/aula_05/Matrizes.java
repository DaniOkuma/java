package aula_05;

public class Matrizes {


	public static void main(String[] args) {
	
		int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		double[][] matrizDouble = new double[3][3];
		
		
		
		//2 laços de repetição - um para a linha e outro para a coluna
		
		//controla a linha
		for(int indiceI = 0; indiceI < matriz.length; indiceI ++) {
			
			//controla a coluna
			for(int indiceJ = 0; indiceJ < matriz.length; indiceJ ++) {
				System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] =" + matriz[indiceI][indiceJ]);
				
				
				//controla a linha
				for(int indiceI = 0; indiceI < matrizDouble.length; indiceI ++) {
					
					//controla a coluna
					for(int indiceJ = 0; indiceJ < matrizDouble.length; indiceJ ++) {
						System.out.println("Matriz[" + indiceI + "][" + indiceJ + "] =" + matrizDouble);
						matrizDouble[indiceI][indiceJ] = leia.nextDouble();
						
						
					}
				}
			}
			
		}

	}

}
