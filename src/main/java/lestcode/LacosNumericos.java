package lestcode;

public class LacosNumericos {

	public static void main(String[] args) {
		// 1 2 3 4 5 6 7 8 9 10
		/* para uma variável que inicia em 1, e vai até 10, 
		mudando 1-por-1, faça: */
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		for(int i = 1; i <= 10; i+=2) { //pula de 2-em-2
			System.out.println(i); //13579
		}
		
		//EXEMPLO TABUADA
		
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + "x" + i + " = " + j * i);
			}
		}
	}

}
