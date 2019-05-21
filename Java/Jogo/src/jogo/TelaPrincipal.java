package jogo;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	static JLabel personagem;
	static GraphicsDevice device = GraphicsEnvironment
	        .getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	static String posicaoBoneco[] = new String [10];
	static boolean andando = false;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
//					device.setFullScreenWindow(frame); 
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
	public TelaPrincipal() {
		
		posicaoBoneco[0] = "/imagens/bonecoParado.png";
//		Imagem boneco parado
		ImageIcon instanciaImagem_bonecoParado = new ImageIcon(TelaPrincipal.class.getResource("/imagens/bonecoParado.png"));
		Image imagem_bonecoParado = instanciaImagem_bonecoParado.getImage().getScaledInstance(215, 250, Image.SCALE_FAST);
		
		ImageIcon instanciaImagem_bonecoAndar = new ImageIcon(TelaPrincipal.class.getResource("/imagens/bonecoAndando.gif"));
		Image imagem_bonecoAndar = instanciaImagem_bonecoAndar.getImage().getScaledInstance(215, 250, Image.SCALE_FAST);

		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 768);
//		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEncerrar = new JButton("ENCERRAR");
		btnEncerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		textField = new JTextField();
		textField.setBounds(0, -20, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnEncerrar.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnEncerrar.setBackground(Color.WHITE);
		btnEncerrar.setBounds(385, 201, 89, 23);
		contentPane.add(btnEncerrar);
		
		personagem = new JLabel("");
		personagem.setBounds(186, 411, 215, 250);
		personagem.setIcon(new ImageIcon(imagem_bonecoParado));
		contentPane.add(personagem);
		
		JLabel cenario = new JLabel("");
		cenario.setBounds(0, 0, getWidth(), getHeight());
		ImageIcon instanciaImagem_cenario = new ImageIcon(TelaPrincipal.class.getResource("/imagens/cenario.png"));
		Image imagem_cenario = instanciaImagem_cenario.getImage().getScaledInstance(cenario.getWidth(), cenario.getHeight(), Image.SCALE_SMOOTH);
		cenario.setIcon(new ImageIcon(imagem_cenario));
		contentPane.add(cenario);
		
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				andando = true;
				while(andando == true) {
					personagem.setIcon(new ImageIcon(imagem_bonecoAndar));
					repaint();
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				personagem.setIcon(new ImageIcon(imagem_bonecoParado));
                repaint();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				textField.requestFocus();
			}
		});

	}
}
