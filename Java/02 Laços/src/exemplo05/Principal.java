package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Vari�vel de valida��o
		boolean valida = false;
		
		
		do {
			try {
				int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe uma idade:"));
				valida = true;
			} catch (Exception erro) {
				JOptionPane.showMessageDialog(null, "Informe um n�mero inteiro v�lido!");
			}
		} while (valida == false);
		

	}

}
