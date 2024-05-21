package tarefa_controle_de_fluxos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		float nota1, nota2, nota3, nota4;
		
		System.out.println("********* Calculadora de Médias **********");
		System.out.println("Coloque suas notas do ano (número de 1-10)");

		System.out.println("\nDigite sua nota do primeiro bimestre: ");
		nota1 = scanner.nextFloat();
		
		System.out.println("Digite sua nota do segunto bimestre: ");
		nota2 = scanner.nextFloat();

		System.out.println("Digite sua nota do terceiro bimestre: ");
		nota3 = scanner.nextFloat();
		
		System.out.println("Digite sua nota do quarto bimestre: ");
		nota4 = scanner.nextFloat();
		
		float soma = nota1 + nota2 + nota3 + nota4;
		float media = soma / 4;
		
		System.out.println("Sua média é: " + media);
		
		if (media >= 7) {
			System.out.println("Parabéns!!\nVocê foi aprovado!!");
		} else if (media >= 5) {
			System.out.println("Você está de recuperação.");
		} else {
			System.out.println("Você está reprovado.");
		}
	}

}
