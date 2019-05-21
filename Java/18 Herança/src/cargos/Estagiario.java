package cargos;

public class Estagiario extends Cargo{

//	Construtor
	public Estagiario() {
		cargo = "Estagiario";
		
	}
	
//	IR
	public void ir() {
		System.out.println("Não há desconto de imposto de renda");
	}
	
}
