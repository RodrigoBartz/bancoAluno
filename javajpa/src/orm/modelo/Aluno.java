package orm.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity                          //linka a classe com o banco, e referencia ao cara logo abaixo //
@Table(name="Alunos")
public class Aluno {
	@Id                         //a anotação @Id identifica o atribto como chave primaria //
	@GeneratedValue             //a anotação @GeneratedValue identifica o atributo como auto-increment //
	private Long id;
	
	private String Nome;
	private String Email;
	private String CPF;	
	private String dataNascimento;
	private String Naturalidade;
	private String Endereco;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNaturalidade() {
		return Naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		Naturalidade = naturalidade;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

}
