import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

import Class.*;
import DateClass.DateStudent;

import javax.swing.*;

public class testCoding {
    public static void main(String[] args) {
        StudentTeste();
        // I will leave the coding more clean and more organized - (Vou deixar o Codigo mais limpo e Organizado)
    }


    public static void StudentTeste(){
        Student student = new Student();

        for(int i = 1; i <= 4; i++){ // Add Discipline for the List
            String disciplina = JOptionPane.showInputDialog("Digite o nome da disciplina "+i + ": ");
            String nota = JOptionPane.showInputDialog("Digite a nota "+i + ": ");

            Discipline discipline = new Discipline();
            discipline.setDiscipline(disciplina);
            discipline.setNota(Integer.valueOf(nota));
            student.getDisciplines().add(discipline);
        }

        int escolhaRemove = JOptionPane.showConfirmDialog(null, "Deseja remover alguma Disciplina?", "Remove", JOptionPane.YES_NO_OPTION);
        if(escolhaRemove == 0){
            while(true){
                System.out.println("---------------------------------------------------------");
                for(Discipline listDiscipline : student.getDisciplines()){
                    System.out.println(listDiscipline);
                }

                String escolhaDisciplina = JOptionPane.showInputDialog("Digite a disciplina que deseja remover");
                student.getDisciplines().remove(Integer.valueOf(escolhaDisciplina).intValue() - 1);

                int continueRemove = JOptionPane.showConfirmDialog(null, "Deseja tirar mais alguma?", "ContinueRemove", JOptionPane.YES_NO_OPTION);
                if(continueRemove == 1){
                    break;
                }
            }
        }

        int escolhaVerMedia = JOptionPane.showConfirmDialog(null, "Deseja ver sua media final", "Media", JOptionPane.YES_NO_OPTION);

        if(escolhaVerMedia == 0){ // choice to see average = (Escolha para ver a média)
            System.out.println("Você está "+ student.getAprovado());
            System.out.println("Media: "+ student.getNotas());
        }

    }



}
