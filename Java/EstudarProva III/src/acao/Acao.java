package acao;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import beans.Usuario;
import dados.Dados;
import formulario.Formulario;

public class Acao {

	public static boolean ExisteUsuario(String nomeUsuario) {
		boolean existe = false;
		for (int i = 0; i < Dados.arrayUsuario.size(); i++) {
			if (nomeUsuario.equals(Dados.arrayUsuario.get(i).getNome())) {
				existe = true;
				break;
			}
		}
		return existe;
	}

	
	public static void CadastrarUsuario(Usuario usuario) {
		if (ExisteUsuario(usuario.getNome()) == false) {
			Dados.arrayUsuario.add(usuario);	

			if (usuario.getIMC() >= 40) {
				Dados.IMC[6]++;
//				Obesidade III (m�rbida)
			}else if (usuario.getIMC() >= 35) {
				Dados.IMC[5]++;
//				Obesidade II (severa)
			}else if (usuario.getIMC() >= 30) {
				Dados.IMC[4]++;
//				Obesidade I
			}else if (usuario.getIMC() >= 25) {
				Dados.IMC[3]++;
//				Acima do peso
			}else if (usuario.getIMC() >= 18.5) {
				Dados.IMC[2]++;
//				Peso normal
			}else if (usuario.getIMC() >= 17) {
				Dados.IMC[1]++;
//				Abaixo do peso
			}else if (usuario.getIMC() < 17) {
				Dados.IMC[0]++;
//				Muito abaixo do peso
			}
		}else {
			JOptionPane.showMessageDialog(null, "Usu�rio j� cadastrado!");
		}
	}
	
	public static void AlterarUsuario(int indice, Usuario usuario) {
		Dados.arrayUsuario.set(indice, usuario);
		
//		if (Formulario.IMC_auxiliar >= 40) {
//			Dados.IMC[6]++;
////			Obesidade III (m�rbida)
//		}else if (IMC_auxiliar >= 35) {
//			Dados.IMC[5]++;
////			Obesidade II (severa)
//		}else if (IMC_auxiliar >= 30) {
//			Dados.IMC[4]++;
////			Obesidade I
//		}else if (IMC_auxiliar >= 25) {
//			Dados.IMC[3]++;
////			Acima do peso
//		}else if (IMC_auxiliar >= 18.5) {
//			Dados.IMC[2]++;
////			Peso normal
//		}else if (IMC_auxiliar >= 17) {
//			Dados.IMC[1]++;
////			Abaixo do peso
//		}else if (IMC_auxiliar < 17) {
//			Dados.IMC[0]++;
////			Muito abaixo do peso
//		}
	}
	
	public static DefaultTableModel RetornaTabelaUsuario() {
		DefaultTableModel tabela_usuario = new DefaultTableModel();
		tabela_usuario.addColumn("Nome");
		tabela_usuario.addColumn("Idade");
		tabela_usuario.addColumn("Altura");
		tabela_usuario.addColumn("Peso");
		tabela_usuario.addColumn("IMC");
		
		for (int i = 0; i < Dados.arrayUsuario.size(); i++) {
			tabela_usuario.addRow(new Object[] {
					Dados.arrayUsuario.get(i).getNome(),
					Dados.arrayUsuario.get(i).getIdade(),
					Dados.arrayUsuario.get(i).getAltura(),
					Dados.arrayUsuario.get(i).getPeso(),
					Dados.arrayUsuario.get(i).getIMC()
			});
		}
		
		return tabela_usuario;
	}
	
	public static DefaultTableModel RetornaTabelaIMC() {
		DefaultTableModel tabela_IMC = new DefaultTableModel();
		tabela_IMC.addColumn("Identifica��o Peso");
		tabela_IMC.addRow(new Object[] {"Muito abaixo do peso"});
		tabela_IMC.addRow(new Object[] {"Abaixo do peso"});
		tabela_IMC.addRow(new Object[] {"Peso normal"});
		tabela_IMC.addRow(new Object[] {"Acima do peso"});
		tabela_IMC.addRow(new Object[] {"Obesidade I"});
		tabela_IMC.addRow(new Object[] {"Obesidade II (severa)"});
		tabela_IMC.addRow(new Object[] {"Obesidade III (m�rbida)"});
		tabela_IMC.addColumn("Quantidade");
		
		for (int i = 0; i < Dados.IMC.length; i++) {
			tabela_IMC.setValueAt(Dados.IMC[i], i, 1);
		}
		
		return tabela_IMC;
	}
}
