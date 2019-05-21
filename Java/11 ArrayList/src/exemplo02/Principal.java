package exemplo02;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

//		Objeto #01
		Curso c1 = new Curso();
		c1.setNomeCurso("Java");
		c1.setAreaCurso("Desenvolvimento");
		c1.setValorCurso(2300);
		
//		Objeto #02
		Curso c2 = new Curso();
		c2.setNomeCurso("Photoshop");
		c2.setAreaCurso("Gráfica");
		c2.setValorCurso(600);

//		Objeto #03
		Curso c3 = new Curso();
		c3.setNomeCurso("C#");
		c3.setAreaCurso("Desenvolvimento");
		c3.setValorCurso(1800);
		
//		ArrayList
		ArrayList<Curso> cursos = new ArrayList<Curso>();
		cursos.add(c1);
		cursos.add(c2);
		cursos.add(c3);
		
//		Laço
		for (int i = 0; i < cursos.size(); i++) {
			System.out.println(cursos.get(i).getNomeCurso());
		}

	}

}
