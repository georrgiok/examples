package jav.E6;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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

public class E6_01 {
   public static void main(String[] args) {

   ArrayList<Notebook> notebook_list = RandomNotebookList(30);

     // print(p);
     HashMap<String, String> filter = Choose();
     Lib.Write("Вам подходит:");
     ArrayList<Notebook> itog = FilterNotebookList(notebook_list,filter);
     

     if (itog.size()==0) {
      Lib.Write("не найдено подходящих вариантов");
     }
     else{
      print(itog);
     }

     
   }

   public static ArrayList<Notebook> FilterNotebookList(ArrayList<Notebook> notebook_list,HashMap<String, String> filter) {
      
      ArrayList<Notebook> newlist = new ArrayList<Notebook>()  ;

      for (Notebook z :  notebook_list) {

        if (filter.containsKey("brand")&&!z.brand.equals(filter.get("brand"))) {continue;}
        if (filter.containsKey("os")&&!z.os.equals(filter.get("os"))) {continue;}
        if (filter.containsKey("diagonal")&&!(z.diagonal >= Integer.parseInt(filter.get("diagonal")))) {continue;}
        if (filter.containsKey("color")&&!z.color.equals(filter.get("color"))) {continue;}
        if (filter.containsKey("cpu")&&!z.cpu.equals(filter.get("cpu"))) {continue;}
        if (filter.containsKey("gpu")&&!z.gpu.equals(filter.get("gpu"))) {continue;}
        if (filter.containsKey("memory")&&!(z.memory>= Integer.parseInt(filter.get("memory")))) {continue;}
        if (filter.containsKey("storage")&&!(z.storage>= Integer.parseInt(filter.get("storage")))) {continue;}
        newlist.add(z);


        
      

            

   
        
      }
      return newlist;
   }




   public static HashMap<String, String> Choose() {


      HashMap<String, String> criteriy = new HashMap<String,String>();
      

      
      ArrayList<String> brand = new ArrayList<String>(Arrays.asList("hp","lenovo","irbis"));
      ArrayList<Notebook> arr = new ArrayList<Notebook>();
      ArrayList<Integer> storage = new ArrayList<Integer>(Arrays.asList(256,512,1024)); 
      ArrayList<String> os = new ArrayList<String>(Arrays.asList("windows 10","dos","windows 11","linux mint")); 
      ArrayList<Integer> memory = new ArrayList<Integer>(Arrays.asList(4,8,16,32)); 
      ArrayList<String> cpu = new ArrayList<String>(Arrays.asList("Intel Celeron N4020"," Intel Core i5-10300H","Intel Core i5-11400H","Intel Core i5-1135G7"));
      ArrayList<Integer> diagonal = new ArrayList<Integer>(Arrays.asList(10,11,12,13,14,15,16));  
      ArrayList<String> gpu = new ArrayList<String>(Arrays.asList("GeForce GTX 1650 4 ГБ","интегрированная"," Radeon RX 6600 XT"," Intel UHD Graphics 600")); 
      ArrayList<String> colors = new ArrayList<String>(Arrays.asList("black","red","green","white")); 
      

      String chek = "";
      while (chek.equals("")) {
         Lib.Write(" Укажите номер подходящего вам критерия фильтрации:\nбренд -1 \nos -2 \nдиагональ -3\nоперативная память -4\nпостоянная память -5\nпроцессор -6\nвидеокарта -7\nцвет -8");
         String crite = Lib.Take();

      
         switch (crite) {
            case "1":
               see_variants(brand,"brand",criteriy);
               break;

            case "2":
               see_variants(os,"os",criteriy);
               break;

            case "3":
               see_Int_variants(diagonal,"diagonal",criteriy);
               break;

            case "4":
               see_Int_variants(memory,"memory",criteriy);
               break;

            case "5":
               see_Int_variants(storage,"storage",criteriy);
               break;

            case "6":
               see_variants(cpu,"cpu",criteriy);
               break;

            case "7":
               see_variants(gpu,"gpu",criteriy);
               break;

            case "8":
               see_variants(colors,"colors",criteriy);
               break;


            default:
               Lib.Write("Не верно выбрана цифра");
               break;


         }
         Lib.Write(" Нажмите enter для выбора нового критерия или введите любой символ для завершения и получения результата ");
         chek = Lib.Take(); 
         

         
      }
      
      return criteriy;

   } 

   public static void see_Int_variants(ArrayList<Integer> list, String name,HashMap<String, String> criteriy ) {
      String x = null;
      
      String mes = "укажите минимальные значения для указанных критериев\n";
      for (int i = 0; i < list.size(); i++) {
         mes += "вариант "+i + "  " + list.get(i)+"\n";
      }
      Lib.Write(mes);
      x = Lib.Take();
      criteriy.put(name,""+list.get(Integer.parseInt(x)));
   }
   public static void see_variants(ArrayList<String> list, String name,HashMap<String, String> criteriy ) {
      String x = null;
      String mes = "Выберете нужное значение\n";
      for (int i = 0; i < list.size(); i++) {
         mes += "вариант "+i + "  " + list.get(i)+"\n";
      }
      Lib.Write(mes);
      x = Lib.Take();
      criteriy.put(name,list.get(Integer.parseInt(x)));
   }

   
   

   public static ArrayList<Notebook> RandomNotebookList(Integer m) {

      HashMap<String,ArrayList<String>> models = new HashMap<String,ArrayList<String>>();
      ArrayList<String> brand = new ArrayList<String>(Arrays.asList("hp","lenovo","irbis"));
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
         String key = brand.get(Lib.getRandomInt(0,brand.size()-1));
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