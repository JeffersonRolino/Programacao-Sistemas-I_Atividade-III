package entities;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private Double salarioBase;
    private Double salarioFamilia;

    private Double salarioFinal;
    private int quantidadeDeDependentes;

    // Construtores
    public Funcionario() {
    }

    public Funcionario(String nome, Double salario, int quantidadeDeDependentes) {
        this.nome = nome;
        this.salarioBase = salario;
        this.quantidadeDeDependentes = quantidadeDeDependentes;
        setSalarioFamilia();
        setSalarioFinal();
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalario(Double salario) {
        this.salarioBase = salario;
    }

    public Double getSalarioFamilia() {
        return salarioFamilia;
    }

    private void setSalarioFamilia() {
        this.salarioFamilia = this.salarioBase +
                ((this.quantidadeDeDependentes * 134.98) +
                ((this.salarioBase * 0.03) * this.quantidadeDeDependentes));
    }

    public Double getSalarioFinal(){
        return this.salarioFinal;
    }

    private void setSalarioFinal(){
        this.salarioFinal = this.salarioBase + this.salarioFamilia;
    }

    public int getQuantidadeDeDependentes() {
        return quantidadeDeDependentes;
    }

    public void setQuantidadeDeDependentes(int quantidadeDeDependentes) {
        this.quantidadeDeDependentes = quantidadeDeDependentes;
    }

    @Override
    public String toString() {

        return "Funcionário: " + this.nome + "\n" +
                "Salário Base: R$" + this.salarioBase + "\n" +
                "Quantidade de Dependentes: " + this.quantidadeDeDependentes + "\n" +
                "Total do Salário Familia: R$" + this.salarioFamilia + "\n" +
                "Salário Final: R$" + this.salarioFinal;
    }


    // Funções Personalizadas
}
