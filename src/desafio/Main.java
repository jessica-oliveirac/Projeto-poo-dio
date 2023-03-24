package desafio;

import java.time.LocalDate;
import desafio.dominio.Curso;
import desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("curso java");
		curso1.setDescricao("descrição do curso java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("curso java");
		curso2.setDescricao("descrição do curso java");
		curso2.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de java");
		mentoria.setDescricao("descrição mentoria java");
		mentoria.setData(LocalDate.now());
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
