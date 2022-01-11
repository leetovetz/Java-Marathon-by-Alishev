package day09.Task1;

public class Student extends Human {
    private String groupeName;

    public Student(String name, String groupeName) {
        super(name);
        this.groupeName = groupeName;
    }

    public String getGroupeName() {
        return groupeName;
    }

    public void setGroupeName(String groupeName) {
        this.groupeName = groupeName;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("This student with the name " + getName());
    }
}
