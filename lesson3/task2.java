package lesson3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

import java.util.ArrayList;
import java.util.Random;

public class task2 {

    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> lst = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            lst.add(val);
        }
        System.out.printf("Целочисленный список %s\n", lst);
        int maxItem = lst.get(0);
        int minItem = lst.get(0);
        int sumItems = 0;
        for (int item : lst) {
            if (item > maxItem) {
                maxItem = item;
            }
            if (item < minItem) {
                minItem = item;
            }
            sumItems += item;
        }
        float average = (float) sumItems / lst.size();

        System.out.printf("Максимальный элемент %s\n", maxItem);
        System.out.printf("Минимальный элемент %s\n", minItem);
        System.out.printf("Среднее арифметическое %s\n", average);
    }
}
