
// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package lesson3;

import java.util.ArrayList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random num = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            int value = num.nextInt(-1000, 1000);
            lst.add(value);
        }
        System.out.printf("Список целых чисел %s\n", lst);
        int i = 0;
        while (i < lst.size()) {
            if (lst.get(i) % 2 == 0) {
                lst.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("Все нечетные числа %s", lst);
    }
}
