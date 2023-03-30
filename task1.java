//Вычислить n-ое треугольного число(сумма чисел от 1 до n),
// а так же n! (произведение чисел от 1 до n)
//Ввод:5
//Треугольное число 1 + 2 + 3 + 4 + 5 = 15
//n! 1 * 2 * 3 * 4 * 5 = 120

import java.util.Scanner;


public class task1 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d, n!: %d\n", Number(i), Number1(i));
        iScanner.close();
    }

    public static int Number(int a) {
        return (a * (a + 1)) / 2;
    }

    public static int Number1(int a) {
        if (a == 1)
            return 1;
        else
            return a * Number1(a - 1);
}
}
