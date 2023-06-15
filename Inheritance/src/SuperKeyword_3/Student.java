package super3;

public class Student extends Person {
    private int id;
    private double cgpa;
    
    public Student(String sname,int sage, int id, double cgpa) {
        super(sname,sage);
        this.id = id;
        this.cgpa = cgpa;
    }
    
    public void display() {
        super.display();
        System.out.println("ID: " + id);
        System.out.println("CGPA: " + cgpa);
    }
    
    public static void main(String[] args) {
        Student s = new Student("JIM", 20, 12345, 3.8);
    //  s.display1();
        s.display();
      
    }
}
