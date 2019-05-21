package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Variável de validação
		boolean valida = false;
		
		
		do {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade:"));
				valida = true;
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Informe um número inteiro válido!");
			}
		} while (valida == false);
		

	}

}
