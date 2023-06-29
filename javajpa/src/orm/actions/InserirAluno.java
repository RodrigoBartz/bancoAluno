package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Aluno;

public class InserirAluno {
	
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nome: ");
		aluno.setNome(scanner.nextLine());
		System.out.println("Email: ");
		aluno.setEmail(scanner.nextLine());
		System.out.println("CPF: ");
		aluno.setCPF(scanner.nextLine());
		System.out.println("Data de Nascimento: ");
		aluno.setDataNascimento(scanner.nextLine());
		System.out.println("Naturalidade: ");
		aluno.setNaturalidade(scanner.nextLine());
		System.out.println("Endereco: ");
		aluno.setEndereco(scanner.nextLine());
		
		//factory para ddl
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
		
		//para operar na base: manager
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(aluno);
		manager.getTransaction().commit();
		
		System.out.println("Aluno inserido. ID:" +aluno.getId());
		
		manager.close();
	}
}


//terminar codigo