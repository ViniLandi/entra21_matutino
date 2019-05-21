package exemplo05;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		} catch (Exception erro) {
			System.out.println("Falha ao obter a idade: "+erro.getMessage());
		}finally {
			JOptionPane.showMessageDialog(null, "");
		}
		

	}

}