package ua.com.alevel;

public class StartProject {
    public static void main(String[] args){
        ua.com.alevel.print.PrintLower pl = new ua.com.alevel.print.PrintLower();
        ua.com.alevel.print.PrintUpper pu = new ua.com.alevel.print.PrintUpper();

        String msg = "Hello World";

        pl.printLower(msg);
        pu.printUpper(msg);

    }
}