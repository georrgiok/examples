package jav.E3;
import java.util.Arrays;

import jav.Lib_folder.Lib;

import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class E3_02 {
    /*public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,45,3,100,45,1000,78,5,456,12,79,5641,3,23));
        
        for (int j=0;j<arr.size();j++) {
            if (arr.get(j)%2==0){

               arr.remove(j);
               j--;
            }
            
        }
        Lib.Write(arr.toString());
    
    
    }*/

    
    public static void main(String[] args) {
        Del a = new Del("1, 4, 6,7 ,5 ,4,1");
    
            a.see();

           a.delOdd();
            a.see();

          // System.out.println(a); // .toString()*/
    }
}
// cjplfnm создать класс на вход строку ту
// метод удалить четные или нечтные 
// мктод печати