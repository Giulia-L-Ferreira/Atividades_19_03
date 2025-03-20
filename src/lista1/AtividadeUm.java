package lista1;

import java.util.Scanner;

public class AtividadeUm {
	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		int numero1, numero2, numero3;

		
		System.out.println("Insira o primeiro número: ");
		numero1 = lerScanner.nextInt();
		
		System.out.println("Insira o segundo número: ");
		numero2 = lerScanner.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		numero3 = lerScanner.nextInt();
		
		
		if (numero1 + numero2 == numero3) {
			
			System.out.println("\nA soma do primeiro e do segundo número é igual que o terceiro número.");
			
		} else if (numero1 + numero2 < numero3) {
			
			System.out.println("\nA soma do primeiro e do segundo número é menor que o terceiro número.");
			
		} else {
			
			System.out.println("\nA soma do primeiro e do segundo número é maior que o terceiro número.");
		
			
		}

		lerScanner.close();
		
		
		
}
}
