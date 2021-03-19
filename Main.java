/* Faça um programa em java que leia 10 valores inteiros, armazene-os em um vetor.
Crie um outro vetor que terá os números inteiros armazenados em ordem crescente.
Após a ordenação, apresente o conteúdo dos dois vetores. */

import java.util.*; 

class Main {
  public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

    //int n;
		int v1[] = new int[10];

		for (int i=0; i<10; i++) {
			System.out.print("Informe um número inteiro >> ");
			v1[i] = sc.nextInt();
		}

		int v2[] = Arrays.copyOf(v1,10);
		Arrays.sort(v2);

		System.out.println("\n\n***Primeiro Array:");
		for (int i=0; i<10; i++) {
			System.out.println(v1[i]);
		}

		System.out.println("\n\n***Segundo Array:");
		for (int i=0; i<10; i++) {
			System.out.println(v2[i]);
		}
		
  }
}