package midterm_vudanghuy_3974;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {

    Scanner scan = new Scanner(System.in);
    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }
    
    public StudentList(ArrayList<Student> studentList){
        this.studentList = studentList;
    }
    
    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
    
    public void addStudent(){
        System.out.print("Enter number of student you want to add: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter infomation of student "+ (i+1));
            Student student = new Student();
            student.addStudent();
            studentList.add(student);
        }
    }
    public void deletedStudentById(String id){
        for (int i = 0; i < studentList.size(); i++) {
            if(studentList.get(i).getId().equals(id)){
                
            }
        }
    }
    Student findStudentById(String id){
        for(Student student : studentList){
            if (student.getId().equals(id))
                return student;
        }
        System.out.println("No student has id "+ id);
        return null;
    }
    void displayAllStudent(){
        for(Student student : studentList){
            student.displayInfo();
        }
    }
    
    Student findTopStudent(){
        Student studentTop = studentList.get(0);
        for(Student student : studentList){
            if(studentTop.getGpa()<student.getGpa()){
                studentTop = student;
            }
        }
        return studentTop;
    }
    void displayScholarShipStudents(){
        for(Student student : studentList){
            if(student.isSchoolarship()==true)
                student.displayInfo();
        }
    }
    double caculateTuiitionOfAllStudents(){
        double sum=0;
        for(Student student : studentList){
            sum+=student.caculateTuiition();
        }
        return sum;
    }
}
