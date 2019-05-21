package exercicios;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Exercicio 1
//		Object[] listarsexo = {"Masculino","Feminino"};
//		Object[] listarcargo = {"gerente","atendente","acougueiro","secretaria","almoxarife","padeiro","estagiario"};
//		boolean concluir = false;
// 		int validar = 0;
//		String nome;
//		int idade;
//		int sexo;
//		int cargo;
//		int quantmasc = 0;
//		int quantfem = 0;
//		int gerente = 0;
//		int atendente = 0;
//		int acougueiro = 0;
//		int secretaria = 0;
//		int almoxarife = 0;
//		int padeiro = 0;
//		int estagiario = 0;
//		int maior18 = 0;
//		int menor18 = 0;
//		do {
//		nome = JOptionPane.showInputDialog("Informe seu nome:");
//		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
//		if(idade >= 18)maior18++;
//		else menor18++;
//		sexo = JOptionPane.showOptionDialog(null, "Informe o sexo", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsexo, null);
//		if (sexo == 0) quantmasc++;
//		else quantfem++;
//		cargo = JOptionPane.showOptionDialog(null, "Informe o cargo", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarcargo, null);
//		if (cargo == 0) gerente++;
//		if (cargo == 1) atendente++;
//		if (cargo == 2) acougueiro++;
//		if (cargo == 3) secretaria++;
//		if (cargo == 4) almoxarife++;
//		if (cargo == 5) padeiro++;
//		if (cargo == 6) estagiario++;
//		validar = JOptionPane.showConfirmDialog(null, "Deseja concluir o cadastro?");
//		if (validar == 0) {
//			concluir = true;
//		}
//		}while(concluir == false);
//		
//			JOptionPane.showMessageDialog(null, "Quantidade de homens: "+quantmasc+
//					"\nQuantidade de mulheres: "+quantfem+
//					"\n"+
//					"\nQuantidade de gerentes: "+gerente+
//					"\nQuantidade de atendente: "+atendente+
//					"\nQuantidade de acougueiro: "+acougueiro+
//					"\nQuantidade de secretaria: "+secretaria+
//					"\nQuantidade de almoxarife: "+almoxarife+
//					"\nQuantidade de padeiro: "+padeiro+
//					"\nQuantidade de estagiario: "+estagiario+
//					"\n"+
//					"\nQuantidade de pessoas maior que 18 anos: "+maior18+
//					"\nQuantidade de pessoas menor que 18 anos: "+menor18);
		
		
		
		
//		Exercicio 2
//		boolean concluir = false;
//		int c = 1;	
//		
//		String nome = "";
//		
//		double altura;
//		String nomealtura = "";
//		double alturaant = 0;
//		double maioraltura = 0;
//		double mediaaltura = 0;
//		
//		double peso;
//		String nomepeso = "";
//		double pesoant = 0;
//		double maiorpeso = 0;
//		
//		double idade;
//		String nomeidade = "";
//		double idadeant = 0;
//		double maioridade = 0;
//		
//		boolean alturaigual = false;
//		boolean pesoigual = false;
//		boolean idadeigual = false;
//		
//		while(!nome.equals("SAIR")){		
//		nome = JOptionPane.showInputDialog("Informe seu nome:");
//		if (!nome.equals("SAIR")) {
//			altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura:"));
//			if (altura >= alturaant) {
//				if (c == 1) {
//					nomealtura = nome;
//					mediaaltura += altura;
//				}else {
//					nomealtura += ", "+nome;
//					mediaaltura += altura;
//				}
//				maioraltura = altura;
//			}
//			
//			peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso:"));
//			if (peso > pesoant) {
//				if (c == 1) {
//					nomepeso = nome;
//				}else {
//					nomepeso += ", "+nome;
//				}
//				maiorpeso = peso;
//			}
//			
//			
//			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
//			if (idade > idadeant) {
//				if (c == 1) {
//					nomeidade = nome;
//				}else {
//					nomeidade += ", "+nome;
//				}
//				maioridade = idade;
//			}
//			c++;
//		}	
//		}
//		if (!nome.equals("SAIR")) {
//			JOptionPane.showMessageDialog(null, "Quantidade de jogadores cadastrados: "+c+
//					"\n"
//					+"\nNome(s) e altura do jogador mais alto: "+nomealtura+", "+maioraltura
//					+"\nNome(s) e peso do jogador mais pesado: "+nomepeso+", "+maiorpeso
//					+"\nNome(s) e idade do jogador mais velho: "+nomeidade+", "+maioridade
//					+"\nMédia de altura dos jogadores: "+mediaaltura/c);
//		}
		
	
		
		
//		Exercicio 3
//		double pagar = 0,total = 0;
//		Object[] codigo = {"1","2","3","4","5","6","7","FECHAR"};
//		int pedido = 0;
//		boolean concluir = false;
//		int item1 = 0,item2 = 0,item3 = 0,item4 = 0,item5 = 0,item6 = 0,item7 = 0;
//		while (concluir == false) {
//			pedido = JOptionPane.showOptionDialog(null,
//							"Escolha o código do pedido:" 
//							+ "\n1 - Hambúrguer + Suco de Laranja - R$ 5,00 - "+item1+" pedidos"
//							+ "\n2 - Sanduíche natural + Suco de Uva - R$ 4,50 - "+item2+" pedidos"
//							+ "\n3 - Prato do dia - R$ 8,00 - "+item3+" pedidos"
//							+ "\n4 - Pizza - R$ 12,00 - "+item4+" pedidos"
//							+ "\n5 - Lasanha - R$ 16,50 - "+item5+" pedidos"
//							+ "\n6 - Pão de queijo - R$ 1,00 - "+item6+" pedidos"
//							+ "\n7 - Bolo - R$ 2,50 - "+item7+" pedidos"
//							+ "\n"
//							+ "\nTotal: R$ "+total,
//							"Padaria", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, codigo, null);
//			
//			
//			if(pedido == 0) {item1 += 1;total+=5;}
//			if(pedido == 1) {item2 += 1;total+=4.5;}
//			if(pedido == 2) {item3 += 1;total+=8;}
//			if(pedido == 3) {item4 += 1;total+=12;}
//			if(pedido == 4) {item5 += 1;total+=16.5;}
//			if(pedido == 5) {item6 += 1;total+=1;}
//			if(pedido == 6) {item7 += 1;total+=2.5;}
//			if(pedido == 7) {concluir = true;}
//		}
//			while(pagar < total && total != 0) {
//			pagar = Integer.parseInt(JOptionPane.showInputDialog(
//					"Total a pagar: R$"+total
//					+"\nInsira o valor pago pelo cliente: "));
//			if(pagar < total) {JOptionPane.showMessageDialog(null, 
//					"Dinheiro pago pelo não cliente não suficiente!"
//					+"\nTotal a pagar: R$"+total
//					+"\nValor pago pelo cliente: R$"+pagar);};
//			}
//			
//			if (pagar >= total && total != 0) {
//				JOptionPane.showMessageDialog(null, "Valor total do pedido: R$" + total
//						+ "\nValor pago pelo cliente: R$" + pagar + "\nTroco: R$" + (pagar - total));
//			}
		
		
		
		
//		Exercicio 4
//		Object[] listarvoto = {"Excelente","Ótimo","Bom","Regular","Ruim"," FECHAR "};
//		boolean concluir = false;
//		int excelente = 0,otimo = 0,bom = 0,regular = 0,ruim = 0, total = 0;
//		int crianca = 0, adolescente = 0, adulto = 0;
//		int idade = 0, voto = 0;
//		while(concluir == false) {
//		voto = JOptionPane.showOptionDialog(null, "Qual sua opinião sobre o filme?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarvoto, null);
//		
//
//		if(voto == 0) {excelente ++;total++;}
//		if(voto == 1) {otimo ++;total++;}
//		if(voto == 2) {bom ++;total++;}
//		if(voto == 3) {regular ++;total++;}
//		if(voto == 4) {ruim ++;total++;}
//		
//		if(voto == 5 || (voto!=0 && voto!=1 && voto!=2 && voto!=3 && voto!=4)) {
//			concluir = true;
//			}else {
//		
//		
//		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
//		
//		if(idade > 0 && idade <= 100) {
//			
//		
//			
//		if(idade > 17) {adulto ++;}
//		if(idade >= 10 && idade <= 17) {adolescente ++;}
//		if(idade < 10) {crianca ++;}
//		
//		
//		
//		}else {
//			JOptionPane.showMessageDialog(null, "Insira uma idade entre 0 até 100 anos");
//		}
//			}
//		}
//		if (total > 0) {
//		JOptionPane.showMessageDialog(null, 
//				"Total de "+total+" votos"
//				+"\n"+crianca+" Crianças"
//				+"\n"+adolescente+" Adolescentes"
//				+"\n"+adulto+" Adultos"
//				+"\n"
//				+"\n% de voto em excelente: "+(excelente*100)/total+"%"
//				+"\n% de voto em otimo: "+(otimo*100)/total+"%"
//				+"\n% de voto em bom: "+(bom*100)/total+"%"
//				+"\n% de voto em regular: "+(regular*100)/total+"%"
//				+"\n% de voto em ruim: "+(ruim*100)/total+"%");
//		}
		
		
		
		
//		Exercicio 5
//		String produto = JOptionPane.showInputDialog("Informe o nome do produto:");
//		double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto:"));
//		String resultado = "";
//		for (int i = 1; i <= 10; i++) {
//			resultado += i+" x R$"+(valor - (valor*(i*5))/100)+" = R$"+(valor - (valor*(i*5))/100)*i+"\n";
//		}
//		JOptionPane.showMessageDialog(null, "Nome do produto: "+produto
//				+"\n"+resultado);
		
		
		
