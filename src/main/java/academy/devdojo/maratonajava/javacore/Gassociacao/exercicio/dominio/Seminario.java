package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String title;
    private Aluno[] students;
    private Professor[] professors;
    private Local place;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(String title, Aluno[] students) {
        this.title = title;
        this.students = students;
    }

    public Seminario(String title, Aluno[] students, Local local) {
        this.title = title;
        this.students = students;
        this.place = local;
    }

    public void printData() {
        System.out.println(this.title);
        if (students != null) {
            for (Aluno student : students) {
                System.out.println("Student: " + student.getName() + " | " + student.getAge());
            }
        } else {
            System.out.println("Nesse seminário não há alunos!");
        }
        if (professors != null) {
            for (Professor professor : professors) {
                System.out.println("Teacher: " + professor.getName());
            }
            System.out.println("Place: " + place.getAddress());
            System.out.println("-------------------");
        }
    }

    public void setStudents(Aluno[] students) {
        this.students = students;
    }

    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }
}
