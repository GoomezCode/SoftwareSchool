package Class;

import java.util.Objects;

public class Discipline {
    private String discipline;
    private int nota;

//  /*---------------------------------- Getters and Setters ----------------------------------*/
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }
//  /*---------------------------------- Getters and Setters ----------------------------------*/

//  /*---------------------------------- hashcode and Equals ----------------------------------*/
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return nota == that.nota && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discipline, nota);
    }
//  /*---------------------------------- HashCode and Equals ----------------------------------*/

//  /*---------------------------------- ToString ----------------------------------*/
    @Override
    public String toString() {
        return "Discipline{" +
                "discipline='" + discipline + '\'' +
                ", nota=" + nota +
                '}';
    }
//  /*---------------------------------- ToString ----------------------------------*/
}
