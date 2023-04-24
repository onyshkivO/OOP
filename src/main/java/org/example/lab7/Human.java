package org.example.lab7;

import java.util.Scanner;

public class Human {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    final Scanner scan = new Scanner(System.in);

    public Human(String firstName, String lastName, int age, String gender) {
        if (age<1 ||age>120) age=1;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public Human() {
    }
    public Human(Human human) {
        this.firstName = human.firstName;
        this.lastName = human.lastName;
        this.age = human.age;
        this.gender = human.gender;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<1 ||age>120) age=1;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void input(){
        System.out.print("Input your first name: ");
        firstName=scan.nextLine();
        firstName=scan.nextLine();
        System.out.print("Input your last name: ");
        lastName=scan.nextLine();
        System.out.print("Input your age: ");
        age=scan.nextInt();
        if (age<1 ||age>120) age=1;
        System.out.print("Input your gender: ");
        gender=scan.nextLine();
        gender=scan.nextLine();
    }
    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
