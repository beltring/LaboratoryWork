package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);
    
    public static int inputInt(String msg){
        System.out.println(msg);
        int value = scanner.nextInt();
        
        return value;
    }
    
    public static String inputStr(String msg){
        System.out.println(msg);
        String value = scanner.next();
        
        return value;
    }
}