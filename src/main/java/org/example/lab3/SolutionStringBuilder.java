package org.example.lab3;

import java.util.Scanner;

public class SolutionStringBuilder {
    public static void countAndReplace(StringBuilder s){
        int counter=0;
        int i=0;
        while(i<s.length()-1){
            if (s.charAt(i)==' '&&s.charAt(i+1)=='o'){
                counter++;
                s.replace(i,i+2,"*");
            }
            i++;
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        StringBuilder s1 = new StringBuilder(scanner.nextLine());
        System.out.print("Input second string: ");
        StringBuilder s2 = new StringBuilder(scanner.nextLine());

        System.out.println("Concatenation " + s1 + s2);

        System.out.println("Порівняння == : " + (s1==s2));
        System.out.println("Порівняння equals : "+s1.equals(s2));
        System.out.println("Порівняння compareTo : "+s1.compareTo(s2));

        countAndReplace(s1);
        System.out.println(s1);


    }
}
