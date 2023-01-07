package jav.E4;
import java.util.LinkedList;
import jav.Lib_folder.Lib;
import java.util.Map;
import java.util.HashMap;
/**
 
В калькулятор добавьте возможность отменить последнюю операцию.
 */
public class E4_03 {
    public static void main(String[] args) {
        Lib.Write("Калькулятор 0.1\nИспользование: написать выражение, состоящее из двух компонентов и действия обязательно разделёнными пробелами\nПример: \"2 + 2\"\nМожно использовать предыдущий результат\nПример: \"+ 2\"\nДля получения предыдущего значения: \"z\"\nДля выхода: \"q\"");

        LinkedList<HashMap<String, String>> history = new LinkedList<HashMap<String, String>>();
        Integer itog = 0;
        boolean again = false;
        while (true) {
            
            

            String input = Lib.Take();

            if (input.charAt(0) == ' ') { // взять (этот)
                input = input.substring(1); //удалить (до)
            }
            //Lib.Write(input);
            Integer firstSpace = input.indexOf(" "); //возращает идекс первого вхождения/поиск подстроки в строке (первый "ап")/если той строки нет возращает -1
            String a;
            if (firstSpace == -1) {
                a = input;
            } else {
                a = input.substring(0, firstSpace);
            }
            

            Integer a1 = 0;
            Integer c1 = 0;
            String znak = "";

            
            switch (a) {
                case "q":
                    Lib.Write("Приходите снова!");
                    return;
                case "z":
                    if (!again) history.removeLast();//удалить посл эл
                    HashMap<String, String> old = history.removeLast();
                    Lib.Write(old.get("expression"), false);
                    itog = Integer.parseInt(old.get("itog"));
                    again = true;
                    break;
                case "+":
                case "-":   
                case "/":
                case "*":
                    input = input.substring(a.length()+1);
                    a1 = itog;
                    c1 = Integer.parseInt(input);
                    znak = a;
                    again = false;
                    break;
            
                default:
                    input = input.substring(a.length()+1);  //+ 2
                    String b = input.substring(0, input.indexOf(" "));//+
                    a1 = Integer.parseInt(a);//конв/5
                    c1 = Integer.parseInt(input.substring(b.length()+1));//2
                    znak = b;
                    again = false;
                    break;
            }
            if (again) continue;
  
            //String c = input.substring(b.length()+1);
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
            String expression = a1 + " " + znak + " " + c1 + " = " + itog + "\n(" + itog + ") ";


            HashMap<String, String> toHistory = new HashMap<String, String>();
            toHistory.put("a1", ""+a1);
            toHistory.put("c1", ""+c1);
            toHistory.put("znak", znak);
            toHistory.put("itog", ""+itog);
            toHistory.put("expression", expression);
            history.add(toHistory);

            Lib.Write(expression, false);

        }  
        



    }    
}