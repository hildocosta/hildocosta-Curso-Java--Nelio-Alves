package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Rectangle;



public class Main {

	public static void main(String[] args) {
		
		
		 // Configura o idioma padrão para entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
     // Declaração 
        Rectangle rectangule = new Rectangle();
        
        
        
        System.out.println("Enter rectangle width and height:");
        rectangule.width = sc.nextDouble();
        rectangule.height = sc.nextDouble();
        
        System.out.println(" Data:" + rectangule);
        
        
        sc.close();
        
    
        
        
	}

}
