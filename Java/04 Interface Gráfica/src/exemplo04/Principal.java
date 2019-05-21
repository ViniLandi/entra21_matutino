package exemplo04;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {

//		Cria formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
//		Caixa de combinação
		JComboBox<String> combo = new JComboBox<String>();
		combo.setBounds(10, 10, 470, 30);
		combo.addItem("1");
		combo.addItem("2");
		combo.addItem("3");
		combo.addItem("4");
		
		formulario.add(combo);
		formulario.setVisible(true);
		
	}

}
