package exercicios;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Principal {

	public static void main(String[] args) {

//		Exercicio 10
		
//		DecimalFormat df = new DecimalFormat("#.00");
//		double poupanca = Double.parseDouble(JOptionPane.showInputDialog("Informe a poupança:"));
//		int meses = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de meses:"));
//		String mes = "", resultado = "";
//		double total = poupanca, totalant = 0, ganho = 0;
//		if (meses <= 24 && meses >=1) {
//		for (int i = 1; i <= meses; i++) {
//			totalant = total;
//			total += totalant*0.0037;
//			ganho = totalant*0.0037;
//			if(i == 1) {mes = "Maio - 2019";}
//			if(i == 2) {mes = "Junho - 2019";}
//			if(i == 3) {mes = "Julho - 2019";}
//			if(i == 4) {mes = "Agosto - 2019";}
//			if(i == 5) {mes = "Setembro - 2019";}
//			if(i == 6) {mes = "Outubro - 2019";}
//			if(i == 7) {mes = "Novembro - 2019";}
//			if(i == 8) {mes = "Dezembro - 2019";}
//			
//			if(i == 9) {mes = "Janeiro - 2020";}
//			if(i == 10) {mes = "Fevereiro - 2020";}
//			if(i == 11) {mes = "Março - 2020";}
//			if(i == 12) {mes = "Abril - 2020";}
//			if(i == 13) {mes = "Maio - 2020";}
//			if(i == 14) {mes = "Junho - 2020";}
//			if(i == 15) {mes = "Julho - 2020";}
//			if(i == 16) {mes = "Agosto - 2020";}
//			if(i == 17) {mes = "Setembro - 2020";}
//			if(i == 18) {mes = "Outubro - 2020";}
//			if(i == 19) {mes = "Novembro - 2020";}
//			if(i == 20) {mes = "Dezembro - 2020";}
//			
//			if(i == 21) {mes = "Janeiro - 2021";}
//			if(i == 22) {mes = "Fevereiro - 2021";}
//			if(i == 23) {mes = "Março - 2021";}
//			if(i == 24) {mes = "Abril - 2021";}
//			resultado += mes+" | "+df.format(totalant*0.0037)+" | "+df.format(total)+"\n";
//		}
//				
//		}else {
//			JOptionPane.showMessageDialog(null, "Digite um valor maior que 0 e menor que 24!");
//		}
//		JOptionPane.showMessageDialog(null, resultado);
		
		
		
		
//		Exercicio 11
		
//		Declarações de variaveis
//		int dj = 0, dp = 0, ds = 0, abd = 0, aj = 0, ap = 0, as = 0, arquiteto = 0, gp = 0;
//		Object[] listarsexo = {"Masculino","Feminino"};
//		Object[] listarclube = {"Sim","Não"};
//		int funcionarios = 0, quantmasc = 0, quantfem = 0;
//		int idade50 = 0, idade41_50 = 0, idade27_40 = 0, idade18_26 = 0, clubetotal = 0, clube = 0, horas = 0, horas50 = 0, horas100 = 0;
//		boolean concluir = false;
//		double salarioant = 0, maiorsalario = 0, salariohora = 0;
//		double salario = 0, valetransporte = 0, inss = 0;
//		String nomesalario = "";
//		String nome = "";
//		int sexo = 0, idade = 0, faltas = 0, filhos = 0, cargo = 0;
//		DecimalFormat df = new DecimalFormat("#.00");
		
		
//		Enquanto o usuario não encerrar o cadastro, o loop continua
//		while (concluir == false) {
			
//			Entrada de dados do usuario
//			nome = JOptionPane.showInputDialog("Digite seu nome:");
//			sexo = JOptionPane.showOptionDialog(null, "Informe seu sexo:", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsexo, null);
//			idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
//			faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe sua quantidade de faltas:"));
//			filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe sua quantidade de filhos:"));
//			cargo = Integer.parseInt(JOptionPane.showInputDialog("" 
//					+ "1) Desenvolvedor Java Júnior"
//					+ "\n2) Desenvolvedor Java Pleno" 
//					+ "\n3) Desenvolvedor Java Sênior"
//					+ "\n4) Administrador de Banco de Dados" 
//					+ "\n5) Analista Júnior" 
//					+ "\n6) Analista Pleno"
//					+ "\n7) Analista Sênior" 
//					+ "\n8) Arquiteto de Software" 
//					+ "\n9) Gerente de Projetos"));
//			clube = JOptionPane.showOptionDialog(null, "É associado ao clube fidelidade?", null,
//					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarclube, null);
//			salariohora = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário por hora:"));
//			horas = Integer
//					.parseInt(JOptionPane.showInputDialog("Informe quantidade de horas trabalhadas normalmente:"));
//			horas50 = Integer
//					.parseInt(JOptionPane.showInputDialog("Informe quantidade de horas extras trabalhadas 50%:"));
//			horas100 = Integer
//					.parseInt(JOptionPane.showInputDialog("Informe quantidade de horas extras trabalhadas 100%:"));

			
//			Filtro e incrementação de dados
//			if (sexo == 0) {
//				quantmasc++;
//			}else {
//				quantfem++;
//			}
//			
//			
//			if (idade > 50) {
//				idade50++;
//			}else if (idade >= 41) {
//				idade41_50++;
//			}else if (idade >= 27) {
//				idade27_40++;
//			}else if (idade >= 18) {
//				idade18_26++;
//			}
//			
//			
//			if(cargo == 1) {dj++;}
//			if(cargo == 2) {dp++;}
//			if(cargo == 3) {ds++;}
//			if(cargo == 4) {abd++;}
//			if(cargo == 5) {aj++;}
//			if(cargo == 6) {ap++;}
//			if(cargo == 7) {as++;}
//			if(cargo == 8) {arquiteto++;}
//			if(cargo == 9) {gp++;}
			
			
			
//			Cálculos
//			salario = (salariohora * horas) + (salariohora * (horas50 * 1.5)) + (salariohora * (horas100 * 2));
//			
//			valetransporte = salario * 0.06;
//			
//			
//			if (salario > 5600) {
//				inss = salario * 0.1;
//			} else if (salario >= 3500) {
//				inss = salario * 0.08;
//			} else if (salario > 2000) {
//				inss = salario * 0.07;
//			} else {
//				inss = salario * 0.05;
//			}
//		
//			
//			
//			if (clube == 0) {salario -= 110; clubetotal++;}
//			if (faltas == 0) {salario += 200;}
//			if (filhos > 0) {salario += (filhos * 50);} 
//			funcionarios++;
//
//			
//			salario -= valetransporte;
//			salario -= inss;
			
			
//			Maior salário
//			if (salario >= salarioant) {
//				if (funcionarios == 1) {
//					nomesalario = nome;
//				}else if(salario == salarioant){
//					nomesalario += ", "+nome;
//				}
//				maiorsalario = salario;
//			}
			
			
//			Confirmar se usuário deseja continuar
//			JOptionPane.showMessageDialog(null, nome+", seu salário liquido é: R$"+df.format(salario));
//			if(JOptionPane.showOptionDialog(null, "Deseja continuar?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarclube, null) == 1) {
//				concluir = true;
//			}
//		}
		
		
//		Verifica se algo foi cadastrado, se sim entra em um JOptionPane mostrando o resultado dos cadastros
//		if (funcionarios > 0) {
//			JOptionPane.showMessageDialog(null, ""
//					+ "Números de usúarios cadastrados: "+funcionarios+""
//					+ "\nQuantidade de homens: "+quantmasc+" , "+(quantmasc*100)/funcionarios+"%"
//					+ "\nQuantidade de mulheres: "+quantfem+" , "+(quantfem*100)/funcionarios+"%"
//					+ "\nNúmero de funcionarios com idade entre 18 e 26 anos: "+idade18_26
//					+ "\nNúmero de funcionarios com idade entre 27 e 40 anos: "+idade27_40
//					+ "\nNúmero de funcionarios com idade entre 41 e 50 anos: "+idade41_50
//					+ "\nNúmero de funcionarios acima de 50 anos: "+idade50+""
//							+ "\n"
//					+ "\nQuantidade de Desenvolvedor Java Júnior: "+dj+" - "+(dj*100)/funcionarios+"%"
//					+ "\nQuantidade de Desenvolvedor Java Pleno: "+dp+" - "+(dp*100)/funcionarios+"%"
//					+ "\nQuantidade de Desenvolvedor Java Sênior: "+ds+" - "+(ds*100)/funcionarios+"%"
//					+ "\nQuantidade de Administrador de Banco de Dados: "+abd+" - "+(abd*100)/funcionarios+"%"
//					+ "\nQuantidade de Analista Júnior: "+aj+" - "+(aj*100)/funcionarios+"%"
//					+ "\nQuantidade de Analista Pleno: "+ap+" - "+(ap*100)/funcionarios+"%"
//					+ "\nQuantidade de Analista Sênior: "+as+" - "+(as*100)/funcionarios+"%"
//					+ "\nQuantidade de Arquiteto de Software: "+arquiteto+" - "+(arquiteto*100)/funcionarios+"%"
//					+ "\nQuantidade de Gerente de Projetos: "+gp+" - "+(gp*100)/funcionarios+"%"+""
//							+ "\n"
//					+ "\nNome do funcionário com maior salário: "+nomesalario+" - R$"+df.format(maiorsalario)+""
//							+ "\n"
//					+ "\nQuantidade funcionários com clube fidelidade: "+clubetotal+" - "+(clubetotal*100)/funcionarios+"%");
//		}
		
		
		
		}

}
