
//Вывести все простые числа от 1 до 1000

public class task2 {

    public static void main(String[] args) {

        for (int a = 2; a < 1000; a++) {
            if ((a % 7 == 0 && a % 2 == 0) && (a % 3 == 0 && a % 5 == 0)) {

                System.out.printf(" %s,", a);
            }
        }

    }
}
