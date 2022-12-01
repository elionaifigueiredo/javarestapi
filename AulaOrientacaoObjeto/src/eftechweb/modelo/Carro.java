package eftechweb.modelo;

public class Carro {
	
	String nome;
	int anoDeFabricacao;
	String modelo; 
	
	Proprietario dono;

	
	void ligar() {
		System.out.println("Ligando o carro : " + modelo);
	}
}
