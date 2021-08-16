package ExerciciosAula19;

import java.util.Scanner;

/*Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
regras de formação: a) Ci deverá receber 1 quando Ai for maior que Bi;
b) Ci deverá receber 0 quando Ai for igual a Bi; c) Ci deverá receber -1
quando A i for menor que B i .*/

public class Ex26 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorA[i] = scan.nextInt();
		}
		System.out.println(" ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("Digite a posição " + i + " : ");
			vetorB[i] = scan.nextInt();
		}
		System.out.println("vetorA");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("   " + vetorA[i]);
		}
		System.out.println(" ");
		System.out.println("vetorB");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print("   " + vetorB[i]);
		}
		System.out.println(" ");
		System.out.println("vetorC");
		for (int i = 0; i < vetorC.length; i++) {
			if (vetorA[i] > vetorB[i]) {
				vetorC[i] = 1;
				System.out.print("   " + vetorC[i]);
			} else if (vetorA[i] == vetorB[i]) {
				vetorC[i] = 0;
				System.out.print("   " + vetorC[i]);
			} else {
				vetorC[i] = -1;
				System.out.print("   " + vetorC[i]);
			}
		}

	}

}
