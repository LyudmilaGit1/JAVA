package lesson2;

import java.io.File;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) {
        parse();
    }

    public static void parse() {
        File textFile = new File("text.txt");

        try {
            FileReader f = new FileReader(textFile);
            char[] a = new char[(int) textFile.length()];
            f.read(a);
            StringBuilder sb = new StringBuilder();
            for (char c : a) {
                sb.append(c);
            }
            f.close();
            String line = sb.toString();
            line = line.replace("фамилия", "Студент");
            line = line.replace("оценка", "получил(а)");
            line = line.replace("предмет", "по предмету");
            line = line.replace("\"", "");
            line = line.replace(":", " ");
            line = line.replace(",", " ");
            System.out.println(line);

        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}
// у меня все русские буквы не кодируются? проблема в программе или это кодом
// решается как в python?