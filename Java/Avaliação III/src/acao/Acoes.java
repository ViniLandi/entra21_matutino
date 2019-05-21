package acao;

import javax.swing.table.DefaultTableModel;

import beans.Colaborador;
import dados.BDColaborador;

public class Acoes {

	public void CadastrarColaborador(Colaborador c) {
		BDColaborador.arrayColaborador.add(c);
	}
	
	public DefaultTableModel selecionar() {

		DefaultTableModel modelo = new DefaultTableModel();
		modelo.addColumn("Colaborador");
		modelo.addColumn("Salário Liquido");

		for (int i = 0; i < BDColaborador.arrayColaborador.size(); i++) {
			modelo.addRow(new Object[] { BDColaborador.arrayColaborador.get(i).getNomeColaborador(), BDColaborador.arrayColaborador.get(i).getSalarioLiquido() });

		}
		return modelo;
	}
}
