
//*(ДОПОЛНИТЕЛЬНАЯ) +Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69 (пользователь).
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.
//Ввод: 2? + ?5 = 69
//Вывод: 24 + 45 = 69
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите результат: ");
        int r = iScanner.nextInt();
        System.out.printf("Введите десятки первого числа: ");
        int l = iScanner.nextInt();
        System.out.printf("Введите еденицы второго числа: ");
        int c = iScanner.nextInt();

        int count = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (l * 10 + i + j * 10 + c == r) {
                    count += 1;
                    System.out.println(count + ")" + l + i + " + " + j + c + " = " + r);
                    iScanner.close();
                }
            }
        }
        System.out.println("\n");
        if (count == 0) {
            System.out.println("Решений нет\n");
        }

    }
}
