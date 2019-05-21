package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import beans.Colaborador;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;

import acao.Acoes;

import javax.swing.event.ChangeEvent;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNomeColaborador;
	private JTextField txtSalarioBruto;
	private JTextField txtValeTransporte;
	private JTextField txtImpostoRenda;
	private JTextField txtSalarioLiquido;
	private JComboBox cbxCargo;
	private JCheckBox chckbxClubeFidelidade;
	private JCheckBox chckbxPlanoDeSade;
	private JCheckBox chckbxValeTransporte;
	private JSpinner spinnerFaltas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	
	private Colaborador colaborador() {
		Colaborador c = new Colaborador();
		c.setNomeColaborador(txtNomeColaborador.getText());
		c.setCargo(cbxCargo.getSelectedItem().toString());
		c.setImpostoRenda(Double.parseDouble(txtImpostoRenda.getText()));
		c.setSalarioLiquido(Double.parseDouble(txtSalarioLiquido.getText()));
		c.setValeTransporte(chckbxValeTransporte.isSelected());
		c.setClubeFidelidade(chckbxClubeFidelidade.isSelected());
		c.setPlanoSaude(chckbxPlanoDeSade.isSelected());
		c.setFaltasMes(Integer.parseInt(spinnerFaltas.getValue().toString()));
		
		return c;
	}
	
	public TelaPrincipal() {
		
		Acoes acoes = new Acoes();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(10, 11, 664, 280);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblColaborador = new JLabel("Colaborador:");
		lblColaborador.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblColaborador.setBounds(10, 15, 64, 14);
		panel.add(lblColaborador);
		
		JLabel lblSalrioBruto = new JLabel("Sal\u00E1rio Bruto:");
		lblSalrioBruto.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSalrioBruto.setBounds(10, 68, 76, 14);
		panel.add(lblSalrioBruto);
		
		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs:");
		lblFaltasNoMs.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblFaltasNoMs.setBounds(10, 181, 82, 14);
		panel.add(lblFaltasNoMs);
		
		txtNomeColaborador = new JTextField();
		txtNomeColaborador.setBounds(109, 12, 230, 20);
		panel.add(txtNomeColaborador);
		txtNomeColaborador.setColumns(10);
		
		txtSalarioBruto = new JTextField();
		txtSalarioBruto.setEnabled(false);
		txtSalarioBruto.setColumns(10);
		txtSalarioBruto.setBounds(109, 65, 230, 20);
		panel.add(txtSalarioBruto);
		
		txtValeTransporte = new JTextField();
		txtValeTransporte.setEnabled(false);
		txtValeTransporte.setColumns(10);
		txtValeTransporte.setBounds(121, 117, 218, 20);
		panel.add(txtValeTransporte);
		
		spinnerFaltas = new JSpinner();
		spinnerFaltas.setBounds(109, 178, 52, 20);
		panel.add(spinnerFaltas);
		
		JLabel lblCargo = new JLabel("Cargo:");
		lblCargo.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCargo.setBounds(350, 15, 33, 14);
		panel.add(lblCargo);
		
		cbxCargo = new JComboBox();
		cbxCargo.setModel(new DefaultComboBoxModel(new String[] {"Estagi\u00E1rio", "Desenvolvedor JR", "Desenvolvedor Plenor", "Desenvolvedor S\u00EAnior", "Analista de sistemas JR", "Analista de sistemas Pleno", "Analista de sistemas S\u00EAnior", "Arquiteto de software"}));
		cbxCargo.setBounds(392, 11, 244, 22);
		panel.add(cbxCargo);
		
		chckbxClubeFidelidade = new JCheckBox("Clube fidelidade");
		chckbxClubeFidelidade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxClubeFidelidade.setBounds(376, 64, 105, 23);
		panel.add(chckbxClubeFidelidade);
		
		chckbxPlanoDeSade = new JCheckBox("Plano de sa\u00FAde");
		chckbxPlanoDeSade.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxPlanoDeSade.setBounds(531, 64, 105, 23);
		panel.add(chckbxPlanoDeSade);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de renda:");
		lblImpostoDeRenda.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblImpostoDeRenda.setBounds(349, 120, 90, 14);
		panel.add(lblImpostoDeRenda);
		
		JLabel lblSalrioLiquido = new JLabel("Sal\u00E1rio L\u00EDquido:");
		lblSalrioLiquido.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblSalrioLiquido.setBounds(350, 181, 76, 14);
		panel.add(lblSalrioLiquido);
		
		txtImpostoRenda = new JTextField();
		txtImpostoRenda.setEnabled(false);
		txtImpostoRenda.setText("");
		txtImpostoRenda.setBounds(449, 117, 192, 20);
		panel.add(txtImpostoRenda);
		txtImpostoRenda.setColumns(10);
		
		txtSalarioLiquido = new JTextField();
		txtSalarioLiquido.setEnabled(false);
		txtSalarioLiquido.setText("");
		txtSalarioLiquido.setColumns(10);
		txtSalarioLiquido.setBounds(449, 178, 192, 20);
		panel.add(txtSalarioLiquido);
		
		chckbxValeTransporte = new JCheckBox("Vale transporte:");
		chckbxValeTransporte.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		chckbxValeTransporte.setFont(new Font("Tahoma", Font.PLAIN, 11));
		chckbxValeTransporte.setBounds(10, 116, 105, 23);
		panel.add(chckbxValeTransporte);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(10, 246, 105, 23);
		panel.add(btnCadastrar);
		
		JButton btnEstatisticas = new JButton("Estatisticas");
		btnEstatisticas.setBounds(121, 246, 105, 23);
		panel.add(btnEstatisticas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 302, 664, 198);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(acoes.selecionar());
		scrollPane.setViewportView(table);
		
		cbxCargo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (cbxCargo.getSelectedItem().equals("Estagi�rio")) {
					txtSalarioBruto.setText("900.0");
					txtImpostoRenda.setText("0");
					txtSalarioLiquido.setText("900.0");
				}else if (cbxCargo.getSelectedItem().equals("Desenvolvedor JR")) {
					txtSalarioBruto.setText("1300.0");
					txtImpostoRenda.setText(""+(1300*0.04));
					txtSalarioLiquido.setText(""+(1300-(1300*0.04)));
				}else if (cbxCargo.getSelectedItem().equals("Desenvolvedor Pleno")) {
					txtSalarioBruto.setText("1800.0");
					txtImpostoRenda.setText(""+(1800*0.055));
					txtSalarioLiquido.setText(""+(1800-(1800*0.055)));
				}else if (cbxCargo.getSelectedItem().equals("Desenvolvedor S�nior")) {
					txtSalarioBruto.setText("2400.0");
					txtImpostoRenda.setText(""+(2400*0.06));
					txtSalarioLiquido.setText(""+(2400-(2400*0.06)));
				}else if (cbxCargo.getSelectedItem().equals("Analista de sistemas JR")) {
					txtSalarioBruto.setText("2700.0");
					txtImpostoRenda.setText(""+(2700*0.065));
					txtSalarioLiquido.setText(""+(2700-(2700*0.065)));
				}else if (cbxCargo.getSelectedItem().equals("Analista de sistemas Pleno")) {
					txtSalarioBruto.setText("3200.0");
					txtImpostoRenda.setText(""+(3200*0.07));
					txtSalarioLiquido.setText(""+(3200-(3200*0.07)));
				}else if (cbxCargo.getSelectedItem().equals("Analista de sistemas S�nior")) {
					txtSalarioBruto.setText("3600.0");
					txtImpostoRenda.setText(""+(3600*0.075));
					txtSalarioLiquido.setText(""+(3600-(3600*0.075)));
				}else if (cbxCargo.getSelectedItem().equals("Arquiteto de software")) {
					txtSalarioBruto.setText("4400.0");
					txtImpostoRenda.setText(""+(4400*0.08));
					txtSalarioLiquido.setText(""+(4400-(4400*0.08)));
				}
			}
		});
		
		chckbxClubeFidelidade.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!txtSalarioLiquido.getText().equals("")) {
						double liquido = Double.parseDouble(txtSalarioLiquido.getText());
						if (chckbxClubeFidelidade.isSelected()) {
							txtSalarioLiquido.setText(Double.toString(liquido-100));
						}else {
							txtSalarioLiquido.setText(Double.toString(liquido+100));
						}
				}
			}
		});
		
		chckbxPlanoDeSade.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!txtSalarioLiquido.getText().equals("")) {
						double liquido = Double.parseDouble(txtSalarioLiquido.getText());
						if (chckbxPlanoDeSade.isSelected()) {
							txtSalarioLiquido.setText(Double.toString(liquido-(liquido*0.03)));
						}else {
							txtSalarioLiquido.setText(Double.toString(liquido+(liquido*0.03)));
						}
				}
			}
		});
		
		chckbxValeTransporte.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (!txtSalarioLiquido.getText().equals("")) {
					double liquido = Double.parseDouble(txtSalarioLiquido.getText());
					if (chckbxValeTransporte.isSelected()) {
						txtValeTransporte.setText(""+(liquido*0.06));
						txtSalarioLiquido.setText(Double.toString(liquido-(liquido*0.06)));
					}else {
						txtValeTransporte.setText("0");
						txtSalarioLiquido.setText(Double.toString(liquido+(liquido*0.06)));
					}
				}
			}
		});
		
		spinnerFaltas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if (!txtSalarioLiquido.getText().equals("")) {
					double liquido = Double.parseDouble(txtSalarioLiquido.getText());
					int qntFaltas = Integer.parseInt(spinnerFaltas.getValue().toString());
						txtSalarioLiquido.setText(Double.toString(liquido-(qntFaltas*50)));
				}
			}
		});
		
		
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				acoes.CadastrarColaborador(colaborador());
				table.setModel(acoes.selecionar());
			}
		});
	}
}
