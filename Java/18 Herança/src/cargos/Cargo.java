package cargos;

public class Cargo {

	protected String cargo;
	protected double salario;
	protected int nivel;
	
//	Vale transporte
	public void vt() {
		System.out.println("Desconto do vale transporte é: "+salario*0.06);
	}

//	Identificação
	public void identificacao() {
		System.out.println("O cargo selecionado é "+cargo);
	}
}
