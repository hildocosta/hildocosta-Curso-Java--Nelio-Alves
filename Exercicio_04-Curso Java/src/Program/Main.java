package Program;

import java.util.Locale;
import java.util.Scanner;


import Entites.Employee;

public class Main {

	public static void main(String[] args) {
		
		// Configura o idioma padrão para entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        // Declaração 
        Employee employee = new Employee();
        
        System.out.println("Enter Name:");
        employee.name = sc.nextLine();
        
        System.out.println("Enter Gross Salary:");
        employee.grossSalary = sc.nextDouble();
        
        System.out.println("Enter Tax:");
        employee.tax = sc.nextDouble();
        
        employee.NetSalary();
       
        
        System.out.println(employee);
        
        System.out.println(" Wich percentage to increase salary: ?");
        double percentage = sc.nextDouble(); // Lê a porcentagem fornecida pelo usuário
        employee.increaseSalary(percentage); // Chama o método increaseSalary com o valor da porcentagem
        
        System.out.println();
        System.out.println(" Updated data: " + employee);
        

        // Fecha o scanner
        sc.close();

	}

}
