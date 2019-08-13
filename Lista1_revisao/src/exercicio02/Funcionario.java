package exercicio02;

public class Funcionario {
   private double salario;
   private double somaInicial;
   private double somaFinal;
   private String nome = "";

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salarioInicial) {
        this.salario = salarioInicial;
    }

    public double getSomaInicial() {
        return somaInicial;
    }

    public void setSomaInicial(double somaInicial) {
        this.somaInicial = this.somaInicial + this.getSalario();
    }

    public double getSomaFinal() {
        return somaFinal;
    }

    public void setSomaFinal(double somaFinal) {
        this.somaFinal = this.somaFinal + this.getSalario();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void incrementaSalario() {
        double n = this.getSalario();
        if (n < 150) {
            n += n * 0.25;
        } else if (n < 300) {
            n += n * 0.20;
        } else if (n < 600) {
            n += n * 0.15;
        } else {
            n += n * 0.10;
        }
    }
}
