package exemplo03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Meu formul�rio");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 74, 414, 176);
		formulario.add(scrollPane);
		
		
		
		JTable table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table.getColumnModel().getColumn(0).setResizable(false);
		scrollPane.setViewportView(table);
		
		
//		R�tulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(10, 30, 130, 25);
		
//		Caixa De Texto
		JTextField caixa = new JTextField();
		caixa.setBounds(150, 30, 200, 25);
		
//		Bot�o
		JButton botao = new JButton();
		botao.setText("Enviar");
//		botao.setSize(100, 30);
		botao.setBounds(370, 30, 100, 25);

//		Evento no bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = caixa.getText();
				JOptionPane.showMessageDialog(null, "Ol� "+ nome);
				caixa.setText("");
				caixa.requestFocus();
				
//				DefaultTableModel table = (DefaultTableModel) table.getModel();
//				table.addRow(new Object[]{caixa.getText()});
			}
		});

//		Adicionar o bot�o ao formul�rio
		formulario.add(botao);
		formulario.add(rotulo);
		formulario.add(caixa);
		formulario.setVisible(true);
	}

}
