package cargos;

public class Desenvolvedor extends Cargo{

	public Desenvolvedor(double salario, int nivel) {
		cargo = "Desenvolvedor";
		this.salario = salario;
		this.nivel = nivel;
	}
	
//	IR
	public void ir() {
		if (nivel == 1) {
			System.out.println("Imposto de renda: "+salario*0.04);
		}else if (nivel == 2) {
			System.out.println("Imposto de renda: "+salario*0.05);
		}else {
			System.out.println("Imposto de renda: "+salario*0.10);
		}
	}
	
}
