import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

import Class.*;
import DateClass.DateStudent;

import javax.swing.*;

public class testCoding {
    public static void main(String[] args) {
        DisStudent();
    }



    public static void DisStudent(){
        Student student = new Student();

        for(int i = 1; i <= 2; i++){
            String disciplina = JOptionPane.showInputDialog("Digite o nome da Disciplina"+ i + ": ");
            String nota = JOptionPane.showInputDialog("Digite a nota da Disciplina"+ i + ": ");

            Discipline discipline = new Discipline();
            discipline.setDiscipline(disciplina);
            discipline.setNota(Integer.valueOf(nota));

            student.getDisciplines().add(discipline);

        }

        for(Discipline listDisciplina : student.getDisciplines()){
            System.out.println(listDisciplina);
        }
        System.out.println("------------------------------------------------------------------------------------");

        int escolhaRemover = JOptionPane.showConfirmDialog(null, "Deseja Remover Alguma Disciplina: ", "Remover", JOptionPane.YES_NO_OPTION);

        if(escolhaRemover == 0){
            String disciplinaRemover = JOptionPane.showInputDialog("Digite o num da Disciplina: ");
            student.getDisciplines().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
        }

        for(Discipline listDisciplina : student.getDisciplines()){
            System.out.println(listDisciplina);
        }

    }
}
