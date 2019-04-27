package by.bntu.fitr.povt.beltring.javalabs.lab10.util;

import by.bntu.fitr.povt.beltring.javalabs.lab10.util.exception.InputException;
import java.util.Scanner;

public class UserInput {

    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String msg) throws InputException {
        System.out.print(msg);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            scanner.next();
            throw new InputException("Value must be integer\n");
        }
    }

    public static String inputStr(String msg) {
        System.out.print(msg);
        String result = null;
        result = scanner.nextLine();

        while (result.isEmpty()) {
            result = scanner.nextLine();
        }

        return result;
    }
}
