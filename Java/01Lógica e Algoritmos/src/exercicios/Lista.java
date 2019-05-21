package exercicios;

import java.util.Arrays;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Lista {
	public static void main(String[] args) {
		
		

//		Exercicio 1
//		String nome = JOptionPane.showInputDialog("Informe seu nome:");
//		String idade = JOptionPane.showInputDialog("Informe sua idade:");
//		String cidade = JOptionPane.showInputDialog("Informe a cidade onde você mora:");
//		JOptionPane.showMessageDialog(null, "Olá "+nome+", você tem "+idade+" anos de idade e mora em "+cidade+".");


		
		
		
		
//		Exercicio 2
//		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor pago no produto:"));
//		JOptionPane.showMessageDialog(null, valor*0.9);
		
		
		
		
		
//		Exercicio 3
//		double nota1, nota2, nota3, nota4;
//		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
//		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
//		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
//		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
//		double resultado=(nota1+nota2+nota3+nota4)/4;
//		if (resultado >=7) {
//			JOptionPane.showMessageDialog(null, "Aprovado");
//		}else if (resultado >= 5) {
//			JOptionPane.showMessageDialog(null, "Em exame");
//		}else {
//			JOptionPane.showMessageDialog(null, "Reprovado");
//		}
		
		
		
		
		
//		Exercicio 4
//		String produto = JOptionPane.showInputDialog("Digite o produto");
//		double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço"));
//		UIManager.put("OptionPane.cancelButtonText", "Cancelar"); 
//		UIManager.put("OptionPane.noButtonText", "Parcelado"); 
//		UIManager.put("OptionPane.yesButtonText", "À vista");
//		int forma_pagamento = JOptionPane.showConfirmDialog(null, "Escolha a forma de pagamento");
//		if (preco >= 500 && forma_pagamento == 0) {
//			preco = preco*0.9;
//		}
//		JOptionPane.showMessageDialog(null, "O produto "+produto+" custará "+preco+".");
		
		
		
		
//		Exercicio 5
//		int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia no mês de Fevereiro de 2018"));
//		if (dia < 1 || dia > 28) {
//			JOptionPane.showMessageDialog(null, "Digite um dia válido entre 1 e 28");
//		}else{
//			switch (dia) {
//			case 3:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 4:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 10:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 11:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 17:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 18:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//
//			case 24:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//				
//			case 25:
//				JOptionPane.showMessageDialog(null, "Final de semana");
//				break;
//
//			default:
//				JOptionPane.showMessageDialog(null, "Dia de semana");
//				break;
//			}
//		}
		
		
		
		
//		Exercicio 6
//		int resultado;
//		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
//		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
//		if (numero1 == numero2) {
//			resultado = (numero1+numero2);
//			JOptionPane.showMessageDialog(null, resultado);
//		}else {
//			resultado = (numero1*numero2);
//			JOptionPane.showMessageDialog(null, resultado);
//		}
		
		
		
		
//		Exercicio 7
//		String resultado = "";
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
//		for (int i = 0; i <= 10; i++) {
//				resultado += numero+" X "+i+" = "+(numero*i)+"\n";
//		}
//		JOptionPane.showMessageDialog(null, resultado);
		
		
		
		
//		Exercicio 8
//		double resposta;
//		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
//		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
//		String operacao = JOptionPane.showInputDialog("Escolha o número da opção"
//				+ "\n1 - SOMA"
//				+ "\n2 - SUBTRAÇÃO"
//				+ "\n3 - DIVISÃO"
//				+ "\n4 - MULTIPLICAÇÃO");
//		switch (operacao) {
//		case "1":
//			resposta = numero1+numero2;
//			JOptionPane.showMessageDialog(null, numero1+" + "+numero2+" = "+resposta);
//			break;
//
//		case "2":
//			resposta = numero1-numero2;
//			JOptionPane.showMessageDialog(null, numero1+" - "+numero2+" = "+resposta);
//			break;
//
//		case "3":
//			resposta = numero1/numero2;
//			JOptionPane.showMessageDialog(null, numero1+" / "+numero2+" = "+resposta);
//			break;
//			
//		case "4":
//			resposta = numero1*numero2;
//			JOptionPane.showMessageDialog(null, numero1+" X "+numero2+" = "+resposta);
//			break;
//			
//		default:
//			JOptionPane.showMessageDialog(null, "Digite uma opção válida");
//			break;
//		}
		
		
		
		
//		Exercicio 9
//		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
//		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
//		int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:"));
//		if (numero1 < numero2) {
//			if (numero1 < numero3) {
//				JOptionPane.showMessageDialog(null, "O primeiro número é o menor");
//			} else if(numero3 < numero1){
//				JOptionPane.showMessageDialog(null, "O terceiro número é o menor");
//			}
//		} else if (numero2 < numero1) {
//			if (numero2 < numero3) {
//				JOptionPane.showMessageDialog(null, "O segundo número é o menor");
//			}else if(numero3 < numero2){
//				JOptionPane.showMessageDialog(null, "O terceiro número é o menor");
//			}
//		}
//		if (numero1 == numero2 && numero1 == numero3) {JOptionPane.showMessageDialog(null, "Os números são iguais");
//		}else if (numero1 == numero2) {JOptionPane.showMessageDialog(null, "O primeiro e o segundo são iguais");
//		}else if (numero1 == numero3) {JOptionPane.showMessageDialog(null, "O primeiro e o terceiro são iguais");
//		}else if (numero2 == numero3) {JOptionPane.showMessageDialog(null, "O segundo e o terceiro são iguais");}
		
		
		
		
		
//		Exercicio 10
//		int cent1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 centavo"));
//		int cent5 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 5 centavos"));
//		int cent10 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 10 centavos"));
//		int cent25 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 25 centavos"));
//		int cent50 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 50 centavos"));
//		int real = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de moedas de 1 real"));
//		
//		double resultado = (cent1*0.01)+(cent5*0.05)+(cent10*0.10)+(cent25*0.25)+(cent50*0.50)+(real*1.0);
//		
//		JOptionPane.showMessageDialog(null, "Moedas de 1 centavo : "+cent1
//				+"\nMoedas de 5 centavos : "+cent5
//				+"\nMoedas de 10 centavos : "+cent10
//				+"\nMoedas de 25 centavos : "+cent25
//				+"\nMoedas de 50 centavos : "+cent50
//				+"\nMoedas de 1 real : "+real
//				+"\n"
//				+ "\nDinheiro total : "+resultado);
		
		
		
//		Exercicio 11
//		double nota1, nota2, nota3, nota4;
//		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota:"));
//		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota:"));
//		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota:"));
//		nota4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a quarta nota:"));
//		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de faltas:"));
//		double resultado=(nota1+nota2+nota3+nota4)/4;
//		if (faltas < 15) {
//			if (resultado >=10) {
//				JOptionPane.showMessageDialog(null, "Parabéns");
//			}else if (resultado >= 9) {
//				JOptionPane.showMessageDialog(null, "Ótimo");
//			}else if (resultado >= 7){
//				JOptionPane.showMessageDialog(null, "Bom");
//			}else if (resultado >= 5.1){
//				JOptionPane.showMessageDialog(null, "Em exame");
//			}else {
//				JOptionPane.showMessageDialog(null, "Reprovado");
//			}
//		}else {
//			JOptionPane.showMessageDialog(null, "Reprovado");
//		}
	
		
		
//		Exercicio 12
//		int velomax = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade máxima:"));
//		int veloveiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade do veículo:"));
//		if ((veloveiculo-velomax) >= 30) {
//			JOptionPane.showMessageDialog(null, "Multa de R$200 aplicada, veículo acima da velocidade máxima em 30km/h ou mais");
//		}else if ((veloveiculo-velomax) > 10) {
//			JOptionPane.showMessageDialog(null, "Multa de R$100 aplicada, veículo acima da velocidade máxima em 10km/h ou mais");
//		}else if ((veloveiculo-velomax) > 0) {
//			JOptionPane.showMessageDialog(null, "Multa de R$50 aplicada, veículo acima da velocidade máxima");
//		}else {
//			JOptionPane.showMessageDialog(null, "Bom motorista");
//		}
		
		
		
//		Exercicio 13
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite algum número:"));
//		JOptionPane.showMessageDialog(null, "O antecessor é "+(numero-1)+", o sucessor é "+(numero+1));
		
		
		
//		Exercicio 14
//		int veiculo = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do veículo:"));
//		if (veiculo > 25000) {
//			JOptionPane.showMessageDialog(null, "Valor do veículo: "+veiculo
//					+"\n"
//					+"\nValor em % do distribuidor: R$"+veiculo*0.15
//					+"\nValor em % de impostos: R$"+veiculo*0.20
//					+"\n"
//					+"\nValor do veículo após as cobranças: R$"+veiculo*0.65);
//		}else if (veiculo > 12000) {
//			JOptionPane.showMessageDialog(null, "Valor do veículo: "+veiculo
//					+"\n"
//					+"\nValor em % do distribuidor: R$"+veiculo*0.10
//					+"\nValor em % de impostos: R$"+veiculo*0.15
//					+"\n"
//					+"\nValor do veículo após as cobranças: R$"+veiculo*0.75);
//		}else if (veiculo <= 12000) {
//			JOptionPane.showMessageDialog(null, "Valor do veículo: "+veiculo
//					+"\n"
//					+"\nValor em % do distribuidor: R$"+veiculo*0.05
//					+"\nIsento de impostos por conta do valor do veículo"
//					+"\n"
//					+"\nValor do veículo após as cobranças: R$"+veiculo*0.95);
//		}
		
		
		
		
//		Exercicio 15
//			Object[] tipoapto = {"1 - apto simples","2 - apto duplo","3 - suíte de luxo"};
//			int apto = JOptionPane.showOptionDialog(null, "Escolha o a opção do apto", "Apto", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, tipoapto, null);
//			int dias = Integer.parseInt(JOptionPane.showInputDialog("Quantos dias deseja ficar?"));
//			switch (apto) {
//			case 0:
//				JOptionPane.showMessageDialog(null, "Apto simples, R$45 por dia por "+dias+" dias"
//						+"\nValor: R$"+(45*dias));
//				break;
//
//			case 1:
//				JOptionPane.showMessageDialog(null, "Apto duplo, R$65 por dia por "+dias+" dias"
//						+"\nValor: R$"+(65*dias));
//				break;
//
//			case 2:
//				JOptionPane.showMessageDialog(null, "Suíte de luxo, R$110 por dia por "+dias+" dias"
//						+"\nValor: R$"+(110*dias));
//				break;
//				
//			default:
//				break;
//			}
		
		
		
		
//		Exercicio 16
//		double pagar;
//		Object[] codigo = {" 1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "};
//		int pedido = JOptionPane.showOptionDialog(null, 
//				"Escolha o código do pedido:"
//				+"\n1 - Hambúrguer + Suco de Laranja - R$ 5,00"
//				+"\n2 - Sanduíche natural + Suco de Uva - R$ 4,50"
//				+"\n3 - Prato do dia - R$ 8,00"
//				+"\n4 - Pizza - R$ 12,00"
//				+"\n5 - Lasanha - R$ 16,50"
//				+"\n6 - Pão de queijo - R$ 1,00"
//				+"\n7 - Bolo - R$ 2,50", "Padaria", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, codigo, null);
//		switch (pedido) {
//		case 0:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"1 - Hambúrguer + Suco de Laranja - R$ 5,00"+
//					"\nDinheiro pago pelo cliente:"));	
//			if (pagar < 5) {
//			JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//			}else {
//			JOptionPane.showMessageDialog(null, 
//					"1 - Hambúrguer + Suco de Laranja - R$ 5,00"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-5));
//			}
//			break;
//
//		case 1:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"2 - Sanduíche natural + Suco de Uva - R$ 4,50"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 4.5) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"2 - Sanduíche natural + Suco de Uva - R$ 4,50"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-4.5));
//				}
//			break;
//			
//		case 2:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"3 - Prato do dia - R$ 8,00"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 8) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"3 - Prato do dia - R$ 8,00"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-8));
//				}
//			break;
//			
//			
//		case 3:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"4 - Pizza - R$ 12,00"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 12) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"4 - Pizza - R$ 12,00"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-12));
//				}
//			break;
//			
//			
//		case 4:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"5 - Lasanha - R$ 16,50"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 16.5) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"5 - Lasanha - R$ 16,50"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-16.50));
//				}
//			break;
//			
//		case 5:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"6 - Pão de queijo - R$ 1,00"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 5) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"6 - Pão de queijo - R$ 1,00"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-1));
//				}
//			break;
//			
//		case 6:
//			pagar = Double.parseDouble(JOptionPane.showInputDialog(
//					"7 - Bolo - R$ 2,50"+
//					"\nDinheiro pago pelo cliente:"));
//			if (pagar < 2.5) {
//				JOptionPane.showMessageDialog(null, "Dinheiro não suficiente");
//				}else {
//			JOptionPane.showMessageDialog(null, 
//					"7 - Bolo - R$ 2,50"+
//					"\nDinheiro pago pelo cliente: R$"+pagar+
//					"\nTroco: R$"+(pagar-2.50));
//				}
//			break;
//			
//		default:
//			break;
//		}
		
		
		
		
//		Exercicio 17
//		double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));
//		double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));
//		JOptionPane.showMessageDialog(null, numero1/numero2);
		
		
		
		
//		Exercicio 18
//		int le = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º lado"));
//		int ld = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º lado"));
//		int li = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º lado"));
//		
//		if (le <= (ld+li) && ld <= (le+li) && li <= (ld+le)) {
//			if (le == ld && le == li) {
//				JOptionPane.showMessageDialog(null, "Triangulo eqüilátero, três lados iguais");
//			}else if (le == ld || le == li || ld == li) {
//				JOptionPane.showMessageDialog(null, "Triangulo isósceles, dois lados iguais");
//			}else {
//				JOptionPane.showMessageDialog(null, "Triangulo escaleno, todos lados diferentes");
//			}
//		} else {
//			JOptionPane.showMessageDialog(null, "Não é triângulo");
//		}
		
		
		
		
//		Exercicio 19
//		double espaco = Double.parseDouble(JOptionPane.showInputDialog("Digite o espaço percorrido: (KM/H)"));
//		double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo utilizado: (EM HORAS)"));
//		JOptionPane.showMessageDialog(null, "Velocidade média: "+(espaco/tempo)+" KM/H");
		
		
		
		
//		Exercicio 20
//		int escolhaestado;
//		int escolhacidade;
//		Object[] listaestados = {"SC","RJ","RS"};
//		Object[] cidadesc = {"Blumenau","Florianópolis","Balneário Camboriú"};
//		Object[] cidaderj = {"Rio de Janeiro","São Gonçalo","Duque de Caxias"};
//		Object[] cidaders = {"Porto Alegre","Caxias do Sul","Santa Maria"};
//			escolhaestado = JOptionPane.showOptionDialog(null, "Escolha algum estado", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaestados, null);					
//			if (escolhaestado == 0) {
//				escolhacidade = JOptionPane.showOptionDialog(null, "Escolha alguma cidade", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, cidadesc, null);
//			switch (escolhacidade) {
//			case 0:
//				JOptionPane.showMessageDialog(null, "Blumenau tem 350.000 habitantes");
//				break;
//
//			case 1:
//				JOptionPane.showMessageDialog(null, "Florianópolis tem 500.000 habitantes");
//				break;
//				
//			case 2:
//				JOptionPane.showMessageDialog(null, "Balneário Camboriú tem 130.000 habitantes");
//				break;
//			}
//			}else if (escolhaestado == 1) {
//				escolhacidade = JOptionPane.showOptionDialog(null, "Escolha alguma cidade", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, cidaderj, null);
//				switch (escolhacidade) {
//				case 0:
//					JOptionPane.showMessageDialog(null, "Rio de Janeiro tem 6.700.000 habitantes");
//					break;
//
//				case 1:
//					JOptionPane.showMessageDialog(null, "São Gonçalo tem 1.100.000 habitantes");
//					break;
//					
//				case 2:
//					JOptionPane.showMessageDialog(null, "Duque de Caxias tem 900.000 habitantes");
//					break;
//				}
//			}else if (escolhaestado == 2) {
//				escolhacidade = JOptionPane.showOptionDialog(null, "Escolha alguma cidade", "Escolha", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, cidaders, null);
//				switch (escolhacidade) {
//				case 0:
//					JOptionPane.showMessageDialog(null, "Porto Alegre tem 4.300.000 habitantes");
//					break;
//
//				case 1:
//					JOptionPane.showMessageDialog(null, "Caxias do Sul tem 400.000 habitantes");
//					break;
//					
//				case 2:
//					JOptionPane.showMessageDialog(null, "Santa Maria tem 300.000 habitantes");
//					break;
//				}
//			}
		
		
		
		
		
//		Exercicio 21
//		Object[] listarproduto = {"Calça","Camisa","Casaco","Meias","Paletó"};
//		Object[] listarpagamento = {"À vista","À prazo 30 dias","À prazo 60 dias"};
//		int escolhaproduto = JOptionPane.showOptionDialog(null, "Escolha um produto", "Produtos", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarproduto, null);
//		int escolhapagamento = JOptionPane.showOptionDialog(null, "Escolha a forma de pagamento", "Pagamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarpagamento, null);
//		switch (escolhaproduto) {
//		case 0:
//			if(escolhapagamento == 0) {JOptionPane.showMessageDialog(null, "Calça à vista = R$ 150,00");}
//			if(escolhapagamento == 1) {JOptionPane.showMessageDialog(null, "Calça à prazo 30 dias = R$ 165,00");}
//			if(escolhapagamento == 2) {JOptionPane.showMessageDialog(null, "Calça à prazo 60 dias = R$ 180,00");}
//			break;
//
//		case 1:
//			if(escolhapagamento == 0) {JOptionPane.showMessageDialog(null, "Camisa à vista = R$ 300,00");}
//			if(escolhapagamento == 1) {JOptionPane.showMessageDialog(null, "Camisa à prazo 30 dias = R$ 330,00");}
//			if(escolhapagamento == 2) {JOptionPane.showMessageDialog(null, "Camisa à prazo 60 dias = R$ 360,00");}
//			break;
//			
//		case 2:
//			if(escolhapagamento == 0) {JOptionPane.showMessageDialog(null, "Casaco à vista = R$ 250,00");}
//			if(escolhapagamento == 1) {JOptionPane.showMessageDialog(null, "Casaco à prazo 30 dias = R$ 275,00");}
//			if(escolhapagamento == 2) {JOptionPane.showMessageDialog(null, "Casaco à prazo 60 dias = R$ 300,00");}
//			break;
//			
//		case 3:
//			if(escolhapagamento == 0) {JOptionPane.showMessageDialog(null, "Meias à vista = R$ 30,00");}
//			if(escolhapagamento == 1) {JOptionPane.showMessageDialog(null, "Meias à prazo 30 dias = R$ 33,00");}
//			if(escolhapagamento == 2) {JOptionPane.showMessageDialog(null, "Meias à prazo 60 dias = R$ 36,00");}
//			break;
//			
//		case 4:
//			if(escolhapagamento == 0) {JOptionPane.showMessageDialog(null, "Paletó à vista = R$ 450,00");}
//			if(escolhapagamento == 1) {JOptionPane.showMessageDialog(null, "Paletó à prazo 30 dias = R$ 495,00");}
//			if(escolhapagamento == 2) {JOptionPane.showMessageDialog(null, "Paletó à prazo 60 dias = R$ 540,00");}
//			break;
//			
//		default:
//			break;
//		}
		
		
		
		
		
//		Exercicio 22
//		int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 1º lado:"));
//		int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 2º lado:"));
//		int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 3º lado:"));
//		int lado4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o 4º lado:"));
//		if (lado1 == lado2 && lado1==lado3 && lado1 == lado4) {
//			JOptionPane.showMessageDialog(null, "É um quadrado");
//		}else {
//			JOptionPane.showMessageDialog(null, "Não é um quadrado");
//		}
		
		
		
		
//		Exercicio 23
//		float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu peso:"));
//		float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua altura:"));
//		float IMC = (float) (peso/(Math.pow(altura, 2)));
//		if (IMC >= 40) {
//			JOptionPane.showMessageDialog(null, "Obesidade III (mórbida)");
//		}else if (IMC >= 35) {
//			JOptionPane.showMessageDialog(null, "Obesidade II (severa)");
//		}else if (IMC >= 30) {
//			JOptionPane.showMessageDialog(null, "Obesidade I");
//		}else if (IMC >= 25) {
//			JOptionPane.showMessageDialog(null, "Acima do peso");
//		}else if (IMC >= 18.5) {
//			JOptionPane.showMessageDialog(null, "Peso normal");
//		}else if (IMC >= 17) {
//			JOptionPane.showMessageDialog(null, "Abaixo do peso");
//		}else if (IMC < 17) {
//			JOptionPane.showMessageDialog(null, "Muito abaixo do peso");
//		}
		
		
		
		
//		Exercicio 24
//		int[] valor = new int[3];
//		valor[0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º valor:"));
//		valor[1] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º valor:"));
//		valor[2] = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3º valor:"));
//		Arrays.sort(valor);
//			for (int i = 0; i < 3; i++) {
//				System.out.println(valor[i]);
//			}
		
		
		
		
//		Exercicio 25
//		int hora = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora"));
//		if (hora >= 19) {
//			JOptionPane.showMessageDialog(null, "Boa noite!");
//		}else if (hora >= 12) {
//			JOptionPane.showMessageDialog(null, "Boa Tarde!");
//		}else if (hora >= 7) {
//			JOptionPane.showMessageDialog(null, "Bom dia!");
//		}else if (hora >= 0) {
//			JOptionPane.showMessageDialog(null, "Bom madrugada!");
//		}
		
		
		
		
//		Exercicio 26
//		String nome = JOptionPane.showInputDialog("Informe seu nome:");
//		int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
//		
//		if (idade > 90) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade do idoso III");
//		}else if (idade > 76) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade do idoso II");
//		}else if (idade > 61) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade do idoso I");
//		}else if (idade > 46) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade de Adulto");
//		}else if (idade > 31) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade Madura");
//		}else if (idade > 15) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade Jovem");
//		}else if (idade > 12) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade Adolescente");
//		}else if (idade > 5) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade Criança");
//		}else if (idade > 0) {
//			JOptionPane.showMessageDialog(null, nome+"\n");
//			JOptionPane.showMessageDialog(null, idade+"\n");
//			JOptionPane.showMessageDialog(null, "Idade Bebê");
//		}
		
		
		
		
//		Exercicio 27
//		int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
//		if ((ano % 4) == 0) {
//			JOptionPane.showMessageDialog(null, "É bissexto");
//		}else {
//			JOptionPane.showMessageDialog(null, "Não é bissexto");
//		}
		
		
		
		
		
//		Exercicio 28
//		int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe algum número"));
//		if ((numero % 2) == 0) {
//			JOptionPane.showMessageDialog(null, "Número é par");
//		}else {
//			JOptionPane.showMessageDialog(null, "Número é ímpar");
//		}
//		if (numero >=0) {
//			JOptionPane.showMessageDialog(null, "Número é positivo");
//		}else {
//			JOptionPane.showMessageDialog(null, "Número é negativo");
//		}
		
		
		

		
		
//		Exercicio 29
//		int hora = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora atual:"));
//		JOptionPane.showMessageDialog(null, hora+
//				"\n\nHorario estados unidos: "+(hora-1)+
//				"\nHorario china: "+(hora+11)+
//				"\nHorario inglaterra: "+(hora+4));
		
		
		
		
		
		
//		Exercicio 30
//		double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor ganho por hora:"));
//		int hora = Integer.parseInt(JOptionPane.showInputDialog("Hora trabalhadas normalmente:"));
//		int extra = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de hora extra:"));
//		double total = ((valor*2)*extra)+valor*hora;
//		JOptionPane.showMessageDialog(null, "Valor ganho por hora: "+valor+
//				"\nHoras trabalhadas: "+hora+
//				"\nHoras extra: "+extra+
//				"\nValor ganho normalmente: "+valor*hora+
//				"\nValor ganho na hora extra: "+(valor*2)*extra+
//				"\nValor ganho total: "+total);
		
		
		
		
		
//		Exercicio 31
//		String nome[] = new String[3];
//		int idade[] = new int[3];
//		for (int i = 0; i < 3; i++) {
//			nome[i] = JOptionPane.showInputDialog("Informe o nome da "+(i+1)+" pessoa: ");
//			idade[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade da "+(i+1)+" pessoa: "));
//		}
//		String[] a = {idade[0]+" "+nome[0],idade[1]+" "+nome[1],idade[2]+" "+nome[2]};
//		
//		Arrays.sort(a);
//		
//		for (int i = 0; i < 3; i++) {
//			System.out.println(a[i]);
//		}
		
		
		
		
//		Exercicio 32
//		int orcamento = Integer.parseInt(JOptionPane.showInputDialog("Informe o orçamento:"));
//		JOptionPane.showMessageDialog(null, "5% - 30 dias - "+orcamento*1.05+
//				"\n10% - 30 dias - "+orcamento*1.10+
//				"\n20% - 30 dias - "+orcamento*1.20+
//				"\n30% - 30 dias - "+orcamento*1.30+
//				"\n40% - 30 dias - "+orcamento*1.40+
//				"\n50% - 30 dias - "+orcamento*1.50
//				);
		
		
		
		
		
		
//		Exercicio 33
//		int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:"));
//		int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mes:"));
//		if (mes == 12) {
//			if (dia >= 22) {
//				JOptionPane.showMessageDialog(null, "Caprocornio");
//			}else {
//				JOptionPane.showMessageDialog(null, "Sagitario");
//			}
//		}else if (mes == 11) {
//			if (dia >= 22) {
//				JOptionPane.showMessageDialog(null, "Sagitario");
//			}else {
//				JOptionPane.showMessageDialog(null, "Escorpiao");
//			}
//		}else if (mes == 10) {
//			if (dia >= 23) {
//				JOptionPane.showMessageDialog(null, "Escorpiao");
//			}else {
//				JOptionPane.showMessageDialog(null, "Libra");
//			}
//		}else if (mes == 9) {
//			if (dia >= 23) {
//				JOptionPane.showMessageDialog(null, "Libra");
//			}else {
//				JOptionPane.showMessageDialog(null, "Virgem");
//			}
//		}else if (mes == 8) {
//			if (dia >= 23) {
//				JOptionPane.showMessageDialog(null, "Virgem");
//			}else {
//				JOptionPane.showMessageDialog(null, "Leão");
//			}
//		}else if (mes == 7) {
//			if (dia >= 22) {
//				JOptionPane.showMessageDialog(null, "Leão");
//			}else {
//				JOptionPane.showMessageDialog(null, "Cancer");
//			}
//		}else if (mes == 6) {
//			if (dia >= 21) {
//				JOptionPane.showMessageDialog(null, "Cancer");
//			}else {
//				JOptionPane.showMessageDialog(null, "Gemeos");
//			}
//		}else if (mes == 5) {
//			if (dia >= 21) {
//				JOptionPane.showMessageDialog(null, "Gemeos");
//			}else {
//				JOptionPane.showMessageDialog(null, "Touro");
//			}
//		}else if (mes == 4) {
//			if (dia >= 21) {
//				JOptionPane.showMessageDialog(null, "Touro");
//			}else {
//				JOptionPane.showMessageDialog(null, "Aries");
//			}
//		}else if (mes == 3) {
//			if (dia >= 21) {
//				JOptionPane.showMessageDialog(null, "Aries");
//			}else {
//				JOptionPane.showMessageDialog(null, "Aquario");
//			}
//		}else if (mes == 2) {
//			if (dia >= 20) {
//				JOptionPane.showMessageDialog(null, "Peixes");
//			}else {
//				JOptionPane.showMessageDialog(null, "Aquario");
//			}
//		}else if (mes == 1) {
//			if (dia >= 21) {
//				JOptionPane.showMessageDialog(null, "Aquario");
//			}else {
//				JOptionPane.showMessageDialog(null, "Capricornio");
//			}
//		}
//		
		
		
		
		
		
//		Exercicio 34
//		double aplicacao = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da aplicação"));
//		JOptionPane.showMessageDialog(null, "Poupança: "+aplicacao*0.044+
//				"\nCDB: "+aplicacao*0.0465+
//				"\nLCI: "+aplicacao*0.058);
		
		
		
		
		
//		Exercicio 35
//		String nome = JOptionPane.showInputDialog("Informe o nome:");
//		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario bruto:"));
//		int faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe as faltas:"));
//		double salarioliquido = 0;
//		if (salario >= 6000) {
//			salarioliquido = salario*0.86;
//		}else if (salario >= 3500) {
//			salarioliquido = salario*0.89;
//		}else if (salario >= 2000) {
//			salarioliquido = salario*0.92;
//		}else if (salario >= 937) {
//			salarioliquido = salario*0.95;
//		}else {
//			salarioliquido = salario;
//		}
//		salarioliquido -= salario*0.06;
//		if (faltas > 5) {
//			salarioliquido -= 150;
//		}else if (faltas >=1) {
//			salarioliquido -= 50;
//		}else {
//			salarioliquido += 100;
//		}
//		JOptionPane.showMessageDialog(null, "Nome: "+nome+
//				"\nSalario liquido: "+salarioliquido);
		
		
		
		
	}
	}

