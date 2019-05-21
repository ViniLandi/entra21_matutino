package exemplo07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		/*
		 * 1º Dividir
		 * 2º Multiplicar
		 * 3º Subtrair
		 * 4º Somar
		 */
		
//		Condicional composta
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));

		double media = (nota1+nota2)/2;
		if (media == 10) {
			JOptionPane.showMessageDialog(null, "Parabéns! Você obteve média 10!");
		}else if(media >=9) {
			JOptionPane.showMessageDialog(null, "Ótimo com média "+media);
		}else if(media >=8) {
			JOptionPane.showMessageDialog(null, "Bom com média "+media);
		}else if(media >=7) {
			JOptionPane.showMessageDialog(null, "Na média com "+media);
		}else if(media >=5) {
			JOptionPane.showMessageDialog(null, "Em exame com média "+media);
		}else{
			JOptionPane.showMessageDialog(null, "Reprovado!");
		}
	}

}
