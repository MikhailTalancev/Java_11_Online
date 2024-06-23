package ua.com.alevel.controller;

import ua.com.alevel.reverse_logic.StringReverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverseController {
    public void start() {
        System.out.println("Welcome to String Reverse!");
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
        System.out.println("If you want reverse string please enter 1");
        System.out.println("If you want reverse string by substring please enter 2");
        System.out.println("If you want reverse string by index please enter 3");
        System.out.println("If you want exit please enter 4");
    }

    private void goToOperations(String text, BufferedReader reader) {
        switch (text) {
            case "1" -> reverse(reader);
            case "2" -> reverseBySubstring(reader);
            case "3" -> reverseByIndex(reader);
            case "4" -> System.exit(0);
        }
    }

    private void reverseByIndex(BufferedReader reader) {
        try {
            System.out.println("Please enter your string:");
            String text = reader.readLine();
            System.out.println("Please enter left index:");
            int l = Integer.parseInt(reader.readLine());
            System.out.println("Please enter right index:");
            int r = Integer.parseInt(reader.readLine());
            System.out.println("reverse String = " + StringReverse.reverse(text,l,r));
        } catch (IOException e) {
            System.out.println("e=" + e);
        }
    }

    private void reverseBySubstring(BufferedReader reader) {
        try {
            System.out.println("Please enter your string:");
            String text = reader.readLine();
            System.out.println("Please enter substring");
            String subText = reader.readLine();
            System.out.println("reverse String = " + StringReverse.reverse(text, subText));
        } catch (IOException e) {
            System.out.println("e=" + e);
        }

    }
    private void reverse(BufferedReader reader) {
        try {
            System.out.println("Please enter your string:");
            String text = reader.readLine();
            System.out.println("reverse String = " + StringReverse.reverse(text));
        } catch (IOException e) {
            System.out.println("e=" + e);
        }
    }
}
