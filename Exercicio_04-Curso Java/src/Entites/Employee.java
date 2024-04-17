package Entites;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;

	
	
	// Metodo para Calcular o Salario Liquido
	public double NetSalary() {
		return grossSalary - tax;
	}

	
	
	// Método para incrementar a porcentagem de aumento salarial
	public void increaseSalary(double percentage) {
		double increaseAmount = grossSalary * (percentage / 100.0); // Calcula o valor do aumento
		grossSalary += increaseAmount; // Adiciona o aumento ao salário bruto
	}

	
	
	// Método toString para exibir informações sobre o funcionario
	@Override
	public String toString() {
		return "Employee: " + name 
				            + ", $ "
	                        + String.format("% .2f ", NetSalary());
	}

}
