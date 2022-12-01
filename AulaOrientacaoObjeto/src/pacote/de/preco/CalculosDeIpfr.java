package pacote.de.preco;

public class CalculosDeIpfr {

	void CalculosImpostos(Preco preco, double percentualImposto, double margemLucro) {

		preco.impostos = preco.custos * (percentualImposto / 100);

		preco.lucro = preco.custos * (margemLucro / 100);

		preco.venda = preco.custos + preco.impostos + preco.lucro;

	}

}
