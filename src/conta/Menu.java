package conta;

import java.io.IOException;
import java.util.Scanner;

import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ContaCorrente cc1 = new ContaCorrente(1, 123, 1, "Javinson Arrays dos Santos", 1400.0f, 300.0f);

		cc1.visualizar();

		ContaPoupanca cp1 = new ContaPoupanca(2, 136, 2, "Bruna Souza Mendes", 800.0f, 100);

		cp1.visualizar();

		int opcao, numero, agencia, tipo, aniversario;
		int nDestino;
		float saldo = 0, limite, valor;
		String titular;

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

				System.out.println("Numero da Agencia: ");
				agencia = leia.nextInt();

				System.out.println("Nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				do {
					System.out.println("Tipo da conta(1-CC/ 2-CP): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("saldo da conta: ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("limite da conta corrente: ");
					limite = leia.nextFloat();
					ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
				}
				case 2 -> {
					System.out.println("Aniversairo da conta Poupança: ");
					aniversario = leia.nextInt();
					ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
				}
				}

				keyPress();
				break;
			case 2:
				System.out.println("Listar todas as Contas\n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Consultar dados da Conta - por número\n\n");

				System.out.println("Numero da conta: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados da Conta\n\n");

				System.out.println("Numero da conta: ");
				numero = leia.nextInt();

				System.out.println("Numero da Agencia: ");
				agencia = leia.nextInt();

				System.out.println("Nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();

				tipo = 0;

				switch (tipo) {
				case 1 -> {
					System.out.println("limite da conta corrente: ");
					limite = leia.nextFloat();
					ContaCorrente cc = new ContaCorrente(0, agencia, tipo, titular, saldo, limite);
					cc.visualizar();
				}
				case 2 -> {
					System.out.println("Aniversairo da conta Poupança: ");
					aniversario = leia.nextInt();
					ContaPoupanca cp = new ContaPoupanca(0, agencia, tipo, titular, saldo, aniversario);
					cp.visualizar();
				}
				}

				keyPress();
				break;
			case 5:
				System.out.println("Apagar a Conta\n\n");

				System.out.println("Numero da conta: ");
				numero = leia.nextInt();

				keyPress();
				break;
			case 6:
				System.out.println("Saque\n\n");

				System.out.println("Numero da conta: ");
				numero = leia.nextInt();

				System.out.println("Valor do saque: ");
				valor = leia.nextFloat();

				keyPress();
				break;
			case 7:
				System.out.println("Depósito\n\n");

				System.out.println("Numero da conta: ");
				numero = leia.nextInt();

				System.out.println("Valor do deposito: ");
				valor = leia.nextFloat();

				keyPress();
				break;
			case 8:
				System.out.println("Transferência entre Contas\n\n");

				System.out.println("Numero da conta - origem: ");
				numero = leia.nextInt();

				System.out.println("Numero da conta - destino: ");
				nDestino = leia.nextInt();

				System.out.println("Valor da transferencia: ");
				valor = leia.nextFloat();

				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}

	}

	public static void keyPress() {

		try {

			System.out.println("\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}

}
