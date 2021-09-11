package main;

import java.util.ArrayList;
import java.util.Scanner;

import organizacoes.Organizacao;
import pessoa.Pessoa;
import pessoa.Usuario;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Usuario usuario = new Usuario();
		ArrayList<Pessoa> usuarioLista = new ArrayList<Pessoa>();
		ArrayList<Organizacao> organizacaoLista = new ArrayList<Organizacao>();

		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("|Tecle do 1 ao 3 para ONGs mais perto de você, ou tecle 3 para sair.|\n");
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
				usuarioLista.add(new Usuario(usuario.nome(), usuario.idade(), usuario.localUsuario()));
				for (int i = 0; i < usuarioLista.size(); i++) {
					System.out
							.println("\nNome do usuario número: ( " + (i + 1) + " ) " + usuarioLista.get(i).getNome());
					System.out
							.println("Idade do usuario número: ( " + (i + 1) + " ) " + usuarioLista.get(i).getIdade());
					System.out.println(
							"Localização do usuario número: ( " + (i + 1) + " ) " + usuarioLista.get(i).getRegiao());
				}
				break;
			case 2:
				break;
			default:
				System.out.println("Opcão invalida!");
			}

		}

	}

}
