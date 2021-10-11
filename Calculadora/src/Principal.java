import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		double n1 = 0;
		double n2 = 0;
		String operacao;
		double resultado = 0;
		int contador = 0;
		String continua = "sim";
		String strn1 = "";
		String strn2 = "";

		System.out.println("Calculadora");
		System.out.println();
		System.out.println("Para realiza��o de calculos insira dois valores e a operacaoo que deseja realizar, elas s�o: Soma, Subtracao, Multiplicacao, Divisao");
		System.out.println();

		while (continua.equals("sim")) {

			System.out.println("Inserir primeiro valor: ");
			strn1 = scanner.next();

			System.out.println("Inserir segundo valor: ");
			strn2 = scanner.next();

			try {
				n1 = Double.parseDouble(strn1);
				n2 = Double.parseDouble(strn2);
			} catch (NumberFormatException e) {
				System.out.println("Iniciar calculo novamente, inserior apenas numeros");
				continue;
			}

			System.out.println("Inserir opera��o: ");
			operacao = scanner.next().toLowerCase();
			String[] palavras = operacao.split("");
			
			while (!operacao.equals("soma") && !operacao.equals("subtracao") && !operacao.equals("multiplicacao") && !operacao.equals("divisao") && contador < 3) {
				System.out.println(
						"Opera��o inv�lida, favor inserir uma das Opera��es: Soma, Subtracao, Multiplicacao, Divisao: ");
				operacao = scanner.next();
				contador++;
			}

			while (operacao.equals("divisao") && n2 == 0) {
				System.out.println("Na divis�o � impossivel dividir por 0, favor inserir o segundo valor novamente:");
				n2 = scanner.nextInt();
			}

			if (operacao.equals("soma")) {
				resultado = n1 + n2;
			} else if (operacao.equals("subtracao")) {
				resultado = n1 - n2;

			} else if (operacao.equals("multiplicacao")) {
				resultado = n1 * n2;
			} else if (operacao.equals("divisao")) {
				resultado = n1 / n2;
			} else {
				System.out.println("A opera��o est� invalida, tente novamente");
			}

			System.out.println("O resultado da operacao �: " + resultado);
			System.out.println("");
			System.out.println("Deseja realizar outro calculo? ");
			continua = scanner.next();
			while (!continua.equals("sim")) {
				System.out.println("Calculadora Finalizada");
				break;
			}
		}
	}
}