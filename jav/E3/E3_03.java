package jav.E3;
import java.util.Arrays;
import jav.Lib_folder.Lib;
import java.util.ArrayList;
//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
public class E3_03 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1,45,3,100,45,1000,78,5,456,12,79,5641,3,23));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mid = 0;
        int summ=0;
        for (int i =0;i<arr.size();i++){
            if (arr.get(i)<min) {
                min = arr.get(i);
            }
            if (arr.get(i)>max){
                max=arr.get(i);
            } 
            summ=summ+arr.get(i);
        }
        mid = summ/arr.size();
        Lib.Write("max = " + max +" min = "+ min + " middle = " + mid);

    }
    
    
}
