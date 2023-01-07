package jav.E5;

import jav.Lib_folder.Lib;

public class E5_03 {
    public static void main(String args[]){
        int arr[] = {78, 18, 34, 6, 12, 1};
        Lib.Write(arr);
        sort(arr);
        Lib.Write("Aлгоритм пирамидальной сортировки (HeapSort)");
        Lib.Write(arr);
    }

    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--){
            large(arr, n, i);
        }

        for (int i=n-1; i>=0; i--){

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            large(arr, i, 0);
        }
    }


    static void large(int arr[], int n, int i){
        int largest = i;
        int l = 2*i + 1; 
        int r = 2*i + 2;

        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]){
            largest = r;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            large(arr, n, largest);
        }
    }
  
}

