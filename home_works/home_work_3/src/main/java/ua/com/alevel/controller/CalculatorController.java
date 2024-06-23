package ua.com.alevel.controller;

import ua.com.alevel.math.MathLogic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorController {
    public void start() {
        System.out.println("Welcome to Calculator!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            String text;
            menu();
            while ((text = reader.readLine()) != null) {
                goToOperations(text, reader);
                menu();
            }
        } catch (IOException e) {
            System.out.println("e=" + e);
        }

    }

    private void menu() {
        System.out.println("If you want find sum please enter 1");
        System.out.println("If you want find subtract please enter 2");
        System.out.println("If you want find multiply please enter 3");
        System.out.println("If you want find division please enter 4");
        System.out.println("If you want find raise to a power please enter 5");
        System.out.println("If you want find factorial please enter 6");
        System.out.println("If you want exit please enter 7");
    }

    private void goToOperations(String text, BufferedReader reader) {
        switch (text) {
            case "1" -> sum(reader);
            case "2" -> sub(reader);
            case "3" -> mul(reader);
            case "4" -> div(reader);
            case "5" -> pow(reader);
            case "6" -> fac(reader);
            case "7" -> System.exit(0);
        }
    }

    private void pow(BufferedReader reader) {
        try {
            System.out.println("Please enter a number");
            int left = Integer.parseInt(reader.readLine());
            System.out.println("Please enter a power");
            int right = Integer.parseInt(reader.readLine());
            int pow = MathLogic.power(left,right);
            System.out.println("result = " + pow);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }

    private void fac(BufferedReader reader) {
        try {
            System.out.println("Please enter a number");
            int left = Integer.parseInt(reader.readLine());
            long fac = MathLogic.factorial(left);
            System.out.println("factorial = " + fac);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }

    private void div(BufferedReader reader) {
        try {
            System.out.println("Please enter a left number");
            double left = Double.parseDouble(reader.readLine());
            System.out.println("Please enter a right number");
            double right = Double.parseDouble(reader.readLine());
            double div = MathLogic.division(left,right);
            System.out.println("division = " + div);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }

    private void mul(BufferedReader reader) {
        try {
            System.out.println("Please enter a left number");
            double left = Double.parseDouble(reader.readLine());
            System.out.println("Please enter a right number");
            double right = Double.parseDouble(reader.readLine());
            double mul = MathLogic.multiply(left,right);
            System.out.println("multiply = " + mul);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }

    private void sub(BufferedReader reader) {
        try {
            System.out.println("Please enter a left number");
            double left = Double.parseDouble(reader.readLine());
            System.out.println("Please enter a right number");
            double right = Double.parseDouble(reader.readLine());
            double sub = MathLogic.subtract(left,right);
            System.out.println("subtract = " + sub);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }

    void sum(BufferedReader reader) {
        try {
            System.out.println("Please enter a left number");
            double left = Double.parseDouble(reader.readLine());
            System.out.println("Please enter a right number");
            double right = Double.parseDouble(reader.readLine());
            double sum = MathLogic.sum(left,right);
            System.out.println("sum = " + sum);
        } catch (IOException e){
            System.out.println("e=" + e);
        } catch (NumberFormatException e){
            System.out.println("Invalid Data");
        }
    }
}
