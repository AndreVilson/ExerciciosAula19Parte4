package ExerciciosAula19;

import java.util.Scanner;

/*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
a) B i deverá receber 1 quando A i for par; b) B i deverá receber 0
quando Ai for ímpar.*/

public class Ex25 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite o número " + i + " : ");
			vetorA[i] = scan.nextInt();

			vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;// Ternário
		}

		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(" " + vetorA[i]);
		}
		System.out.println(" ");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(" " + vetorB[i]);
		}

	}

}
