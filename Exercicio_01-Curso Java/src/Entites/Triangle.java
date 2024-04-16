package Entites;

public class Triangle {
    
    // Atributos para os lados do tri�ngulo
    public double a;
    public double b;
    public double c;
    
    
    
    // M�todo para calcular a �rea do tri�ngulo
    public double area() {
    	
        // Calcula o semi-per�metro do tri�ngulo
        double p = (a + b + c) / 2.0;
        
        // Calcula a �rea usando a f�rmula de Heron        
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}