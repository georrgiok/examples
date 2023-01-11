package jav.E5;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import jav.Lib_folder.Lib;
import java.util.Map;



//Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
// что 1 человек может иметь несколько телефонов.
public class E5_01 {
  
    String name;
    HashMap<String, LinkedList<String>> phonebook;

    public  E5_01(String bookname) {
        this.phonebook = new HashMap<String, LinkedList<String>>();
        this.name = bookname;

    }
    public void add(String name, String number) {
        LinkedList<String> b;
        if (this.phonebook.containsKey(name)){//сравнивает есть ли такой ключ
            b = this.phonebook.get(name);
            
        }
        else{
            b = new LinkedList<String>();
            this.phonebook.put(name,b);
            
        }
        b.add(number);
        
    }

    public void see() {
        //Iterator it = this.phonebook.entrySet().iterator();
        Lib.Write("Справочник "+this.name);

        for (Map.Entry<String, LinkedList<String>> entry : this.phonebook.entrySet()) {
            Lib.Write( entry.getKey() + "   номер(а): " + entry.getValue());
        }

    }

    public static void main(String[] args) {
        E5_01 a = new E5_01("1");
        a.add("Анна Мусина","+76867866");
        a.add("Иван Юрин","+562161661");

        
        a.add("Иван Юрин","+576575461661");

    
        E5_01 b = new E5_01("2");

        b.add("Иван Мечников","+766342866");
        b.add("Мария Федорова","+56212341");
        b.add("Петр Лыков","+596564061");
        a.see();
        b.see();
 
    }

}
