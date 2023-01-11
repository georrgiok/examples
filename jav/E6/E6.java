package jav.E6;
import java.util.Map;
import java.net.spi.InetAddressResolver.LookupPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import javax.naming.StringRefAddr;
import jav.E6.Notebook;
/* 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 2. Создать множество ноутбуков.
 3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 “Введите цифру, соответствующую необходимому критерию:
 1 - ОЗУ
 2 - Объем ЖД
 3 - Операционная система
 4 - Цвет …
  1. Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
  2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям. */
   import jav.Lib_folder.Lib;

public class E6 {
   public static void main(String[] args) {
      ArrayList<Notebook> p = RandomNotebookList(28);


     // print(p);
      
     Lib.Write(" Choice your criteria and write number:\n1) Brend write-0\n2) model write-1 \n3) os write-2 \n4) diagonal write-3\n5) memory write-4\n6) storage write-5\n7) cpu write-6\n8) gpu write-7\n9) color write-8");
     
     String crite = Lib.Take();}

     public static ArrayList<Notebook> RandomNotebookList(Integer m) {

        HashMap<String,ArrayList<String>> models = new HashMap<String,ArrayList<String>>();
        ArrayList<String> bran = new ArrayList<String>(Arrays.asList("hp","lenovo","irbis"));
        models.put("hp", new ArrayList<String>(Arrays.asList("TG01-2089ur","Pavilion Gaming 17-cd2080ur","TBook 14 G2 ITL","OMEN 15-en1021ur" )));
        models.put("lenovo", new ArrayList<String>(Arrays.asList("ThinkBook 15 G2 ITL","Legion 5 15ITH6H","ThinkPad T14 Gen 1","ThinkPad T14 Gen 1")));
        models.put("irbis", new ArrayList<String>(Arrays.asList("NB610","NB6900","NB120","NB8930")));
        ArrayList<Notebook> arr = new ArrayList<Notebook>();
        ArrayList<Integer> storage = new ArrayList<Integer>(Arrays.asList(256,512,1024)); 
        ArrayList<String> os = new ArrayList<String>(Arrays.asList("windows 10","dos","windows 11","linux mint")); 
        ArrayList<Integer> memory = new ArrayList<Integer>(Arrays.asList(4,8,16,32)); 
        ArrayList<String> cpu = new ArrayList<String>(Arrays.asList("Intel Celeron N4020"," Intel Core i5-10300H","Intel Core i5-11400H","Intel Core i5-1135G7"));
        ArrayList<Integer> diagonal = new ArrayList<Integer>(Arrays.asList(10,11,12,13,14,15,16));  
        ArrayList<String> gpu = new ArrayList<String>(Arrays.asList("GeForce GTX 1650 4 ГБ","интегрированная"," Radeon RX 6600 XT"," Intel UHD Graphics 600")); 
        ArrayList<String> colors = new ArrayList<String>(Arrays.asList("black","red","green","white")); 
  
  
  
        for (int i = 0; i < m; i++) {
           String key = bran.get(Lib.getRandomInt(0,bran.size()-1));
           ArrayList<String> mod = models.get(key);
           Notebook a = new Notebook(key, mod.get(Lib.getRandomInt(0,mod.size()-1)));
           a.memory=memory.get(Lib.getRandomInt(0,memory.size()-1));
           a.cpu=cpu.get(Lib.getRandomInt(0,cpu.size()-1));
           a.diagonal=diagonal.get(Lib.getRandomInt(0,diagonal.size()-1));
           a.os=os.get(Lib.getRandomInt(0,os.size()-1));
           a.gpu=gpu.get(Lib.getRandomInt(0,gpu.size()-1));
           a.color=colors.get(Lib.getRandomInt(0,colors.size()-1));
           a.storage=storage.get(Lib.getRandomInt(0, storage.size()-1));
           arr.add(a);
          
        }
        
        return arr;
    }
     public static void print(ArrayList<Notebook> z) {
        int x = 1;
  
        for (Notebook notebook : z) {
  
           Lib.Write(x+")");
           notebook.see();
           x++;
           
        }
     }
  
}
