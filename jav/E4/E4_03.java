package jav.E4;

import jav.Lib_folder.Lib;

/**
 
В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class E4_03 {
    public static void main(String[] args) {
        Lib.Write("calc: (a + a enter + a  )");
        //Lib.Write("");
        Integer itog = 0;
        while (true) {
            
        

            String num = Lib.Take();
            String a = num.substring(0, num.indexOf(" "));
            //Lib.Write(a);
            num = num.substring(a.length()+1);
            //Lib.Write(num);
            //Lib.Write(b);
            Integer a1 = 0;
            Integer c1 = 0;
            String znak = "";
            if (a.equals("+")||a.equals("-")||a.equals("*")||a.equals("/")){
                String b = num.substring(a.length());
                a1 = itog;
                c1 = Integer.parseInt(b);
                znak = a;
            }
            else{
                String b = num.substring(0, num.indexOf(" "));
                String c = num.substring(b.length()+1);
                 a1 = Integer.parseInt(a);
                 c1 = Integer.parseInt(c);
                 znak = b;
                
            }
            //String c = num.substring(b.length()+1);
            // Lib.Write(c);

            itog = 0;
            switch (znak) {
                case "+":
                    itog = a1+c1;
                    break;
                case "-":
                itog = a1-c1;
                    break;
                case "*":
                itog = a1*c1;
                    break;
                case "/":
                itog = a1/c1;
                    break;
            
                default:
                    break;
            } 
            Lib.Write(itog);

        }  
        



    }    
}