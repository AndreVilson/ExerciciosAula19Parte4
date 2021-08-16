package ExerciciosAula19;

import java.util.Scanner;

/*Implementar um programa que obtenha a cotação do dólar (U$) em
relação ao real (R$) e a seguir armazene em vetor A com 20
elementos as seguintes conversões:
A[i] = cotação do dolar * i, para todo i variando de 1 até 20.*/

public class Ex20 {
	public static void main(String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		double[] vetorA = new double[20];
		double cotacao;;
		
		System.out.println("Digite a cotação do dólar ");
		cotacao = scan.nextDouble();
		
		for (int i = 0; i < vetorA.length; i++) {
			
			
			vetorA [i]= cotacao * i;
			
			
			System.out.println("Cotação " + i + " : " + vetorA[i]);
			
			
		}
		
		
		
		
		
		
		
	}

}
