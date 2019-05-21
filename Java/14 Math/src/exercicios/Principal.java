package exercicios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Cursor;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumeros;
	private JTextField txtOperacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false);
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 482);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 334, 443);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNumeros = new JTextField();
		txtNumeros.setEditable(false);
		txtNumeros.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtNumeros.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtNumeros.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNumeros.setText("0");
		txtNumeros.setBackground(UIManager.getColor("Button.background"));
		txtNumeros.setBounds(10, 40, 314, 62);
		txtNumeros.setBorder(null);
		panel.add(txtNumeros);
		txtNumeros.setColumns(10);
		
		JButton btnClearAll = new JButton("C");
		btnClearAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtNumeros.setText("0");
			}
		});
		btnClearAll.setBackground(SystemColor.scrollbar);
		btnClearAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClearAll.setBounds(10, 113, 55, 55);
		panel.add(btnClearAll);
		
		JButton btnRaizQuadrada = new JButton("\u00B2\u221A");
		btnRaizQuadrada.setBackground(SystemColor.scrollbar);
		btnRaizQuadrada.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRaizQuadrada.setBounds(75, 113, 55, 55);
		panel.add(btnRaizQuadrada);
		
		JButton btnRaizCubica = new JButton("\u00B3\u221A");
		btnRaizCubica.setBackground(SystemColor.scrollbar);
		btnRaizCubica.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRaizCubica.setBounds(140, 113, 55, 55);
		panel.add(btnRaizCubica);
		
		JButton btnLog = new JButton("log");
		btnLog.setBackground(SystemColor.scrollbar);
		btnLog.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLog.setBounds(205, 113, 55, 55);
		panel.add(btnLog);
		
		JButton btnApagar = new JButton("\u2190");
		btnApagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0") || txtNumeros.getText().length() == 1) {
					txtNumeros.setText("0");
				}else {
					txtNumeros.setText(txtNumeros.getText().substring(0, txtNumeros.getText().length()-1));
				}
			}
		});
		btnApagar.setBackground(SystemColor.scrollbar);
		btnApagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnApagar.setBounds(270, 113, 55, 55);
		panel.add(btnApagar);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("7");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "7");
				}
			}
		});
		btn7.setBackground(Color.WHITE);
		btn7.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn7.setBounds(10, 179, 55, 55);
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("8");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "8");
				}
			}
		});
		btn8.setBackground(Color.WHITE);
		btn8.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn8.setBounds(75, 179, 55, 55);
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("9");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "9");
				}
			}
		});
		btn9.setBackground(Color.WHITE);
		btn9.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn9.setBounds(140, 179, 55, 55);
		panel.add(btn9);
		
		JButton btnSin = new JButton("sin");
		btnSin.setBackground(SystemColor.scrollbar);
		btnSin.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSin.setBounds(205, 179, 55, 55);
		panel.add(btnSin);
		
		JButton btnCos = new JButton("cos");
		btnCos.setBackground(SystemColor.scrollbar);
		btnCos.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCos.setBounds(270, 179, 55, 55);
		panel.add(btnCos);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("4");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "4");
				}
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn4.setBounds(10, 245, 55, 55);
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("5");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "5");
				}
			}
		});
		btn5.setBackground(Color.WHITE);
		btn5.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn5.setBounds(75, 245, 55, 55);
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("6");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "6");
				}
			}
		});
		btn6.setBackground(Color.WHITE);
		btn6.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn6.setBounds(140, 245, 55, 55);
		panel.add(btn6);
		
		JButton btnTan = new JButton("tan");
		btnTan.setBackground(SystemColor.scrollbar);
		btnTan.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnTan.setBounds(205, 245, 55, 55);
		panel.add(btnTan);
		
		JButton btnDividir = new JButton("\u00F7");
		btnDividir.setBackground(SystemColor.scrollbar);
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDividir.setBounds(270, 245, 55, 55);
		panel.add(btnDividir);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("1");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "1");
				}
				
			}
		});
		btn1.setBackground(Color.WHITE);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn1.setBounds(10, 311, 55, 55);
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("2");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "2");
				}
			}
		});
		btn2.setBackground(Color.WHITE);
		btn2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn2.setBounds(75, 311, 55, 55);
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("3");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "3");
				}
			}
		});
		btn3.setBackground(Color.WHITE);
		btn3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn3.setBounds(140, 311, 55, 55);
		panel.add(btn3);
		
		JButton btnSubtrair = new JButton("-");
		btnSubtrair.setBackground(SystemColor.scrollbar);
		btnSubtrair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSubtrair.setBounds(205, 311, 55, 55);
		panel.add(btnSubtrair);
		
		JButton btnMultiplicacao = new JButton("X");
		btnMultiplicacao.setBackground(SystemColor.scrollbar);
		btnMultiplicacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMultiplicacao.setBounds(270, 311, 55, 55);
		panel.add(btnMultiplicacao);
		
		JButton btnMudarSinal = new JButton("\u00B1");
		btnMudarSinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().startsWith("-")) {
					txtNumeros.setText(txtNumeros.getText().substring(1));
				}else {
					txtNumeros.setText("-"+txtNumeros.getText());
				}
			}
		});
		btnMudarSinal.setBackground(SystemColor.scrollbar);
		btnMudarSinal.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnMudarSinal.setBounds(10, 377, 55, 55);
		panel.add(btnMudarSinal);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtNumeros.getText().equals("0")) {
					txtNumeros.setText("0");
				}else if (txtNumeros.getText().length() < 12){
					txtNumeros.setText(txtNumeros.getText() + "0");
				}
			}
		});
		btn0.setBackground(Color.WHITE);
		btn0.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn0.setBounds(75, 377, 55, 55);
		panel.add(btn0);
		
		JButton btnVirgula = new JButton(",");
		btnVirgula.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean temVirugula = false;
				temVirugula = false;
				
				for (int i = 0; i < txtNumeros.getText().length(); i++) {
					if (txtNumeros.getText().charAt(i) == ',') {
						temVirugula = true;
					}
				}
				if (temVirugula == false) {
					txtNumeros.setText(txtNumeros.getText() + ",");
				}
			}
		});
		btnVirgula.setBackground(SystemColor.scrollbar);
		btnVirgula.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnVirgula.setBounds(140, 377, 55, 55);
		panel.add(btnVirgula);
		
		JButton btnSomar = new JButton("+");
		btnSomar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (txtOperacao.getText().length() > 0) {
					double resultado;
					resultado = 0;
					String teste[] = txtOperacao.getText().split(" + ");
					
					for (int i = 0; i < teste.length; i++) {
						resultado += Double.parseDouble(teste[i].replace(" + ", ""));
					}
					txtNumeros.setText(Double.toString(resultado));
				}
				
				txtOperacao.setText(txtOperacao.getText()+txtNumeros.getText()+" + ");

			}
		});
		btnSomar.setBackground(SystemColor.scrollbar);
		btnSomar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSomar.setBounds(205, 377, 55, 55);
		panel.add(btnSomar);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setBackground(SystemColor.scrollbar);
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnIgual.setBounds(270, 377, 55, 55);
		panel.add(btnIgual);
		
		txtOperacao = new JTextField();
		txtOperacao.setHorizontalAlignment(SwingConstants.RIGHT);
		txtOperacao.setEditable(false);
		txtOperacao.setBackground(UIManager.getColor("Button.background"));
		txtOperacao.setBounds(10, 11, 314, 28);
		txtOperacao.setBorder(null);
		panel.add(txtOperacao);
		txtOperacao.setColumns(10);
	}
}
