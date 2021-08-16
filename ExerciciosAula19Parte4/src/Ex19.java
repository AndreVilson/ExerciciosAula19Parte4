package ExerciciosAula19;

import java.util.Scanner;

/*Ler as duas notas bimestrais para um conjunto de 10 alunos.
Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
tipo real. Escreva um programa que calcule a média aritmética simples
das notas informadas armazenando o resultado em um vetor “Result”
de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação	
de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
estará “aprovado”, caso contrário, a situação do aluno será
“reprovado”.*/

public class Ex19 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] notas1 = new double[10];
		double[] notas2 = new double[notas1.length];
		double[] resultados = new double[notas1.length];

		for (int i = 0; i < notas1.length; i++) {
			System.out.print("Digite a primeira nota do aluno " + i + " : ");
			notas1[i] = scan.nextDouble();
		}
		System.out.println("");
		for (int i = 0; i < notas2.length; i++) {
			System.out.print("Digite a segunda nota do aluno " + i + " : ");
			notas2[i] = scan.nextDouble();
		}

		for (int i = 0; i < resultados.length; i++) {
			resultados[i] = (notas1[i] + notas2[i]) / 2;
			System.out.print(" aluno " + i + " media " + resultados[i]);
			if (resultados[i] >= 7.0) {
				System.out.print(" Aprovado");
			} else {
				System.out.print(" Reprovado");
			}
			System.out.println(" ");
		}

	}

}
