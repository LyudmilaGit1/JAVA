// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.
package lesson4;

import java.util.LinkedList;

public class task2 {
    public static void main(String[] args) {
        int[] list = {5, 8, 12, 36, 45, 16, 8, 9, 11};
        LinkedList<Integer> linkList = new LinkedList<>();
        for (Integer temp : list) {
            linkList.add(temp);
        }
       
        System.out.println(linkList);
              

        enqueue(linkList, 0);
        System.out.println(linkList);

        System.out.println(dequeue(linkList));
        
        System.out.println(first(linkList));
        System.out.println(linkList);
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.add(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
    
}
