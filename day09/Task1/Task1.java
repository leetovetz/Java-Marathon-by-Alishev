package day09.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Alex", "505");
        Teacher teacher = new Teacher("Rita", "Computer Science");

        System.out.println(student.getGroupeName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();
    }
}
