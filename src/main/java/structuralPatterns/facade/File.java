package structuralPatterns.facade;

import java.util.Scanner;

public class File {
    private String message;
    public void write(){
        Scanner sc = new Scanner(System.in);
        message = sc.nextLine();
        System.out.println(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void read(){
        System.out.println( "Read file: " + message);
    }
}
