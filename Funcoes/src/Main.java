import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada= new Scanner(System.in);
		
		/*System.out.println("Insira um valor inteiro?");
		int a = entrada.nextInt();
		System.out.println(funcoes.criaVetor1(a));
		System.out.println();
		
		System.out.println("Resposta do Exercício 2:");
		System.out.println(funcoes.criaVetor2(a));
		*/
		//System.out.println(funcoes.somaArgumento());
		
	/*	System.out.println("Insira um valor: ");
		float valor= entrada.nextFloat();
		System.out.println(funcoes.retornaValor(valor));*/
	
		/*System.out.println("Insira o valor do imposto sobre as vendas:");
		float imposto= entrada.nextFloat();
		System.out.println("Insira o custo do produto: ");
		float custo = entrada.nextFloat();
		System.out.println("Valor do produto com o imposto:");
		System.out.println(funcoes.somaImposto(imposto, custo));*/
		
		System.out.println("Insira o horário que deseja converter:");
		String hora= entrada.next();
		funcoes.conversorHora(hora);
	}

}
