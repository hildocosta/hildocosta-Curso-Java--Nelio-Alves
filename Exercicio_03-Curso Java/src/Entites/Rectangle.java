package Entites;

public class Rectangle {
	
	// Atributos para a largura e altura do ret�ngulo
	public double width;
	public double height;
	
	
	
	// M�todo para calcular a �rea do ret�ngulo
	public double areaRectangle() {
		return width * height;		
	}
	
	
	
	// M�todo para calcular o per�metro do ret�ngulo
	public double perimeterRectangle() {
	    return 2 * (width + height);
	}
	
	
	
	// M�todo para calcular o valor da diagonal do ret�ngulo
	public double diagonalRectangle() {
	    return Math.sqrt(width * width + height * height);
	}
	
	
	// M�todo toString para exibir informa��es sobre o ret�ngulo
	public String toString() {
	    return "Area = " + String.format("%.2f", areaRectangle())
	            + ", Perimeter = " + String.format("%.2f", perimeterRectangle())
	            + ", Diagonal = " + String.format("%.2f", diagonalRectangle());
	}

}
