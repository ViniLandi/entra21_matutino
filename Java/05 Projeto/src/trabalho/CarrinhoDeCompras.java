package trabalho;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

import javax.swing.JPasswordField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.JTabbedPane;

public class CarrinhoDeCompras extends JFrame {

	private JPanel contentPane;
	private JTable tabela_produtos;
	private JTable tabela_carrinho;
	private JPasswordField passwordField;
	String formatoData = "dd/MM/yyyy";
	String formatoMinSeg = "mm:s";
	String data, hora, minSeg;
	java.util.Date agora;
	SimpleDateFormat formata;
	private JTable tabela_clientes;
	private JTable tabela_historico;
	double total = 0;
	
	/**
	 * Inicia a aplicação.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarrinhoDeCompras frame = new CarrinhoDeCompras();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 * @return 
	 */
	
	public CarrinhoDeCompras() {
		
//		Vetor para armazenar dados de clientes cadastrados
		String cliente[][] = new String[10000][3];
		
//		Definindo os parametros sobre a minha tela principal
		setIconImage(Toolkit.getDefaultToolkit().getImage(CarrinhoDeCompras.class.getResource("/trabalho/iconeCarrinho.jpg")));
		setResizable(false);
		setTitle("Carrinho de Compras");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 562); //1100 para o cupom fiscal | 675 tela normal
		setLocationRelativeTo(null);
		
//		Cria jmenubar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
	
		JMenuItem mntmNovo = new JMenuItem("Novo");
		mntmNovo.setEnabled(false);
		menuArquivo.add(mntmNovo);
		
		JMenu menuDepartamentos = new JMenu("Departamentos");
		menuArquivo.add(menuDepartamentos);
		
		JMenuItem mntmRoupas = new JMenuItem("Roupas");
		menuDepartamentos.add(mntmRoupas);
		
//		Muda para o departamento de roupas quando clicado na opção
		mntmRoupas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] sim_nao = {"SIM","NÃO"};
				DefaultTableModel tabelaProdutos = (DefaultTableModel) tabela_produtos.getModel();
				
//				Verifica se existe dados na tabela produto, se não tiver então simplesmente adiciona os itens, se tiver ja linhas entao pergunta pra sobrescrever
				if (tabela_produtos.getRowCount() == 0) {
//					Cria linhas para produtos pré-definidos
					tabelaProdutos.addRow(new Object[]{"Camisa Preta - PoloWear", "R$ 60.0"});
					tabelaProdutos.addRow(new Object[]{"Camisa Preta/Branca - Adidas", "R$ 100.0"});
					tabelaProdutos.addRow(new Object[]{"Camisa Azul Escura - Nike", "R$ 100.0"});
					
					tabelaProdutos.addRow(new Object[]{"Bermuda Tactel Preta - Nike", "R$ 80.0"});
					tabelaProdutos.addRow(new Object[]{"Bermuda Jeans Básica Azul", "R$ 60.0"});
					tabelaProdutos.addRow(new Object[]{"Calça Jeans Básica Azul", "R$ 100.0"});
				}else {
					int override = JOptionPane.showOptionDialog(null, "Deseja abrir o estoque de outro departamento?"
							+ "\nIsso irá apagar os produtos atuais na tabela de produtos!", "Deseja abrir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null);
					if (override == 0) {
						
//						Limpa os dados na tabela produtos
						while (tabela_produtos.getRowCount() != 0) {
							tabelaProdutos.removeRow(0);
						}
						
//						Cria linhas para produtos pré-definidos
						tabelaProdutos.addRow(new Object[]{"Camisa Preta - PoloWear", "R$ 60.0"});
						tabelaProdutos.addRow(new Object[]{"Camisa Preta/Branca - Adidas", "R$ 100.0"});
						tabelaProdutos.addRow(new Object[]{"Camisa Azul Escura - Nike", "R$ 100.0"});
						
						tabelaProdutos.addRow(new Object[]{"Bermuda Tactel Preta - Nike", "R$ 80.0"});
						tabelaProdutos.addRow(new Object[]{"Bermuda Jeans Básica Azul", "R$ 60.0"});
						tabelaProdutos.addRow(new Object[]{"Calça Jeans Básica Azul", "R$ 100.0"});
					}
				}
			}
		});
		
		JMenuItem mntmTecnologia = new JMenuItem("Tecnologia");
		menuDepartamentos.add(mntmTecnologia);
		
		JMenuItem mntmCadastrarCliente = new JMenuItem("Cadastrar cliente");
		menuArquivo.add(mntmCadastrarCliente);
		
