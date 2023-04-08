package lesson5;
  // Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
   import java.util.ArrayList;
   import java.util.HashMap;
   import java.util.Map;
   import java.util.Scanner;


public class phonebook {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        Map<String, ArrayList<Integer>> bookPhone = new HashMap<>();
        System.out.printf("Введите фамилию: ");
        String f = iScanner.next();
        System.out.printf("Введите фамилию: ");
        String f1 = iScanner.next();
        System.out.printf("Введите фамилию: ");
        String f2 = iScanner.next();
        System.out.printf("Введите номер: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите номер: ");
        int b = iScanner.nextInt();
        System.out.printf("Введите номер: ");
        int c = iScanner.nextInt();
        System.out.printf("Введите номер: ");
        int a1 = iScanner.nextInt();
        System.out.printf("Введите номер: ");
        int b1 = iScanner.nextInt();
        System.out.printf("Введите номер: ");
        int c1 = iScanner.nextInt();
        addNumber(f, a, bookPhone);
        addNumber(f, b, bookPhone);
        addNumber(f1, c, bookPhone);
        addNumber(f2, a1, bookPhone);
        addNumber(f, b1, bookPhone);
        addNumber(f1, c1, bookPhone);
        printBook(bookPhone);
        iScanner.close();
       }
       
    public static void addNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }

    }
    
    public static void printBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    
} 
    

