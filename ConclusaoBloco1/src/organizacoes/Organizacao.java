package organizacoes;

public abstract class Organizacao implements InterfaceOrganizacao {
	
	private String nome;
	private String regiao;
	private String contato;
	private int pix;

	private String tipoOng;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}
	public int getPix() {
		return pix;
	}
	public void setPix(int pix) {
		this.pix = pix;
	}
	
	public String getTipoOng() {
		return tipoOng;
	}
	public void setTipoOng(String tipoOng) {
		this.tipoOng = tipoOng;
	}
	
}
