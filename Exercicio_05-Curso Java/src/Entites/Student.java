package Entites;

public class Student {

    public String name;
    public double primeiroTrimestre;
    public double segundoTrimestre;
    public double terceiroTrimestre;

    // Método para calcular a nota final do aluno
    public double notaFinal() {
        return primeiroTrimestre + segundoTrimestre + terceiroTrimestre;
    }

    // Método para verificar se o aluno passou ou não
    public String verificarAprovacao() {
        double notaFinal = notaFinal();
        if (notaFinal >= 60.0) {
            return "Passou!";
        } else {
            double pontosFaltantes = 60.0 - notaFinal;
            return "Reprovou! Faltaram " + pontosFaltantes + " pontos para passar.";
        }
    }

    // Método toString para exibir informações sobre o aluno
    @Override
    public String toString() {
        return "Nome do Aluno: " + name + "\n" + "Nota do Primeiro Trimestre: "
                + String.format("%.2f", primeiroTrimestre) + "\n" + "Nota do Segundo Trimestre: "
                + String.format("%.2f", segundoTrimestre) + "\n" + "Nota do Terceiro Trimestre: "
                + String.format("%.2f", terceiroTrimestre) + "\n" + "A Nota Final do Aluno e: "
                + String.format("%.2f", notaFinal());
    }
}
