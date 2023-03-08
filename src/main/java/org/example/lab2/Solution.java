package org.example.lab2;

import java.util.Arrays;

public class Solution {

    private static class StudentStruct{
        String secondName;
        Integer course;
        String specialty;
        Integer mathGrade;
        Integer physicsGrade;
        Integer computerScienceGrade;

    }


    public static void main(String[] args) {
        third();
    }
    //first
    public static void first() {
        int[] b = new int[21];
        create(b);
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));
        calculateAndReplace1D(b);


    }

    private static void create(int[] b) {
        for (int i = 0; i < 21; i++) {
            b[i] = (int) Math.floor(Math.random() * (90 - 10 + 1) + 10);
        }
    }

    private static void calculateAndReplace1D(int[] b) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 21; i++) {
            if (b[i] % 2 != 0 && b[i] % 3 == 0) continue;
            count++;
            sum += b[i];
            b[i] = 0;
        }
        System.out.println(Arrays.toString(b));
        System.out.println(sum);
        System.out.println(count);
    }
    //second
    public static void second() {
        int rows = 8;
        int cols = 5;
        int[][] matrix = new int[rows][cols];
        create(matrix);
        print(matrix);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        sort(matrix);
        print(matrix);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        calculateAndReplace2D(matrix);
    }

    private static void print(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    private static void create(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) Math.floor(Math.random() * (51 - 4 + 1) + 51);
            }
        }
    }

    private static void calculateAndReplace2D(int[][] matrix) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0 || (i % 3 == 0 && j % 3 == 0)) continue;
                count++;
                sum += matrix[i][j];
                matrix[i][j] = 0;
            }
        }
        print(matrix);
        System.out.println(sum);
        System.out.println(count);
    }

    private static void sort(int[][] matrix) {
        for (int i0 = 0; i0 < matrix.length - 1; i0++)
            for (int i1 = 0; i1 < matrix.length - i0 - 1; i1++)
                if ((matrix[i1][0] > matrix[i1 + 1][0])
                        ||
                        (matrix[i1][0] == matrix[i1 + 1][0] &&
                                matrix[i1][1] < matrix[i1 + 1][1])
                        ||
                        (matrix[i1][0] == matrix[i1 + 1][0] &&
                                matrix[i1][1] == matrix[i1 + 1][1] &&
                                matrix[i1][2] < matrix[i1 + 1][2]))
                    change(matrix, i1, i1 + 1, matrix[0].length);
    }

    private static void change(int[][] matrix, int row1, int row2, int colCount) {
        int tmp;
        for (int j = 0; j < colCount; j++) {
            tmp = matrix[row1][j];
            matrix[row1][j] = matrix[row2][j];
            matrix[row2][j] = tmp;
        }
    }

    private static void third(){
        StudentStruct[] students = new StudentStruct[4];
        students[0]=new StudentStruct();
        students[0].secondName="Торба";
        students[0].course=1;
        students[0].specialty="Комп'ютерні науки";
        students[0].mathGrade=4;
        students[0].physicsGrade=5;
        students[0].computerScienceGrade=2;

        students[1]=new StudentStruct();
        students[1].secondName="Куля";
        students[1].course=3;
        students[1].specialty="Фізика";
        students[1].mathGrade=5;
        students[1].physicsGrade=5;
        students[1].computerScienceGrade=5;

        students[2]=new StudentStruct();
        students[2].secondName="Штрик";
        students[2].course=2;
        students[2].specialty="Математики";
        students[2].mathGrade=3;
        students[2].physicsGrade=3;
        students[2].computerScienceGrade=3;

        students[3]=new StudentStruct();
        students[3].secondName="Дріт";
        students[3].course=1;
        students[3].specialty="Математики";
        students[3].mathGrade=3;
        students[3].physicsGrade=4;
        students[3].computerScienceGrade=4;
        printstruct(students);
        int superGrade = superGradeCounter(students);
        System.out.println("Students that have super grade: "+superGrade);

    }
    private static int  superGradeCounter(StudentStruct[] students){
        return (int)Arrays.stream(students)
                .filter(studentStruct -> studentStruct.mathGrade==5&&studentStruct.physicsGrade==5&&studentStruct.computerScienceGrade==5)
                .count();
    }
    private static void printstruct(StudentStruct[] students){
        System.out.printf("|%15s |%7s |%20s |%10s |%13s|%20s |\n","secondName","course","specialty","mathGrade","physicsGrade","computerScienceGrade");
        System.out.println("-------------------------------------------------------------------------------------------------");
        for (StudentStruct student :students){
            System.out.printf("|%15s |%7s |%20s |%10s |%13s|%20s |\n",student.secondName,student.course,student.specialty
                    ,student.mathGrade,student.physicsGrade,student.computerScienceGrade);
        }
        System.out.println("-------------------------------------------------------------------------------------------------");
    }
}
