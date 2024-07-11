import java.util.ArrayList;

// Student class
class Student extends User {
    // Fields
    private double gpa;
    private ArrayList<Classroom> classes;
    private String startDate;

    // Constructor
    public Student(String firstName, String lastName, double gpa, String startDate) {
        super(firstName, lastName, 'S');
        this.gpa = gpa;
        this.startDate = startDate;
        this.classes = new ArrayList<>();
    }

    // Getters and Setters
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Classroom> getClasses() {
        return classes;
    }

    public void setClasses(ArrayList<Classroom> classes) {
        this.classes = classes;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // toString method
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }

    // Override getDashboard method
    @Override
    public void getDashboard() {
        System.out.println("Displaying dashboard for student");
        System.out.println("GPA: " + gpa);
        System.out.println("Classes: " + classes);
    }
}