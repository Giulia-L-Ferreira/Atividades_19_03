package lista2;

import java.util.Scanner;

public class AtividadeSeis {
	public static void main(String[] args) {
		
		Scanner lerScanner = new Scanner(System.in);
		
		String nome;
		float salario;
		int codigo;
		
		System.out.println("Nome:");
		nome = lerScanner.nextLine();
		
		System.out.println("\nSalário atual:");
		salario = lerScanner.nextFloat();
		
		System.out.println("Escolha a opção correspondente ao seu cargo: ");
		System.out.println("---------------------------");
		System.out.println("1) Gerente");
		System.out.println("2) Vendedor");
		System.out.println("3) Supervisor");
		System.out.println("4) Motorista");
		System.out.println("5) Estoquista");
		System.out.println("6) Técnico de TI");
		System.out.println("---------------------------");	
		codigo = lerScanner.nextInt();
		
		for (int linha = 0; linha < 50; linha++) {
		    System.out.println();
		}
		
		switch (codigo) {
			
		case 1:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 10/100);
			System.out.println(nome + " -- Gerente");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		case 2:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 7/100);
			System.out.println(nome + " -- Vendedor");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		case 3:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 9/100);
			System.out.println(nome + " -- Supervisor");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		case 4:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 6/100);
			System.out.println(nome + " -- Motorista");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		case 5:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 5/100);
			System.out.println(nome + " -- Estoquista");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		case 6:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			salario = salario + (salario * 8/100);
			System.out.println(nome + " -- Técnico de TI");
			System.out.printf("Você receberá R$%.2f", salario," apartir desse mês.");
			break;
			
		default:
			for (int linha = 0; linha < 50; linha++) {
			    System.out.println();
			}
			System.out.println("opção inválida");
			break;
		
		}
		
		
		lerScanner.close();
	}

}
