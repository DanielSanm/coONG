package pessoa;

public abstract class Pessoa implements InterfacePessoa{
	private String nome = "";
	private String regiao = "";
	private int idade = 0;
	private String escolhaUsuario = " ";
	
	public String getEscolhaUsuario() {
		return escolhaUsuario;
	}
	public void setEscolhaUsuario(String escolhaUsuario) {
		this.escolhaUsuario = escolhaUsuario;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
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
	


}
