package exemplo01;

public class Principal {

	public static void main(String[] args) {

//		Instanciar
		Carro Golf = new Carro(); 

		Golf.ano = 2019;
		Golf.cor = "Preto";
		Golf.fabricante = "Volkswagen";
		Golf.modelo = "Golf GTI";
		Golf.cavalos = 800;
		Golf.exibirDados();
		
		Carro Supra = new Carro();
		Supra.ano = 1999;
		Supra.cor = "Laranja";
		Supra.fabricante = "Toyota";
		Supra.modelo = "Supra";
		Supra.cavalos = 1100;
		Supra.exibirDados();
	}

}