//		Muda para o departamento de tecnologia quando clicado na opção
		mntmTecnologia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Object[] sim_nao = {"SIM","NÃO"};
				DefaultTableModel tabelaProdutos = (DefaultTableModel) tabela_produtos.getModel();
				
				if (tabela_produtos.getRowCount() == 0) {
//					Cria linhas para produtos pré-definidos
					tabelaProdutos.addRow(new Object[]{"Celular Samsung S10", "R$ 4500.0"});
					tabelaProdutos.addRow(new Object[]{"Celular Samsung S9", "R$ 2500.0"});
					tabelaProdutos.addRow(new Object[]{"Celular Xiaomi Mi 9", "R$ 3000.0"});
					tabelaProdutos.addRow(new Object[]{"Celular Xiaomi Mi 8", "R$ 2000.0"});
					
					tabelaProdutos.addRow(new Object[]{"Notebook Gamer Acer Aspire Nitro 5 Intel Core i5", "R$ 4000.0"});
					tabelaProdutos.addRow(new Object[]{"Notebook Dell Inspiron 15 i15-3576-A70", "R$ 3100.0"});
					tabelaProdutos.addRow(new Object[]{"Notebook Luvaglio", "R$ 3990000.00"});
				}else {
					int override = JOptionPane.showOptionDialog(null, "Deseja abrir o estoque de outro departamento?"
							+ "\nIsso irá apagar os produtos atuais na tabela de produtos!", "Deseja abrir?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null);
					if (override == 0) {
						
//						Limpa os dados na tabela produtos
						while (tabela_produtos.getRowCount() != 0) {
							tabelaProdutos.removeRow(0);
						}
						
//						Cria linhas para produtos pré-definidos
						tabelaProdutos.addRow(new Object[]{"Celular Samsung S10", "R$ 4500.0"});
						tabelaProdutos.addRow(new Object[]{"Celular Samsung S9", "R$ 2500.0"});
						tabelaProdutos.addRow(new Object[]{"Celular Xiaomi Mi 9", "R$ 3000.0"});
						tabelaProdutos.addRow(new Object[]{"Celular Xiaomi Mi 8", "R$ 2000.0"});
						
						tabelaProdutos.addRow(new Object[]{"Notebook Gamer Acer Aspire Nitro 5 Intel Core i5", "R$ 4000.0"});
						tabelaProdutos.addRow(new Object[]{"Notebook Dell Inspiron 15 i15-3576-A70", "R$ 3100.0"});
						tabelaProdutos.addRow(new Object[]{"Notebook Luvaglio", "R$ 3990000.00"});
					}
				}
			}
		});

		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//		Componentes para o cupom fiscal
		JPanel panel = new JPanel();
		panel.setBounds(674, 11, 389, 130);
		panel.setBorder(new LineBorder(new Color(230, 230, 0),1));
		panel.setBackground(new Color(255, 255, 200));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblData1 = new JLabel("__/__/____");
		lblData1.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblData1.setBounds(10, 11, 60, 14);
		panel.add(lblData1);
		
		JLabel lblHora1 = new JLabel("__:__:__");
		lblHora1.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblHora1.setBounds(80, 11, 48, 14);
		panel.add(lblHora1);
		
		JLabel lblCcfXxxx = new JLabel("CCF: XXXXXX");
		lblCcfXxxx.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblCcfXxxx.setBounds(243, 11, 66, 14);
		panel.add(lblCcfXxxx);
		
		JLabel lblCXxxxxx = new JLabel("C00: XXXXX");
		lblCXxxxxx.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblCXxxxxx.setBounds(319, 11, 60, 14);
		panel.add(lblCXxxxxx);
		
		JLabel lblCpf = new JLabel("CPF consumidor:");
		lblCpf.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblCpf.setBounds(0, 36, 389, 14);
		panel.add(lblCpf);
		
		JLabel lblNome = new JLabel("NOME:");
		lblNome.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblNome.setBounds(0, 50, 389, 14);
		panel.add(lblNome);
		
		JLabel label_4 = new JLabel("----------------------------------------------------------------");
		label_4.setFont(new Font("Courier New", Font.PLAIN, 10));
		label_4.setBounds(0, 60, 389, 14);
		panel.add(label_4);
		
		JLabel lblCupomFiscal = new JLabel("CUPOM FISCAL");
		lblCupomFiscal.setHorizontalAlignment(SwingConstants.CENTER);
		lblCupomFiscal.setFont(new Font("Courier New", Font.BOLD, 20));
		lblCupomFiscal.setBounds(0, 75, 389, 22);
		panel.add(lblCupomFiscal);
		
		JLabel lblItem = new JLabel("ITEM     DESCRI\u00C7\u00C3O     QTD.UN.VL_UNIT(R$)    ST     VL_ITEM(R$)");
		lblItem.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblItem.setBounds(0, 98, 389, 14);
		panel.add(lblItem);
		
		JLabel label = new JLabel("----------------------------------------------------------------");
		label.setFont(new Font("Courier New", Font.PLAIN, 10));
		label.setBounds(0, 25, 389, 14);
		panel.add(label);
		
		JLabel label_3 = new JLabel("----------------------------------------------------------------");
		label_3.setFont(new Font("Courier New", Font.PLAIN, 10));
		label_3.setBounds(0, 0, 389, 14);
		panel.add(label_3);
		
		JLabel label_5 = new JLabel("----------------------------------------------------------------");
		label_5.setFont(new Font("Courier New", Font.PLAIN, 10));
		label_5.setBounds(0, 116, 389, 14);
		panel.add(label_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(674, 140, 389, 223);
		scrollPane_2.setBorder(null);
		scrollPane_2.setBackground(new Color(255, 255, 200));
		contentPane.add(scrollPane_2);
		
		JTextPane txtCupomFiscal = new JTextPane();
		txtCupomFiscal.setEditable(false);
		txtCupomFiscal.setFont(new Font("Courier New", Font.PLAIN, 11));
		txtCupomFiscal.setBorder(new LineBorder(new Color(230, 230, 0),1));
		txtCupomFiscal.setBackground(new Color(255, 255, 200));
		scrollPane_2.setViewportView(txtCupomFiscal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(674, 362, 389, 73);
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(230, 230, 0),1));
		panel_1.setBackground(new Color(255, 255, 200));
		contentPane.add(panel_1);
		
		JLabel lblBematech = new JLabel("BEMATECH                 MP-2100 TH FI                   ECF-IF");
		lblBematech.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblBematech.setBounds(0, 11, 389, 14);
		panel_1.add(lblBematech);
		
		JLabel lblVersoEcfLj = new JLabel("VERS\u00C3O:01.01.01                                  ECF:XXX LJ:XXXX");
		lblVersoEcfLj.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblVersoEcfLj.setBounds(0, 25, 389, 14);
		panel_1.add(lblVersoEcfLj);
		
		JLabel label_12 = new JLabel("----------------------------------------------------------------");
		label_12.setFont(new Font("Courier New", Font.PLAIN, 10));
		label_12.setBounds(0, 62, 389, 14);
		panel_1.add(label_12);
		
		JLabel label_16 = new JLabel("----------------------------------------------------------------");
		label_16.setFont(new Font("Courier New", Font.PLAIN, 10));
		label_16.setBounds(0, 0, 389, 14);
		panel_1.add(label_16);
		
		JLabel lblQqqqqqqqertyyeiryy = new JLabel("QQQQQQQQERTYYEIRYY");
		lblQqqqqqqqertyyeiryy.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblQqqqqqqqertyyeiryy.setBounds(0, 39, 108, 14);
		panel_1.add(lblQqqqqqqqertyyeiryy);
		
		JLabel lblData2 = new JLabel("__/__/____");
		lblData2.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblData2.setBounds(261, 39, 60, 14);
		panel_1.add(lblData2);
		
		JLabel lblHora2 = new JLabel("__:__:__");
		lblHora2.setFont(new Font("Courier New", Font.PLAIN, 10));
		lblHora2.setBounds(331, 39, 48, 14);
		panel_1.add(lblHora2);
		
		JLabel lblFabEmulador = new JLabel("FAB: EMULADOR                                       BR");
		lblFabEmulador.setFont(new Font("Courier New", Font.BOLD, 11));
		lblFabEmulador.setBounds(0, 53, 389, 14);
		panel_1.add(lblFabEmulador);
		
//		Fim dos componentes do cupom fiscal ---------------------
		
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Arial Black", Font.BOLD, 11));
		tabbedPane.setBounds(10, 11, 638, 164);
		contentPane.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("CARRINHO", null, panel_2, null);
		panel_2.setLayout(null);


		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 633, 136);
		panel_2.add(scrollPane_1);
		
//		Cria uma tabela para o carrinho e define os parametros para as caracteristicas da mesma
		tabela_carrinho = new JTable();
		tabela_carrinho.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabela_carrinho.setShowVerticalLines(false);
		tabela_carrinho.setShowHorizontalLines(false);
		tabela_carrinho.setForeground(Color.BLACK);
		tabela_carrinho.setBackground(UIManager.getColor("Button.background"));
		scrollPane_1.setViewportView(tabela_carrinho);
		tabela_carrinho.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produtos", "Pre\u00E7o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
