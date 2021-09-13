package pessoa;

import java.util.Scanner;

public class Usuario extends Pessoa {

	private String decisaoUsuario = "";
	private String escolhaOng = "";
	
	public String escolhaUsuario() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você deseja ser doador ou voluntário?" + "\nDoador: 1" + "\nVoluntário: 2");
		int escolha = scan.nextInt();
		scan.nextLine();
		if (escolha == 1) {
			this.setEscolhaUsuario("doador");
			return "doador";
		}
		else {
			this.setEscolhaUsuario("voluntario");
			return "voluntario";
		}
	}
	
	public Usuario() {}
	public Usuario(String nome, int idade, String regiao, String escolhaUsuario, String decisaoUsuario) {
		this.setNome(nome);
		this.setRegiao(regiao);
		this.setIdade(idade);
		this.setEscolhaUsuario(escolhaUsuario);
		this.setDecisaoUsuario(decisaoUsuario);
	}

	public String decisaoUsuario(String escolhaUsuario) {
		Scanner scan = new Scanner(System.in);
		
		
		if (escolhaUsuario.equals("doador")) {
			System.out.print(" ___________________________________________________________________\n");
			System.out.print("|O'que você deseja doar?                           				  |\n");
			System.out.print("| 1 - Dinheiro                                       				  |\n");
			System.out.print("| 2 - Vestuários		                                              |\n");
			System.out.print("| 3 - Alimentos                                                     |\n");
			System.out.print("| 4 - Objetos	                                                      |\n");
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
			
			default: System.out.println("Opção inválida!");
			break;
			}
		}
		else if (escolhaUsuario.equals("voluntario")) {
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
			return null;
			
			default: System.out.println("Opção inválida!");
			break;
			}
		}
		return "entrou";
	}
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

	public String getDecisaoUsuario() {
		return decisaoUsuario;
	}

	public void setDecisaoUsuario(String decisaoUsuario) {
		this.decisaoUsuario = decisaoUsuario;
	}

	public String getEscolhaOng() {
		return escolhaOng;
	}

	public void setEscolhaOng() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha a ONG: ");
		this.escolhaOng = scan.nextLine();
	}


}