//		Exercicio 6
//		String nome = "";
//		Object[] listarsexo = {"Masculino","Feminino"};
//		int sexo = 0, quantmasc = 0, quantfem = 0,total = 0;
//		double nota1, nota2, nota3, nota4, resultado;
//		int parabens = 0, otimo = 0, bom = 0, satisfatorio = 0, recuperacao = 0, reprovado = 0, totalnotas = 0;
//		
//		while (!nome.equals("SAIR") || !nome.equals("sair")) {
//			nome = JOptionPane.showInputDialog("Informe seu nome: \nDigite \"SAIR\" para fechar");
//			if(!nome.equals("SAIR") || !nome.equals("sair")) {
//			sexo = JOptionPane.showOptionDialog(null, "Informe o sexo", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsexo, null);
//			if(sexo == 0) {quantmasc++;total++;}
//			if(sexo == 1) {quantfem++;total++;}
//			nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1ª nota"));
//			nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2ª nota"));
//			nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3ª nota"));
//			nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4ª nota"));
//			resultado = (nota1+nota2+nota3+nota4)/4;		
//			if (resultado >= 10) {
//				JOptionPane.showMessageDialog(null, "Aprovado, parabéns! Sua nota é: "+resultado);
//				parabens++;
//				totalnotas++;
//			}else if (resultado >= 9) {
//				JOptionPane.showMessageDialog(null, "Aprovado, ótimo! Sua nota é: "+resultado);
//				otimo++;
//				totalnotas++;
//			}else if (resultado >= 8) {
//				JOptionPane.showMessageDialog(null, "Aprovado, bom! Sua nota é: "+resultado);
//				bom++;
//				totalnotas++;
//			}else if (resultado >= 7) {
//				JOptionPane.showMessageDialog(null, "Aprovado, satisfatório! Sua nota é: "+resultado);
//				satisfatorio++;
//				totalnotas++;
//			}else if (resultado >= 5) {
//				JOptionPane.showMessageDialog(null, "Em recuperação! Sua nota é: "+resultado);
//				recuperacao++;
//				totalnotas++;
//			}else if (resultado < 5) {
//				JOptionPane.showMessageDialog(null, "Reprovado! Sua nota é: "+resultado);
//				reprovado++;
//				totalnotas++;
//			}
//		}
//		}
//		if (total != 0 && totalnotas != 0) {
//			JOptionPane.showMessageDialog(null, 
//					"Quantidade de homens: "+quantmasc+", porcentagem de homens: " + (quantmasc * 100) / total+"%"
//					+ "\nQuantidade de mulheres: "+quantfem+", porcentagem de mulheres " + (quantfem * 100) / total+"%" 
//					+ "\n"
//					+ "\nQuantidade: "+parabens+", porcentagem de alunos que tiraram 10 (Parabéns): " + (parabens * 100) / totalnotas+"%"
//					+ "\nQuantidade: "+otimo+", porcentagem de alunos que tiraram entre 9 e 9.9 (Ótimo): " + (otimo * 100) / totalnotas+"%"
//					+ "\nQuantidade: "+bom+", porcentagem de alunos que tiraram entre 8 e 8.9 (Bom): " + (bom * 100) / totalnotas+"%"
//					+ "\nQuantidade: "+satisfatorio+", porcentagem de alunos que tiraram entre 7 e 7.9 (Satisfatório): " + (satisfatorio * 100) / totalnotas+"%"
//					+ "\nQuantidade: "+recuperacao+", porcentagem de alunos que tiraram entre 5 e 6.9 (Recuperação): " + (recuperacao * 100) / totalnotas+"%"
//					+ "\nQuantidade: "+reprovado+", porcentagem de alunos que tiraram menos que 5 (Reprovado): " + (reprovado * 100) / totalnotas+"%");
//		}
		
		
		
