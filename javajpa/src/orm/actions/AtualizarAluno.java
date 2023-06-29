package orm.actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class AtualizarAluno {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setId(6L);
		aluno.setNome("Barbara");
		aluno.setEmail("barbara.org");
		aluno.setCPF("123456789");
		aluno.setDataNascimento("10/02/2000");
		aluno.setNaturalidade("boliviana");
		aluno.setEndereco("algum lugar na bolivia");

		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno atualizado, ID: " +aluno.getId());
		
		manager.close();
	}
}
