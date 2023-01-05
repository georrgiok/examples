package jav.E3;
import jav.Lib_folder.Lib;
import java.util.Arrays;

//Реализовать алгоритм сортировки слиянием
public class E3_01 {
    public static void main(String[] args) {
        int[] arr = {1,45,3,100,45,1000,78,5,456,12,79,5641,3,23};

        SortArray(arr,0,arr.length-1);
        Lib.Write(arr);

    }
    private static void SortArray(int[] a, int start_i, int end_i) {

        if (end_i <= start_i){
            return;
        }
        int mid = start_i + (end_i - start_i) / 2;
        SortArray(a, start_i, mid);
        SortArray(a, mid + 1, end_i);
    
        int[] buffer = Arrays.copyOf(a, a.length);
    
        for (int k = start_i; k <= end_i; k++){
            buffer[k] = a[k];
        }
    
        int i = start_i, j = mid + 1;
        for (int k = start_i; k <= end_i; k++){
    
            if (i > mid) {
                a[k] = buffer[j];
                j++;
            } 
            else if (j > end_i) {
                a[k] = buffer[i];
                i++;
            } 
            else if (buffer[j] < buffer[i]){
                a[k] = buffer[j];
                j++;
            } 
            else {
                a[k] = buffer[i];
                i++;
            }
        }
    }
}

