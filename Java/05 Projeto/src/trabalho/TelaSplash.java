package trabalho;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaSplash extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSplash frame = new TelaSplash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaSplash() {
		
//		Cria uma tela de splash somente para um "enfeite" de carregamento do sistema
		
		setType(Type.UTILITY);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(TelaSplash.class.getResource("/trabalho/iconeCarrinho.jpg")));
		setUndecorated(true);
		setBackground(Color.WHITE);
		setTitle("Sistema carrinho de compras");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 574, 476);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblCarregandoSistema = new JLabel("CARREGANDO SISTEMA...");
		lblCarregandoSistema.setForeground(Color.BLACK);
		lblCarregandoSistema.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblCarregandoSistema.setHorizontalAlignment(SwingConstants.CENTER);
		lblCarregandoSistema.setBounds(10, 358, 538, 38);
		contentPane.add(lblCarregandoSistema);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setForeground(Color.GREEN);
		progressBar.setStringPainted(true);
		progressBar.setBounds(10, 427, 543, 38);
		contentPane.add(progressBar);
		JLabel Imagem = new JLabel();
		Imagem.setBounds(48, 0, 479, 396);
		
//		Adiciona um ícone para plano de fundo numa JLabel chamada "Imagem"
		ImageIcon iconeCarrinho = new ImageIcon(TelaSplash.class.getResource("/trabalho/iconeCarrinho.jpg"));
		Image icone_carrinho = iconeCarrinho.getImage().getScaledInstance(Imagem.getWidth(), Imagem.getHeight(), Image.SCALE_SMOOTH);
		Imagem.setIcon(new ImageIcon(icone_carrinho));
		
		contentPane.add(Imagem);
		
//		Processo para fazer a progressBar carregar
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
//				Utilizando Thread..
			    Thread t = new Thread(){
			        public void run(){
//			        	Loop que vai de 0 a 100 incrementando a cada 20 milisegundos 1% à progressBar
			            for(int i = 0 ; i <= 100; i++){
			            	progressBar.setValue(i);
			                try {
			                    Thread.sleep(20);
			                } catch (InterruptedException e) {
			                }
//			                Se a progressBar carregou 100% então...
						    if (progressBar.getValue() == 100) {
							    CarrinhoDeCompras CarrinhoDeCompras = new CarrinhoDeCompras();
//							    Mostra a tela principal do sistema ao usuário
							    CarrinhoDeCompras.setVisible(true);
//							    Fecha a tela de splash
							    dispose();
							}
			            }
			        }
			    };
//			    Executa os parametros da Thread criada
			    t.start();
	            }
		});
	}
}
