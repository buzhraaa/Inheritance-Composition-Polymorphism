import java.util.ArrayList;

// User class
class User {
    // Fields
    private String firstName;
    private String lastName;
    private char role;

    // Constructor
    public User(String firstName, String lastName, char role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getRole() {
        return role;
    }

    public void setRole(char role) {
        this.role = role;
    }

    // toString method
    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", role=" + role +
                '}';
    }

    // getDashboard method
    public void getDashboard() {
        System.out.println("Displaying dashboard for user");
    }
}