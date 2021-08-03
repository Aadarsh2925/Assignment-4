package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Student student=new Student();
        student.setStudentId(2304);
        student.setStudentType('F');
        int id= student.getStudentId();
        System.out.println("StudentId = "+id);
        char type=student.getStudentType();
        System.out.println("Type of the student ('F'(fresher)/'L'(lateral) : "+type);
    }
}
