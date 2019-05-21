package exemplo08;

public class Principal {

	public static void main(String[] args) {

//		Condicional Aninhada
		double valor = 100.01;
		String segmento = "limpeza";
//		String forma_pagamento = "a vista";
		
		if(segmento.equals("limpeza")) {
			
			if(valor > 100) {
				System.out.println("Desconto de 10%, R$"+(valor*0.9));
			} else {
				System.out.println("Sem desconto, R$"+valor);
			}
		}else {
			if(valor > 100) {
				System.out.println("Desconto de 5%, R$"+(valor*0.95));
			}else {
				System.out.println("Sem desconto, R$"+valor);
			}
		}
		

	}

}