//		bloqueia o usuario de redimensionar colunas
		tabela_carrinho.getColumnModel().getColumn(0).setResizable(false);
//		Seta um tamanho pré definido para o widht da coluna
		tabela_carrinho.getColumnModel().getColumn(0).setPreferredWidth(400);
		tabela_carrinho.getColumnModel().getColumn(1).setResizable(false);
		
//		Bloqueia o usuário de mover as colunas
		tabela_carrinho.getTableHeader().setReorderingAllowed(false);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("CLIENTES CADASTRADOS", null, panel_3, null);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 633, 136);
		panel_3.add(scrollPane_3);
		
//		Cria tabela para armazenar dados dos clientes cadastrados
		tabela_clientes = new JTable();
		tabela_clientes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_3.setViewportView(tabela_clientes);
		tabela_clientes.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CPF", "NOME"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
//		bloqueia o usuario de redimensionar colunas
		tabela_clientes.getColumnModel().getColumn(0).setResizable(false);
		tabela_clientes.getColumnModel().getColumn(1).setResizable(false);
//		Seta um tamanho pré definido para o widht da coluna
		tabela_clientes.getColumnModel().getColumn(1).setPreferredWidth(300);
		
//		Bloqueia o usuário de mover as colunas
		tabela_clientes.getTableHeader().setReorderingAllowed(false);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("HISTÓRICO DE COMPRAS", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 0, 633, 136);
		panel_4.add(scrollPane_4);
		
//		Cria uma tabela para armazenar dados em um historico de compras efetuadas
		tabela_historico = new JTable();
		tabela_historico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane_4.setViewportView(tabela_historico);
		tabela_historico.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"CPF", "TOTAL"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
//		bloqueia o usuario de redimensionar colunas
		tabela_historico.getColumnModel().getColumn(0).setResizable(false);
		tabela_historico.getColumnModel().getColumn(1).setResizable(false);
		
//		Bloqueia o usuário de mover as colunas
		tabela_historico.getTableHeader().setReorderingAllowed(false);


		JLabel lblProdutos = new JLabel("Produtos:");
		lblProdutos.setBounds(10, 271, 134, 23);
		lblProdutos.setForeground(Color.BLACK);
		lblProdutos.setFont(new Font("Tahoma", Font.BOLD, 20));
		contentPane.add(lblProdutos);


		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 305, 638, 130);
		contentPane.add(scrollPane);
		
//		Cria uma tabela para os produtos e define os parametros para as caracteristicas da mesma
		tabela_produtos = new JTable();
		tabela_produtos.setForeground(Color.BLACK);
		tabela_produtos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabela_produtos.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Produtos", "Pre\u00E7o"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		
//		bloqueia o usuario de redimensionar colunas
		tabela_produtos.getColumnModel().getColumn(0).setResizable(false);
//		Seta um tamanho pré definido para o widht da coluna
		tabela_produtos.getColumnModel().getColumn(0).setPreferredWidth(400);
		tabela_produtos.getColumnModel().getColumn(1).setResizable(false);
		
//		Bloqueia o usuário de mover as colunas
		tabela_produtos.getTableHeader().setReorderingAllowed(false);
		scrollPane.setViewportView(tabela_produtos);
		
		


		JLabel lblMostrarTotal = new JLabel("TOTAL: R$");
		lblMostrarTotal.setBounds(489, 186, 74, 20);
		lblMostrarTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMostrarTotal.setForeground(Color.BLACK);
		contentPane.add(lblMostrarTotal);
		
//		Label para expor o total da compra ao usuário
		JLabel lblTotal = new JLabel("0.0");
		lblTotal.setBounds(562, 186, 86, 20);
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setForeground(Color.BLACK);
		contentPane.add(lblTotal);
	
//		Botão para alterar a habilitação de manipulação dos produtos.. cadastrar produtos, editar, excluir
		JButton btnHabilitarManipulaoDeProdutos = new JButton("Habilitar manipula\u00E7\u00E3o de produtos");
		btnHabilitarManipulaoDeProdutos.setBounds(416, 457, 232, 30);
		btnHabilitarManipulaoDeProdutos.setForeground(Color.BLACK);
		btnHabilitarManipulaoDeProdutos.setBackground(Color.YELLOW);
		btnHabilitarManipulaoDeProdutos.setFont(new Font("Arial", Font.BOLD, 11));
		contentPane.add(btnHabilitarManipulaoDeProdutos);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(416, 467, 150, 20);
		passwordField.setFont(new Font("Arial", Font.BOLD, 13));
		passwordField.setVisible(false);
		contentPane.add(passwordField);
		
		JLabel lblSenha = new JLabel("Insira a senha de administrador:");
		lblSenha.setBounds(416, 454, 190, 14);
		lblSenha.setVisible(false);
		lblSenha.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(lblSenha);
		
		JButton btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(567, 467, 81, 20);
		btnEnviar.setBackground(Color.WHITE);
		btnEnviar.setVisible(false);
		btnEnviar.setFont(new Font("Arial", Font.PLAIN, 11));
		contentPane.add(btnEnviar);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(808, 457, 128, 30);
		btnOk.setFont(new Font("Arial Black", Font.BOLD, 13));
		contentPane.add(btnOk);


		JButton btnCadastrarProduto = new JButton("Cadastrar Produto");
		btnCadastrarProduto.setBounds(10, 457, 134, 30);
		btnCadastrarProduto.setEnabled(false);
		btnCadastrarProduto.setForeground(Color.BLACK);
		btnCadastrarProduto.setBackground(Color.WHITE);
		btnCadastrarProduto.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnCadastrarProduto);
		
//		Ação a executar pelo botão cadastrar produto na tabelas de produtos
		btnCadastrarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Declaração de variaveis para usar e verificar o cadastramento de algum produto
				boolean verifica_nome = false, verifica_preco = false, verifica_null = false;
				String nome_produto = "";
				double preco = 0;
				
//				Reseta variaveis para esta funcionabilidade ser usada novamente
				verifica_nome = false;
				verifica_preco = false;
				
//				Loop para verificar e validar o nome do produto, enquanto não for digitado um nome válido, não sai do loop
				while (verifica_nome == false) {
					
					try {
//						entrada do nome do produto
						nome_produto = JOptionPane.showInputDialog("Informe o nome do produto:");
						if (nome_produto.equals("") || nome_produto.equals(" ")) {
							JOptionPane.showMessageDialog(null, "O nome do produto deve ser preenchido");
						} else {
//							Se digitou algum nome válido, entao a variavel boolean responsavel pelo loop recebe true e entao.. sai do loop
							verifica_nome = true;
						} 
					} catch (Exception e2) {
//						catch caso o usuário clique no botão cancelar
						verifica_nome = true;
						verifica_preco = true;
					}
				}
				
