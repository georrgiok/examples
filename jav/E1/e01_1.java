

import jav.Lib_folder.*;
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class E01_1 {
    public static void main(String[] args) {
        
        Write("vvedy n");
        
        int n = Integer.parseInt(Take());
        int i =1;
        int summ=0;
        int um=1;

        while (i<=n) {
            summ+=i;
            um*=i;
            i++;
        }
        Write("n-ое треугольного число =   "+summ);
        Write("n! =   "+um);
        //Write(""+Integer.MAX_VALUE);
      }

    public static void Write(String text ) {    //создалась перременная(функции)
               
        System.out.println(text);   
    }
    public static String Take() {

        Scanner str = new Scanner(System.in);
        String sds = str.nextLine();
        return sds;
    }
















}