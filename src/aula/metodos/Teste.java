package aula.metodos;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		// Algoritmo que usa a classe Calculadora e seus métodos para executar cálculos
		
		// Criação das variáveis
		int op, i;
		float n1, n2;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iniciando a calculadora");
		
		// Loop para realizar as operações quantas vezes o usuário desejar
		do {
			for(i = 0; i < 50; i++) { // Estilizar
				System.out.print("*");
			}
			// Menu
			System.out.println("\nEscolha a operação desejada: \n" + 
							   "\t1 - Somar\n" +
							   "\t2 - Subtrair\n" +
							   "\t3 - Multiplicar\n" + 
							   "\t4 - Dividir\n" +
							   "\t0 - Sair");
			for(i = 0; i < 50; i++) { // Estilizar
				System.out.print("*");
			}
			
			// Leitura da opção
			System.out.print("\nEscolha a opção: ");
			op = input.nextInt();
			
			// Switch case de acordo com a opção desejada
			switch(op) {
			case 1: // Somar
				n1 = Calculadora.recebern1();
				n2 = Calculadora.recebern2();
				System.out.println("\n" + n1 + " + " + n2 + " = " + Calculadora.somar(n1, n2));
				break;
			case 2: // Subtrair
				n1 = Calculadora.recebern1();
				n2 = Calculadora.recebern2();
				System.out.println("\n" + n1 + " - " + n2 + " = " + Calculadora.subtrair(n1, n2));
				break;
			case 3: // Multiplicar
				n1 = Calculadora.recebern1();
				n2 = Calculadora.recebern2();
				System.out.println("\n" + n1 + " * " + n2 + " = " + Calculadora.multiplicar(n1, n2));
				break;
			case 4: // Dividir
				n1 = Calculadora.recebern1();
				n2 = Calculadora.recebern2();
				System.out.println("\n" + n1 + " / " + n2 + " = " + Calculadora.dividir(n1, n2));
				break;
			case 0: // Sair
				input.nextLine();
				System.out.println("\nObrigado por usar a calculadora.");
				break;
			default: 
				System.out.println("\nOpção inválida.");
			}
			
		}while(op != 0);
		
		
	}

}