//				Loop para verificar e validar o preço do produto, enquanto não for digitado um preço válido, não sai do loop
				while (verifica_preco == false) {
					
//					reseta a variavel que verifica se o usuario não digitou nada, para entao poder usar novamente
					verifica_null = false;
					
//					Tratamento de erro caso o que for digitado foi nulo ou utilizou de outros caracateres a não ser números ou virgula
						try {
							
							preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:\n*Utilize apenas números e vírgulas para os centavos!", 0).replace(",", "."));
							
						} catch (Exception e2) {
							
//							Catch caso o usuario nao digite nada
							JOptionPane.showMessageDialog(null, "O preço não pode estar vazio e é somente permitido o uso de números e vírgula!");
							
//							variavel do tipo boolean usada futuramente para identificar caso o usuario digitou nada
							verifica_null = true;
						}
						
//						Se o preço que o usuario digitou foi diferente de 0 e se ele digitou alguma coisa (!= null) então pode sair do loop de validação de preço e continuar o cadastro do produto
							if (preco != 0 && verifica_null != true) {
								verifica_preco = true;
//								Se o usuario digitou 0, então acusa que o preço não pode ser 0
							}else if (preco == 0 && verifica_null != true){
								JOptionPane.showMessageDialog(null, "O preço não pode ser 0 (zero)!"); 							
							}
				}
				
//				Se o usuário não cancelou ao digitar o nome do produto então cadastra
				if (nome_produto != null) {
					
//					Faz uma instancia da tabela_produtos
					DefaultTableModel tabela = (DefaultTableModel) tabela_produtos.getModel();
					
//					Adiciona na tabela o produto cadastrado
					tabela.addRow(new Object[]{nome_produto, "R$ "+preco});
				}
				
			}
		});

		



		JButton btnEditarProduto = new JButton("Editar Produto");
		btnEditarProduto.setBounds(154, 457, 121, 30);
		btnEditarProduto.setEnabled(false);
		btnEditarProduto.setForeground(Color.BLACK);
		btnEditarProduto.setBackground(Color.WHITE);
		btnEditarProduto.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnEditarProduto);
		
//		Ação a executar pelo botão editar produto da tabelas de produtos
		btnEditarProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Declaração de variaveis para usar no cadastramento de algum produto
				String nome_produto = "", nome_produto_selecionado = "", preco_selecionado = "";
				double preco = 0;
				boolean verifica_preco = false, verifica_null = false;
				
//				Reseta variaveis para esta funcionabilidade ser usada novamente
				verifica_preco = false;
				
//				Verifica se há alguma linha da tabela selecionada, se houver.. pode seguir com a funcionabilidade
					if (tabela_produtos.getSelectedRow() != -1) {
						
//						Captura o nome e o preço do produto selecionado na tabela para as variaveis
						nome_produto_selecionado = (String) tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0);
						preco_selecionado = (String) tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1);
						
//						Pede pra digitar o nome de alteração do produto
						nome_produto = JOptionPane.showInputDialog(
								"Produto: "+nome_produto_selecionado+"\nPreço : "+preco_selecionado
								+ "\n\nInforme o nome do produto"
								+ "\nOu"
								+ "\nDeixe o campo vazio para manter o antigo nome!");
						
//						Se não for informado nenhum novo nome, permanece o antigo nome para o produto
						if (nome_produto.equals("") || nome_produto.equals(" ")) {
							nome_produto = nome_produto_selecionado;
						}
						
						
//				Loop para verificar e validar o preço de alteração do produto, enquanto não for digitado um preço válido, não sai do loop
				while (verifica_preco == false) {
					
//				reseta a variavel que verifica se o usuario não digitou nada, para entao poder usar novamente
				verifica_null = false;
				
//				Tratamento de erro caso o que for digitado foi nulo ou utilizou de outros caracateres a não ser números ou virgula
						try {
//						Pede pra digitar o preço do produto
						preco = Double.parseDouble(JOptionPane.showInputDialog(
								"Produto: "+nome_produto+"\nPreço : "+preco_selecionado
								+ "\n\nInforme o preço do produto"
								+ "\nOu"
								+ "\nDeixe o campo com valor em 0 para manter o antigo preço!", 0).replace(",", "."));
						} catch (Exception e2) {
							
//							Verifica se o que foi digitado foi nulo ou utilizou de outros caracateres a não ser números e virgula
							JOptionPane.showMessageDialog(null, "O preço não pode estar vazio e é somente permitido o uso de números e vírgula!");
							
//							variavel do tipo boolean usada futuramente para identificar caso o usuario digitou nada
							verifica_null = true;
						}

//						Se no campo digitado não foi nulo então prossegue
						if (verifica_null == false) {
							
//							Se no campo de alteração de preço for digitado 0, permanece o antigo preço
							if (preco == 0) {
								preco = Double.parseDouble(preco_selecionado.substring(3));
							}
							
//							Se foi tudo filtrado e digitado corretamente, poderá sair do loop de verificação e a edição do produto foi efetuada com sucesso
							verifica_preco = true;
						}
				}

//				Define na tabela os novos valores da alteração do produto
				tabela_produtos.setValueAt(nome_produto, tabela_produtos.getSelectedRow(), 0);
				tabela_produtos.setValueAt("R$ "+preco, tabela_produtos.getSelectedRow(), 1);
				
//				Se não houver linhas selecionadas então não será possível efetuar alguma alteração
					}else {
						JOptionPane.showMessageDialog(null, "Selecione a linha de algum produto para editar!");
					}
			}
		});

		
		JButton btnExcluirProduto = new JButton("Excluir Produto");
		btnExcluirProduto.setBounds(285, 457, 121, 30);
		btnExcluirProduto.setEnabled(false);
		btnExcluirProduto.setForeground(Color.BLACK);
		btnExcluirProduto.setBackground(Color.WHITE);
		btnExcluirProduto.setFont(new Font("Arial", Font.PLAIN, 12));
		contentPane.add(btnExcluirProduto);
		
//		Ação a executar pelo botão excluir produto da tabelas de produtos
		btnExcluirProduto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Verifica se há alguma linha da tabela selecionada
					if (tabela_produtos.getSelectedRow() != -1) {
						Object[] sim_nao = {"SIM","NÃO"};
						int excluir = JOptionPane.showOptionDialog(null, "Deseja realmente exlcuir?", "Excluir?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null);
					if (excluir == 0) {
						DefaultTableModel tabela = (DefaultTableModel) tabela_produtos.getModel();
						tabela.removeRow(tabela_produtos.getSelectedRow());
					}
					}else {
						JOptionPane.showMessageDialog(null, "Selecione a linha de algum produto para excluir!");
					}
			}
		});

		
		
		JButton btnAdicionarAoCarrinho = new JButton("Adicionar ao carrinho");
		btnAdicionarAoCarrinho.setBounds(10, 220, 190, 40);
		btnAdicionarAoCarrinho.setFont(new Font("Arial", Font.PLAIN, 12));
		btnAdicionarAoCarrinho.setForeground(Color.BLACK);
		btnAdicionarAoCarrinho.setBackground(Color.WHITE);
		contentPane.add(btnAdicionarAoCarrinho);
		
