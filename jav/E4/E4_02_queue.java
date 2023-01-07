package jav.E4;
import java.util.LinkedList;
import jav.Lib_folder.Lib;

public class E4_02_queue {
    LinkedList<Integer> orig;

    public E4_02_queue() {
        this.orig = new LinkedList<Integer>();
    }
    public static void main(String[] args) {
        
    }
    //enqueue() - помещает элемент в конец очереди, 
    public E4_02_queue enqueue(Integer b) {
        this.orig.addLast(b);
        return this;
    }
    //dequeue() - возвращает первый элемент из очереди и удаляет его,
    public Integer dequeue() {
        return this.orig.removeFirst();
    }
    //first() - возвращает первый элемент из очереди, не удаляя.
    public Integer first() {
        return this.orig.getFirst();
    }
    public E4_02_queue see() {
        Lib.Write(""+this.orig);
        return this;
    }

}
