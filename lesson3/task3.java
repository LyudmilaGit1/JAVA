// Реализовать алгоритм сортировки слиянием
package lesson3;
import java.util.Arrays;
import java.util.Random;

public class task3 {
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 7, 8, 18, 25, 38, 8, 4, 1, 15, 10};
        int[] result = mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergeSort(int[] sortArr) {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int firstIndex, int lastIndex) {
        if (firstIndex >= lastIndex - 1) {
            return buffer1;
        }

        int middle = firstIndex + (lastIndex - firstIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, firstIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, lastIndex);

        int index1 = firstIndex;
        int index2 = middle;
        int destIndex = firstIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < lastIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < lastIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }
   
}