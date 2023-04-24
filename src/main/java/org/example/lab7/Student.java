package org.example.lab7;

public class Student extends Human {
    private String faculty;
    private int course;

    public Student(String firstName, String lastName, int age, String gender, String faculty, int course) {
        super(firstName, lastName, age, gender);
        this.faculty = faculty;
        if (course<1) course=1;
        this.course = course;
    }

    public Student() {
        super();
        course=1;
    }

    public Student(Student student) {
        this.faculty = student.faculty;
        if (course < 1||course>5) course = 1;
        this.course = student.course;
        this.setAge(student.getAge());
        this.setGender(student.getGender());
        this.setFirstName(student.getFirstName());
        this.setLastName(student.getLastName());
    }

    public Student(Human human, String faculty, int course) {
        super(human);
        this.faculty = faculty;
        if (course < 1||course>5) course = 1;
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        if (course < 1||course>5) course = 1;
        this.course = course;
    }

    @Override
    public void input() {
        System.out.print("Input your faculty: ");
        faculty =scan.nextLine();
        System.out.print("Input your course: ");
        course =scan.nextInt();
        if (course < 1||course>5) course = 1;
        super.input();
    }

    @Override
    public String toString() {
        return "Student{" +
                "faculty='" + faculty + '\'' +
                ", course=" + course + super.toString()+
                '}';
    }
}
