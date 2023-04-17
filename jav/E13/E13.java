package jav.E13;

import java.util.Iterator;

public class E13 {

  public static void main(String[] args) {
    Single<String> list = new Single<>();

    list.append("a");
    list.append("b");
    list.append("c");
    list.append("d");
    list.append("e");

    for (Object item : list) {
      System.out.println(item);
    }
    list.reverse();

    System.out.println("/REVERSE\\");

    for (Object item : list) {
      System.out.println(item);
    }
  }

  


  public static class Single<T> implements Iterable {

    ListItem<T> head;
    ListItem<T> tail;

    @Override
    public Iterator iterator() {
      return new Iterator<T>() {
        ListItem<T> current = head;

        @Override
        public boolean hasNext() {
          return current != null;
        }

        @Override
        public T next() {
          T data = current.data;
          current = current.next;
          return data;
        }
      };
    }

 
    private static class ListItem<T> {

      T data;
      ListItem<T> next;
    }

    //Голова пустая
    public boolean isEmpty() {
      return head == null;
    }

    //заполнение списка
    public void append(T item) {

      //Выделение памяти для списка
      ListItem<T> newItem = new ListItem<>();
      newItem.data = item;

      //Если, голова и хвост пустая
      if (isEmpty()) {
        head = newItem;
        tail = newItem;
      } else { //Если, не пустая то передаём элементу адрес и ставим в хвост
        tail.next = newItem;
        tail = newItem;
      }
    }

    //метод разворота списка
    public void reverse() {
      if (!isEmpty() && head.next != null) {//Если голова не равна нулю
        tail = head;
        ListItem<T> current = head.next;
        head.next = null;
        while (current != null) {
          ListItem<T> next = current.next;
          current.next = head;
          head = current;
          current = next;
        }
      }
    }
  }
}