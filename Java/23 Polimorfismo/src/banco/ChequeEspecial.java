package banco;

public class ChequeEspecial extends Cheque{

//	M�todo de juros
	public void juros(double valor) {
		System.out.println("Taxa do cheque especial: "+valor * 0.20);
	}
	
}
