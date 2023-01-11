package jav.E5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import jav.Lib_folder.Lib;

/**Пусть дан список сотрудников:
 * {"Иван Иванов","Светлана Петрова", "Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"}
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
 Отсортировать по убыванию популярности. */
public class E5_02 {
    public static void main(String[] args) {
        String[] a = {"Иван Иванов","Светлана Петрова", "Кристина Белова","Анна Мусина","Анна Крутова","Иван Юрин","Петр Лыков","Павел Чернов","Петр Чернышов","Мария Федорова","Марина Светлова","Мария Савина","Мария Рыкова","Марина Лугова","Анна Владимирова","Иван Мечников","Петр Петин","Иван Ежов"};
       
        HashMap<String,Integer> list = new HashMap<String,Integer>();

        for (String iter : a ) {
            String name = iter.substring(0, iter.indexOf(" "));
            if (list.containsKey(name)){//есть ли этот ключ
                list.put(name,list.get(name)+1);//вставить
            }
            else{
                list.put(name,1);
            }
        }
        ArrayList<String> sortlist = new ArrayList<String>();
        while(list.size()>0){
            Integer max =0;
            String name = "";

            for (Map.Entry<String, Integer> entry : list.entrySet()) {//перебор мапы ключ/знач

            
                if (max<entry.getValue()) {
                    max = entry.getValue();
                    name = entry.getKey();
                }
                
                
            }
            sortlist.add(name+": "+max);
            list.remove(name);

        }
        Lib.Write(""+sortlist);


    }
}