//		Exercicio 7
//		String l = "";
//		String espaco1 = "_ ";
//		String espaco2 = "_ ";
//		String espaco3 = "_ ";
//		String espaco4 = "_ ";
//		String espaco5 = "_ ";
//		String espaco6 = "_ ";
//		String espaco7 = "_";
//		String letrastent = "";
//		int tentativas = 6;
//		int palavra = 0;
//		boolean letrafoi = false;
//		while (tentativas > 0 && (!espaco1.equals("E ") || !espaco2.equals("S ") || !espaco3.equals("T ") || !espaco4.equals("U ") || !espaco5.equals("D ") || !espaco6.equals("A ") || !espaco7.equals("R"))) {
//			l = JOptionPane.showInputDialog("Jogo da forca - Digite alguma letra:"
//					+"\n"+espaco1+espaco2+espaco3+espaco4+espaco5+espaco6+espaco7
//					+"\n"
//					+"\nRestam ainda "+tentativas+" tentativas"
//					+"\nLetras tentadas : "+letrastent).toUpperCase();
//			if (!letrastent.equals("")) {
//				for (int i = 0; i < letrastent.length(); i++) {
//					if (l.equals(letrastent.substring(i,(i+1)))) {
//						JOptionPane.showMessageDialog(null, "Letra já tentada!");
//						letrafoi = true;
//						break;
//					}else {
//						letrafoi = false;
//					}
//				}
//			}
//			if (l.equals("E")){
//					if (espaco1.equals("_ ")) {
//					espaco1 = "E ";
//					letrastent += l;
//					palavra++;
//					}
//			}else if (l.equals("S")) { 
//				if (espaco2.equals("_ ")) {
//				espaco2 = "S ";
//				letrastent += l;
//				palavra++;
//				}
//			}else if (l.equals("T")) { 
//				if (espaco3.equals("_ ")) {
//				espaco3 = "T ";
//				letrastent += l;
//				palavra++;
//					}
//			}else if (l.equals("U")) {
//				if(espaco4.equals("_ ")) {
//				espaco4 = "U ";
//				letrastent += l;
//				palavra++;
//				}
//			}else if (l.equals("D")) {
//				if(espaco5.equals("_ ")) {
//				espaco5 = "D ";
//				letrastent += l;
//				palavra++;
//			}
//			}else if (l.equals("A")) { 
//				if(espaco6.equals("_ ")) {
//				espaco6 = "A ";
//				letrastent += l;
//				palavra++;
//			}
//			}else if (l.equals("R")) { 
//				if(espaco7.equals("_")) {
//				espaco7 = "R";
//				letrastent += l;
//				palavra++;
//				}
//			}else if (l.equals(" ") || l.equals("")) {
//				JOptionPane.showMessageDialog(null, "Digite alguma coisa!");
//			}else{
//				if(letrafoi == false) {
//					letrastent += l;
//				}
//				tentativas--;
//				
//				
//			}
//		}
//		if (tentativas == 0) {
//			JOptionPane.showMessageDialog(null, "Você fracassou!");
//		}else if(palavra == 7){
//			JOptionPane.showMessageDialog(null, "Você ganhou!");
//		}
		
		
		
		
//		Exercicio 8
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
//		int numeroant = 0;
//		for (int i = (numero-1); i > 0; i--) {
//			if(i == (numero-1)) {
//				numeroant = numero*i;
//				JOptionPane.showMessageDialog(null, numero+" x "+i+" = "+numeroant);
//			}else {
//				int calc = numeroant;
//				numeroant = numeroant*i;
//				JOptionPane.showMessageDialog(null, calc+" x "+i+" = "+numeroant);
//			}	
//		}
		
		
		
		
		
//		Exercicio 9
//		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número:"));
//		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número:"));
//		String c = "";
//		int quantpar = 0, quantimpar = 0;
//		if (numero1 < numero2) {
//			for (int i = numero1; i <= numero2; i++) {
//				if((i%2)==0) {quantpar++;}
//				else {quantimpar++;}
//				c += i+" ";
//			}
//			JOptionPane.showMessageDialog(null, c+"\nQuantidade de números pares: "+quantpar+"\nQuantidade de números ímpares: "+quantimpar);
//		}else if(numero1 > numero2) {
//			for (int i = numero2; i <= numero1; i++) {
//				if((i%2)==0) {quantpar++;}
//				else {quantimpar++;}
//				c += i+" ";
//			}
//			JOptionPane.showMessageDialog(null, c+"\nQuantidade de números pares: "+quantpar+"\nQuantidade de números ímpares: "+quantimpar);
//		}else {
//			JOptionPane.showMessageDialog(null, "Os números são iguais");
//		}
	}

}
