package prova;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Questao {

	public static void main(String[] args) {

//		Declaração de variaveis
		DecimalFormat df = new DecimalFormat("#.00");
		String nome = "";
		Object[] listarsexo = { "Masculino", "Feminino" };
		Object[] listardepartamento = { "Áudio/Vídeo", "Informática", "Telefonia", "Vestuário", "Fechar Compra" };
		Object[] listaraudiovideo = { "TV", "Aparelhos de som", "Voltar" };
		Object[] listarinformatica = { "Hardware", "Software", "Voltar" };
		Object[] listartelefonia = { "Smartphones", "Tablets", "Voltar" };
		Object[] listarvestuario = { "Masculino", "Feminino", "Voltar" };

		Object[] listartv = { "Smart TV Led 49 Samsung - R$ 4.999,99", "Smart TV 4k LG 60 - R$7.499,00",
				"Smart TV Full HD 32 Samsung - R$ 1.710,00", "Voltar" };
		Object[] listaraparelhodesom = { "Semp Toshiba Áudio Bright - R$ 599,99", "Mini System LG - R$ 512,00",
				"Mini System Philco - R$ 499,99", "Voltar" };

		Object[] listarhardware = { "Placa Mãe Asus - R$ 2.000,00", "Memória Ram Corsair 4GB - R$500,00",
				"Mouse Multilaser - R$59,90", "Voltar" };
		Object[] listarsoftware = { "Windows 10  - R$500,00", "Office 2019   - R$399,99", "AutoCad 3D - R$899,50",
				"Voltar" };

		Object[] listarsmartphones = { "Celular1 - R$ 100,00", "Celular2 - R$ 200,00", "Celular3 - R$ 300,00",
				"Voltar" };
		Object[] listartablets = { "Tablet1 - R$ 1000,00", "Tablet2 - R$ 2000,00", "Tablet3 - R$ 3000,00", "Voltar" };

		Object[] listarmasculino = { "Camisa Social Lacoste - R$ 200,00", "Calça Jeans Calvin Klein - R$ 230,00",
				"Camisa Social Dudalina - R$ 130,00", "Voltar" };
		Object[] listarfeminino = { "Camisa Social Dudalina - R$170,00", "Calça Jeans Miss Masi - R$ 99,90",
				"Bermuda Dijean - R$ 74,40", "Voltar" };

		Object[] listarformapagamento = { "À vista", "À prazo" };

		int idade = 0, sexo = 0;
		int quantmasc = 0, quantfem = 0, totalclientes = 0;
		int idade17 = 0, idade18_30 = 0, idade31_50 = 0, idade51 = 0;
		int quant_audiovideo = 0, quant_informatica = 0, quant_telefonia = 0, quant_vestuario = 0;
		String nomemaior = "", nomemenor = "";
		double carrinhomaior = 0, carrinhomenor = 0;

		Object[] listarexecutar = { "Sim", "Não" };
		boolean concluir_sistema = false, concluir_departamento = false;
		boolean concluir_audiovideo = false, concluir_informatica = false, concluir_telefonia = false,
				concluir_vestuario = false;

		boolean concluir_tv = false, concluir_aparelhosom = false;
		boolean concluir_hardware = false, concluir_software = false;
		boolean concluir_smartphone = false, concluir_tablet = false;
		boolean concluir_masculino = false, concluir_feminino = false;

		String nomecarrinho = "";
		double carrinho = 0, carrinhoaudiovideo = 0, carrinhoinformatica = 0, carrinhotelefonia = 0,
				carrinhovestuario = 0;
		double valorpago = 0;
		
		
		
		
		
		

//		Pergunta se quer ir para o sistema
		if (JOptionPane.showOptionDialog(null, "Deseja executar o sistema?", "Executar Sistema?",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarexecutar, null) == 0) {

//			Laço principal do sistema
			while (concluir_sistema == false) {

				nome = "";
				idade = 0;

				nomecarrinho = "";
				valorpago = 0;
				carrinho = 0;
				carrinhoaudiovideo = 0;
				carrinhoinformatica = 0;
				carrinhotelefonia = 0;
				carrinhovestuario = 0;

//				Entrada de dados
				while (nome.equals("") || nome.equals(" ")) {
					nome = JOptionPane.showInputDialog("Informe seu nome:");
					if (nome.equals("") || nome.equals(" ")) {
						JOptionPane.showMessageDialog(null, "Insira um nome válido!");
					}
				}

				if (JOptionPane.showOptionDialog(null, "Informe seu sexo:", "Sexo", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsexo, null) == 0) {
					quantmasc++;
				} else {
					quantfem++;
				}

				while (idade <= 0) {
					idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
					if (idade > 50) {
						idade51++;
					} else if (idade > 30) {
						idade31_50++;
					} else if (idade > 17) {
						idade18_30++;
					} else if (idade > 0 && idade < 18) {
						idade17++;
					} else {
						JOptionPane.showMessageDialog(null, "Digite uma idade válida!");
					}
				}

//				Laço para entrada dos departamentos
				concluir_departamento = false;
				while (concluir_departamento == false) {
					int departamento = JOptionPane.showOptionDialog(null,
							nomecarrinho + "\nSelecione o departamento desejado:", "Escolha o departamento",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listardepartamento, null);

//					Departamento audio_video
					if (departamento == 0) {
						concluir_audiovideo = false;

						while (concluir_audiovideo == false) {
							int audio_video = JOptionPane.showOptionDialog(null,
									nomecarrinho + "\nSelecione seu subdepartamento:", "?",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaraudiovideo, null);

//							Subdepartamento tv
							if (audio_video == 0) {
								concluir_tv = false;
								while (concluir_tv == false) {
									int tv = JOptionPane.showOptionDialog(null, nomecarrinho + "\nEscolha seu produto:",
											"?", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listartv, null);
									if (tv == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 4999.99;
										}

										if (quantidade > 0) {
											nomecarrinho += "Smart TV Led 49 Samsung - R$ 4999,99 (x" + quantidade
													+ ")\n";
											quant_audiovideo++;
										}
									} else if (tv == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 7499;
										}

										if (quantidade > 0) {
											nomecarrinho += "Smart TV 4k LG 60 - R$ 7499,00 (x" + quantidade + ")\n";
											quant_audiovideo++;
										}
									} else if (tv == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 1710;
										}

										if (quantidade > 0) {
											nomecarrinho += "Smart TV Full HD 32 Samsung - R$ 1710,00 (x" + quantidade
													+ ")\n";
											quant_audiovideo++;
										}
									} else if (tv == 3) {
										concluir_tv = true;
									}

								}
//								Subdepartamento aparelhos de som
							} else if (audio_video == 1) {
								concluir_aparelhosom = false;
								while (concluir_aparelhosom == false) {
									int aparelhodesom = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listaraparelhodesom, null);
									if (aparelhodesom == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 599.99;
										}

										if (quantidade > 0) {
											nomecarrinho += "Semp Toshiba Áudio Bright - R$ 599,99 (x" + quantidade
													+ ")\n";
											quant_audiovideo++;
										}
									} else if (aparelhodesom == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 512;
										}

										if (quantidade > 0) {
											nomecarrinho += "Mini System LG - R$ 512,00 (x" + quantidade + ")\n";
											quant_audiovideo++;
										}
									} else if (aparelhodesom == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoaudiovideo += 499.99;
										}

										if (quantidade > 0) {
											nomecarrinho += "Mini System Philco - R$ 499,99 (x" + quantidade + ")\n";
											quant_audiovideo++;
										}
									} else if (aparelhodesom == 3) {
										concluir_aparelhosom = true;
									}

								}

							} else if (audio_video == 2) {
								concluir_audiovideo = true;
							}
						}

