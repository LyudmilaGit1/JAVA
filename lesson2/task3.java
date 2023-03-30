package lesson2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("logs1.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите действие: ");
        String operations = Operations(logger);
        System.out.println(getResult(operations, i, a, logger));
        iScanner.close();
    }

    static String Operations(Logger logger) {
        try (Scanner scan = new Scanner(System.in)) {
			String operations = scan.nextLine();
			return operations;
		}
    }

    static int getResult(String opr, int num1, int num2, Logger logger) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");

        }
        return result;
    }

}
