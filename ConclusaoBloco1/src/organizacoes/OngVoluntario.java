package organizacoes;

//import java.util.ArrayList;

public class OngVoluntario extends Organizacao {
	
	//private ArrayList<OngVoluntario> organizacaoLista = new ArrayList<OngVoluntario>();
	
	public OngVoluntario() {}
	
	public OngVoluntario(String nome, String regiao, String contato, int pix, String necessidades) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setContato(contato);
		this.setPix(pix);
	}
	
	@Override
	public String nome() {
		
		return null;
	}

	@Override
	public String regiao() {
		
		return null;
	}

	@Override
	public String contato() {
		
		return null;
	}

	@Override
	public int pix() {
		
		return 0;
	}

	@Override
	public String necessidades() {
		
		return null;
	}

	@Override
	public String definirOng(String regiao) {
		System.out.println("Recurso em desenvolvimento");
		return null;
	}
}
