package aulas.listaoito;

public class Autor {
	private String nome, cpf, enderešo;
	
	public Autor(String nome, String cpf, String enderešo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.enderešo = enderešo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}
	
}
