package exemplo02;

public class Produto {

//	Atributo
	private static int contador = 0; //static para manter o valor na proxima instancia
	public Produto() {
		System.out.println(contador);
		contador++;
	}
	
}
