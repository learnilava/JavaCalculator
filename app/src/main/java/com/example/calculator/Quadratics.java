package com.example.calculator;

import java.util.Scanner;

public class Quadratics {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] sam = solve("s.nextLine()");

        for (int i=0; i < sam.length; i ++){
            System.out.println(sam[i]);
        }
    }

    public static String[] solve(String equation) {
//        String[] equationElements = equation.split("+");

        int a = 1;
        int b = 2;
        int c = -63;


        String sol1 = String.valueOf((b*(-1)) + Math.sqrt(((b*b) - (4*a*c)))/(2*a));
        String sol2 = String.valueOf((b*(-1)) - Math.sqrt(((b*b) - (4*a*c)))/(2*a));

        String[] answers = {sol1, sol2};


        return answers;
    }
}
