package main;

import java.util.ArrayList;
import java.util.Scanner;

import organizacoes.OngVoluntario;
import organizacoes.OngDoador;
import organizacoes.Organizacao;
import organizacoes.TestaOng;
import pessoa.Pessoa;
import pessoa.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Usuario usuario = new Usuario();
		ArrayList<Usuario> usuarioLista = new ArrayList<Usuario>();
		ArrayList<Organizacao> organizacaoLista = new ArrayList<Organizacao>();
		TestaOng testaOng = new TestaOng();
		
		organizacaoLista.add(new OngDoador("Ceu azul","Zona norte","ceuazul@gmail.com",423432432, "doador"));
		organizacaoLista.add(new OngDoador("Generation","Zona sul","generation@gmail.com",12345678,"doador"));
		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("|Selecione uma das opções abaixo: 								  |\n");
			System.out.print("| 1 - Cadastro usuario                                              |\n");
			System.out.print("| 2 - Cadastro Ong                                                  |\n");
			System.out.print("| 3 - Sair                                                          |\n");
			System.out.print("|___________________________________________________________________|\n");

			int opcao = scan.nextInt();

			if (opcao == 3) {
				System.out.println("Encerrando programa");
				scan.close();
				break;
			}

			switch (opcao) {
			case 1:
				usuarioLista.add(
						new Usuario(usuario.nome(), usuario.idade(), usuario.localUsuario(), usuario.escolhaUsuario(), usuario.decisaoUsuario(usuario.getEscolhaUsuario())));
				
				for (int i = 0; i < usuarioLista.size(); i++) {
					System.out
							.println("\nNome do usuario número: " + usuarioLista.get(i).getNome());
					System.out
							.println("Idade do usuario número: " + usuarioLista.get(i).getIdade());
					System.out.println(
							"Localização do usuario número: " + usuarioLista.get(i).getRegiao());
//					System.out.println("A sua decisão foi: " + usuarioLista.get(i).getEscolhaUsuario());
//					System.out.println("A sua decisão foi: " + usuarioLista.get(i).getDecisaoUsuario());
					
					
				}
				for(int i = 0; i < usuarioLista.size(); i++) {
					for(int j = 0; j < organizacaoLista.size(); j++) {
						if(usuarioLista.get(i).getEscolhaUsuario().equals(organizacaoLista.get(j).getTipoOng())) {
							testaOng.tipoOng(organizacaoLista.get(j));
						}
					}
					usuarioLista.get(i).setEscolhaOng();
				}
				
				for(int i = 0; i < usuarioLista.size(); i++) {
					for(int j = 0; j < organizacaoLista.size(); j++) {
						if(usuarioLista.get(i).getEscolhaOng().equalsIgnoreCase(organizacaoLista.get(j).getNome())) {
							System.out.println("Você selecionou a ONG " + organizacaoLista.get(j).getNome());
							System.out.println("Muito obrigado " + usuarioLista.get(i).getNome() + " pela doação de " + usuarioLista.get(i).getDecisaoUsuario());
						}
					}
					
				}
				
				break;
			case 2:
				System.out.println("\n1 - Doador");
				System.out.println("\n2 - Voluntária");
				int escolhaOng = scan.nextInt();
				
				if(escolhaOng == 1) {
//					organizacaoLista.add(new OngDoador(doadorOng.nome()));
				}else if (escolhaOng == 2) {
					organizacaoLista.add(new OngVoluntario());
				}
				
				break;
			default:
				System.out.println("Opcão invalida!");
			}

		}

	}

}
