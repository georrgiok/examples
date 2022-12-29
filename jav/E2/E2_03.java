package jav.E2;
import java.util.ArrayList;
import java.util.Map;

import jav.Lib_folder.Lib;

// Дана json строка (можно сохранить в файл и читать из файла) (Коллеги, если сложно будет распарсить .json -> можно работать как со строкой обычной)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
public class E2_03 {
    public static void main(String[] args) {
        String a = Lib.ReadFile("jav/E2/E2_03.json");

        ArrayList<String> arrayList = new ArrayList<>();

        boolean z =true;
        int x = 1;
        while (z) {
            
        
            if (a.indexOf(",{")!=-1) {
                arrayList.add(a.substring(x, a.indexOf(",{")));
                a=a.substring(a.indexOf(",{")+1);
                x = 0;
            } else {
                z=false;
                arrayList.add(a.substring(x, a.indexOf("]")));  
            }
        }
        StringBuilder c = new StringBuilder()  ;
    
        for (String b : arrayList) {
            
            Map<String, String> map=Lib.FromJsonToMap(b);
            c.append("Студент ");
            c.append(map.get("фамилия"));
            c.append(" получил ");
            c.append(map.get("оценка"));
            c.append(" по предмету ");
            c.append(map.get("предмет"));
            c.append("\n");
        }
        Lib.Write(c.toString());


    }
    
}
