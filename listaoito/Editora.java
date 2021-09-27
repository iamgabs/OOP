package aulas.listaoito;

public class Editora {
	private String cnpj, nome, enderešo, telefone;	
	
	public Editora(String cnpj, String nome, String enderešo, String telefone) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	
}
