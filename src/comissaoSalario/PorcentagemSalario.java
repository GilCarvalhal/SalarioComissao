package comissaoSalario;

import java.util.Locale;
import java.util.Scanner;

public class PorcentagemSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String NomeVendedor;
		double SalarioFixo, TotalVendas, Comissao;

		System.out.println("Informe o nome do vendedor");
		NomeVendedor = sc.nextLine();

		System.out.println("Informe o seu salario fixo");
		SalarioFixo = sc.nextDouble();

		System.out.println("Informe o total de vendas em dinheiro");
		TotalVendas = sc.nextDouble();

		// 15% de comissão sobre suas vendas efetuadas.
		Comissao = (TotalVendas * 15) / 100;

		System.out.print("Nome: " + NomeVendedor);
		System.out.println();
		System.out.printf("Salário fixo R$: %.2f", SalarioFixo);
		System.out.println();
		System.out.printf("Comissão R$: %.2f", Comissao);
		System.out.println();
		System.out.printf("Salário completo R$: %.2f", (SalarioFixo + Comissao));

		sc.close();
	}

}
