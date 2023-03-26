package org.example.lab4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;
    private Map<Integer,String> map;

    public Date(int day, int month, int year) {
        init(day,month,year);
        initMap();
    }
    private void initMap(){
        map = new HashMap<>();
        map.put(1,"січня");
        map.put(2,"лютого");
        map.put(3,"березня");
        map.put(4,"квітня");
        map.put(5,"травня");
        map.put(6,"червня");
        map.put(7,"липня");
        map.put(8,"серпня");
        map.put(9,"вересня");
        map.put(10,"жовтня");
        map.put(11,"листопада");
        map.put(12,"грудня");
    }

    public void init(int day, int month, int year){
        if (!validateDay(day)) day = 1;
        this.day = day;
        if (!validateMonth(month)) month = 1;
        this.month = month;
        this.year = year;
    }
    public void read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day: ");
        int day=scanner.nextInt();
        System.out.print("Input month: ");
        int month=scanner.nextInt();
        System.out.print("Input year: ");
        int year=scanner.nextInt();
        init(day,month,year);
    }
    public void display(){
        System.out.printf("%02d.%02d.%d\n",day,month,year);
    }
    public void displayText(){
        System.out.printf("%02d %s %d року\n",day,map.get(month),year);
    }

    private boolean validateDay(int day) {
        return day > 0 && day < 32;
    }

    private boolean validateMonth(int month) {
        return month > 0 && month < 13;
    }

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
        initMap();
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        if (validateDay(day)) day = 1;
        this.day = day;
    }

    public void setMonth(int month) {
        if (validateMonth(month)) month = 1;
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