//						Departamento informatica
					} else if (departamento == 1) {
						concluir_informatica = false;

						while (concluir_informatica == false) {
							int informatica = JOptionPane.showOptionDialog(null,
									nomecarrinho + "\nSelecione seu subdepartamento:", "?",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarinformatica, null);

//							Subdepartamento hardware
							if (informatica == 0) {

//								Escolha produto
								concluir_hardware = false;
								while (concluir_hardware == false) {
									int hardware = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarhardware, null);
									if (hardware == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 2000;
										}

										if (quantidade > 0) {
											nomecarrinho += "Placa Mãe Asus - R$ 2000,00 (x" + quantidade + ")\n";
											quant_informatica++;
										}
									} else if (hardware == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 500;
										}

										if (quantidade > 0) {
											nomecarrinho += "Memória Ram Corsair 4GB - R$ 500,00 (x" + quantidade
													+ ")\n";
											quant_informatica++;
										}
									} else if (hardware == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 59.90;
										}

										if (quantidade > 0) {
											nomecarrinho += "Mouse Multilaser - R$ 59,90 (x" + quantidade + ")\n";
											quant_informatica++;
										}
									} else if (hardware == 3) {
										concluir_hardware = true;
									}

								}

//								Subdepartamento software
							} else if (informatica == 1) {

//								Escolha produto
								concluir_software = false;
								while (concluir_software == false) {
									int software = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsoftware, null);
									if (software == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 500;
										}

										if (quantidade > 0) {
											nomecarrinho += "Windows 10 - R$ 500,00 (x" + quantidade + ")\n";
											quant_informatica++;
										}
									} else if (software == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 399.99;
										}

										if (quantidade > 0) {
											nomecarrinho += "Office 2019 - R$ 399,99 (x" + quantidade + ")\n";
											quant_informatica++;
										}
									} else if (software == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhoinformatica += 899.50;
										}

										if (quantidade > 0) {
											nomecarrinho += "AutoCad 3D - R$ 899,50 (x" + quantidade + ")\n";
											quant_informatica++;
										}
									} else if (software == 3) {
										concluir_software = true;
									}

								}

							} else if (informatica == 2) {
								concluir_informatica = true;
							}
						}

