package exercicios;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
//		Exercicio 01
//		Object[] listaroperacoes = {"SOMAR","SUBTRAIR","MULTIPLICAR","DIVIDIR"};
//		int[] vetor1 = new int[10];
//		int[] vetor2 = new int[10];
//		String mostrar = "";
//		
//		for (int i = 0; i < 10; i++) {
//			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor do 1º vetor"));
//		}
//		for (int i = 0; i < 10; i++) {
//			vetor2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor do 2º vetor"));
//		}
//		int operacao = JOptionPane.showOptionDialog(null, "Seleciona a operação", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaroperacoes, null);
//		if (operacao == 0) {
//			for (int i = 0; i < 10; i++) {
//				mostrar += (vetor1[i]+" + "+vetor2[i]+" = "+(vetor1[i]+vetor2[i])+"\n");
//			}
//		}else if (operacao == 1) {
//			for (int i = 0; i < 10; i++) {
//				mostrar += (vetor1[i]+" - "+vetor2[i]+" = "+(vetor1[i]-vetor2[i])+"\n");
//			}
//		}else if (operacao == 2) {
//			for (int i = 0; i < 10; i++) {
//				mostrar += (vetor1[i]+" * "+vetor2[i]+" = "+(vetor1[i]*vetor2[i])+"\n");
//			}
//		}else if (operacao == 3) {
//			for (int i = 0; i < 10; i++) {
//				mostrar += (vetor1[i]+" / "+vetor2[i]+" = "+(vetor1[i]/vetor2[i])+"\n");
//			}
//		}
//		JOptionPane.showMessageDialog(null, mostrar);
		
		
		
		
		
		
//		Exercicio 02
//		int[] vetor1 = new int[10];
//		for (int i = 0; i < 10; i++) {
//			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite algum valor"));
//		}
//		String mostrar = "";
//		for (int i = 9; i >= 0; i--) {
//			mostrar += vetor1[i]+"\n";
//		}
//		JOptionPane.showMessageDialog(null, mostrar);
		
		
		
		
		
		
		
//		Exercicio 03
//		int[] vetor1 = new int[5];
//		String mostrar = "";
//		boolean achou = false;
//		
//		for (int i = 0; i < 5; i++) {
//			vetor1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º valor"));
//		}
//		
//		int procurar = Integer.parseInt(JOptionPane.showInputDialog("Digite algum número para procurar"));
//		for (int i = 0; i < 5; i++) {
//			if (vetor1[i] == procurar) {
//				mostrar = "O número "+procurar+" está na posição: "+vetor1[i];
//				achou = true;
//			}
//		}
//		if (achou == true) {
//		JOptionPane.showMessageDialog(null, mostrar);
//		}else {
//			JOptionPane.showMessageDialog(null, "O número "+procurar+" não foi encontrado");
//		}
		
		
		
		
		
		
		
