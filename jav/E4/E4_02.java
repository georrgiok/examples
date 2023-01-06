package jav.E4;
import java.util.LinkedList;
import jav.Lib_folder.Lib;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
public class E4_02 {
    public static void main(String[] args) {
        LinkedList<Integer> orig = new LinkedList<Integer>();
        orig.add(2);
        orig.add(5);
        orig.add(32);
        orig.add(352);
        enqueue(orig, 6);
        Lib.Write("enqueue "+orig);
        Lib.Write("dequeue el = " + dequeue(orig) + "   list " + orig );
        Lib.Write("first " + first(orig));

    }
    public static void enqueue(LinkedList<Integer> a,Integer b) {
        a.addLast(b);
    }

    public static Integer dequeue(LinkedList<Integer> a) {
        return a.removeFirst();
    }

    public static Integer first(LinkedList<Integer> a) {
        return a.getFirst();
    }

}
