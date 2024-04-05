package ua.com.alevel.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskThree {
    private String getData() throws IOException {
        System.out.println("Task Three");
        System.out.println("Enter data:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        return reader.readLine();
    }

    private void print(int timeH, int timeM) {
        if (timeH > 9) {
            System.out.print(timeH);
        } else {
            System.out.print("0" + timeH);
        }
        System.out.print(" ");
        if (timeM > 9) {
            System.out.println(timeM);
        } else {
            System.out.println("0" + timeH);
        }


    }

    private int getAnswerMinute(int data){
        int sum = 9*60;

        sum += data*45;

        sum += 5*((data)/2);

        sum += 15*((data-1)/2);

        return sum;
    }
    public void doTask() throws IOException {
        int data = Integer.parseInt(getData());

        int answer = getAnswerMinute(data);

        print(answer/60, answer%60);
    }
}
