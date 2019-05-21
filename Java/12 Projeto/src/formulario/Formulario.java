package formulario;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import modelo.Pessoa;

public class Formulario {
	
//	ArrayList de pessoa
	public static ArrayList<Pessoa> dadosPessoa = new ArrayList<Pessoa>();
	
//	DefaultTableModel
	DefaultTableModel dados = new DefaultTableModel();

//	Construtor
	public Formulario() {
		JFrame f = new JFrame("Sistema simples");
		f.setSize(335, 500);
		f.setLayout(null);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(listarDados());
		f.add(cadastrarDados());
		f.setVisible(true);
	}
	
//	Cadastrar dados
	private JPanel cadastrarDados() {
		JPanel p = new JPanel();
		p.setBounds(10, 10, 300, 200);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 10, 60, 20);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(10, 50, 60, 20);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setBounds(10, 90, 60, 20);
		
		
		
		JTextField txtNome = new JTextField();
		txtNome.setBounds(70, 10, 220, 20);

		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(70, 50, 220, 20);
		
		JTextField txtCidade = new JTextField();
		txtCidade.setBounds(70, 90, 220, 20);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setBounds(70, 130, 150, 20);
		
		btnCadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
//				Obter os dados informados
				String nome = txtNome.getText();
				int idade = Integer.parseInt(txtIdade.getText());
				String cidade = txtCidade.getText();
				
//				Criar um obj da classe Pessoa
				Pessoa p = new Pessoa();
				p.setNome(nome);
				p.setIdade(idade);
				p.setCidade(cidade);
				
//				Adicionar ao ArrayList
				dadosPessoa.add(p);
				
//				Adicionar na tabela
				dados.addRow(new Object[] {nome, idade, cidade});
				
//				Limpar os campos
				txtNome.setText("");
				txtIdade.setText("");
				txtCidade.setText("");
				
//				Cursos no campo nome selecionado
				txtNome.requestFocus();
				

				
				
			}
		});
		
		
		p.add(btnCadastrar);
		
		p.add(lblNome);
		p.add(lblIdade);
		p.add(lblCidade);
		
		p.add(txtNome);
		p.add(txtIdade);
		p.add(txtCidade);
		
		return p;
	}
	
//	Listar dados
	private JPanel listarDados() {
		
		JPanel p = new JPanel();
		p.setBounds(10, 240, 300, 200);
		p.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		p.setLayout(null);
		
		JScrollPane barra = new JScrollPane(tabela());
		barra.setBounds(0, 0 , 300, 200);
		p.add(barra);
		return p;
	}
	
//	Tabela
	private JTable tabela() {
		
		
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addColumn("Cidade");
		dados.addRow(new Object[] {"Carlos", 46, "Pomerode"});
		dados.addRow(new Object[] {"Ester", 17, "Blumenau"});
		dados.addRow(new Object[] {"Ana", 30, "Indaial"});
		
//		Tabela
		JTable tabela = new JTable(dados);
		
//		Retorno
		return tabela;
		
	}
	
}
