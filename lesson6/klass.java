package lesson6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class klass{
    public static void main(String[] args) {
        notebook N1=new notebook("Zenbook 14",152878,"Asus");
        N1.setColor("black");
        N1.setHDD(700);
        N1.setOS("Windows");
        N1.setRAM(8);
        
        notebook N2=new notebook("ThinkPad X1 Carbon Gen 9",7867,"Lenovo");
        N2.setColor("white");
        N2.setHDD(1000);
        N2.setOS("Windows");
        N2.setRAM(8);

        notebook N3=new notebook("Spectre X360",65346,"hp");
        N3.setColor("white");
        N3.setHDD(900);
        N3.setOS("Windows");
        N3.setRAM(16);

        notebook N4=new notebook("MagicBook 15",46677,"HONOR");
        N4.setColor("black");
        N4.setHDD(700);
        N4.setOS("Linux");
        N4.setRAM(8);

        notebook N5=new notebook("MacBook Air 13",8438483,"Apple");
        N5.setColor("silver");
        N5.setHDD(1000);
        N5.setOS("macOS");
        N5.setRAM(8);
        
        HashSet <notebook> notebooks = new HashSet<>(Arrays.asList(N1,N2,N3,N4,N5));
        HashSet <notebook> res = new HashSet<>();

        System.out.println("Здравствуйте");
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 0, чтобы осуществить поиск\n");
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        if(n==0){
            System.out.println("Тогда взгляните на возможные варианты");
            System.out.println();
            System.out.print(Arrays.asList(N1, N2, N3, N4, N5));
            
        }
        while(n!=0){
            
        if(n==1){
            System.out.println("Введите минимальную оперативную память");
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите минимальный объем ЖД" );
            Integer temp = sc.nextInt();
            sc.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = sc.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = sc.nextLine();
            filters.put("color", temp);
        }
        
        System.out.print("Введите цифру, соответствующую необходимому критерию:\n 1 - ОЗУ \n 2 - Объем ЖД \n 3 - Операционная система \n 4 - цвет \n или 0, чтобы показать результат поиска\n");
        n = sc.nextInt();
        sc.nextLine();
             
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook N = (notebook) it.next();
                    if(N.getRAM()>=(Integer)entry.getValue()){
                        res.add(N);
                    }
                }
                }
             if(entry.getKey().equals("HDD")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook N = (notebook)it.next();
                    if(N.getHDD()>=(Integer)entry.getValue()){
                        res.add(N);
                        }
                    }
                    }
            if(entry.getKey().equals("OS")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook N = (notebook)it.next();
                        if(N.getOS().equals(entry.getValue())){
                            res.add(N);
                            }
                        }
                        }
            if(entry.getKey().equals("color")){
                Iterator it = notebooks.iterator();
                while(it.hasNext()){
                    notebook N = (notebook)it.next();
                        if(N.getColor().equals(entry.getValue())){
                            res.add(N);
                                    }
                                }
                                }
            }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                notebook N = (notebook)it.next();
            System.out.println(N.toString());
            System.out.println();
        }
        
        
    }}

    