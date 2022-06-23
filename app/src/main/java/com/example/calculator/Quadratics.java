package com.example.calculator;

public class Quadratics {
    public static String solve(String equation) {

        double a;
        double b;
        double c;

//        if

        int ind = equation.indexOf("x^2");

        if (ind == 0){
            a = 1.0;
            equation = equation.substring(2);
        } else {
            String term = equation.substring(0, ind);

            if (term.substring(1) == "+"){
                a = Double.parseDouble(term.substring(1));
            } else {
                a = Double.parseDouble(term);
            }

            equation = equation.substring(ind + 3);
        }

        ind = equation.indexOf("x");
        if (ind == 0){
            b = 1.0;
            equation = equation.substring(0);
        } else {
            String term = equation.substring(0, ind);

            if (term.substring(1) == "+"){
                b = Double.parseDouble(term.substring(2));
            } else {
                b = Double.parseDouble(term.substring(1));
            }
            equation = equation.substring(ind + 1);
        }


        if (equation.substring(1) == "+"){
            c = Double.parseDouble(equation.substring(1));
        } else {
            c = Double.parseDouble(equation);
        }

        double sol1;
        double sol2;
        boolean isSolution = ((b * b - 4 * a * c) > 0);

        if (isSolution) {
            double discriminant = Math.sqrt(b * b - 4 * a * c);

            sol1 = ((b * (-1)) + discriminant) / (2 * a);
            sol2 = ((b * (-1)) - discriminant) / (2 * a);

        } else {
            return "null";
        }

        String ans = "";

        if (sol1 > 0){
            ans += "(X + " + String.valueOf(sol1) + ")";
        } else if (sol1 < 0){
            ans += "(X + " + String.valueOf(sol1) + ")";
        } else if (sol1 == 0){
            ans += "X";
        }


        if (sol2 > 0){
            ans += "(X + " + String.valueOf(sol2) + ")";
        } else if (sol2 < 0){
            ans += "(X + " + String.valueOf(sol2) + ")";
        } else if (sol2 == 0){
            ans += "X";
        }

        return ans;
    }
}

