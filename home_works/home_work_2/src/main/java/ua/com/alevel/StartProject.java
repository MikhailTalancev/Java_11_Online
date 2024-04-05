package ua.com.alevel;

import ua.com.alevel.tasks.TaskOne;
import ua.com.alevel.tasks.TaskThree;
import ua.com.alevel.tasks.TaskTwo;

import java.io.IOException;

public class StartProject {
    public static void main(String[] args) throws IOException {
        TaskOne taskOne = new TaskOne();
        taskOne.doTask();

        TaskTwo taskTwo = new TaskTwo();
        taskTwo.doTask();

        TaskThree taskThree = new TaskThree();
        taskThree.doTask();
    }
}