package exemplo01;

public class Pessoa {

//	Construtor #1
	Pessoa(){
		System.out.println("Hello world!");
	}
	
//	Construtor #2
	Pessoa(String nome){
		System.out.println("Hello "+nome);
	}
	
//	Construtor #3
	Pessoa(String nome, int idade){
		System.out.println("Hello "+nome+", você tem "+idade+" anos.");
	}
}
