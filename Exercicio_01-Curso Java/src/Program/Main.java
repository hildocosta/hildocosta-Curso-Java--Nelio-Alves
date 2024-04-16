package Program; 
import java.util.Locale;
import java.util.Scanner;

import Entites.Triangle;

public class Main {

    public static void main(String[] args) {
        
        // Configura o idioma padr�o para entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        
        // Declara��o de vari�veis para os tri�ngulos X e Y
        Triangle x, y;
        
        
        
        // Instancia os objetos para os tri�ngulos X e Y
        x = new Triangle();
        y = new Triangle();
        
        
        
        // Entrada de dados para o tri�ngulo X
        System.out.println( " Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        
        
        
        // Entrada de dados para o tri�ngulo Y
        System.out.println( " Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();
        
        
        
        // Calcula a �rea dos tri�ngulos X e Y
        double areaX = x.area();
        double areaY = y.area();        
        
        
        
        // Exibe a �rea dos tri�ngulos X e Y
        System.out.printf(" Triangle X area: %.4f%n", areaX);
        System.out.printf(" Triangle Y area: %.4f%n", areaY);
        
        
        
        // Determina qual tri�ngulo tem a maior �rea e exibe a mensagem correspondente
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