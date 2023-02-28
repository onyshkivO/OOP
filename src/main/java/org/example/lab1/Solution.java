package org.example.lab1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Solution {
    public void lab3_1() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        double A;
        double B;

        System.out.print("x= ");
        x = scanner.nextInt();


        A = 1 / abs(x + 2) + 1;
        if (x < 1) {
            B = 7 * x * x + x - 8;
        }
        if (1 <= x && x <= 4) {
            B = cos((x + 4) / sqrt(11)) / sin((x + 4) / sqrt(11)) + 3;
        }
        else {
            B = sqrt(1 + abs(pow(cos(x), 3)));
        }

        y = A - B;
        System.out.println("1)y = " + y);


        if (x < 1) {
            B = 7 * x * x + x - 8;
        } else if (x > 4) {
            B = sqrt(1 + abs(pow(cos(x), 3)));
        } else {
            B = cos((x + 4) / sqrt(11)) / sin((x + 4) / sqrt(11)) + 3;
        }
        y = A - B;
        System.out.println("2)y = " + y);
    }

    public void lab4_1(){
        int i;
        double P;

        i = 1;
        P = 1;

        while (i<=15)
        {
            P *= (sin(i) * sin(i) + cos(1 / i) * cos(1 / i)) /(i * i) ;
            i++;
        }
        System.out.println( "p1= "+P );

        i = 1;
        P = 1;

        do
        {
            P *= (sin(i) * sin(i) + cos(1 / i) * cos(1 / i)) / (i * i);
            i++;
        } while (i<=15);

        System.out.println( "p2= "+P );

        P = 1;
        i = 1;
        for (; i <= 15; i++)
        {
            P *= (sin(i) * sin(i) + cos(1 / i) * cos(1 / i)) / (i * i);
        }

        System.out.println( "p3= "+P );

        P = 1;
        i = 15;
        for (; i>=1; i--)
        {
            P *= (sin(i) * sin(i) + cos(1 / i) * cos(1 / i)) / (i * i);
        }

        System.out.println( "p4= "+P );

    }

    public void lab4_2(){
        double x, xp, xk, dx, A, B, y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("xp = ");
        xp = scanner.nextInt();
        System.out.print("xk = ");
        xk = scanner.nextInt();
        System.out.print("dx = ");
        dx = scanner.nextInt();


        System.out.println( "---------------------------" );
        System.out.println( "|       x |        y |");
        System.out.println( "---------------------------" );

        x = xp;

        while (x<=xk)
        {
            A = 1 / abs(x + 2) + 1;

            if (x < 1)
            {
                B = 7 * x * x + x - 8;
            }
            else
            if (x > 4)
            {
                B = sqrt(1 + abs(pow(cos(x), 3)));
            }
            else
            {
                B = cos((x + 4) / sqrt(11)) / sin((x + 4) / sqrt(11)) + 3;
            }

            y = A - B;
            System.out.printf  ("|%8.2f | %8.2f |  \n", x, y);
            //System.out.println("|      "+x+" |           "+y+" |");

            x +=dx;
        }

        System.out.println( "---------------------------" );

    }
}
