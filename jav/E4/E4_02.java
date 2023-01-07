package jav.E4;
import jav.Lib_folder.Lib;
import jav.E4.E4_02_queue;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//enqueue() - помещает элемент в конец очереди, 
//dequeue() - возвращает первый элемент из очереди и удаляет его,
//first() - возвращает первый элемент из очереди, не удаляя.
public class E4_02 {
    public static void main(String[] args) {

        E4_02_queue a = new E4_02_queue();

        a.enqueue(1).enqueue(2).enqueue(4);
        E4_02_queue b = new E4_02_queue();
        b.enqueue(5).enqueue(7).enqueue(12);

        Lib.Write(a.dequeue());
        Lib.Write(a.first());
        a.see();


    }

}
