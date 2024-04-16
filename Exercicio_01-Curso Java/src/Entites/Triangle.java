package Entites;

public class Triangle {
    
    // Atributos para os lados do triângulo
    public double a;
    public double b;
    public double c;
    
    
    
    // Método para calcular a área do triângulo
    public double area() {
    	
        // Calcula o semi-perímetro do triângulo
        double p = (a + b + c) / 2.0;
        
        // Calcula a área usando a fórmula de Heron        
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}