package academy.learnprogramming;

public class Student {
    private int studentId;
    private  char studentType;
    

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }
    public void setStudentType(char studentType){
        this.studentType=studentType;
    }
    public int getStudentId(){
        return studentId;
    }
    public char getStudentType(){
        return studentType;
    }

}
