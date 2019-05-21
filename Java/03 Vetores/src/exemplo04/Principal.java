package exemplo04;

public class Principal {

	public static void main(String[] args) {

		int[] numeros = {1, 2, 3, 4, 5};
		
//		Método de ordenação - Bubble Sort | Método bolha
		int maiorNumero;
		for (int i1 = 0; i1 < (numeros.length-1); i1++) {
			for (int i2 = i1+1; i2 < numeros.length; i2++) {
		
				if (numeros[i2] < numeros[i1]) {
					maiorNumero = numeros[i1];
					numeros[i1] = numeros[i2];
					numeros[i2] = maiorNumero;
				}
			}
		}
		
//		Exibir dados do vetor
		for (int i : numeros) {
			System.out.println(i);
		}

	}

}
