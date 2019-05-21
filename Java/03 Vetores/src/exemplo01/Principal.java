package exemplo01;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Vetor é um tipo de variável que armazena vários dados
		String[] nomes = new String[3];
		
//		Pedir os três nomes
		for (int i = 0; i < 3; i++) { nomes[i] = JOptionPane.showInputDialog((i+1)+"º nome:"); }
		
//		Concatena os nomes
		String exibirNomes = "";
		for (int i = 0; i < 3; i++) { exibirNomes += nomes[i]+"\n"; }
		
//		Exibe os nomes
		JOptionPane.showMessageDialog(null, exibirNomes);
		
//		Com laço while
		int indice = 0;
		while (indice < 3) {
			nomes[indice] = JOptionPane.showInputDialog((indice+1)+"º nome");
			indice++;
		}
		
//		Laço while pra exibir os nomes
		indice = 0;
		while (indice < 3) {
			System.out.println((indice+1)+"º nome é: "+nomes[indice]);
			indice++;
		}

	}

}