//						Departamento telefonia
					} else if (departamento == 2) {
						concluir_telefonia = false;

						while (concluir_telefonia == false) {
							int telefonia = JOptionPane.showOptionDialog(null,
									nomecarrinho + "\nSelecione seu subdepartamento:", "?",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listartelefonia, null);

//							Subdepartamento smartphones
							if (telefonia == 0) {

//								Escolha produto
								concluir_smartphone = false;
								while (concluir_smartphone == false) {
									int smartphone = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarsmartphones, null);
									if (smartphone == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 100;
										}

										if (quantidade > 0) {
											nomecarrinho += "Celular1 - R$ 100,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (smartphone == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 200;
										}

										if (quantidade > 0) {
											nomecarrinho += "Celular2 - R$ 200,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (smartphone == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 300;
										}

										if (quantidade > 0) {
											nomecarrinho += "Celular3 - R$ 300,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (smartphone == 3) {
										concluir_smartphone = true;
									}

								}

//								Subdepartamento tablets
							} else if (telefonia == 1) {

//								Escolha produto
								concluir_tablet = false;
								while (concluir_tablet == false) {
									int tablet = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listartablets, null);
									if (tablet == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 1000;
										}

										if (quantidade > 0) {
											nomecarrinho += "Tablet1 - R$ 1000,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (tablet == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 2000;
										}

										if (quantidade > 0) {
											nomecarrinho += "Tablet2 - R$ 2000,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (tablet == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhotelefonia += 3000;
										}

										if (quantidade > 0) {
											nomecarrinho += "Tablet3 - R$ 3000,00 (x" + quantidade + ")\n";
											quant_telefonia++;
										}
									} else if (tablet == 3) {
										concluir_tablet = true;
									}

								}

							} else if (telefonia == 2) {
								concluir_telefonia = true;
							}
						}

//						Departamento vestuario
					} else if (departamento == 3) {
						concluir_vestuario = false;

						while (concluir_vestuario == false) {
							int vestuario = JOptionPane.showOptionDialog(null,
									nomecarrinho + "\nSelecione seu subdepartamento:", "?",
									JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarvestuario, null);

//							Subdepartamento masculino
							if (vestuario == 0) {

//								Escolha produto
								concluir_masculino = false;
								while (concluir_masculino == false) {
									int masculino = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarmasculino, null);
									if (masculino == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 200;
										}

										if (quantidade > 0) {
											nomecarrinho += "Camisa Social Lacoste - R$ 200,00 (x" + quantidade + ")\n";
											quant_vestuario++;
										}
									} else if (masculino == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 230;
										}

										if (quantidade > 0) {
											nomecarrinho += "Calça Jeans Calvin Klein - R$ 230,00 (x" + quantidade
													+ ")\n";
											quant_vestuario++;
										}
									} else if (masculino == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 130;
										}

										if (quantidade > 0) {
											nomecarrinho += "Camisa Social Dudalina - R$ 130,00 (x" + quantidade
													+ ")\n";
											quant_vestuario++;
										}
									} else if (masculino == 3) {
										concluir_masculino = true;
									}

								}

//								Subdepartamento feminino
							} else if (vestuario == 1) {

//								Escolha produto
								concluir_feminino = false;
								while (concluir_feminino == false) {
									int feminino = JOptionPane.showOptionDialog(null,
											nomecarrinho + "\nEscolha seu produto:", "?",
											JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarfeminino, null);
									if (feminino == 0) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 170;
										}

										if (quantidade > 0) {
											nomecarrinho += "Camisa Social Dudalina - R$ 170,00 (x" + quantidade
													+ ")\n";
											quant_vestuario++;
										}
									} else if (feminino == 1) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 99.90;
										}

										if (quantidade > 0) {
											nomecarrinho += "Calça Jeans Miss Masi - R$ 99,90 (x" + quantidade + ")\n";
											quant_vestuario++;
										}
									} else if (feminino == 2) {

//								Pede e confere a quantidade, inserir em quantidade um "0" para cancelar a compra
										int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade desejada deste produto:"));
										for (int i = 1; i <= quantidade; i++) {
											carrinhovestuario += 74.40;
										}

										if (quantidade > 0) {
											nomecarrinho += "Bermuda Dijean - R$ 74,40 (x" + quantidade + ")\n";
											quant_vestuario++;
										}
									} else if (feminino == 3) {
										concluir_feminino = true;
									}

								}

							} else if (vestuario == 2) {
								concluir_vestuario = true;
							}
						}
					} else if (departamento == 4) {
						concluir_departamento = true;
						carrinho = carrinhoaudiovideo + carrinhoinformatica + carrinhotelefonia + carrinhovestuario;
						totalclientes++;
						
//						Confere o cliente que mais gastou e menos gastou
						if (carrinho > 0) {
							if (carrinho > carrinhomaior) {
								nomemaior = nome;
								carrinhomaior = carrinho;
							}
							if (totalclientes == 1) {
								nomemenor = nome;
								carrinhomenor = carrinho;
							} else if (carrinho < carrinhomenor) {
								nomemenor = nome;
								carrinhomenor = carrinho;
							}

						}

					}

				}

