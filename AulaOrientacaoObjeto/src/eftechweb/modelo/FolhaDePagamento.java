package eftechweb.modelo;

public class FolhaDePagamento {

	double calcularSalario

	(int horasNormais, int horasExtras, double valorHorasNormais, double valorHorasExtras)

	{

		double valorhorasNormais = horasNormais * valorHorasNormais;
		double valorhorasExtras = horasExtras * valorHorasExtras;

		return valorhorasNormais + valorhorasExtras;

	}

}
