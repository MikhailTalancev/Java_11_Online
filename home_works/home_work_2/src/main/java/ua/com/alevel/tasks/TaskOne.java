package ua.com.alevel.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskOne {

    private String getData() throws IOException {
        System.out.println("Task One");
        System.out.println("Enter data:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private void print(int sum){
        System.out.println("sum:" + sum);
    }

    public void doTask() throws IOException {
        String data = getData();
        char[] dataChar = data.toCharArray();
        int sum = 0;

        for (char aChar : dataChar){
            int ch = (int) aChar;
            if (ch >= 48 && ch <= 57) {
                sum = sum + Character.getNumericValue(aChar);
            }
        }

        print(sum);
    }


}
