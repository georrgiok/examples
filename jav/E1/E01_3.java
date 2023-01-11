import jav.Lib_folder.*;
//Реализовать простой калькулятор
import java.util.Scanner;
public class E01_3 {
   
    public static void main(String[] args) {
        Write("calc (+ - * /)");

        Write("введите 1 число");
        double a1 = Integer.parseInt(Take());
        Write("введите оператор");
        String op = Take();
        Write("введите 2 число");
        double a2 = Double.parseDouble(Take());
        double itog=0;
        switch (op) {
            case "+":
                itog = a1+a2;
                break;
            case "-":
            itog = a1-a2;
                break;
            case "*":
            itog = a1*a2;
                break;
            case "/":
            itog = a1/a2;
                break;
        
            default:
                break;
        }   
        Write(""+a1+op+a2+"="+itog);
    }
    public static void Write(String text ) {   
               
        System.out.println(text);   
    }
    public static String Take() {

        Scanner str = new Scanner(System.in);
        String sds = str.nextLine();
        return sds;
    }
}
