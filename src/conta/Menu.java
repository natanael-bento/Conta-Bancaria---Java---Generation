package conta;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

import conta.util.cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// TESTE CLASSE CONTA:

		Conta c1 = new Conta(1, 123, 1, "Natanael da Silva Bento", 10000.0f);

		c1.visualizar();
		c1.sacar(9000.0f);
		c1.visualizar();
		c1.depositar(2000.0f);
		c1.visualizar();

		// System.out.println("\n\n" +
		// c1.getSaldo());

		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Javinson Arrays dos Santos", 1400.0f, 300.0f);

		cc1.visualizar();
		cc1.sacar(1700.0f);
		cc1.visualizar();
		cc1.depositar(330.0f);
		cc1.visualizar();
		cc1.sacar(335.0f);
		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(2, 136, 2, "Bruna Souza Mendes", 800.0f, 100);
		cp1.visualizar();
		cp1.sacar(850.0f);
		cp1.visualizar();
		cp1.depositar(100);
		cp1.visualizar();

		

		int opcao;

		while (true) {

			System.out.println(
					cores.TEXT_YELLOW + cores.ANSI_BLACK_BACKGROUND + "*********************************************");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("                 BANCO INGAZEIRA             ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("         1 - Criar Uma Conta                 ");
			System.out.println("         2 - Listar todas as Contas          ");
			System.out.println("         3 - Buscar conta por Numero         ");
			System.out.println("         4 - Atualizar dados da Conta        ");
			System.out.println("         5 - Apagar Conta                    ");
			System.out.println("         6 - Sacar                           ");
			System.out.println("         7 - Depositar                       ");
			System.out.println("         8 - Tranferir valores entre conta   ");
			System.out.println("         9 - Sair                            ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("*********************************************" + cores.TEXT_RESET);
			System.out.println("           Entre com a opção desejada:      ");
			System.out.println("                                             ");

			opcao = leia.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco Ingazeira - Seu banco, sua familia!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");

				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");

				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				break;
			case 6:
				System.out.println("Saque\n\n");

				break;
			case 7:
				System.out.println("Depósito\n\n");

				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				break;
			}
		}

	}

}
