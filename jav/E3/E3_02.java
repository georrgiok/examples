package jav.E3;
import java.util.Arrays;

import jav.Lib_folder.Lib;

import java.util.ArrayList;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class E3_02 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,45,3,100,45,1000,78,5,456,12,79,5641,3,23));
        
        for (int j=0;j<arr.size();j++) {
            if (arr.get(j)%2==0){

               arr.remove(j);
               j--;
            }
            
        }
        Lib.Write(arr.toString());
    
    
    }
    
}