//		Exercicio 04
//		String[][] aluno = new String [10][12];
//		int contador = 0;
//		int contador_resposta = 0;
//		String maiorNome, maiorNota;
//		boolean concluir = false, concluir_resposta = false, cadastrou = false;
//		String[] resposta = new String [10];
//		
//		for (int i = 0; i < 10; i++) {
//			concluir = false;
//			while (concluir == false) {
//			resposta[i] = JOptionPane.showInputDialog("Informe a resposta da questao: "+(i+1)+"\nA, B, C, D:");
//			switch (resposta[i]) {
//			case "A":
//				concluir = true;
//				break;
//
//			case "B":
//				concluir = true;
//				break;
//				
//			case "C":
//				concluir = true;
//				break;
//				
//			case "D":
//				concluir = true;
//				break;
//				
//			default:
//				JOptionPane.showMessageDialog(null, "Digite alguma resposta da questão que seja válida");
//				break;
//			}
//			}
//		}
//		
//		concluir = false;
//		while (concluir == false) {
//			contador_resposta = 0;
//			aluno[contador][0] = JOptionPane.showInputDialog("Digite o nome do "+(contador+1)+"º aluno").toUpperCase();
//			if (!aluno[0][0].equals("SAIR")) {
//				cadastrou = true;
//			}
//			if (aluno[contador][0].equals("SAIR") || contador > 9) {
//				concluir = true;
//			}else {
//				for (int i = 1; i < 11; i++) {
//					concluir_resposta = false;
//					while (concluir_resposta == false) {
//						aluno[contador][i] = JOptionPane.showInputDialog("Informe a resposta do aluno "+aluno[contador][0]+" na questão: "+i);
//					switch (aluno[contador][i]) {
//					case "A":
//						concluir_resposta = true;
//						if (aluno[contador][i].equals(resposta[i-1])) {
//							contador_resposta++;
//							aluno[contador][11] = Integer.toString(contador_resposta);
//						}
//						break;
//		
//					case "B":
//						concluir_resposta = true;
//						if (aluno[contador][i].equals(resposta[i-1])) {
//							contador_resposta++;
//							aluno[contador][11] = Integer.toString(contador_resposta);
//						}
//						break;
//						
//					case "C":
//						concluir_resposta = true;
//						if (aluno[contador][i].equals(resposta[i-1])) {
//							contador_resposta++;
//							aluno[contador][11] = Integer.toString(contador_resposta);
//						}
//						break;
//						
//					case "D":
//						concluir_resposta = true;
//						if (aluno[contador][i].equals(resposta[i-1])) {
//							contador_resposta++;
//							aluno[contador][11] = Integer.toString(contador_resposta);
//						}
//						break;
//						
//					default:
//						JOptionPane.showMessageDialog(null, "Digite alguma resposta da questão que seja válida");
//						break;
//					}
//					}
//				}
//			}
//			if (cadastrou == true && !aluno[contador][0].equals("SAIR")) {
//					JOptionPane.showMessageDialog(null, "O aluno "+aluno[contador][0]+" acertou "+aluno[contador][11]+" questões");		
//					contador++;
//			}
//		}
//		
//		String mostrar = "";
//		
//		if (cadastrou == true) {
//			
//			for (int j = 0; j < contador-1; j++) {
//				for (int j2 = j+1; j2 < contador; j2++) {
//					if (Integer.parseInt(aluno[j2][11]) > Integer.parseInt(aluno[j][11])) {
//						maiorNome = aluno[j2][0];
//						aluno[j2][0] = aluno[j][0];
//						aluno[j][0] = maiorNome;
//						
//						maiorNota = aluno[j2][11];
//						aluno[j2][11] = aluno[j][11];
//						aluno[j][11] = maiorNota;
//					}
//				}
//			}
//			
//				for (int i = 0; i < contador; i++) {
//					mostrar += "Aluno: "+aluno[i][0]+", acertou: "+aluno[i][11]+" questões.\n";
//				}
//				JOptionPane.showMessageDialog(null, mostrar);			
//		}else {
//			JOptionPane.showMessageDialog(null, "Não foi cadastrado nenhum aluno!");
//		}

		
		
		
		
		
//		Exercicio 05
//		int[] numeros = new int [15];
//		int positivo = 0, neutro = 0, negativo = 0;
//		int par = 0, impar = 0;
//		int soma = 0, maiorQueMedia = 0;
//		double media = 0;
//		int maiorNumero = 0, menorNumero = 0;
//		
//		for (int i = 0; i < numeros.length; i++) {
//			numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
//			if (numeros[i] > 0) {
//				positivo++;
//			}else if (numeros[i] == 0) {
//				neutro++;
//			}else if (numeros[i] < 0) {
//				negativo++;
//			}
//			
//			if ((numeros[i]%2) == 0) {
//				par++;
//			}else {
//				impar++;
//			}
//		}
//		
//		for (int i = 0; i < numeros.length; i++) {
//			soma += numeros[i];
//			media = soma/numeros.length;
//		}
//		
//		for (int i = 0; i < numeros.length; i++) {
//			if (numeros[i] >= media) {
//				maiorQueMedia++;
//			}
//		}
//		
//		for (int i1 = 0; i1 < (numeros.length-1); i1++) {
//			for (int i2 = i1+1; i2 < numeros.length; i2++) {
//		
//				if (numeros[i2] > numeros[i1]) {
//					maiorNumero = numeros[i1];
//					numeros[i1] = numeros[i2];
//					numeros[i2] = maiorNumero;
//				}
//			}
//		}
//		maiorNumero = numeros[0];
//		menorNumero = numeros[14];
//		JOptionPane.showMessageDialog(null, 
//				"Soma dos números: "+soma+
//				"\nMedia dos números: "+media+
//				"\nQuantidade de números maiores ou iguais a média: "+maiorQueMedia+
//				"\nQuantidade de números negativos: "+negativo+
//				"\nQuantidade de números neutros: "+neutro+
//				"\nQuantidade de números positivos: "+positivo+
//				"\nMaior número: "+maiorNumero+
//				"\nMenor número: "+menorNumero+
//				"\nQuantidade de números pares: "+par+
//				"\nQuantidade de números ímpares: "+impar);
		
		
		
		
		
