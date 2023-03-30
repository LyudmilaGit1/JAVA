//Реализовать простой калькулятор (+ - / *)
//Ввод числа ->
//Ввод знака ->
//Ввод числа ->

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Введите второе число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите действие: ");
        String operations = Operations();
        System.out.println(getResult(operations, i, a));
        iScanner.close();
    }

    static String Operations() {
        try (Scanner scan = new Scanner(System.in)) {
            String operations = scan.nextLine();
            return operations;
        }
    }

    static int getResult(String opr, int num1, int num2) {
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
