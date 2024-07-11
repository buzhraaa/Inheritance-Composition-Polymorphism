//Teacher class
class Teacher extends User {
    // Fields
    private String subject;
    private double salary;
    private Classroom classroom;
    private String startDate;

    // Constructor
    public Teacher(String firstName, String lastName, String subject, double salary, String startDate) {
        super(firstName, lastName, 'T');
        this.subject = subject;
        this.salary = salary;
        this.startDate = startDate;
    }

    // Getters and Setters
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
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
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", salary=" + salary +
                ", classroom=" + classroom +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    // Override getDashboard method
    @Override
    public void getDashboard() {
        System.out.println("Displaying dashboard for teacher");
        System.out.println("Subject: " + subject);
        System.out.println("Classroom: " + classroom);
        System.out.println("Salary: " + salary);
    }
}

