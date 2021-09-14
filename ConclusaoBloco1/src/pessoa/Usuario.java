package pessoa;

import java.util.ArrayList;
import java.util.Scanner;

import organizacoes.OngDoador;
import organizacoes.OngVoluntario;
import organizacoes.TestaOng;

public class Usuario extends Pessoa {
	Scanner scan = new Scanner(System.in);
	private TestaOng testaOng = new TestaOng(); //Para chamar métodos da classe TestaOng
	private String decisaoUsuario = "";
	private String escolhaOng = "";
	private String escolhaUsuario = "";
	private ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();

	public void mostraUsuarios() {
		System.out.println(usuarioLista);
	}
	
	public void adicionarUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(usuario.nome());
		usuario.setIdade(usuario.idade());
		usuario.setRegiao(usuario.localUsuario());
		usuario.setEscolhaUsuario(usuario.escolhaUsuario());
		usuario.setDecisaoUsuario(usuario.decisaoUsuario(usuario.getEscolhaUsuario()));
		usuario.setEscolhaOng(usuario.escolhaOrganizacao(usuario.getEscolhaUsuario(), usuario.getRegiao()));
		usuarioLista.add(usuario);
	}

	public Usuario() {
	}

	public String escolhaUsuario() {

		System.out.println("Você deseja ser doador ou voluntário?" + "\nDoador: 1" + "\nVoluntário: 2");
		int escolha = scan.nextInt();
		scan.nextLine();
		if (escolha == 1) {
			return "doador";
		} else {
			return "voluntario";
		}
	}

	public String decisaoUsuario(String escolhaUsuario) {
		
		if (escolhaUsuario.equals("doador")) {
			System.out.print(" ___________________________________________________________________\n");
			System.out.print("| O que você deseja doar?                                           |\n");
			System.out.print("| 1 - Dinheiro                                                      |\n");
			System.out.print("| 2 - Vestuários		                                    |\n");
			System.out.print("| 3 - Alimentos                                                     |\n");
			System.out.print("| 4 - Objetos	                                                    |\n");
			System.out.print("|___________________________________________________________________|\n");
			int escolha = scan.nextInt();
			scan.nextLine();
			switch (escolha) {

			case 1:
				return "Dinheiro";

			case 2:
				return "Vestuários";

			case 3:
				return "Alimentos";

			case 4:
				return "Objetos";

			default:
				System.out.println("Opção inválida!");
				break;
			}
		} else if (escolhaUsuario.equals("voluntario")) {
			System.out.print(" ___________________________________________________________________\n");
			System.out.print("|Qual o serviço que deseja oferecer?                 				  |\n");
			System.out.print("| 1 - Transporte                                      			  |\n");
			System.out.print("| 2 - Cozinhar		                                              |\n");
			System.out.print("| 3 - Lecionar                                                      |\n");
			System.out.print("| 4 - Outros	                                                      |\n");
			System.out.print("|___________________________________________________________________|\n");
			int escolha = scan.nextInt();
			switch (escolha) {

			case 1:
				return "Transporte";

			case 2:
				return "Cozinhar";

			case 3:
				return "Lecionar";

			case 4:
				return "Outros";

			default:
				System.out.println("Opção inválida!");
				break;
			}
		}
		return "entrou";
	}

	public String nome() {
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();

		return nome;
	}

	@Override
	public int idade() {
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		scan.nextLine();
		return idade;
	}

	@Override
	public String localUsuario() {

		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("| Tecle do 1 ao 4 para ONGs mais perto de você                      |\n");
			System.out.print("| 1 - Zona Norte                                                    |\n");
			System.out.print("| 2 - Zona Sul                                                      |\n");
			System.out.print("| 3 - Zona Leste                                                    |\n");
			System.out.print("| 4 - Zona Oeste                                                    |\n");
			System.out.print("|___________________________________________________________________|\n");

			int opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\n\t\t\tZona Norte Selecionada \n");
				return "Zona Norte";
			case 2:
				System.out.print("\n\t\t\tZona Sul Selecionada \n");
				return "Zona Sul";

			case 3:
				System.out.print("\n\t\t\tZona Leste Selecionada \n");
				return "Zona Leste";

			case 4:
				System.out.print("\n\t\t\tZona Oeste Selecionada \n");
				return "Zona Oeste";

			default:
				System.out.print("\n\t\t\tSelecione uma opção válida!\n");
				break;
			}
		}
	} // Fim metodo localPessoa

	public String getDecisaoUsuario() {
		return decisaoUsuario;
	}

	public void setDecisaoUsuario(String decisaoUsuario) {
		this.decisaoUsuario = decisaoUsuario;
	}

	public String getEscolhaOng() {
		return escolhaOng;
	}

	public String getEscolhaUsuario() {
		return escolhaUsuario;
	}

	public void setEscolhaUsuario(String escolhaUsuario) {
		this.escolhaUsuario = escolhaUsuario;
	}

	public void setEscolhaOng(String escolhaOng) {
		this.escolhaOng = escolhaOng;
	}
	
	@Override
	public String toString() {
		return "\nNome " + this.getNome() + " | idade: " + this.getIdade() + " | Ong selecionada: " + this.getEscolhaOng() + " | \n";
	}

	public String escolhaOrganizacao(String escolhaUsuario, String regiao) {
		if(escolhaUsuario.equals("doador")) {
			return testaOng.tipoOng(new OngDoador(), regiao);
		} else {
			return testaOng.tipoOng(new OngVoluntario(), regiao);
		}
	}
}
