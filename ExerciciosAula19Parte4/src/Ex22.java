package ExerciciosAula19;

/*Gerar aleatoriamente um vetor A com 10 elementos inteiros e iguais a
0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
para implementar um programa que determine o percentual de
números 0's e 1's existentes no vetor A.*/

public class Ex22 {
	public static void main(String[] args) {

		int[] vetorA = new int[10];
		int cont1 = 0;
		int porcento = 0;

		System.out.println("VetorA ");
		for (int i = 0; i < vetorA.length; i++) {

			vetorA[i] = (int) Math.round(Math.random() * 1);
			System.out.print(" " + vetorA[i]);
			if (vetorA[i] == 1) {
				cont1++;
			}
		}
		System.out.println("");
		porcento = cont1 * 10;
		System.out.println("Qtd de Números 1 : " + porcento + "%");
		System.out.println("Qtd de Números 0 : " + (100 - porcento) + "%");

	}

}
