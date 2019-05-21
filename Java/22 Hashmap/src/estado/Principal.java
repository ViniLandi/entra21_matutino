package estado;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
//		Criar o hashmap
		HashMap<String, String> estados = new HashMap<String, String>();
		
//		Adicionar
		estados.put("Santa Catarina", "Floripa");
		estados.put("Paran�", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		estados.put("Rio Grande do Sul", "Porto Alegre");
		
		estados.remove("Paran�");
		estados.clear();
		
//		Listar todos os valores
		System.out.println(estados);
		
//		Exibir informa��o espec�fica
		System.out.println(estados.get("Santa Catarina"));
		
	}
}