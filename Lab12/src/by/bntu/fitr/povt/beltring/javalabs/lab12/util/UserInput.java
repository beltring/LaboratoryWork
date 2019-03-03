package by.bntu.fitr.povt.beltring.javalabs.lab12.util;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);
    
    public static int input(String msg){
        System.out.print(msg);
        int value = scanner.nextInt();
        
        return value;
    }

}
