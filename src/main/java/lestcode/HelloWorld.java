package lestcode;

public class HelloWorld {
	public static void main (String[]args) {
		int nota = 100;
		String graduacao;
		
		// A 80 B 70 C 60 D 0
		if(nota >= 80) {
			// System.out.println("Graduação A");
			graduacao = "A";
		} else if (nota < 80 && nota >= 70) {
			graduacao = "B";
		} else if (nota < 70 && nota >= 60) {
			graduacao = "C";
		} else if (nota < 60 && nota >= 0) {
			graduacao = "D";
		} else {
			graduacao = "";
		}
		
		switch (graduacao) {
		case "A":
		case "B":
			System.out.println("Aluno Aprovado!");
			break;
		case "C":
		case "D":
			System.out.println("Não Aprovado!");
			break;
		default:
			System.out.println("Graduação Inválida!");
		}
		
		
	}

}
