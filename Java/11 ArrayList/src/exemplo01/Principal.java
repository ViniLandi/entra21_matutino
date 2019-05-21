package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//		Criar ArrayList
		ArrayList<String> cursos = new ArrayList<String>();
		
//		Cadastrar cursos
		cursos.add("Java");
		cursos.add("MySQL");
		cursos.add("HTML");
		cursos.add("CSS");
		cursos.add("JavaScript");
		
//		Alterar um curso
		cursos.set(4, "jQuery");
		
//		Remover um curso
		cursos.remove(1);
		
//		Remover todos os cursos
		cursos.clear();
		
//		Exibir a quantidade de registros
		System.out.println("Cursos: "+cursos.size());
		
		
//		Listar os cursos
		for (String curso : cursos) {
			System.out.println(curso);
		}

	}

}
