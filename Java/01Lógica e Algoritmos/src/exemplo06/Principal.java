package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Condicional simples
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		if(idade >= 18) {
			JOptionPane.showMessageDialog(null, "Maior de idade");
		} else {
			JOptionPane.showMessageDialog(null, "Menor de idade");
		}

	}

}
