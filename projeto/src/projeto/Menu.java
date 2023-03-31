package projeto;

import java.util.ArrayList;
import java.util.Scanner;

import projeto.controller.EstoqueController;
import projeto.model.Bebida;
import projeto.model.Comida;
import projeto.model.Produto;
import projeto.util.Cores;
import java.io.IOException;
import java.util.InputMismatchException;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao = 0, tipo = 0, id = 0, tamanho = 0, temperatura = 0, escolha = 0;

		EstoqueController produto = new EstoqueController();

		ArrayList<Produto> lstComidas2 = new ArrayList<Produto>();
		ArrayList<Bebida> lstBebidas2 = new ArrayList<Bebida>();
		int idC = 0, idB = 0;

		while (true) {

			System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                     Java Coffee                     ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                    1 - Cardápio                     ");
			System.out.println("                    2 - Estoque                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {// projeto
				opcao = leia.nextInt();
				if (opcao == 0) {
					invalidMessage();
				}
				if (opcao > 2) {
					invalidMessage();
				}
			} catch (InputMismatchException e) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + "*****************************************************");
				System.out.println(Cores.TEXT_WHITE_BOLD + "Opção Inválida: Digite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			switch (opcao) {// cardapio ou estoque
			case 1 -> {// cardapio

				do {
					System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                 JAVA COFFEE CARDÁPIO                ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Bebida                               ");
					System.out.println("            2 - Comida                               ");
					System.out.println("            0 - Encerrar Compra                      ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     " + Cores.TEXT_RESET);
					tipo = leia.nextInt();

					if (tipo == 1) {
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("             OPÇÕES DE BEBIDAS                       ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("                                                     ");
						System.out.println("            1 - Café Filtrado    R$ 6,50             ");
						System.out.println("            2 - Café com Leite   R$ 7,00             ");
						System.out.println("            3 - Capuccino        R$ 7,90             ");
						System.out.println("            4 - Chá de Camomila  R$ 8,00             ");
						System.out.println("            5 - Chá Mate         R$ 8,00             ");
						System.out.println("            6 - Chá de Camomila  R$ 8,00             ");
						System.out.println("            7 - Suco de Laranja  R$ 7,50             ");
						System.out.println("            8 - Suco de Morango  R$ 7,00             ");
						System.out.println("            9 - Suco de Maracujá R$ 7,00             ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("Entre com a opção desejada:                          ");
						System.out.println("                                                     " + Cores.TEXT_RESET);
						tipo = leia.nextInt();

						// Switch case

						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("              TAMANHO DA BEBIDA                      ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("                                                     ");
						System.out.println("            1 - Grande           R$ 7,00             ");
						System.out.println("            2 - Médio            R$ 5,00             ");
						System.out.println("            3 - Pequeno          R$ 2,00             ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("Entre com a opção desejada:                          ");
						System.out.println("                                                     " + Cores.TEXT_RESET);
						tamanho = leia.nextInt();

						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("              TEMPERATURA DA BEBIDA                  ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("                                                     ");
						System.out.println("            1 - Quente                               ");
						System.out.println("            2 - Gelada                               ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("Entre com a opção desejada:                          ");
						System.out.println("                                                     " + Cores.TEXT_RESET);
						temperatura = leia.nextInt();

						// Validação se a bebida existe realmente
						if (tipo > 0 && tipo < 10 && tamanho > 0 && tamanho < 4 && temperatura > 0 && temperatura < 3) {

						} else {
							System.out.println("Essa bebida não existe, tente novamente!");
						}

					} else if (tipo == 2) {

						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                 COMIDA                              ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("                                                     ");
						System.out.println("            1 - Brownie          R$ 5,00             ");
						System.out.println("            2 - Coxinha          R$ 5,00             ");
						System.out.println("            3 - Pão de Queijo    R$ 4,00             ");
						System.out.println("            4 - Croissant        R$ 5,00             ");
						System.out.println("                                                     ");
						System.out.println("*****************************************************");
						System.out.println("Entre com a opção desejada:                          ");
						System.out.println("                                                     " + Cores.TEXT_RESET);
						tipo = leia.nextInt();

					} else if (tipo < 0 && tipo > 2) {
						invalidMessage();
					}

				} while (tipo != 0);
				System.out.println("Compra Finalizada.");
				sobre();
				System.exit(0);
			}

			case 2 -> {// estoque
				while (true) {

					System.out.println(Cores.TEXT_GREEN + Cores.ANSI_BLACK_BACKGROUND
							+ "*****************************************************");

					System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
					System.out.println("                                                     ");
					System.out.println("                 Java Coffee Estoque                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("                                                     ");
					System.out.println("            1 - Adicionar itens                      ");
					System.out.println("            2 - Listar todos os itens                ");
					System.out.println("            3 - Buscar itens                         ");
					System.out.println("            4 - Editar itens                         ");
					System.out.println("            5 - Apagar itens                         ");
					System.out.println("            6 - Sair                                 ");
					System.out.println("                                                     ");
					System.out.println("*****************************************************");
					System.out.println("Entre com a opção desejada:                          ");
					System.out.println("                                                     " + Cores.TEXT_RESET);

					try {// projeto
						tipo = leia.nextInt();
						if (tipo < 0) {
							invalidMessage();
						}
						if (tipo > 6) {
							invalidMessage();
						}

					} catch (InputMismatchException e) {
						System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida! Digite valores inteiros:\n");
						leia.nextLine();
						tipo = 0;

					}

					switch (tipo) {// opções do estoque
					case 1 -> {// Add itens
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                  Adicionar itens:                   ");
						System.out.println("                                                     ");

						Produto comida = new Produto();

						// Colocando variaveis comida
						comida.setId(++idC);

						System.out.println("Digite o nome: ");
						comida.setNome(leia.next());

						System.out.println("Digite a quantidade do estoque: ");
						comida.setQuantidade(leia.nextInt());

						System.out.println("Digite o preço unitário: ");
						comida.setPreco(leia.nextFloat());

						// Adicionando comida preenchida pelo usuário na lista de comida
						lstComidas2.add(comida);

						// Setando Lista de comidas dentro de Produtos
						produto.setLstComidas(lstComidas2);

						keyPress();
					}

					case 2 -> {// listar tudo
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("               Listar todos os itens:                ");
						System.out.println("                                                     ");

						produto.listarTodos();

						keyPress();
					}
					case 3 -> {// buscar
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Buscar itens:                    ");
						System.out.println("                                                     ");

						System.out.println("Editar comida(1) ou bebida(2)?");
						escolha = leia.nextInt();

						System.out.println("Digite o id do produto: ");

						if (escolha == 1) {
							produto.buscarComida(leia.nextInt());
						} else {
							produto.buscarBebida(leia.nextInt());
						}
						keyPress();
					}
					case 4 -> {// editar
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Editar itens:                    ");
						System.out.println("                                                     ");

						System.out.println("Editar comida(1) ou bebida(2)?");
						int opcaoEditar = leia.nextInt();

						System.out.println("Digite o id que deseja buscar: ");
						if (opcaoEditar == 1) {
							produto.editarComida(leia.nextInt());
						} else {
							// produto.editarBebida(leia.nextInt());
						}

						keyPress();

					}
					case 5 -> {// remover
						System.out.println(Cores.TEXT_YELLOW + "*****************************************************");
						System.out.println("                                                     ");
						System.out.println("                    Apagar itens:                    ");
						System.out.println("                                                     ");

						System.out.println("Apagar comida(1) ou bebida(2)?");
						int opcaoApagar = leia.nextInt();

						System.out.println("Digite o id que deseja deletar: ");
						if (opcaoApagar == 1) {
							produto.deletarComida(leia.nextInt());
						} else {
							produto.deletarBebida(leia.nextInt());
						}

						keyPress();

					}
					case 6 -> {// sair
						sobre();
						leia.close();
						System.exit(0);
					}

					}
				}
			}

			}
		}

	}

	public static void sobre() {// participantes
		System.out.println(Cores.TEXT_WHITE_BOLD + "*****************************************************");
		System.out.println("                   Projeto Java Coffee                  ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("Camille Bueno: https://github.com/CamillePB");
		System.out.println("Stephany Camily: https://github.com/stefygrr");
		System.out.println("Jeanine Santiago: https://github.com/Jeanine19");
		System.out.println("Guilherme Henrique: https://github.com/guilhermehenrique10 ");
		System.out.println("Jeniffer Souza Ribeiro: https://github.com/JenifferSR ");
		System.out.println("Letícia Queiroga: https://github.com/Letixs ");
	}

	public static void keyPress() {// parar o menu até apertar enter
		try {
			System.out.println(Cores.TEXT_RESET + "Pressione Enter para continuar...");
			System.in.read();// tecla enter
		} catch (IOException e) {
			System.out.println("Erro de digitação");
		}
	}

	public static void invalidMessage() {// mensagem de erro
		System.out.println(Cores.TEXT_WHITE_BOLD + "\nOpção Inválida! Tente novamente:\n");
	}
}