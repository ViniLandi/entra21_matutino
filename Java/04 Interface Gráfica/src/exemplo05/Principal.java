package exemplo05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JButton botao1 = new JButton("Botao 1");
		botao1.setBounds(10, 10, 150, 30);

		JButton botao2 = new JButton("Botão 2");
		botao2.setBounds(190, 10, 150, 30);
		
//		Painel
		JPanel painel1 = new JPanel();
		painel1.setBounds(10, 50, 330, 150);
		painel1.setBackground(Color.YELLOW);
		painel1.setVisible(true);
		
		JPanel painel2 = new JPanel();
		painel2.setBounds(10, 50, 330, 150);
		painel2.setBackground(Color.BLUE);
		painel2.setVisible(false);
		
		JButton botao = new JButton("Botao 1");
		botao.setSize(150, 30);
		painel2.add(botao);
		
//		Botões

		botao1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if (painel1.isVisible() == true) {
					painel1.setVisible(false);
				}else {
					painel1.setVisible(true);
				}
				
//				------------
				
				if (painel2.isVisible() == false) {
					painel2.setVisible(true);
				}else {
					painel2.setVisible(false);
				}				
				
			}
		});
		
		botao2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {


				
				
			}
		});
		
		formulario.add(botao1);
		formulario.add(botao2);
		formulario.add(painel1);
		formulario.add(painel2);
		
		
		formulario.setVisible(true);

	}

}
