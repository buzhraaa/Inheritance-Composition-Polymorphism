import java.util.ArrayList;

// Classroom class
class Classroom {
    // Fields
    private String subject;
    private int numberOfStudents;
    private ArrayList<Student> students;
    private Teacher primaryTeacher;
    private String startDate;

    // Constructor
    public Classroom(String subject, Teacher primaryTeacher) {
        this.subject = subject;
        this.primaryTeacher = primaryTeacher;
        this.students = new ArrayList<>();
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Teacher getPrimaryTeacher() {
        return primaryTeacher;
    }

    public void setPrimaryTeacher(Teacher primaryTeacher) {
        this.primaryTeacher = primaryTeacher;
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
        return "Classroom{" +
                "subject='" + subject + '\'' +
                '}';
    }

    // printEachStudent method
    public void printEachStudent() {
        System.out.println("Students in the classroom:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

