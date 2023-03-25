package lesson2;

import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой итерации запишите в лог-файл.

public class task1 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("logs.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        int[] sortArray = new int[] { 15, 9, 0, 4, 7, 3, 2, 1, 14, 25 };

        bubbleSort(sortArray, logger);

    }

    public static void bubbleSort(int[] array, Logger logger) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.info(Arrays.toString(array));
                }
            }
        }
    }
}
