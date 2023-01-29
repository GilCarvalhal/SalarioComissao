package entities;

public class Calculation {

	private String NomeVendedor;
	private double SalarioFixo, TotalVendas, Comissao;

	public Calculation(String nomeVendedor, double salarioFixo, double totalVendas, double comissao) {
		NomeVendedor = nomeVendedor;
		SalarioFixo = salarioFixo;
		TotalVendas = totalVendas;
		Comissao = comissao;
	}

	public String getNomeVendedor() {
		return NomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		NomeVendedor = nomeVendedor;
	}

	public double getSalarioFixo() {
		return SalarioFixo;
	}

	public void setSalarioFixo(double salarioFixo) {
		SalarioFixo = salarioFixo;
	}

	public double getTotalVendas() {
		return TotalVendas;
	}

	public void setTotalVendas(double totalVendas) {
		TotalVendas = totalVendas;
	}

	public double getComissao() {
		return Comissao;
	}

	// 15% de comissão sobre suas vendas efetuadas.
	public double comissaoVendas() {
		Comissao = TotalVendas * 15 / 100;
		return Comissao;
	}
}
