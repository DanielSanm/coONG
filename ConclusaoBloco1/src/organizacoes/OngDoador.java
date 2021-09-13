package organizacoes;

public class OngDoador extends Organizacao {
	
	public OngDoador() {}
	public OngDoador(String nome, String regiao, String contato, int pix, String tipoOng) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setContato(contato);
		this.setPix(pix);
		
		this.setTipoOng(tipoOng);
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
	public void mostraOng(Organizacao organizacao) {
		System.out.println("______________________________________________");
		System.out.println("\nNome da ONG: " + organizacao.getNome());
		System.out.println("Região: " + organizacao.getRegiao());
		System.out.println("Contato: " + organizacao.getContato());
		System.out.println("PIX: " + organizacao.getPix());
	
		System.out.println("______________________________________________");
	}
}