//			Confere se algo foi comprado, senão ele pula a etapa de pagamento
				if (carrinho > 0) {
					int formapagamento = JOptionPane.showOptionDialog(null,
							"Total a ser pago: R$ " + df.format(carrinho) + "\n\n" 
									+ nomecarrinho
									+ "\nEscolha sua forma de pagamento:",
							"Forma de pagamento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
							listarformapagamento, null);
					if (formapagamento == 0) {
						if (carrinhoaudiovideo > 0) {
							carrinho -= carrinhoaudiovideo * 0.05;
						}
						if (carrinhoinformatica > 0) {
							carrinho -= carrinhoinformatica * 0.1;
						}
						if (carrinhotelefonia > 0) {
							carrinho -= carrinhotelefonia * 0.15;
						}
						if (carrinhovestuario > 0) {
							carrinho -= carrinhovestuario * 0.2;
						}

					}

//			Entrada de dinhero do cliente
					while (valorpago < carrinho) {
						valorpago = Double.parseDouble(JOptionPane.showInputDialog(
								"Desconto à vista para: \nÁudio/Vídeo - 5% \nInformática - 10% \nTelefonia - 15% \nVestuário - 20% \n"
										+ "Total a ser pago: R$ " + df.format(carrinho) 
										+ "\n\n" 
										+ nomecarrinho
										+ "\nInsira a quantia paga pelo cliente:"));
						if (valorpago < carrinho) {
							JOptionPane.showMessageDialog(null,
									"Valor insuficiente! Insira um valor que pague a compra!");
						}
					}

//			Joga na tela a "nota fiscal"
					JOptionPane.showMessageDialog(null,
							nomecarrinho + "\nTotal compra: R$ " + df.format(carrinho) + "\n"
									+ "\nValor pago pelo cliente: R$ " + df.format(valorpago) 
									+ "\nTroco: R$ " + df.format(valorpago - carrinho));

				}

//			Encerrar programa ou continuar cadastrando
				int outrocadastro = JOptionPane.showOptionDialog(null, "Deseja cadastar mais usuários?", "Continuar?",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, listarexecutar, null);
				if (outrocadastro == 1) {
					concluir_sistema = true;
				} else {
					concluir_sistema = false;
				}
			}

//			Confere se alguém foi cadastrado para então mostrar as estatisticas
			if (totalclientes > 0) {
				JOptionPane.showMessageDialog(null,
						"Quantidade de clientes que utilizaram o sistema: " + totalclientes
						+ "\nQuantidade e percentual de homens: " + quantmasc + " homens e "+ (quantmasc * 100) / totalclientes + " % dos clientes foram homens"
						+ "\nQuantidade e percentual de mulheres: " + quantfem + " mulheres e "+ (quantfem * 100) / totalclientes + " % dos clientes foram mulheres" 
						+ "\n"
						+ "\nClientes com até 17 anos de idade: " + idade17
						+ "\nClientes que tem entre 18 e 30 anos de idade: " + idade18_30
						+ "\nClientes que tem entre 31 e 50 anos de idade: " + idade31_50
						+ "\nClientes com mais de 50 anos de idade: " + idade51 
						+ "\n"
						+ "\nQuantidade de produtos adquiridos apenas por departamento: " 
						+ "\nÁudio/Vídeo: " + quant_audiovideo 
						+ "\nInformática: " + quant_informatica 
						+ "\nTelefonia: " + quant_telefonia 
						+ "\nVestuário: " + quant_vestuario 
						+ "\n" 
						+ "\n" + nomemaior + " foi o(a) que mais gastou com um total em compras de: R$" + df.format(carrinhomaior)
						+ "\n" + nomemenor + " foi o(a) que menos gastou com um total em compras de: R$" + df.format(carrinhomenor));
			}
		}

	}

}
