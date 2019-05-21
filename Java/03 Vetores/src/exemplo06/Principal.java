package exemplo06;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

//		Matriz ou Array Bidimensional
		String[][] cursos = new String[2][2];
		
//		Obter informações dos cursos
		for (int i = 0; i < 2; i++) {
			cursos[i][0] = JOptionPane.showInputDialog("Nome do curso:");
			cursos[i][1] = JOptionPane.showInputDialog("Área de atuação:");
		}

//		Exibir informações
		System.out.println("Cursos: "+cursos[0][0]+" - Área: "+cursos[0][1]);
		System.out.println("Cursos: "+cursos[1][0]+" - Área: "+cursos[1][1]);
	}

}
