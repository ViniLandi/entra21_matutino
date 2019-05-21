package exemplo02;

public class Principal {
	public static void main(String[] args) {
		//Números inteiros
		byte numero1 = 1; //-128 até 127
		short numero2 = 30; //-32.768 até 32.767
		int numero3 = 20; //-2.147.483.648 até 2.147.483.647
		long numero4 = 50; //-9.223.372.036.854.775.808 até 9.223.372.036.854.808
		
		//Números reais
		float numero5 = 5.8f; //Até 7 casas decimais
		double numero6 = 7.98; //Até 15 casas decimais
		
		//Lógico
		boolean acao = true; //Pode armazenar TRUE ou FALSE
		
		//Textos
		char letra = 'a'; //Armazena apenas um caracter
		char ascii = 65; //Trabalha com o código do caracter
		String texto = "Aprendendo Java na ProWay"; //Armazena um conjunto de caracteres
		
		//Concatenando dados
		System.out.println("A variável do tipo byte é "+numero1);
		System.out.println("A variável do tipo short é "+numero2);
		System.out.println("A variável do tipo int é "+numero3);
		System.out.println("A variável do tipo long é "+numero4);
		System.out.println("A variável do tipo float é "+numero5);
		System.out.println("A variável do tipo double é "+numero6);
		System.out.println("A variável do tipo boolean é "+acao);
		System.out.println("A variável do tipo char é "+letra);
		System.out.println("A variável do tipo char é "+ascii);
		System.out.println("A variável do tipo String é "+texto);
	}
}
