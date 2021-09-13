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
		TestaOng testaOng = new TestaOng();
		OngDoador ongDoador = new OngDoador();
		ongDoador.adicionarOngsPredefinidas();
		
		//organizacaoLista.add(new OngDoador("Ceu azul","Zona norte","ceuazul@gmail.com",423432432, "doador"));
		//organizacaoLista.add(new OngDoador("Generation","Zona sul","generation@gmail.com",12345678,"doador"));
		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("|Selecione uma das opções abaixo: 								  |\n");
			System.out.print("| 1 - Cadastro usuario                                              |\n");
			System.out.print("| 2 - Cadastro Ong                                                  |\n");
			System.out.print("| 3 - Mostrar todos os voluntários cadastrados                      |\n");
			System.out.print("| 4 - Sair                                                          |\n");
			System.out.print("|___________________________________________________________________|\n");

			int opcao = scan.nextInt();

			if (opcao == 4) {
				System.out.println("Encerrando programa");
				scan.close();
				break;
			}

			switch (opcao) {
			case 1:
				usuario.adicionarUsuario();
				break;
			case 2:

				break;
			case 3:
				usuario.mostraUsuarios();
				break;
			default:
				System.out.println("Opcão invalida!");
			}

		}

	}
	
	public void addOng() {
		
	}
	
	public void buscaOng() {
		
	}

}
