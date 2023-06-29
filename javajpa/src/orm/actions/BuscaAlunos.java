package orm.actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Aluno;

public class BuscaAlunos {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		EntityManager manager = factory.createEntityManager();
		
		//JPQL: SQL universal de ORM para Java
		String sql = "select a from Alunos";
		
		Query query = manager.createQuery(sql);
		


		List<Aluno> lista = query.getResultList();
		
		for (Aluno aluno : lista) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getEmail());
			System.out.println(aluno.getCPF());
			System.out.println(aluno.getDataNascimento());
			System.out.println(aluno.getNaturalidade());
			System.out.println(aluno.getEndereco());
		}
		
	}
}
