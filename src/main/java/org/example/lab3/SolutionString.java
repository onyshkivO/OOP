package org.example.lab3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolutionString {

    public static String countAndReplace(String s) {
        Pattern p = Pattern.compile(" o");
        Matcher m = p.matcher(s);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        System.out.println(counter);
        return s.replace(" o", "*");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        String s1 = scanner.nextLine();
        System.out.print("Input second string: ");
        String s2 = scanner.nextLine();
        System.out.println("Concatenation " + s1 + s2);
        System.out.println("Порівняння == : " + (s1==s2));
        System.out.println("Порівняння equals : "+s1.equals(s2));
        System.out.println("Порівняння compareTo : "+s1.compareTo(s2));



        s1 = countAndReplace(s1);

    }
}
