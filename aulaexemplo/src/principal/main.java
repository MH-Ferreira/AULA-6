package principal;

import java.util.Scanner;

import entidade.CLT;
import entidade.FuncionarioCLT;
import entidade.FuncionarioPJ;
import entidade.PJ;
import entidade.cargo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lorena = new Scanner(System.in);

		// Coletar informações do usuário
		System.out.println("Digite o nome do funcionário:");
		String nome = lorena.nextLine();

		System.out.println("Digite o salário base do funcionário:");
		double salario = lorena.nextDouble();

		System.out.println("Escolha o cargo do funcionário: 1-Desenvolvedor, 2-Contador, 3-Professor");
		int opcaoCargo = lorena.nextInt();
		cargo cargo = escolherCargo(opcaoCargo);

		System.out.println("Escolha o tipo de contrato do funcionário: 1-CLT, 2-PJ");
		int opcaoContrato = lorena.nextInt();
		FuncionarioCLT funcionario1;
		FuncionarioPJ funcionario2;
		
		if (opcaoContrato == 1) {
			CLT x = new CLT(nome, salario, cargo);
			System.out.print(x);         
			
		} else if (opcaoContrato == 2) {
			System.out.println("Digite o valor adicional para PJ:");
			double adicional = lorena.nextDouble();
			
						PJ x = new PJ(nome, salario, cargo, adicional);
						System.out.print(x);
		} else {
			System.out.println("Opção de contrato inválida.");
			return; 
		}
		
		
	}

	public static cargo escolherCargo(int opcao) {
		switch (opcao) {
		case 1:
			return cargo.DESENVOLVEDOR;
		case 2:
			return cargo.CONTADOR;
		case 3:
			return cargo.PROFESSOR;
		default:
			throw new IllegalArgumentException("Opção de cargo inválida");
		}
	}

}
