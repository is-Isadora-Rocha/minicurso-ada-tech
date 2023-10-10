package lestcode;

import java.util.Arrays;

public class VetoresJava {

	public static void main(String[] args) {
		
		int [] numero = new int [5];
		// [0] [1] [2] [3] [4]
		
		numero[0] = 1;
		numero[1] = 2;
		numero[2] = 3;
		numero[3] = 4;
		numero[4] = 5;
		
		//System.out.println(numero);
		//[I@cac736f = end de mem
		
		for (int i = 0; i < numero.length; i++) {
			System.out.println(numero[i]);
		}
		
		String[] letras = new String[3];
		
		letras[0] = "i";
		letras[1] = "s";
		letras[2] = "a";
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		String[] letras2 = {"A", "B", "C"};
		for (int i = 0; i < letras2.length; i++) {
			System.out.println(letras2[i]);
		}
		System.out.println(Arrays.toString(letras));
	}

}
