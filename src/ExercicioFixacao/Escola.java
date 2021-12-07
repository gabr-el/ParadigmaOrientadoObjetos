package ExercicioFixacao;

public class Escola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso c1 = new Curso("Física", "Licenciatura");
		Curso c2 = new Curso("Engenharia", "Graduação");
		Curso c3 = new Curso("Sistemas", "Graduação");

		Aluno a = new Aluno("Julio", "12309876720", "@gmail.com");
		a.imprimirDados();

		a.matricular(c1);
		a.matricular(c2);
		a.matricular(c3);
		a.imprimirDados();

		Aluno b = new Aluno("Rio", "12345678910", "gmail");
		b.matricular(c1);
		b.matricular(c2);

		// PASSANDO UM VETOR COMO PARAMETRO

		// Profesor[] prof = {p1, p2, p3, null, null };
		// Curso c4 = new Curso("4", "Automação", "Tecnologia", p2, prof);

		Professor p = new Professor("0321H", "Carlos", "03212387614", "Ong", "@gmail.com", c1);
		Professor p2 = new Professor("132A", "ferdinand", "12309876518", "seila", "gmail", c2);
		Professor p3 = new Professor("09kh", "Suzi", "Lou", "zef", "gmail.com", c3);

		c1.addDocentes(p);
		c2.addDocentes(p2);
		c3.addDocentes(p3);

		c1.setCoordenador(p);
		c2.setCoordenador(p2);
		c3.setCoordenador(p3);

		c1.imprimirDados();
		c2.imprimirDados();
		c3.imprimirDados();

	}

}
