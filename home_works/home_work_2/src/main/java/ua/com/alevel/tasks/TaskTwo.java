package ua.com.alevel.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;

public class TaskTwo {
    private String getData() throws IOException {
        System.out.println("Task Two");
        System.out.println("Enter data:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private void print(Character a, int b){
        System.out.println(a + " " + b);
    }

    public void doTask() throws IOException {
        String data = getData();
    }
}
