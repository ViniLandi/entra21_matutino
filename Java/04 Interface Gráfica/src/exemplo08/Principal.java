package exemplo08;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JTextArea campo = new JTextArea();
		
		JScrollPane barra = new JScrollPane(campo);
		barra.setBounds(10, 10, 470, 230);

		formulario.add(barra);
		
		formulario.setVisible(true);

	}
	
}
