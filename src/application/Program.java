package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Calculation;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do vendedor");
		String NomeVendedor = sc.nextLine();

		System.out.println("Informe o seu salario fixo");
		double SalarioFixo = sc.nextDouble();

		System.out.println("Informe o total de vendas em dinheiro");
		double TotalVendas = sc.nextDouble();

		Calculation calculo = new Calculation(NomeVendedor, SalarioFixo, TotalVendas, TotalVendas);

		System.out.print("Nome: " + calculo.getNomeVendedor());
		System.out.println();
		System.out.printf("Salário fixo R$: %.2f", calculo.getSalarioFixo());
		System.out.println();
		System.out.printf("Comissão R$: %.2f", calculo.comissaoVendas());
		System.out.println();
		System.out.printf("Salário completo R$: %.2f", (calculo.getSalarioFixo() + calculo.comissaoVendas()));

		sc.close();
	}

}
