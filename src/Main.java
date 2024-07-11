public class Main {

public static void main(String[] args) {

// Create instances

Teacher teacher1 = new Teacher("John", "Doe", "Math", 50000, "2022-01-01");

Teacher teacher2 = new Teacher("Alice", "Smith", "English", 55000, "2022-02-01");

Teacher teacher3 = new Teacher("Bob", "Johnson", "Science", 60000, "2022-03-01");



Admin admin = new Admin("Admin", "Adminson", "Head Administrator", 70000, "2022-01-01");



Student student1 = new Student("Emma", "Lee", 3.5, "2022-01-01");

Student student2 = new Student("Michael", "Brown", 3.2, "2022-01-15");

Student student3 = new Student("Sophia", "Garcia", 3.8, "2022-02-01");



Classroom classroom1 = new Classroom("Mathematics", teacher1);

Classroom classroom2 = new Classroom("English", teacher2);

Classroom classroom3 = new Classroom("Science", teacher3);



// Set additional fields using setters

teacher1.setClassroom(classroom1);

teacher2.setClassroom(classroom2);

teacher3.setClassroom(classroom3);



student1.getClasses().add(classroom1);

student2.getClasses().add(classroom2);

student3.getClasses().add(classroom3);



// Print all values

System.out.println("Teachers:");

System.out.println(teacher1);

System.out.println(teacher2);

System.out.println(teacher3);



System.out.println("\nAdmin:");

System.out.println(admin);



System.out.println("\nStudents:");

System.out.println(student1);

System.out.println(student2);

System.out.println(student3);



System.out.println("\nClassrooms:");

System.out.println(classroom1);

System.out.println(classroom2);

System.out.println(classroom3);



// Use polymorphic method getDashboard()

System.out.println("\nDashboard:");

teacher1.getDashboard();

admin.getDashboard();

student1.getDashboard();

}
}