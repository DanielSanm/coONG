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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String regiao() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String contato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int pix() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String necessidades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String definirOng(String regiao) {
		System.out.println("Recurso em desenvolvimento");
		return null;
	}
}
