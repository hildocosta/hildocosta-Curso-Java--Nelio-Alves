package Entites;

public class Rectangle {
	
	// Atributos para a largura e altura do retângulo
	public double width;
	public double height;
	
	
	
	// Método para calcular a área do retângulo
	public double areaRectangle() {
		return width * height;		
	}
	
	
	
	// Método para calcular o perímetro do retângulo
	public double perimeterRectangle() {
	    return 2 * (width + height);
	}
	
	
	
	// Método para calcular o valor da diagonal do retângulo
	public double diagonalRectangle() {
	    return Math.sqrt(width * width + height * height);
	}
	
	
	// Método toString para exibir informações sobre o retângulo
	public String toString() {
	    return "Area = " + String.format("%.2f", areaRectangle())
	            + ", Perimeter = " + String.format("%.2f", perimeterRectangle())
	            + ", Diagonal = " + String.format("%.2f", diagonalRectangle());
	}

}
