package ua.com.alevel.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TaskTwo {

    private String getData() throws IOException {
        System.out.println("Task Two");
        System.out.println("Enter data:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private void print(int count, Character a, Integer b){
        System.out.println(count + "." + " " + a + " " + b);
    }

    public void doTask() throws IOException {
        String data = getData();
        char[] dataArray = data.toCharArray();
        HashMap<Character, Integer> parseData = new HashMap<Character, Integer>();

        for(char aChar :  dataArray){
            if(!parseData.containsKey(aChar)){
                parseData.put(aChar, 1);
            } else {
                parseData.replace(aChar, parseData.get(aChar)+1);
            }
        }

        Set<Character> parseDataKeys = parseData.keySet();
        int count = 1;

        for (Character a : parseDataKeys){
            if(a >= 'a' && a <= 'z') {print(count, a, parseData.get(a)); count++;}
            if(a >= 'A' && a <= 'Z') {print(count, a, parseData.get(a)); count++;}
            if(a >= 'а' && a <= 'я') {print(count, a, parseData.get(a)); count++;}
            if(a >= 'А' && a <= 'Я') {print(count, a, parseData.get(a)); count++;}

        }
    }
}