//		Inserindo e redimensionando uma imagem para o botao de adicionar algum produto ao carrinho
		ImageIcon carrinhoAdd = new ImageIcon(CarrinhoDeCompras.class.getResource("/trabalho/carrinhoAdd.png"));
		Image carrinho_add = carrinhoAdd.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnAdicionarAoCarrinho.setIcon(new ImageIcon(carrinho_add));
		
//		Ação a executar quando clicado no botão para adicionar produto ao carrinho
		btnAdicionarAoCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Verifica se há alguma linha selecionada, se não houver, então o sistema vai pedir para selecionar
				if (tabela_produtos.getSelectedRow() != -1) {			
					DefaultTableModel tabela = (DefaultTableModel) tabela_carrinho.getModel();
					
//					Adiciona na tabela carrinho o produto desejado
					tabela.addRow(new Object[]{tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0), tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1)});
					
//					Incrementa a variavel e a label total o valor dos produtos
					total += Double.parseDouble(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1).toString().substring(3));
					lblTotal.setText(String.valueOf(total));
					
				}else {
					JOptionPane.showMessageDialog(null, "Selecione algum produto para poder adicionar!", "Nada adicionado!", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
//		Implementação para inserir produto na tabela carrinho com a tecla ENTER
		tabela_produtos.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
					
//					Verifica se há alguma linha selecionada
					if (tabela_produtos.getSelectedRow() != -1) {			
						DefaultTableModel tabela = (DefaultTableModel) tabela_carrinho.getModel();
						
//						Adiciona na tabela o produto cadastrado
						tabela.addRow(new Object[]{tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 0), tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1)});
						
//						Incrementa a variavel e a label total o valor dos produtos
						total += Double.parseDouble(tabela_produtos.getValueAt(tabela_produtos.getSelectedRow(), 1).toString().substring(3));
						lblTotal.setText(String.valueOf(total));
					}
				}
			}
		});
		
		
		
		JButton btnRemoverDoCarrinho = new JButton("Remover do carrinho");
		btnRemoverDoCarrinho.setBounds(210, 220, 190, 40);
		btnRemoverDoCarrinho.setFont(new Font("Arial", Font.PLAIN, 12));
		btnRemoverDoCarrinho.setForeground(Color.BLACK);
		btnRemoverDoCarrinho.setBackground(Color.WHITE);
		contentPane.add(btnRemoverDoCarrinho);
		
//		Inserindo e redimensionando uma imagem para o botao de excluir algum produto ao carrinho
		ImageIcon carrinhoDel = new ImageIcon(CarrinhoDeCompras.class.getResource("/trabalho/carrinhoDel.png"));
		Image carrinho_del = carrinhoDel.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
		btnRemoverDoCarrinho.setIcon(new ImageIcon(carrinho_del));
		
//		Ação a executar quando clica no botão de remover algum item da tabela carrinho
		btnRemoverDoCarrinho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
//				Verifica se há produtos na tabela carrinho
				if (tabela_carrinho.getRowCount() != 0) {
//					Verifica se alguma linha de um produto foi selecionado
					if (tabela_carrinho.getSelectedRow() != -1) {

					DefaultTableModel tabela = (DefaultTableModel) tabela_carrinho.getModel();
					
//					Decrementa a variavel e a label total o valor dos produtos
					total -= Double.parseDouble(tabela_carrinho.getValueAt(tabela_carrinho.getSelectedRow(), 1).toString().substring(3));
					lblTotal.setText(String.valueOf(total));
					
//					Remove da tabela o item escolhido
					tabela.removeRow(tabela_carrinho.getSelectedRow());
		
					
					}else {
						JOptionPane.showMessageDialog(null, "Selecione algum produto para remover!", "Nada removido!", JOptionPane.INFORMATION_MESSAGE);
					}
				}else {
					JOptionPane.showMessageDialog(null, "Não há produtos no carrinho para serem removidos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
//		Ação a executar quando clica no botão de remover algum item da tabela carrinho utilizando a tecla DELETE
		tabela_carrinho.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == java.awt.event.KeyEvent.VK_DELETE){
//					Verifica se alguma linha de um produto foi selecionado
					if (tabela_carrinho.getSelectedRow() != -1) {

						DefaultTableModel tabela = (DefaultTableModel) tabela_carrinho.getModel();
						
//						Decrementa a variavel e a label total o valor dos produtos
						total -= Double.parseDouble(tabela_carrinho.getValueAt(tabela_carrinho.getSelectedRow(), 1).toString().substring(3));
						lblTotal.setText(String.valueOf(total));
						
//						Remove da tabela o item escolhido
						tabela.removeRow(tabela_carrinho.getSelectedRow());
			
//						Seleciona o primeiro item da tabela
							if (tabela_carrinho.getRowCount() != 0) {
								tabela_carrinho.addRowSelectionInterval(0,0);
							}
						}
				} 
			}
		});
		
		
		
		
		JButton btnFecharCompra = new JButton("FECHAR COMPRA");
		btnFecharCompra.setBounds(489, 219, 159, 40);
		btnFecharCompra.setForeground(Color.BLACK);
		btnFecharCompra.setBackground(Color.GREEN);
		btnFecharCompra.setFont(new Font("Arial Black", Font.BOLD, 11));
		contentPane.add(btnFecharCompra);
		
//		Ação a executar quando clicado no botao de fechar a compra e então emitir o cupom fiscal
		btnFecharCompra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean concluir_pagamento = false, concluir_cpf = false, compra_independente = false;
				double quantiaPaga = 0;
				String cupomFiscal = "";
				Object[] vista_prazo = {"À VISTA","À PRAZO"};
				String cpf;
				int indiceCpf;
				
//				Reseta variaveis
				quantiaPaga = 0;
				concluir_pagamento = false;
				concluir_cpf = false;
				indiceCpf = -1;
				compra_independente = false;
				cupomFiscal = "";
				
//				instancia da tabela do carrinho e tabela do historico
				DefaultTableModel tabela = (DefaultTableModel) tabela_carrinho.getModel();
				DefaultTableModel tabelaHistorico = (DefaultTableModel) tabela_historico.getModel();
				
