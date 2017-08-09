package entity;

public class Dependente {

	private int id;
	private String nome;
	private int idade;
	
	private Funcionario funcionario;
	
	public Dependente() {

	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n\tIDADE: " + idade;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}
