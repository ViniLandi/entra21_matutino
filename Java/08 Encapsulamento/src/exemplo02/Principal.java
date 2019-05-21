package exemplo02;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		p.setNome("Ester");
		p.setIdade(17);
		
		System.out.println(p.getNome()+"\n"+p.getIdade());

	}

}
