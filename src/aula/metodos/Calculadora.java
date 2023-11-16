package aula.metodos;

import java.util.Scanner;

public class Calculadora {
	
	// Métodos são ações associadas a uma classe específica e são utilizadas para modularizar um programa em funcionalidades menores e mais contidas, assim, ao invés de uma função fazer várias coisas ao mesmo tempo, cada função é responsável por uma única ação, o que facilita muito a manutenção do programa
	
	// A estrutura de um método é: 
	// [modificador de acesso] [modificador de não acesso] [tipo] nome (parametros) {funcionalidade}
	
	// Essa classe cria métodos para ler dois números e fazer o cálculo das 4 operações matemáticas básicas:
	
	public static float recebern1() { // Ler n1
		float n1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite o primeiro número: ");
		n1 = input.nextFloat();
		
		return n1;
	}
	
	public static float recebern2() { // Ler n2
		float n2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\nDigite o segundo número: ");
		n2 = input.nextFloat();
		
		return n2;
	}
	
	public static float somar(float n1, float n2) { // Soma
		return n1 + n2;
	}
	
	public static float subtrair(float n1, float n2) { // Subtração
		return n1 - n2;
	}
	
	public static float multiplicar(float n1, float n2) { // Multiplicação
		return n1 * n2;
	}
	
	public static float dividir(float n1, float n2) { // Divisão
		return n1 / n2;
	}

}
