package Class;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Student {
//  /*-------------------- Data do Student --------------------*/
    private String nome;
    private int idade; // Se for Menor d idade Cadastre Os pais
    private String rg;
    private String cpf;
    private String serieEscolar;
    private String dataNascimento;
    private String residencia;
    private String sexo;
    private ArrayList<Discipline> disciplines = new  ArrayList<Discipline>();
    private Random id = new Random(); // Ele tem que ser um RANDOM
//  /*-------------------- Data do Student --------------------*/

//  /*-------------------- Data do Student and Parents--------------------*/
    private String nomeMae;
    private String nomePai;
    private String rgMae;
    private String cpfMae;
    private String rgPai;
    private String cpfPai;
    private int telMae;
    private int telPai;
    private String emailMae;
    private String emailPai;
    private String StatusCivil;
//  /*-------------------- Data do Student and Parents--------------------*/


//  /*---------------------------------- Getters and Setters ----------------------------------*/
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

    public String getSerieEscolar() {
        return serieEscolar;
    }

    public void setSerieEscolar(String serieEscolar) {
        this.serieEscolar = serieEscolar;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getRgMae() {
        return rgMae;
    }

    public void setRgMae(String rgMae) {
        this.rgMae = rgMae;
    }

    public String getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(String cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getRgPai() {
        return rgPai;
    }

    public void setRgPai(String rgPai) {
        this.rgPai = rgPai;
    }

    public String getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(String cpfPai) {
        this.cpfPai = cpfPai;
    }

    public int getTelMae() {
        return telMae;
    }

    public void setTelMae(int telMae) {
        this.telMae = telMae;
    }

    public int getTelPai() {
        return telPai;
    }

    public void setTelPai(int telPai) {
        this.telPai = telPai;
    }

    public String getEmailMae() {
        return emailMae;
    }

    public void setEmailMae(String emailMae) {
        this.emailMae = emailMae;
    }

    public String getEmailPai() {
        return emailPai;
    }

    public void setEmailPai(String emailPai) {
        this.emailPai = emailPai;
    }

    public String getStatusCivil() {
        return StatusCivil;
    }

    public void setStatusCivil(String statusCivil) {
        StatusCivil = statusCivil;
    }

    public ArrayList<Discipline> getDisciplines() {return disciplines;}

    public void setDisciplines(ArrayList<Discipline> disciplines) {this.disciplines = disciplines;}

    //  /*---------------------------------- Getters and Setters ----------------------------------*/

//  /*---------------------------------- ToString ----------------------------------*/
    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", rg='" + rg + '\'' +
                ", cpf='" + cpf + '\'' +
                ", serieEscolar='" + serieEscolar + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", residencia='" + residencia + '\'' +
                ", sexo='" + sexo + '\'' +
                ", id=" + id +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                ", rgMae='" + rgMae + '\'' +
                ", cpfMae='" + cpfMae + '\'' +
                ", rgPai='" + rgPai + '\'' +
                ", cpfPai='" + cpfPai + '\'' +
                ", telMae=" + telMae +
                ", telPai=" + telPai +
                ", emailMae='" + emailMae + '\'' +
                ", emailPai='" + emailPai + '\'' +
                ", StatusCivil='" + StatusCivil + '\'' +
                '}';
    }
//  /*---------------------------------- ToString ----------------------------------*/

//  /*---------------------------------- HashCode and Equals ----------------------------------*/
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return idade == student.idade && id == student.id && telMae == student.telMae && telPai == student.telPai && Objects.equals(nome, student.nome) && Objects.equals(rg, student.rg) && Objects.equals(cpf, student.cpf) && Objects.equals(serieEscolar, student.serieEscolar) && Objects.equals(dataNascimento, student.dataNascimento) && Objects.equals(residencia, student.residencia) && Objects.equals(sexo, student.sexo) && Objects.equals(nomeMae, student.nomeMae) && Objects.equals(nomePai, student.nomePai) && Objects.equals(rgMae, student.rgMae) && Objects.equals(cpfMae, student.cpfMae) && Objects.equals(rgPai, student.rgPai) && Objects.equals(cpfPai, student.cpfPai) && Objects.equals(emailMae, student.emailMae) && Objects.equals(emailPai, student.emailPai) && Objects.equals(StatusCivil, student.StatusCivil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade, rg, cpf, serieEscolar, dataNascimento, residencia, sexo, id, nomeMae, nomePai, rgMae, cpfMae, rgPai, cpfPai, telMae, telPai, emailMae, emailPai, StatusCivil);
    }
//  /*---------------------------------- HashCode and Equals ----------------------------------*/

    public Double getId(){
        return this.id.nextDouble(10);
    }

    public Double getNotas(){
        Double somaNotas = 0.0;

        for(Discipline disciple : disciplines){
            somaNotas += disciple.getNota();
        }
        return somaNotas / disciplines.size();
    }


    public String getAprovado(){
        Double media = this.getNotas();

        if(media >=70){
        return "Aprovado";
        }else if(media >= 50){
            return "Recuperação";
        }else{
        return "Reprovado";
        }
    }



}
