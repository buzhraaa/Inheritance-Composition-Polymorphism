//Admin class
class Admin extends User {
    // Fields
    private String title;
    private double salary;
    private String startDate;

    // Constructor
    public Admin(String firstName, String lastName, String title, double salary, String startDate) {
        super(firstName, lastName, 'A');
        this.title = title;
        this.salary = salary;
        this.startDate = startDate;
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
        return "Admin{" +
                "title='" + title + '\'' +
                ", salary=" + salary +
                ", startDate='" + startDate + '\'' +
                '}';
    }

    // Override getDashboard method
    @Override
    public void getDashboard() {
        System.out.println("Displaying dashboard for administrator");
    }
}