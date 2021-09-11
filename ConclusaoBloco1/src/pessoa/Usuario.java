package pessoa;

import java.util.Scanner;

public class Usuario extends Pessoa {
	
	public Usuario() {}
	public Usuario(String nome, int idade, String regiao) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setIdade(idade);
	}

	@Override
	public String nome() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = scan.nextLine();
		//scan.close();
		return nome;
	}

	@Override
	public int idade() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		int idade = scan.nextInt();
		scan.nextLine();
		return idade;
	}
	@Override
	public String localUsuario() {

		Scanner menu = new Scanner(System.in);

		while (true) {

			System.out.print("##-----------------------------CoOng-------------------------------##\n");
			System.out.print("|___________________________________________________________________|\n");
			System.out.print("|Tecle do 1 ao 4 para ONGs mais perto de você, ou tecle 5 para sair.|\n");
			System.out.print("| 1 - Zona Norte                                                    |\n");
			System.out.print("| 2 - Zona Sul                                                      |\n");
			System.out.print("| 3 - Zona Leste                                                    |\n");
			System.out.print("| 4 - Zona Oeste                                                    |\n");
			System.out.print("| 5 - Sair                                                          |\n");
			System.out.print("|___________________________________________________________________|\n");

			int opcao = menu.nextInt();

			if (opcao == 5) {
				System.out.print("\n\t\t\tAté logo! \n");
				menu.close();
				break;
			}

			switch (opcao) {
			case 1:
				System.out.print("\n\t\t\tZona Norte Selecionada \n");
				return "ZonaNorte";
			case 2:
				System.out.print("\n\t\t\tZona Sul Selecionada \n");
				break;

			case 3:
				System.out.print("\n\t\t\tZona Leste Selecionada \n");
				break;

			case 4:
				System.out.print("\n\t\t\tZona Oeste Selecionada \n");
				break;

			default:
				System.out.print("\n\t\t\tOpção Inválida!\n");
				break;
			}
		}
		return null;
	} // Fim metodo localPessoa
}
