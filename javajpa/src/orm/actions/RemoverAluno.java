package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;


public class RemoverAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		aluno.setId(5L);
		aluno = manager.find(Aluno.class, aluno.getId());
		
		manager.getTransaction().begin();
		manager.remove(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno excluido");
		
		manager.close();
	}
}
