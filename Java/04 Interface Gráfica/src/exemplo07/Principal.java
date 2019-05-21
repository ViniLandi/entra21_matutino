package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu formulário");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
//		Radio button
		JRadioButton rbt01 = new JRadioButton("Opção 01");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Primeiro botão");
		
		JRadioButton rbt02 = new JRadioButton("Opção 02");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Segundo botão");
		
		JRadioButton rbt03 = new JRadioButton("Opção 03");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("Terceiro botão");
		
		JButton btn = new JButton("Testar");
		btn.setBounds(10, 100, 100, 20);
		

		
//		Agrupar botões de rádio
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

			try {
				//getSelection obtêm o Radio Button selecionado
				//getActionCommand retorna um valor do Radio Button
				JOptionPane.showMessageDialog(null, bg.getSelection().getActionCommand());
			} catch (Exception e2) {
				
			}
				
			}
		});
		
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.add(btn);
		formulario.setVisible(true);

	}

}
