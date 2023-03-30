// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
package lesson4;

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {

        int[] lst = {15, 5, 3, 16, 8, 6, 11, 9, 28, 35};
        LinkedList<Integer> lst1 = new LinkedList<>();
        for (Integer temp : lst) {
            lst1.add(temp);
        }        
        int count = 0;
        while (count != lst1.size() - 1) {
            lst1.add(lst1.size()-count, lst1.getFirst());
            lst1.removeFirst();
            count++;
        }
        System.out.println("revers = " + lst1);      
    }
}

