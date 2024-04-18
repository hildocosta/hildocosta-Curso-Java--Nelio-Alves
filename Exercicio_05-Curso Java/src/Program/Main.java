package Program;

import java.util.Locale;
import java.util.Scanner;

import Entites.Student;

public class Main {

    public static void main(String[] args) {
        // Configura o idioma padrão para entrada de dados
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Declaração
        Student student = new Student();

        System.out.println("Digite o Nome do Aluno:");
        student.name = sc.nextLine();

        System.out.println("Digite a Nota do Primeiro Semestre:");
        student.primeiroTrimestre = sc.nextDouble();

        System.out.println("Digite a Nota do Segundo Semestre:");
        student.segundoTrimestre = sc.nextDouble();

        System.out.println("Digite a Nota do Terceiro Semestre:");
        student.terceiroTrimestre = sc.nextDouble();

        // Exibe os detalhes do aluno
        System.out.println(student);

        // Verifica se o aluno passou e exibe a mensagem correspondente
        System.out.println(student.verificarAprovacao());

        // Fecha o scanner
        sc.close();
    }
}
