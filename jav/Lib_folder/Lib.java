package jav.Lib_folder;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.FileReader;
import java.util.stream.Collectors;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Map;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
////////////////////////////////////////////////////////////////////////////////
public class Lib {
    public static void main(String[] args) {
        
    }
    public static void Write(String text ) {    
        
        
        
        System.out.println(text);
        
    }
    public static void Write(int[] arr) {
      StringBuilder s = new StringBuilder("");
      for (int i : arr) {
        s.append(i);
        s.append("  ");
      }
      Write(s.toString());
    }
    public static void Write(int a) {
      Write(""+a);
    }
    /////////////////////////////////////////////////////////////////////////////
    public static String Take() {

        Scanner str = new Scanner(System.in);
        String sds = str.nextLine();
        return sds;
    }
// определяет простое число (только делится на себя и 1 без остатка)
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
/////////////////////////////////////////////////////////////////////////////////////
public static Map<String, String> FromJsonToMap(String jsonInput) {
  Type mapType = new TypeToken<Map<String, String>>(){}.getType();  
  return new Gson().fromJson(jsonInput, mapType);

}
//////////////////////////////////////////////////////////////////////
public static String ReadFile(String filename) {
    try {

      String pathProject = System.getProperty("user.dir");
      String pathFile = pathProject.concat("/"+filename);
      //Lib.Write(pathFile);
      File f1 = new File(pathFile);
      BufferedReader bufReader = new BufferedReader(new FileReader(f1));
      String line = bufReader.lines().collect(Collectors.joining());
      bufReader.close();
      return line;
    }
    catch (Exception e) {
      Lib.Write("catch");
      e.printStackTrace();//печатает ошибки в предыдущем блоке
    }
    
    return "";
  }
////////////////////////////////////////////////////////////////////////
public static void PrintArr(int[] arr) {
  for (int j = 0; j < arr.length; j++) {
    Write(""+arr[j]);
}
}
/////////////////////////////////////////////////////////////////////////

}
