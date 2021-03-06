package exercicio_1;


import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Acoes{

	public DefaultTableModel selecao() {
	DefaultTableModel tabela_jogos = new DefaultTableModel();
	tabela_jogos = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome do Jogo", "G\u00EAnero do Jogo", "Plataforma", "Classifica\u00E7\u00E3o indicativa", "Valor do Jogo"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
	
	for(int indice=0; indice < BDJogos.arrayJogos.size(); indice++) {
		tabela_jogos.addRow(new Object [] {
				BDJogos.arrayJogos.get(indice).getNome_jogo(),
				BDJogos.arrayJogos.get(indice).getGenero_jogo(),
				BDJogos.arrayJogos.get(indice).getPlataforma_jogo(),
				BDJogos.arrayJogos.get(indice).getClassificacao_jogo(),
				BDJogos.arrayJogos.get(indice).getValor_jogo(),
		});
	}
	
	return tabela_jogos;
	}
//	DefaultTableModel tabela_plataforma = new DefaultTableModel();
//	tabela_plataforma = (DefaultTableModel) TelaCadastro.tabela_plataforma.getModel();
//	
//	DefaultTableModel tabela_genero = new DefaultTableModel();
//	tabela_genero = (DefaultTableModel) TelaCadastro.tabela_genero.getModel();
	
	public boolean ExisteCadastro(Jogo jogo) {
		boolean existe = false;
			for (int i = 0; i < BDJogos.arrayJogos.size(); i++) {
				if (jogo.equals(BDJogos.arrayJogos.get(i).getNome_jogo())) {
					if (jogo.equals(BDJogos.arrayJogos.get(i).getPlataforma_jogo())) {
						existe = true;
						break;
					}else {
						existe = false;
					}
				}else {
					existe = false;
				}
			}
		return existe;
	}

	public boolean ExistePlataforma(String plataforma) {
		boolean existe = false;
		for (int i = 0; i < BDJogos.arrayPlataformas.size(); i++) {
			if (plataforma.equals(BDJogos.arrayPlataformas.get(i).getNomePlataforma())) {
				existe = true;
			}
		}
		return existe;
	}
	
	public boolean ExisteGenero(String genero) {
		boolean existe = false;
		for (int i = 0; i < BDJogos.arrayGeneros.size(); i++) {
			if (genero.equals(BDJogos.arrayGeneros.get(i).getNomeGenero())) {
				existe = true;
			}
		}
		return existe;
	}
	
	
	
	public void AtualizaPlataforma(Plataforma plataforma) {

		int contador;
		if (ExistePlataforma(plataforma.getNomePlataforma()) == false) {
			BDJogos.arrayPlataformas.add(plataforma);
		}else {
			for (int i = 0; i < BDJogos.arrayPlataformas.size(); i++) {
				if (plataforma.equals(BDJogos.arrayPlataformas.get(i).getNomePlataforma())) {
					contador = BDJogos.arrayPlataformas.get(i).getQuantidadePlataforma();
					contador++;
					BDJogos.arrayPlataformas.get(i).setQuantidadePlataforma(contador);
					break;
				}
			}
		}
		ExcluiPlataforma();
	}
	
	public void AtualizaGenero(Genero genero) {

		int contador;
		if (ExisteGenero(genero.getNomeGenero()) == false) {
			BDJogos.arrayGeneros.add(genero);
		}else {
			for (int i = 0; i < BDJogos.arrayGeneros.size(); i++) {
				if (genero.equals(BDJogos.arrayGeneros.get(i).getNomeGenero())) {
					contador = BDJogos.arrayGeneros.get(i).getQuantidadeGenero();
					contador++;
					BDJogos.arrayGeneros.get(i).setQuantidadeGenero(contador);
					break;
				}
			}
		}
		ExcluirGenero();
	}
	
	
	public void ExcluiPlataforma() {
		
		int contador;
		for (int i = 0; i < BDJogos.arrayPlataformas.size(); i++) {
			if (TelaCadastro.plataforma_auxiliar.equals(BDJogos.arrayPlataformas.get(i).getNomePlataforma())) {
				contador = BDJogos.arrayPlataformas.get(i).getQuantidadePlataforma();
				contador --;
				if (contador <= 0) {
					BDJogos.arrayPlataformas.remove(i);
				}else {
					BDJogos.arrayPlataformas.get(i).setQuantidadePlataforma(contador);
				}
				break;
			}
		}
//		TelaCadastro.tabela_plataforma.setModel(tabela_plataforma);
	}
	
	
	public void ExcluirGenero() {
		
		int contador;
		for (int i = 0; i < BDJogos.arrayGeneros.size(); i++) {
			if (TelaCadastro.genero_auxiliar.equals(BDJogos.arrayGeneros.get(i).getNomeGenero())) {
				contador = BDJogos.arrayGeneros.get(i).getQuantidadeGenero();
				contador --;
				if (contador <= 0) {
					BDJogos.arrayGeneros.remove(i);
				}else {
					BDJogos.arrayGeneros.get(i).setQuantidadeGenero(contador);
				}
				break;
			}
		}
//		TelaCadastro.tabela_genero.setModel(tabela_genero);
	}
	
	public void Cadastro_jogo(Jogo jogo, Plataforma plataforma, Genero genero) {
		
			if (ExisteCadastro(jogo) == false) {
				int contador;
				
				BDJogos.arrayJogos.add(jogo);
				
//				tabela_plataforma = (DefaultTableModel) TelaCadastro.tabela_plataforma.getModel();
//				tabela_genero = (DefaultTableModel) TelaCadastro.tabela_genero.getModel();

				
				if (ExistePlataforma(jogo.getPlataforma_jogo()) == false) {
					BDJogos.arrayPlataformas.add(plataforma);
				}else {
					for (int i = 0; i < BDJogos.arrayJogos.size(); i++) {
						if (jogo.getPlataforma_jogo().equals(BDJogos.arrayJogos.get(i).getPlataforma_jogo())) {
							for (int j = 0; j < BDJogos.arrayPlataformas.size(); j++) {
								if (BDJogos.arrayPlataformas.get(j).getNomePlataforma().equals(jogo.getPlataforma_jogo())) {
									contador = BDJogos.arrayPlataformas.get(j).getQuantidadePlataforma();
									contador++;
									BDJogos.arrayPlataformas.get(j).setQuantidadePlataforma(contador);
									break;
								}
							}
							break;
						}
					}
				}
				
				
				if (ExisteGenero(jogo.getGenero_jogo()) == false) {
					BDJogos.arrayGeneros.add(genero);
				}else {
					for (int i = 0; i < BDJogos.arrayGeneros.size(); i++) {
						if (jogo.getGenero_jogo().equals(BDJogos.arrayJogos.get(i).getGenero_jogo())) {
							for (int j = 0; j < tabela_genero.getRowCount(); j++) {
								if (tabela_genero.getValueAt(j, 0).equals(genero)) {
									contador = Integer.parseInt((tabela_genero.getValueAt(j, 1).toString()));
									contador++;
									tabela_genero.setValueAt(contador , j, 1);
									break;
								}
							}
							break;
						}
					}
				}
				
				
			}else {
				JOptionPane.showMessageDialog(null, "J� existe o jogo nesta plataforma!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
		
	}
	
	public void Alterar_jogo(int linha, String nome, String genero, String plataforma, int classificacao, double valor) {
		
		if (TelaCadastro.nome_auxiliar.equals(nome) && TelaCadastro.plataforma_auxiliar.equals(plataforma)) {
					tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
					tabela_jogos.setValueAt(nome, linha, 0);
					tabela_jogos.setValueAt(genero, linha, 1);
					tabela_jogos.setValueAt(plataforma, linha, 2);
					tabela_jogos.setValueAt(classificacao, linha, 3);
					tabela_jogos.setValueAt(valor, linha, 4);
					TelaCadastro.tabela_jogos.setModel(tabela_jogos);
					
					AtualizaPlataforma(plataforma);
					AtualizaGenero(genero);
					
			}else if (ExisteCadastro(nome, plataforma) == false) {
				tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
				tabela_jogos.setValueAt(nome, linha, 0);
				tabela_jogos.setValueAt(genero, linha, 1);
				tabela_jogos.setValueAt(plataforma, linha, 2);
				tabela_jogos.setValueAt(classificacao, linha, 3);
				tabela_jogos.setValueAt(valor, linha, 4);
				TelaCadastro.tabela_jogos.setModel(tabela_jogos);
				
				AtualizaPlataforma(plataforma);
				AtualizaGenero(genero);
			}else {
				JOptionPane.showMessageDialog(null, "J� existe o jogo nesta plataforma!", "ERRO!", JOptionPane.ERROR_MESSAGE);
			}
	}
	
	public void Excluir_jogo(int linha, String genero, String plataforma) {
		
		tabela_jogos = (DefaultTableModel) TelaCadastro.tabela_jogos.getModel();
		tabela_jogos.removeRow(linha);
		TelaCadastro.tabela_jogos.setModel(tabela_jogos);
		ExcluiPlataforma();
		ExcluirGenero();
		
	}
}
