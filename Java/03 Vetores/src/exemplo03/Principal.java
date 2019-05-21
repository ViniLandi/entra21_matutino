package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Vetores
		String[] nomes = new String[20];
		int[] idades = new int[20];
		
//		Variáveis
		int indice = 0;
		boolean continuar = true;
		
//		Laço
		do {
			
//			Obter dados
			nomes[indice] = JOptionPane.showInputDialog("Informe o "+(indice+1)+"º nome");
			idades[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe a "+(indice+1)+"º idade"));
			
			indice++;
			
			
			
//			Verifica se quer continuar
			int verificarContinuar = JOptionPane.showConfirmDialog(null, "Continuar?");
			if (verificarContinuar != 0) {
				continuar = false;
			}
		} while (continuar == true);

//		Exibir mensagem contendo os nomes e idades
		String mensagem = "DADOS";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i] != null) {
			mensagem += "\nNome: "+nomes[i]+" - Idade: "+idades[i];
			}
		
			JOptionPane.showMessageDialog(null, mensagem);
			
			}
	}

}
