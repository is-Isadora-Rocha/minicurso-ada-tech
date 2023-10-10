package lestcode;

public class Arrays {

	public static void main(String[] args) {
		int[] numeros = {9, 10, 12, -2, 3};
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			} 
			media = media + numeros[i];
		}
		
		System.out.println("Maior: "+ maior);
		System.out.println("Menor: "+ menor);
		System.out.println("Média: "+ media);
	}

}
