package org.example.lab7;

public class Main {
    public static void main(String[] args) {
        Human base = new Human("Human","Human",18,"Male");
        Student student = new Student(base,"Math",1);
        Student student2 = new Student("Student","Student",18,"Female","computer science",3);
        Teacher teacher = new Teacher();
        teacher.input();
        System.out.println(base);
        System.out.println(student);
        System.out.println(student2);
        System.out.println(teacher);
        student2.input();
        System.out.println(student2);
    }
}
