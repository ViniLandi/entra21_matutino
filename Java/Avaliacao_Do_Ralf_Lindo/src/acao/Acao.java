package acao;

import dados.Dados;

public class Acao {
	
	public void CadastrarCelular() {
		Dados.produto.setCelular(Dados.produto.getCelular()+1);
	}
	
	public void ExcluirCelular() {
		if (Dados.produto.getCelular() > 0) 
			Dados.produto.setCelular(Dados.produto.getCelular()-1);
	}
	
	
	
	public void CadastrarNotebook() {
		Dados.produto.setNotebook(Dados.produto.getNotebook()+1);
	}
	
	public void ExcluirNotebook() {
		if (Dados.produto.getNotebook() > 0) 
		Dados.produto.setNotebook(Dados.produto.getNotebook()-1);
	}
	
	
	public void CadastrarTV() {
		Dados.produto.setTV(Dados.produto.getTV()+1);
	}
	
	public void ExcluirTV() {
		if (Dados.produto.getTV() > 0) 
		Dados.produto.setTV(Dados.produto.getTV()-1);
	}
	
	
	
	public void CadastrarAparelhoSom() {
		Dados.produto.setAparelhoSom(Dados.produto.getAparelhoSom()+1);
	}
	
	public void ExcluirAparelhoSom() {
		if (Dados.produto.getAparelhoSom() > 0) 
		Dados.produto.setAparelhoSom(Dados.produto.getAparelhoSom()-1);
	}
	
	
	
	public void CadastrarViolao() {
		Dados.produto.setViolao(Dados.produto.getViolao()+1);
	}
	
	public void ExcluirViolao() {
		if (Dados.produto.getViolao() > 0) 
		Dados.produto.setViolao(Dados.produto.getViolao()-1);
	}
	
	
	
	public void CadastrarGuitarra() {
		Dados.produto.setGuitarra(Dados.produto.getGuitarra()+1);
	}
	
	public void ExcluirGuitarra() {
		if (Dados.produto.getGuitarra() > 0) 
		Dados.produto.setGuitarra(Dados.produto.getGuitarra()-1);
	}
	
	
	
	public void CadastrarBateria() {
		Dados.produto.setBateria(Dados.produto.getBateria()+1);
	}
	
	public void ExcluirBateira() {
		if (Dados.produto.getBateria() > 0) 
		Dados.produto.setBateria(Dados.produto.getBateria()-1);
	}
	
	
	
	
	public void CadastrarBaixo() {
		Dados.produto.setBaixo(Dados.produto.getBaixo()+1);
	}
	
	public void ExcluirBaixo() {
		if (Dados.produto.getBaixo() > 0) 
		Dados.produto.setBaixo(Dados.produto.getBaixo()-1);
	}
	
	
	public int AtualizaQuantidade() {
		int quantidade = Dados.produto.getCelular() + Dados.produto.getNotebook() + Dados.produto.getTV() + Dados.produto.getAparelhoSom() + Dados.produto.getViolao() + Dados.produto.getGuitarra() + Dados.produto.getBateria() + Dados.produto.getBaixo();
		
		return quantidade;
	}
}
