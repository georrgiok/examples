 
import java.util.ArrayList;

import jav.Lib_folder.Lib;
/**
 * Класс для хранения и отображения информации о человеке и его родственных связей
 */
public class People {

    protected static Print printTo;
/*
    enum print {
        console, file
    }

    
   // protected static String fileName;
  //  static{                                         //блок статического инициализатора
  //      printTo = print.console;
  //      fileName = "tree.txt";

  //  }

 

    public static void ToConsole() {
        printTo = print.console;
    }

    
    public static void ToFile(String fileName) {
        printTo = print.file;
        People.fileName = fileName;
    }
*/
    public static void PrintStr(String p) {
        People.printTo.Print(p);

       /* switch (People.printTo) {
            case console:
                Lib.Write(p);
                break;
            case file:
                Lib.WriteToFile("\n"+p, People.fileName, true);
                break;
        
            default:
                break;
        }  */
    }

    public static void SelectOutput(Print p) {
        People.printTo = p;
        
    }



    protected String name;
    protected String gender;
    protected Integer year;
    protected People mother;
    protected People father;
    protected ArrayList<People> child;

    
/**
 * Создает человека с заданными данными
 * @param namee Имя
 * @param birthyear Год рождения
 * @param gender Пол ("male" или "female")
 */
    public People(String namee, Integer birthyear, String gender) {
        this.name = namee;
        this.year = birthyear;
        this.child = new ArrayList<People>();
        this.gender = gender;
       
    }


    /**
     * Возвращает имя человека в заглавном регистре
     * @return
     * String
     */
    public String getName() {
        return this.name.toUpperCase();
    }

    private boolean isMale() {
       return this.gender == "male"?true:false;
    }

    /**
     * Отображает информацию о человеке и близкие родственные связи
      */
    public void see() {
        String gen="";
        if (this.isMale()){
            gen="мужской";
        }
        else{
            gen="женский";
        }
        

        PrintStr(String.format("Имя %s, год рождения %d, пол %s\nОтец: %s\nМать: %s",this.getName(), this.year, gen,this.father  == null?"нет данных":this.father.getName(),this.mother  == null?"нет данных":this.mother.getName()));
        for (People  ment : this.child) {
            PrintStr("Дети: "+ment.getName());
      
        }
    }
    /**
     * Указывает отца человека 
     * @param father class People отец
     */
    public void addFather(People father) {

       this.father=father; 
       this.father.addChild(this);
    }
    public void addMother(People mother) {
        this.mother=mother;
       this.mother.addChild(this);
    } 

    /**
     * Добавление ребенка
     * @param child People 
     */
    public void addChild(People child) {
        if (this.child.contains(child))
        {
            return;
        }
            this.child.add(child);
        
        if (this.isMale()){
            child.addFather(this);

        }
        else {
            child.addMother(this);
        }
                
    }
    /**
     * Получение списка братьев и сестер человека
     * @return ArrayList<People>
     */
    public ArrayList<People> brothSistList() {
        ArrayList<People> bs = new ArrayList<People>();
        for (People el:this.father.child) {
            bs.add(el);
        }
        for (People el:this.mother.child) {
            if (!bs.contains(el)){// содержит ли внутри списка bs элемент el
                bs.add(el);
            }
            
            
        }
        return bs;  
    }


    /**
     * Отображение всех братьев
     */
    public void seeBrothers() {
    
        this.seebs(true, "брат","братья");
    }

    /**
     * Отображение всех систёр
     */
    public void seeSisters() {
        this.seebs(false, "сестра","сёстры");  
    }
    /**
     * 
     * @param gender пол
     * @param who  название пола в ед
     * @param whos название пола множ число
     */
    private void seebs(Boolean gender, String who, String whos) {
        String s ="";
        Integer i = 1; 
        ArrayList<People> a = this.brothSistList();

        for (People el:a) {
               
            if (gender==el.isMale() && el!=this){
                if (i<a.size()) {
                    s += who+": "+el.getName()+" \n";         
                }
                else{
                    s += who+": "+el.getName();

                }
                               
            }
           i++; 
        } 
        if (s.equals("")){
           s = whos + " нет" ;
        }

        PrintStr(s);
        
    }
}
