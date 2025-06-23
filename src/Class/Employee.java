package Class;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Employee  {

//  /*-------------------- Data of Employee --------------------*/
    private String nome;
    private int idade; // tem que ser +16
    private String rg;
    private String cpf;
    private String funcao; // função para Escolher as Funções
    private String residencia;
    private Boolean contrato;
    private Boolean estudante;
    private String turno; // função para Escolher o turno
    private Random id = new Random();
//  /*-------------------- Data of Employee --------------------*/

//  /*-------------------- Getters and Setters --------------------*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public Boolean getContrato() {
        return contrato;
    }

    public void setContrato(Boolean contrato) {
        this.contrato = contrato;
    }

    public Boolean getEstudante() {
        return estudante;
    }

    public void setEstudante(Boolean estudante) {
        this.estudante = estudante;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
//  /*-------------------- Getters and Setters --------------------*/

//  /*-------------------- ToString --------------------*/
    @Override
    public String toString() {
        return "Employee{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", funcao='" + funcao + '\'' +
                ", residencia='" + residencia + '\'' +
                ", contrato=" + contrato +
                ", estudante=" + estudante +
                ", turno='" + turno + '\'' +
                ", id=" + id +
                '}';
    }
//  /*-------------------- ToString --------------------*/

//  /*-------------------- HashCode and Equals --------------------*/
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return idade == employee.idade && Objects.equals(nome, employee.nome) && Objects.equals(rg, employee.rg) && Objects.equals(cpf, employee.cpf) && Objects.equals(funcao, employee.funcao) && Objects.equals(residencia, employee.residencia) && Objects.equals(contrato, employee.contrato) && Objects.equals(estudante, employee.estudante) && Objects.equals(turno, employee.turno) && Objects.equals(id, employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, rg, cpf, funcao, residencia, contrato, estudante, turno, id);
    }
//  /*-------------------- HashCode and Equals --------------------*/

    public Double getId(){
        return id.nextDouble();
    }

}
