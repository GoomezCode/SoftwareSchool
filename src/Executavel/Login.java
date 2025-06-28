package Executavel;


import javax.swing.*;
import Class.*;

public class Login {
    // Essa area ainda fazer Desenvolvida

    public static void main(String[] args) {
        StudentLogin();
    }

    public static void StudentLogin(){
        Cadastro listStudent = new Cadastro();

        System.out.println("---------------- Login Aluno ----------------");
        String nome = JOptionPane.showInputDialog(null, "Digite seu Login(nome): ", "Login Aluno", JOptionPane.QUESTION_MESSAGE);
        String cpf = JOptionPane.showInputDialog(null, "Digite seu cpf: ", "Login Aluno", JOptionPane.QUESTION_MESSAGE);
        // String senha = JOptionPane.showInputDialog(null, "Digite seu senha: ", "Login Aluno", JOptionPane.QUESTION_MESSAGE);


        for(Student s: listStudent.addStudent.getStudents()){
            if(s.getNome().equalsIgnoreCase(nome) && s.getCpf().equalsIgnoreCase(cpf)){
                System.out.println("Bem Vindo "+ s.getNome());
            }
        }


    }
}
