package organizacoes;

import java.util.ArrayList;

public class OngDoador extends Organizacao {
	
	ArrayList<OngDoador> organizacaoLista = new ArrayList<OngDoador>();
	
	public OngDoador() {}
	public OngDoador(String nome, String regiao, String contato, int pix, String tipoOng) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setContato(contato);
		this.setPix(pix);
		this.setTipoOng(tipoOng);
	}
	
	public void adicionarOngsPredefinidas() {
		organizacaoLista.add(new OngDoador("Ceu azul","Zona norte","ceuazul@gmail.com",423432432, "doador"));
	}
	
	public void adicionarOngsManual() {
		OngDoador ongDoador = new OngDoador();
		
	}
	
	@Override
	public String nome() {
		System.out.println();
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
	public String toString() {
		return "\n______________________________________________\n" 
				+ "\nNome da ONG: " + this.getNome() 
				+ "\nRegião: " + this.getRegiao() 
				+ "\nContato: " + this.getContato() 
				+ "\nPix: " + this.getPix() 
				+ "\n______________________________________________\n\n";	
	}
	
	@Override
	public void mostraOng() {
		adicionarOngsPredefinidas();
		System.out.println(organizacaoLista);
	}
}
