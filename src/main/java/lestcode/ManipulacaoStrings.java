package lestcode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Locale.LanguageRange;

public class ManipulacaoStrings {

	public static void main(String[] args) {
		//Ol�, [nome]. Hoje � [dia-da-semana], BOM DIA!
		
		String nome = "Isadora";
		
		//ISO 8601
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje); //ANO/MES/DIA
		System.out.println(hoje.getDayOfWeek()); //DIA DA SEMANA
		Locale brasil = new Locale("pt", "BR"); //language e country
		
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		System.out.println(diaSemana);
		
		String saudacao; 
		LocalDateTime agora = LocalDateTime.now();
		if(agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia!";
		} else if (agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa tarde!";
		}else if (agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite!";
		} else {
			saudacao = "Ol�.";
		}
		
		System.out.printf("Ol�, %s. Hoje � %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
		
		/*String nome = "Isadora";
		System.out.println(nome.toUpperCase()); //caixa alta
		System.out.println(nome.toLowerCase()); //caixa baixa
		System.out.println(nome.length());
		
		String nomeOutro = "Isadora";
		System.out.println(nome.equalsIgnoreCase(nomeOutro));*/
		
	}

}
