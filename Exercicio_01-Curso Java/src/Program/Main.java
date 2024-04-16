package Program; 
import java.util.Locale;
import java.util.Scanner;

import Entites.Triangle;

public class Main {

    public static void main(String[] args) {
        
        // Configura o idioma padrão para entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        // Declaração de variáveis para os triângulos X e Y
        Triangle x, y;
        
        
        
        // Instancia os objetos para os triângulos X e Y
        x = new Triangle();
        y = new Triangle();
        
        
        
        // Entrada de dados para o triângulo X
        System.out.println( " Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        
        
        // Entrada de dados para o triângulo Y
        System.out.println( " Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        
        
        // Calcula a área dos triângulos X e Y
        double areaX = x.area();
        double areaY = y.area();        
        
        
        
        // Exibe a área dos triângulos X e Y
        System.out.printf(" Triangle X area: %.4f%n", areaX);
        System.out.printf(" Triangle Y area: %.4f%n", areaY);
        
        
        
        // Determina qual triângulo tem a maior área e exibe a mensagem correspondente
        if (areaX > areaY) {
            System.out.println(" Triangle X has the larger area. ");
        } else if (areaY > areaX) {
            System.out.println(" Triangle Y has the larger area. ");            
        } else {
            System.out.println(" Both triangles have the same area. ");            
        }
        
        
        // Fecha o scanner
        sc.close();
    }
}