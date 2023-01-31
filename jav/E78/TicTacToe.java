package jav.E78;
import jav.Lib_folder.Lib;
import java.util.ArrayList;
import java.util.Arrays;


public class TicTacToe {


    private static Boolean arrLeng(String[] a) {

        for (String b : a) {
           if(b == "" || b == null) {
            return true;
           }
        }
        return false;

    }



    private static Boolean IsWin(String[] a, String name) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1,4,7)));
        arr.add(new ArrayList<Integer>(Arrays.asList(7,8,9)));
        arr.add(new ArrayList<Integer>(Arrays.asList(3,6,9)));
        arr.add(new ArrayList<Integer>(Arrays.asList(7,5,3)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(2,5,8)));
        arr.add(new ArrayList<Integer>(Arrays.asList(1,5,9)));

      

        for (ArrayList<Integer> arrayList : arr) {
            Integer i = 0;
            for (Integer iter : arrayList) {

                if (a[iter-1]==name) {
                    i++;

                    
                }

            }
            if (i==3) {
                return true;
            }
        }
        return false; 
    }

    private static void Move(String[] arr, String name) {
       
       
        Lib.Write("ходит  "+name);
        Boolean m = true;
        while (m) {
            String a ="";
            a=Lib.Take();
            Integer b =Integer.parseInt(a);

            if (arr[b-1]==null){
                arr[b-1]=name;
                m = false;
            }
            else{
                Lib.Write("занято выбери другое");

            }  

        }

    }

    private static void prin(String[] a) {
        String ch ="занятые клетки\n";
        Integer i = 0;
        for (int index = 0; index < a.length; index++) {
            if (a[index]==null) {
                ch+=(index+1)+" ";
            }
            else{

                ch+=a[index]+" ";

                
            }
           i++;
           if (i==3) {
            i=0;
            ch+="\n";
           }
           
        }

        Lib.Write(ch+" ");
    }




/////////////////////
    public static void main(String[] args) {
        Lib.Write("выбери цифру\n1 2 3\n4 5 6\n7 8 9");

        String player1 = "x";
        String player2 = "o";
        

        String[] arr = new String[9];

        

        while (arrLeng(arr)) {
            Move(arr, player1);
            prin(arr);
            if (IsWin(arr, player1)) {
                Lib.Write("[x win]");
                return;
            }
            if(!arrLeng(arr)){
                break;
            }
            Move(arr, player2);
            prin(arr);

            if (IsWin(arr, player2)) {
                Lib.Write("[0 win]");
                return;
            }   
        }
        Lib.Write("Ничья");





    


        
        





    }


    
}