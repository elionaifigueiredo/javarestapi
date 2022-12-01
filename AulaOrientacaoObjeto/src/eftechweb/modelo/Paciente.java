package eftechweb.modelo;

public class Paciente {
	
	double altura;
	double peso;
	
	
	
	double imcDoPaciente() {
		
		double imc = peso / (altura*altura);
		return imc  ;
		
	}

}
