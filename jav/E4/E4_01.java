package jav.E4;
import java.util.LinkedList;
import jav.Lib_folder.Lib;
//Пусть дан LinkedList с несколькими элементами. 
//Реализуйте метод, который вернет “перевернутый” список
public class E4_01 {
    public static void main(String[] args) {
        LinkedList<Integer> orig = new LinkedList<Integer>();
        orig.add(2);
        orig.add(5);
        orig.add(32);
        orig.add(352);

        Lib.Write(""+orig);
        Lib.Write(""+ReversLinkedlist(orig));

    }
    public static LinkedList<Integer> ReversLinkedlist(LinkedList<Integer> a) {
        LinkedList<Integer> rev = new LinkedList<Integer>();
        for (Integer b : a) {
            
            rev.addFirst(b); 
            
        }
        return rev;
            
    }

}
