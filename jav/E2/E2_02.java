package jav.E2;
import java.io.FileWriter;

import jav.Lib_folder.Lib;
//Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.
public class E2_02 {
    public static void main(String[] args) {


        int[] arr = new int[10];
        arr = new int[] { 1, 45, 3, 34, 5, 456, 1, 47, 2, 0 };

        try (FileWriter fw = new FileWriter("jav/E2/e02_01.log", false)){

            boolean t = true;
            while (t){
                fw.write("итерация: ");
                t=false;
                int i=0;
                while (i<arr.length-1) {
                    if(arr[i]>arr[i+1]){
                        
                        t=true;
                        int ar = arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=ar;

                    }
                    fw.append(" "+arr[i]);
                    i++;
                }
                fw.append(" "+arr[i]+"\n");
            }
           fw.flush();//записать
        } 
        catch (Exception e) {

            System.out.println(e.getMessage());
        }   

        Lib.PrintArr(arr);
            
            


        
    }



}


