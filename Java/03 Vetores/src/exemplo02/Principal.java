package exemplo02;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

//		Vetor de números
		int[] numeros = new int[10];
		
		Scanner obterNumero = new Scanner(System.in);
//		Laço FOR
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o "+(i+1)+"º número");
			numeros[i] = obterNumero.nextInt();
		}
		
//		Finalizar Scanner
		obterNumero.close();
		
//		Listar os valores FOREACH
		for (int i : numeros) {
			System.out.println(i);
		}
	}
}
