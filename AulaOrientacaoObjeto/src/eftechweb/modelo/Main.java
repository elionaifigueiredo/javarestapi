package eftechweb.modelo;

public class Main {

	public static void main(String[] args) {
		
	FolhaDePagamento folha = new FolhaDePagamento();
	
	double salario = folha.calcularSalario(160, 12, 35.2, 40.5);
	
	System.out.println("Salário calculado : " + salario);
	
	
		
	}

}
