//Вывести все простые числа от 1 до 1000
import java.util.Scanner;
public class e02_1 {
    public static void main(String[] args) {
        Write("введите n");
        int n = Integer.parseInt(Take());
        Write("все простые числа от 1 до "+n);
        int i=1;
        while (i<n) {

            if (IsSimpleNumber(i)){
                Write(" "+i);
            }

            i++;
            
        }
    }

    public static boolean IsSimpleNumber(int number) {
       int i = 2;
       while (i<number) {
        if (number%i==0) {
            return false;
        } 
        i++;
       } 
       return true;
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
