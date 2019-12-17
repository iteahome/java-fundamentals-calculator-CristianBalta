package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String c = s.next();
        double a = s.nextDouble();
        double b = s.nextDouble();
        System.out.println(Calculator(c,a,b));
    }


    public static double Calculator(String c, double a,double b)
    {
        double rezultat = 0;

        switch (c)
        {
        case "+": rezultat =  a+b;break;
        case "-": rezultat = a-b;break;
        case "*": rezultat = a*b;break;
        case "/": rezultat = a/b;break;
            default: break;
    }
    return rezultat;

    }

}
