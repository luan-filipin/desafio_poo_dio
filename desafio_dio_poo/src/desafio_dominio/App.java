package desafio_dominio;

import java.time.LocalDate;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("descricao do curso Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JS");
		curso2.setDescricao("descricao curso JS");
		curso2.setCargaHoraria(4);
	
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("mentoria de Java");
		mentoria.setDescricao("descricao mentoria Java");
		mentoria.setData(LocalDate.now());
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