//		Exercicio 06
		Object[] listaropcoes = {"Cadastrar","Alterar","Excluir","Pesquisar","Sair"};
		boolean concluir = false, verifica_cadastro = false, verifica_nome = false;
		String cadastro[][]= new String[10][8];
		int contador = 0;
		String dados = "", nome = "";
		
		while (concluir == false) {
		int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Agenda", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaropcoes, null);
		
		switch (opcao) {
		
		case 0:
			verifica_cadastro = false;
			contador = 0;
			while (verifica_cadastro == false) {
				if (contador < 10) {
					if (cadastro[contador][0] == null) {
						
						verifica_nome = false;
						while (verifica_nome == false) {
						nome = JOptionPane.showInputDialog("Digite o nome:");
							for (int i = 0; i < 10; i++) {
									if (nome.equals(cadastro[i][0])) {
										JOptionPane.showMessageDialog(null, "Usuário já cadastrado digite outro!");
										break;
									}else {
										cadastro[contador][0] = nome;
										verifica_nome = true;
									}
							}
						}
						dados += "Nome: "+cadastro[contador][0]+"\n";
//						cadastro[contador][1] = JOptionPane.showInputDialog("Digite a data de nascimento do "+cadastro[contador][0]+":");
//						cadastro[contador][2] = JOptionPane.showInputDialog("Digite o estado do "+cadastro[contador][0]+":");
//						cadastro[contador][3] = JOptionPane.showInputDialog("Digite a cidade do "+cadastro[contador][0]+":");
//						cadastro[contador][4] = JOptionPane.showInputDialog("Digite o endereço do "+cadastro[contador][0]+":");
//						cadastro[contador][5] = JOptionPane.showInputDialog("Digite o telefone do "+cadastro[contador][0]+":");
//						cadastro[contador][6] = JOptionPane.showInputDialog("Digite o celular do "+cadastro[contador][0]+":");
//						cadastro[contador][7] = JOptionPane.showInputDialog("Digite o e-mail do "+cadastro[contador][0]+":");
						verifica_cadastro = true;
						
					}else {
						contador++;
					}
				}else {
					JOptionPane.showMessageDialog(null, "Número de cadastro máximo foi atingido!");
					verifica_cadastro = true;
				}	
			}
			break;

		case 1:
			JOptionPane.showMessageDialog(null, "*ALTERAR*\nUsuários cadastrados:"
					+ "\n"+dados);
			break;

		case 2:
			
			break;

		case 3:
			
			break;

		case 4:
			concluir = true;
			break;
		}
		
		
		}
	}
	
}