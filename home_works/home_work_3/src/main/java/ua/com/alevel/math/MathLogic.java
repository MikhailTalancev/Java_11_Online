package ua.com.alevel.math;

import org.apache.commons.math3.util.ArithmeticUtils;
import org.apache.commons.math3.util.CombinatoricsUtils;

public class MathLogic {
    public static double sum(double a, double b){
        return a+b;
    }
    public static double multiply(double a, double b){
        return a*b;
    }

    public static double subtract(double a, double b){
        return a-b;
    }

    public static double division(double a, double b){
        return a/b;
    }

    public static long factorial(int a){
        return CombinatoricsUtils.factorial(a);
    }

    public static int power(int a, int b){
        return ArithmeticUtils.pow(a,b);
    }
}
