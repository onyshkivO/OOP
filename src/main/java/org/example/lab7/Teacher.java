package org.example.lab7;

public class Teacher extends Human{
    private String stupin;
    private double salary;

    public Teacher(String firstName, String lastName, int age, String gender, String stupin, double salary) {
        super(firstName, lastName, age, gender);
        this.stupin = stupin;
        if (salary<0) salary=0;
        this.salary = salary;
    }

    public Teacher() {
        super();
        salary=1;
    }

    public Teacher(Teacher teacher) {
        this.stupin = teacher.stupin;
        this.salary = teacher.salary;
        this.setAge(teacher.getAge());
        this.setGender(teacher.getGender());
        this.setFirstName(teacher.getFirstName());
        this.setLastName(teacher.getLastName());
    }

    public Teacher(Human human, String stupin, double salary) {
        super(human);
        this.stupin = stupin;
        if (salary<1) salary=1;
        this.salary = salary;
    }

    public String getStupin() {
        return stupin;
    }

    public void setStupin(String stupin) {
        this.stupin = stupin;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary<0) salary=0;
        this.salary = salary;
    }

    @Override
    public void input() {
        System.out.print("Input your stupin: ");
        stupin =scan.nextLine();
        System.out.print("Input your salary: ");
        salary =scan.nextInt();
        if (salary<0) salary=0;
        super.input();
    }

    @Override
    public String toString() {
        return "Student{" +
                "stupin='" + stupin + '\'' +
                ", salary=" + salary + super.toString()+
                '}';
    }
}
