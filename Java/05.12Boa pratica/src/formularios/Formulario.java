package formularios;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.Font;
import acao.Acao;
import beans.Curso;

@SuppressWarnings("serial")
public class Formulario extends JFrame {

	//Declaracao das variaveis
	private Acao a = new Acao();
	private JLabel lblNome = new JLabel("Nome");
	private JLabel lblArea = new JLabel("\u00C1rea");
	private JButton btnCadastrar = new JButton("Cadastrar");
	private JButton btnAlterar = new JButton("Alterar");
	private JButton btnCancelar = new JButton("Cancelar");		
	private JButton btnExcluir = new JButton("Excluir");
	private JScrollPane scrollPane = new JScrollPane();
	private JPanel contentPane = new JPanel();
	private JTextField txtNome = new JTextField();
	private JTextField txtArea = new JTextField();
	private JTable table = new JTable();
	private static int codigoCurso;

	private void LimparCampos() {
		txtNome.setText("");
		txtArea.setText("");
		txtNome.requestFocus();
	}
	
	private Curso Dados() {
		Curso c = new Curso();
		c.setNomeCurso(txtNome.getText());
		c.setAreaCurso(txtArea.getText());
		return c;
	}
	
	private void Configurar(JButton b, int x) {
		b.setEnabled(false);
		b.setFont(new Font("Tahoma", Font.BOLD, 11));
		b.setBounds(x, 93, 90, 30);	
	}

	private void Configurar(JLabel l, int x, int y, int w, int h) {
		l.setFont(new Font("Tahoma", Font.BOLD, 11));
		l.setBounds(x, y, w, h);	
	}
	
	private void Configurar(JTextField t, int x, int y, int w, int h) {
		t.setBounds(x, y, w, h);
		t.setColumns(10);
	}
	
	private void Botao(boolean c) {
		btnCadastrar.setEnabled(c);
		btnAlterar.setEnabled(!c);
		btnExcluir.setEnabled(!c);
		btnCancelar.setEnabled(!c);		
	}
	
	public Formulario() {
				
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 366);
		setContentPane(contentPane);
		
		Configurar(lblNome, 10, 11, 41, 30);
		Configurar(lblArea, 10, 52, 41, 30);
		Configurar(txtNome, 51, 11, 348, 30);
		Configurar(txtArea, 51, 52, 348, 30);
		Configurar(btnCadastrar, 10);
		btnCadastrar.setEnabled(true);
		Configurar(btnAlterar, 109);
		Configurar(btnExcluir, 209);
		Configurar(btnCancelar, 309);

		table.setModel(a.selecao());

		scrollPane.setBounds(10, 134, 389, 182);
		scrollPane.setViewportView(table);
		
		contentPane.add(lblNome);
		contentPane.add(lblArea);
		contentPane.add(txtNome);
		contentPane.add(txtArea);
		contentPane.add(btnCadastrar);
		contentPane.add(btnAlterar);
		contentPane.add(btnExcluir);
		contentPane.add(btnCancelar);
		contentPane.add(scrollPane);

		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.cadastrar(Dados());
				table.setModel(a.selecao());
				LimparCampos();
			}
		});

		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.alteracao(codigoCurso,Dados());
				table.setModel(a.selecao());
				LimparCampos();
				Botao(true);
			}
		});

		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.exclusao(codigoCurso);
				table.setModel(a.selecao());
				LimparCampos();
				Botao(true);
			}
		});

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LimparCampos();
				Botao(true);
			}
		});

		table.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e) {
				codigoCurso = table.getSelectedRow(); 
				txtNome.setText(table.getValueAt(codigoCurso, 0).toString());
				txtArea.setText(table.getValueAt(codigoCurso, 1).toString());
				Botao(false);	
			}
		});
	}
}