//				Se o carrinho não estiver vazio então pode efetuar a compra
				if (tabela_carrinho.getRowCount() != 0) {
					
//					Looping para verificar o CPF do cliente com convênio
					while (concluir_cpf == false) {
//						Entrada do CPF
						cpf = JOptionPane.showInputDialog("Digite seu CPF se possui convênio com a loja:\nOU\nDeixe o campo vazio e pressione enter para efetuar uma compra independente.").replace(".", "").replace("-", "");
//						Se o tamanho do CPF for 11 então está certo e pode entrar
						if (cpf.length() == 11) {
//							Faz um for para verificar se o CPF está cadastrado
							for (int i = 0; i < 10000; i++) {
								if (cpf.equals(cliente[i][0])) {
//									Se estiver cadastrado então variavel responsavel pelo looping é encerrada
									concluir_cpf = true;
//									Variavel int indiceCpf para pegar o indice de qual posição ele achou armazenado o CPF cadastrado, para ser usado posteriormente
									indiceCpf = i;
//									Encerra o loop para verificar se o CPF está cadastrado
									break;
								}
							}
//							Verifica através da variavel indiceCpf se o CPF digitado bateu com algum cadastrado, se não.. acusa erro
							if (indiceCpf == -1) {
								JOptionPane.showMessageDialog(null, "CPF inválido ou não cadastrado!", "ERRO CPF!", JOptionPane.ERROR_MESSAGE);
							}
//							Opção que verifica se o usuário deixou o campo de CPF em branco se optou por fazer alguma compra independente (sem cadastro do CPF)
						}else if (cpf.equals("") || cpf.equals(" ")) {
							concluir_cpf = true;
							compra_independente = true;
						}else {
							JOptionPane.showMessageDialog(null, "CPF inválido!", "ERRO CPF!", JOptionPane.ERROR_MESSAGE);
						}
					}
					
//					Recebe o valor da forma de pagamento, a vista ou a prazo
					int formaPagamento = JOptionPane.showOptionDialog(null, "Total da compra: R$"+total+"\n\nEscolha sua forma de pagamento:", "Forma de pagamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, vista_prazo, null);
					
//					Se o pagamento for à vista
						if (formaPagamento == 0) {
							
//							Enquanto o cliente não inserir um valor suficiente, fica no loop
								while (concluir_pagamento == false) {
									
//									Insere a quantia paga pelo cliente
									quantiaPaga = Double.parseDouble(JOptionPane.showInputDialog("Total da compra: R$"+total+""
											+ "\nForma de pagamento: À vista (10% de desconto)"
											+ "\nTotal da compra após desconto: R$"+total*0.9+""
													+ "\n\nInsira o valor pago :").replace(",", "."));

//										Se a quantia paga FOI suficiente, então pode sair do loop e continuar o processo de compra
										if (quantiaPaga >= (total*0.9)) {
											concluir_pagamento = true;
											
//											Se a quantia paga NÃO foi suficiente, então continua no loop pedindo o valor
										}else {
											JOptionPane.showMessageDialog(null, "Dinheiro pago não suficiente, insira um quantia válida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
										}
								}
								
//								Bloqueia todo o sistema.. o usuário precisa confirmar em OK para concluir o cupom fiscal
								menuArquivo.setEnabled(false);
								tabela_carrinho.setEnabled(false);
								tabela_produtos.setEnabled(false);
								btnAdicionarAoCarrinho.setEnabled(false);
								btnRemoverDoCarrinho.setEnabled(false);
								btnCadastrarProduto.setEnabled(false);
								btnEditarProduto.setEnabled(false);
								btnExcluirProduto.setEnabled(false);
								btnFecharCompra.setEnabled(false);
								btnHabilitarManipulaoDeProdutos.setEnabled(false);
								btnEnviar.setEnabled(false);
								
//								Imprime no cupom fiscal a data e hora atual
								agora = new java.util.Date();
								formata = new SimpleDateFormat(formatoData);
								data = formata.format(agora);
								formata = new SimpleDateFormat(formatoMinSeg);
								minSeg = formata.format(agora);
								hora = agora.getHours() +":"+minSeg;							
								
//								setBounds para exibir na lateral do sistema o cupom fiscal
								setBounds(100, 100, 1100, 562);
								setLocationRelativeTo(null);
								lblData1.setText(data);
								lblData2.setText(data);
								lblHora1.setText(hora);
								lblHora2.setText(hora);

//								Se o usuário utilizou o CPF cadastrado com convênio na loja, então.. registra a compra no nome dele
								if (compra_independente == false) {
									lblCpf.setText("CPF consumidor: "+cliente[indiceCpf][0]);
									lblNome.setText("NOME: "+cliente[indiceCpf][1]);
									tabelaHistorico.addRow(new Object[] {(cliente[indiceCpf][0].substring(0, 3)+"."+cliente[indiceCpf][0].substring(3, 6)+"."+cliente[indiceCpf][0].substring(6, 9)+"-"+cliente[indiceCpf][0].substring(9)), "R$ "+(total*0.9)});
								}else {
//									Se o usuário optou por fazer alguma compra independente(sem utilizar CPF cadastrado)
									tabelaHistorico.addRow(new Object[] {"*Cliente independente*", "R$ "+(total*0.9)});
								}
								
//								Loop utilizado para imprimir no cupom fiscal todos os produtos comprados
								for (int i = 0; i < tabela_carrinho.getRowCount(); i++) {
									cupomFiscal += (i+1)+"  "+tabela_carrinho.getValueAt(i, 0)+"  T10,00%  "+tabela_carrinho.getValueAt(i, 1)+"\n\n";
								}
//								Imprime o total da compra, o dinheiro pago e o troco
								txtCupomFiscal.setText(cupomFiscal
										+ "\n\nTOTAL: (10% DESCONTO) R$                      "+(total*0.9)
										+ "\nDinheiro: R$                                  "+quantiaPaga
										+ "\nTroco: R$                                     "+(quantiaPaga-(total*0.9)));
								
								
//							Reseta a tabela carrinho para a próxima compra
							while (tabela_carrinho.getRowCount() != 0) {
								tabela.removeRow(0);
							}
//							Reseta a variavel e a label total
							total = 0;
							lblTotal.setText("0.0");
							
							
							
//							Se o pagamento for à prazo
						}else if (formaPagamento == 1) {
							
//							Enquanto o cliente não inserir um valor suficiente, fica no loop
								while (concluir_pagamento == false) {
									
//									Insere a quantia paga pelo cliente
									quantiaPaga = Double.parseDouble(JOptionPane.showInputDialog("Total da compra: R$"+total+""
											+ "\nForma de pagamento: À prazo"
											+ "\n\nInsira o valor pago:").replace(",", "."));

//										Se a quantia paga FOI suficiente, então pode sair do loop e continuar o processo de compra
										if (quantiaPaga >= total) {
											concluir_pagamento = true;
											
//											Se a quantia paga NÃO foi suficiente, então continua no loop pedindo o valor
										}else {
											JOptionPane.showMessageDialog(null, "Dinheiro pago não suficiente, insira um quantia válida!", "ERRO!", JOptionPane.ERROR_MESSAGE);
										}
								}
								
//								Imprime no cupom fiscal a data e hora atual
								agora = new java.util.Date();
								formata = new SimpleDateFormat(formatoData);
								data = formata.format(agora);
								formata = new SimpleDateFormat(formatoMinSeg);
								minSeg = formata.format(agora);
								hora = agora.getHours() +":"+minSeg;
								
//								setBounds para exibir na lateral do sistema o cupom fiscal
								setBounds(100, 100, 1100, 562);
								setLocationRelativeTo(null);
								lblData1.setText(data);
								lblData2.setText(data);
								lblHora1.setText(hora);
								lblHora2.setText(hora);
								
//								Se o usuário utilizou o CPF cadastrado com convênio na loja, então.. registra a compra no nome dele
								if (compra_independente == false) {
									lblCpf.setText("CPF consumidor: "+cliente[indiceCpf][0]);
									lblNome.setText("NOME: "+cliente[indiceCpf][1]);
									tabelaHistorico.addRow(new Object[] {(cliente[indiceCpf][0].substring(0, 3)+"."+cliente[indiceCpf][0].substring(3, 6)+"."+cliente[indiceCpf][0].substring(6, 9)+"-"+cliente[indiceCpf][0].substring(9)), "R$ "+total});
								}else {
//									Se o usuário optou por fazer alguma compra independente(sem utilizar CPF cadastrado)
									tabelaHistorico.addRow(new Object[] {"*Cliente independente*", "R$ "+total});
								}
								
//								Loop utilizado para imprimir no cupom fiscal todos os produtos comprados
								for (int i = 0; i < tabela_carrinho.getRowCount(); i++) {
									cupomFiscal += (i+1)+"  "+tabela_carrinho.getValueAt(i, 0)+"  T10,00%  "+tabela_carrinho.getValueAt(i, 1)+"\n\n";
								}
//								Imprime o total da compra, o dinheiro pago e o troco
								txtCupomFiscal.setText(cupomFiscal
										+ "\n\nTOTAL: R$                                     "+total
										+ "\nDinheiro: R$                                  "+quantiaPaga
										+ "\nTroco: R$                                     "+(quantiaPaga-total));
								
//							Reseta a tabela carrinho para a próxima compra
							while (tabela_carrinho.getRowCount() != 0) {
								tabela.removeRow(0);
							}
//							Reseta a variavel e a label total
							total = 0;
							lblTotal.setText("0.0");
							
						}
					
//					Se o carrinho estiver vazio, acusa erro
				}else {
					JOptionPane.showMessageDialog(null, "Não foi possível efetuar a compra, o carrinho está vazio!", "ERRO!", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

	
//		Ação a executar quando clica no botão para verificar a senha e habilitar a manipulação de produtos
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				Se a senha for válida (12345) então habilita os botões
				if (passwordField.getText().equals("12345")) {
					mntmNovo.setEnabled(true);
					btnCadastrarProduto.setEnabled(true);
					btnEditarProduto.setEnabled(true);
					btnExcluirProduto.setEnabled(true);
					lblSenha.setVisible(false);
					passwordField.setVisible(false);
					btnEnviar.setVisible(false);
					btnHabilitarManipulaoDeProdutos.setVisible(true);
//					Altera as propriedades do botão de habilitação para exibir que agora está autorizado
					btnHabilitarManipulaoDeProdutos.setText("Permissão de manipulação habilitado");
					btnHabilitarManipulaoDeProdutos.setEnabled(false);
					btnHabilitarManipulaoDeProdutos.setBackground(Color.GREEN);
				}else {
//					Se a senha for errada então não habilita nada
					btnHabilitarManipulaoDeProdutos.setVisible(true);
					lblSenha.setVisible(false);
					passwordField.setVisible(false);
					btnEnviar.setVisible(false);
					passwordField.setText(null);
				}
			}
		});	
//		Ação a executar quando clica no botão para verificar a senha e habilitar a manipulação de produtos utilizando a tecla ENTER
		passwordField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
//					Se a senha for válida (12345) então habilita os botões
					if (passwordField.getText().equals("12345")) {
						mntmNovo.setEnabled(true);
						btnCadastrarProduto.setEnabled(true);
						btnEditarProduto.setEnabled(true);
						btnExcluirProduto.setEnabled(true);
						lblSenha.setVisible(false);
						passwordField.setVisible(false);
						btnEnviar.setVisible(false);
						btnHabilitarManipulaoDeProdutos.setVisible(true);
//						Altera as propriedades do botão de habilitação para exibir que agora está autorizado
						btnHabilitarManipulaoDeProdutos.setText("Permissão de manipulação habilitado");
						btnHabilitarManipulaoDeProdutos.setEnabled(false);
						btnHabilitarManipulaoDeProdutos.setBackground(Color.GREEN);
					}else {
//						Se a senha for errada então não habilita nada
						btnHabilitarManipulaoDeProdutos.setVisible(true);
						lblSenha.setVisible(false);
						passwordField.setVisible(false);
						btnEnviar.setVisible(false);
						passwordField.setText(null);
					}
				}
			}
		});
