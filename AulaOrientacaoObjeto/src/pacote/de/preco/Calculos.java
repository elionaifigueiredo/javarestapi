package pacote.de.preco;

public class Calculos {

	public static void main(String[] args) {
		
		
		Preco preco = new Preco();
		
		preco.custos = 140;
		
		CalculosDeIpfr deIpfr = new CalculosDeIpfr();
		
		deIpfr.CalculosImpostos(preco, 15, 20);
		
		System.out.println("preco " + preco.custos);
		
		
	}
	
	
}
