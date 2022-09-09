import java.text.DecimalFormat;
import java.util.Scanner;

public class funcoes {

	public static String criaVetor1(int tamanho) {
		StringBuilder saida = new StringBuilder();
		for (int i = 1; i <= tamanho; i++) {
			saida.append("\n");
			int valor = i;
			for (int j = 1; j <= i; j++) {
				saida.append(valor);
				saida.append(" | ");
			}
		}
		return saida.toString();
	}

	public static String criaVetor2(int tamanho) {
		StringBuilder saida = new StringBuilder();
		for (int i = 1; i <= tamanho; i++) {
			saida.append("\n");
			for (int j = 1; j <= i; j++) {
				saida.append(j);
				saida.append(" | ");
			}
		}
		return saida.toString();
	}

	public static StringBuilder somaArgumento() {

		Scanner entrada = new Scanner(System.in);
		StringBuilder saida = new StringBuilder();

		System.out.println("Insira se o argumento é números ou palavras: Digite 1- para número 2- Palavras.");
		int valor = entrada.nextInt();

		if (valor == 1) {
			float soma = 0;
			for (int i = 0; i < 3; i++) {
				System.out.println("Insira um Argumentos:");
				float valorargnumerico = entrada.nextInt();
				soma += valorargnumerico;
			}
			saida.append(soma);
		} else {
			for (int i = 0; i < 3; i++) {
				System.out.println("Insira um Argumento:");
				String valorargpalavras = entrada.next();
				saida.append(valorargpalavras);
				saida.append(" ");
			}
		}

		return saida;

	}

	public static StringBuilder retornaValor(float valor) {

		StringBuilder saida = new StringBuilder();
		if (valor > 0) {
			saida.append("P ");
		} else if (valor <= 0) {
			saida.append("N ");
		}

		return saida;

	}

	public static String somaImposto(float taxaImposto, float custo) {
		float novovalor = custo + (custo) / 100 * taxaImposto;
		return new DecimalFormat("#,##0.00").format(novovalor);

	}

	public static void conversorHora(String horario) {
		int h1 = (int)horario.charAt(0) - '0';
		int h2 = (int)horario.charAt(1)- '0';
		 
		int hh = h1 * 10 + h2;
		System.out.println(hh);
		 
		//return hh; 
		 
	    String amPM;
	    
	    if (hh < 12) {
		amPM = "AM";
		}else {
			amPM = "PM";
		}
		        
		hh %= 12;
		 
		if (hh == 0) {
		   System.out.print("12");
		
		   for (int i = 2; i <5; ++i) {
			   System.out.print(horario.charAt(i));
		   }
		}else {
			System.out.print(hh);
		    
			for (int i = 2; i <5; ++i) {
		        System.out.print(horario.charAt(i));
		    }
			
		}
		
		System.out.println(" "+amPM);
		
		}
}