//		Quando clica no botão para querer a habilitar a manipulação dos produtos.. então faz aparecer um JPassworrdField para inserir a senha
		btnHabilitarManipulaoDeProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				passwordField.setVisible(true);
				lblSenha.setVisible(true);
				btnEnviar.setVisible(true);
				btnHabilitarManipulaoDeProdutos.setVisible(false);
				passwordField.requestFocus();
			}
		});
		
//		Ação a executar quando clica no botão de OK para concluir o cupom fiscal e inicar outra compra
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCpf.setText("CPF consumidor:");
				lblNome.setText("NOME:");
				menuArquivo.setEnabled(true);
				tabela_carrinho.setEnabled(true);
				tabela_produtos.setEnabled(true);
				btnAdicionarAoCarrinho.setEnabled(true);
				btnRemoverDoCarrinho.setEnabled(true);
				btnFecharCompra.setEnabled(true);
				if (btnHabilitarManipulaoDeProdutos.getText().equals("Permissão de manipulação habilitado")) {
					btnHabilitarManipulaoDeProdutos.setEnabled(false);
					btnCadastrarProduto.setEnabled(true);
					btnEditarProduto.setEnabled(true);
					btnExcluirProduto.setEnabled(true);
				}else {
				btnHabilitarManipulaoDeProdutos.setEnabled(true);
				}
				btnEnviar.setEnabled(true);
				setBounds(100, 100, 675, 562);
				setLocationRelativeTo(null);
			}
		});
		
//		Ação a executar quando clica na opão de "Novo" no menu. Caso queira limpar a tabela carrinho e a tabela produtos
		mntmNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object[] sim_nao = {"SIM","NÃO"};
				DefaultTableModel tabelaCarrinho = (DefaultTableModel) tabela_carrinho.getModel();
				DefaultTableModel tabelaProdutos = (DefaultTableModel) tabela_produtos.getModel();

