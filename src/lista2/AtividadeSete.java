package lista2;

import java.util.Scanner;

public class AtividadeSete {
	public static void main(String[] args) {
		Scanner lerScanner = new Scanner(System.in);
		
		float numero1, numero2, resposta;
		int operacao;
		
		System.out.println("-- CALCULADORA --");
		System.out.println("\nInsira o primeiro número:");
		numero1 = lerScanner.nextFloat();
		
		System.out.println("\nInsira o segundo número:");
		numero2 = lerScanner.nextFloat();
		
		System.out.println("\nSelecione o tipo de operação desejada:");
		System.out.println("---------------------------");
		System.out.println("1. + ");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("---------------------------");
		operacao = lerScanner.nextInt();
		
		switch (operacao) {
		
		case 1:
			resposta = numero1 + numero2;
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			System.out.printf("%.2f + %.2f = %.2f",numero1,numero2,resposta);
			break;
			
		case 2:
			resposta = numero1 - numero2;
			System.out.printf("%.2f - %.2f = %.2f",numero1,numero2,resposta);
			break;
			
		case 3:
			resposta = numero1 * numero2;
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			System.out.printf("%.2f * %.2f = %.2f",numero1,numero2,resposta);
			break;
			
		case 4:
			resposta = numero1 / numero2;
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			System.out.printf("%.2f / %.2f = %.2f",numero1,numero2,resposta);
			break;
			
		default:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			System.out.println("Operação inválida");
			break;
		
		}
		
		
		
		
		lerScanner.close();
	}

}
