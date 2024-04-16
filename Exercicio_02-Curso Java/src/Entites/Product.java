package Entites;

public class Product {
	
	// Atributos da classe Product
	public String name; // Nome do produto
	public double price; // Pre�o do produto
	public int quantity; // Quantidade em estoque
	
	
	// M�todo para calcular o valor total do estoque
	public double totalValueInStock() {
		return price * quantity; // Retorna o pre�o do produto multiplicado pela quantidade em estoque
	}
	
	
	// M�todo para adicionar produtos ao estoque
	public void addProducts(int quantity) {
		this.quantity += quantity; // Incrementa a quantidade informada ao estoque atual
	}
	
	// M�todo para remover produtos do estoque
	public void removeProducts(int quantity) {
		this.quantity -= quantity; // Decrementa a quantidade informada do estoque atual
	}
	
	
	// M�todo toString
	 public String toString() {
	   return name
			   + ", $ "
			   + String.format("% .2f ", price)
			   + ", "
			   + quantity
			   + " units, Total: $ "
			   + String.format("% .2f ", totalValueInStock()); 
		 
	 }
	
}