//				Se houver linhas nas tabelas, então perguntara se deseja mesmo apagar os dados atuais nas tabelas
				if (tabela_produtos.getRowCount() != 0 || tabela_carrinho.getRowCount() != 0) {
					int novo = JOptionPane.showOptionDialog(null, "Tem certeza que deseja criar um novo?\nIsso apagará todos os dados nas tabelas!", "Tem certeza?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, sim_nao, null);
					if (novo == 0) {
//						Remove todas as linhas da tabela carrinho
						while (tabela_carrinho.getRowCount() != 0) {
							tabelaCarrinho.removeRow(0);
						}
//						Remove todas as linhas da tabela produtos
						while (tabela_produtos.getRowCount() != 0) {
							tabelaProdutos.removeRow(0);
						}
//						Reseta a variavel e a label total
						total = 0;
						lblTotal.setText("0.0");
					}
				}
			}
		});
		
		
//		Ação a executar quando é clicado no menu a opção de cadastradar o cliente para ter convênio com a loja
		mntmCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int contador = 10;
				int calculo_digito1 = 0, calculo_digito2 = 0;
				int digito1, digito2;
				String cpfString = "";
				String cpf_parte1, cpf_parte2, dv;
				boolean verificaLetraCpf = true, concluiLetraCpf = true;
				boolean verificaCpf = true;
				boolean verificaNaoNull = true;
				
				boolean cpfValido = false;
				
//				Reseta variaveis
				cpfValido = false;
				verificaNaoNull = true;
				verificaCpf = true;
//				Loop principal para validar todas as caracteristicas de um CPF
				while (verificaCpf == true) {
					
//					Reseta variavel
					concluiLetraCpf = true;
//					Loop para verificar se há letras ou caracteres no cpf a não ser (numero, "." , "-")
					while (concluiLetraCpf == true) {
						
//						Reseta variavel
						verificaLetraCpf = true;
						
//						Try/catch para verificar se clicou em cancelar ou deu entrada como nulo
						try {
//							Entrada do cpf
							cpfString = JOptionPane.showInputDialog("Insira o cpf do cliente:").replace(".", "").replace("-", "");
						} catch (NullPointerException e2) {
							verificaNaoNull = false;
						}
						
//					Verificar se não clicou em cancelar
					if (verificaNaoNull == true) {
//								Verifica se há letras ou caracteres a não ser (numero, "." , "-")
								try {
									long cpf = Long.parseLong(cpfString);
								} catch (Exception e2) {
//									Se houver letras ou outros caracteres a não ser (numero, "." , "-") então vai pedir o cpf denovo
									verificaLetraCpf = false;
									JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
								}
//								Se as verificações foi um sucesso então sai do loop
								if (verificaLetraCpf == true) {
									concluiLetraCpf = false;
								}
						}else {
							concluiLetraCpf = false;
							verificaCpf = false;
						}
					}
					
//					Verificar se não clicou em cancelar ou deu entrada como nulo
					if (verificaNaoNull == true) {
//						Demais verificações do CPF
						if (cpfString.length() != 11) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("11111111111")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("22222222222")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("33333333333")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("44444444444")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("55555555555")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("66666666666")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("77777777777")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("88888888888")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else if (cpfString.equals("99999999999")) {
							JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
						}else {
//							Verifica a lógica de calculos do CPF
							contador = 10;
							calculo_digito1 = 0;
							calculo_digito2 = 0;
							
							cpf_parte1 = cpfString.substring(0 , cpfString.length()-2);
							dv = cpfString.substring(9);
							
							for (int i = 0; i < 9; i++) {
								calculo_digito1 += Integer.parseInt(cpf_parte1.substring(i,i+1))*contador;	
								contador--;
							}
							
							digito1 = 11 - (calculo_digito1 % 11);
							if (digito1 == 10 || digito1 == 11) {
								digito1 = 0;
							}
							
							cpf_parte2 = cpf_parte1+digito1;
							
							contador = 11;
							for (int j = 0; j < 10; j++) {
								calculo_digito2 += Integer.parseInt(cpf_parte2.substring(j,j+1))*contador;
								contador--;
							}
							
							digito2 = 11 - (calculo_digito2 % 11);
							if (digito2 == 10 || digito2 == 11) {
								digito2 = 0;
							}
							
//							Se os digitos verificadores forem válidos então o CPF é válido e pode continuar com o cadastro
							if (dv.equals(digito1+""+digito2)) {
								cpfValido = true;
								verificaCpf = false;
							}else {
//								Se houver erro.. informa que o CPF não é válido
								JOptionPane.showMessageDialog(null, "Informe um CPF válido!", "CPF inválido!", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
				}
				
				String nome = "";
				boolean concluirNome = false;
				boolean verificaCpfExiste = false;
				int indiceCliente = 0;
				DefaultTableModel tabelaCliente = (DefaultTableModel) tabela_clientes.getModel();
//				Reseta variaveis
				verificaCpfExiste = false;
				concluirNome = false;
				indiceCliente = 0;
				
//				Se o CPF informado anteriormente foi valido então continua com o cadastro
				if (cpfValido == true) {
//					Loop para verificar se o cpf ja foi cadastrado
					for (int i = 0; i < 10000; i++) {
						if (cpfString.equals(cliente[i][0])) {
							JOptionPane.showMessageDialog(null, "CPF já cadastrado!", "ERRO CPF!", JOptionPane.ERROR_MESSAGE);
							verificaCpfExiste = true;
						}
					}
//					Se o cpf NÃO foi cadastrado ainda.. então continua para outra verificação
					if (verificaCpfExiste == false) {
//						Loop para colocar o cpf na primeira posição vazia que encontrar no vetor dos clientes
						for (int i = 0; i < 10000; i++) {
							if (cliente[i][0] == null) {
//								Variavel int indiceCliente para pegar o indice de qual posição vazia ele achou primeiro, para ser usado posteriormente
								indiceCliente = i;
								break;
							}
						}
					
//						Enquando não digitar um nome válido.. não sai do loop
						while (concluirNome == false) {
//							Entrada do nome
								nome = JOptionPane.showInputDialog("Digite o nome do cliente:");

								if (nome.equals("") || nome.equals(" ")) {
									JOptionPane.showMessageDialog(null, "Insira um nome válido, o campo não pode estar vazio!", "ERRO NOME!", JOptionPane.ERROR_MESSAGE);
								}else {
//									Cadastra os dados no vetor cliente utilizando o indiceCliente como guia para colocar na primeira posição vazia.. verificado anteriormente
									cliente[indiceCliente][0] = cpfString;
									cliente[indiceCliente][1] = nome;
//									Encerra o loop
									concluirNome = true;
								}
						}
						
//						Loop que percorre todos os campos preenchidos no vetor cliente para então adicionar os dados na tabela
						for (int i = 0; i < 10000; i++) {
							if (cliente[i][0] != null) {
								tabelaCliente.addRow(new Object[] {(cliente[i][0].substring(0, 3)+"."+cliente[i][0].substring(3, 6)+"."+cliente[i][0].substring(6, 9)+"-"+cliente[i][0].substring(9)),cliente[i][1]});
							}
						}
						
					}
				}
				
				
			}
		});
	}
}
