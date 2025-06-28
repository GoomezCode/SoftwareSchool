package Executavel;
import DateClass.*;
import Class.*;

import javax.swing.*;


public class Cadastro {
    public static void main(String[] args) {
        String[] ListEscolha = new String[2];
        ListEscolha[0] = "Student";
        ListEscolha[1] = "Employee";
        int Escolha = JOptionPane.showOptionDialog(null, "Qual Cadastro você deseja fazer?", "Cadastro", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, ListEscolha, ListEscolha[0]);
        
        if(Escolha == 0){
            for(int i = 1; i <= 2; i ++){
                Student();
            }
        }
        if(Escolha == 1){
            Employee();
        }


    }

    public static DateStudent addStudent = new DateStudent();
    public static void Student(){

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        String rg = JOptionPane.showInputDialog("Digite seu rg: ");
        String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");
        String serieEscolar  = JOptionPane.showInputDialog("Digite sua Serie: ");
        String dataNascimento = JOptionPane.showInputDialog("Digite sua data de nascimento: ");
        String residencia = JOptionPane.showInputDialog("Digite sua residencia: ");
        String sexo = JOptionPane.showInputDialog("Digite seu sexo: ");

        Student student = new Student();
        student.setNome(nome);
        student.setIdade(Integer.valueOf(idade));
        student.setRg(rg);
        student.setCpf(cpf);
        student.setSerieEscolar(serieEscolar);
        student.setDataNascimento(dataNascimento);
        student.setResidencia(residencia);
        student.setSexo(sexo);

        if(Integer.valueOf(idade) <=17){
            JOptionPane.showMessageDialog(null,"Você e menor de Idade Temos que Adicionar seus Responsaveis");

            String nomeMae = JOptionPane.showInputDialog("Digite o Nome da Mãe: ");
            String nomePai = JOptionPane.showInputDialog("Digite o Nome do pai: ");
            String rgMae = JOptionPane.showInputDialog("Digite o RG da Mae: ");
            String cpfMae = JOptionPane.showInputDialog("Digite o CPF da Mae: ");
            String rgPai = JOptionPane.showInputDialog("Digite o RG do Pai: ");
            String cpfPai =  JOptionPane.showInputDialog("Digite o CPF do Pai: ");
            String telMae = JOptionPane.showInputDialog("Digite o Telefone da Mae: ");
            String telPai = JOptionPane.showInputDialog("Digite o Telefone do pai: ");
            String emailMae = JOptionPane.showInputDialog("Digite o Email da Mae: ");
            String emailPai = JOptionPane.showInputDialog("Digite o Email do Pai: ");
            String statusCivil = JOptionPane.showInputDialog("Informe o Status Civil dos Dois");

            student.setNomeMae(nomeMae);
            student.setNomePai(nomePai);
            student.setRg(rgMae);
            student.setCpf(cpfMae);
            student.setRgPai(rgPai);
            student.setCpfPai(cpfPai);
            student.setTelMae(Integer.valueOf(telMae));
            student.setTelPai(Integer.valueOf(telPai));
            student.setEmailMae(emailMae);
            student.setEmailPai(emailPai);
            student.setStatusCivil(statusCivil);
        }

        addStudent.getStudents().add(student);



        int esccolhaLogin = JOptionPane.showConfirmDialog(null,"Deseja Fazer seu Login?", "Escolha Login", JOptionPane.YES_NO_OPTION);
        if(esccolhaLogin == 0){
            Login LoginStudent = new Login(); // he does the call to the Login to user (Ele faz a ligação para o Login do Usuario)
            LoginStudent.main(null);
        }

    }

    public static void Employee(){
        DateEmployee addEmployee = new DateEmployee();

        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idade = JOptionPane.showInputDialog("Digite sua idade: ");
        String rg = JOptionPane.showInputDialog("Digite seu rg: ");
        String cpf = JOptionPane.showInputDialog("Digite seu cpf: ");

        String[] listFuncao = new String[5];
        listFuncao[0] = "Estágiario";
        listFuncao[1] = "Professora";
        listFuncao[2] = "Diretora";
        listFuncao[3] = "Coordenadora";
        listFuncao[4] = "Limpeza";
        int Escolhafuncao = JOptionPane.showOptionDialog(null, "Qual a sua função", "Função", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, listFuncao, listFuncao);
        String funcao = null;
         if(Escolhafuncao == 0){
             funcao = "Estágiario";
         }
         if(Escolhafuncao == 1){
             funcao = "Professora";
         }
        if(Escolhafuncao == 2){
            funcao = "Diretora";
        }
        if(Escolhafuncao == 3){
            funcao = "Coordenadora";
        }
        if(Escolhafuncao == 4){
            funcao = "Limpeza";
        }



        int IntContrato = JOptionPane.showConfirmDialog(null, "Você já tem Contrato","Contrato", JOptionPane.YES_NO_OPTION);
        Boolean contrato = Boolean.parseBoolean(String.valueOf(IntContrato));
        int IntEstudante = JOptionPane.showConfirmDialog(null, "Você e Estudante?", "Estudante", JOptionPane.YES_NO_OPTION);
        Boolean estudante = Boolean.parseBoolean(String.valueOf(IntEstudante));

        String[] listTurno = new String[3];
        listTurno[0] = "Manhã";
        listTurno[1] = "Tarde";
        listTurno[2] = "Integral";
        int EscolhaTurno = JOptionPane.showOptionDialog(null,"Qual o seu turno", "Turno", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, listTurno, listTurno);
        String turno = null;
        if(EscolhaTurno == 0){
            turno = "Manhã";
        }
        if(EscolhaTurno == 1){
            turno = "Tarde";
        }
        if(EscolhaTurno == 2){
            turno = "Integral";
        }

        Employee employee = new Employee();
        employee.setNome(nome);
        employee.setIdade(Integer.valueOf(idade));
        employee.setRg(rg);
        employee.setCpf(cpf);
        employee.setFuncao(funcao);
        employee.setContrato(contrato);
        employee.setEstudante(estudante);
        employee.setTurno(turno);

        addEmployee.getEmployee().add(employee);



    }

}
