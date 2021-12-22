import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

class Curso {
	private String nome;
	private int alunos;
	
	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}
	
}


public class ExemploCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		// cursos.forEach(System.out::println); // Irá compilar somente valor das strings devido a uma limitação do Method Reference
		// cursos.forEach(c -> System.out.println(c.getNome())); // aqui temos que passar o lambda
		
		// Utilizando a interface fluente stream
		//cursos.stream().filter(c -> c.getAlunos() > 100).forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 100)
//		   .map(c -> c.getAlunos())
//		   .forEach(x -> System.out.println(x));
		
//		cursos.stream()
//		.filter(c -> c.getAlunos() > 100)
//		.map(Curso::getAlunos)
//		.forEach(System.out::println);
//		
//		cursos.stream().filter(c -> c.getAlunos() >= 100)
//		.forEach(c -> System.out.println(c.getNome())); 
		
//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.map(Curso::getAlunos)
//		.forEach(total -> System.out.println(total));
		
//		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
//		
//		int sum = cursos.stream().filter(c -> c.getAlunos() >= 100).mapToInt(Curso::getAlunos).sum();
//		System.out.println(sum);
		
		
		//Streams primitivos
		IntStream stream = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos);
		
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
		System.out.println("Total de Cursos com mais de 100 alunos: " + soma + " alunos.");
		
		
		
	}
}
