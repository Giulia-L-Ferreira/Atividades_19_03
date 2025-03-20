package lista1;

import java.util.Scanner;

public class AtividadeTres {
	public static void main(String[] args) {
		
Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		int idade;
		boolean primeiraDoacao;
		
		System.out.println("Nome: ");
		nome = lerScanner.nextLine();
		
		System.out.println("\nIdade: ");
		idade = lerScanner.nextInt();
		
		if (idade < 18) {
			
			System.out.println( "\n" + nome + " não está apto para doar sangue.");
			
		} else if (idade >= 18 && idade <= 59) {
			
			System.out.println( "\n" + nome + " está apto para doar sangue.");
			
		} else if (idade >= 60 && idade <= 69) {
			
			System.out.println("\nÉ a primeira vez que você doa sangue?: ");
			primeiraDoacao = lerScanner.nextBoolean();
			
					if (primeiraDoacao) {
				
							System.out.println("\n" + nome + " está apto para doar sangue.");
				
						} else {
				
							System.out.println("\n" + nome + " não está apto para doar sangue.");
				
							}
			
		} else {
			
			System.out.println("\n" + nome + " não está apto para doar sangue.");
		
	}

		lerScanner.close();
		
		
	}

}
