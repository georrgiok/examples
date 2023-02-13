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
import java.util.Random;
import java.io.FileWriter;
////////////////////////////////////////////////////////////////////////////////
public class Lib {
    public static void main(String[] args) {
        
    }
    public static void Write(String text ) {    
        System.out.println(text);  
    }
    public static void Write(String text, boolean inNewRow) {
      if (inNewRow) {
        Write(text);
      } else {
        System.out.print(text);
      }
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
        return str.nextLine();
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
/**
 * Программа для получения случайного числа в диапазоне 
 * @param min от включительно
 * @param max до включительно
 * @return 
 * integer случайное целое число
 */
public static Integer getRandomInt(Integer min, Integer max){
  Integer x = (int)(Math.random()*((max-min)+1))+min;
  return x;
}
/////////////////////////////////////////////////////////////////////////
/**
 * запись строки в файл
 *  @param String принимаем строку которую надо записать в файл
 * файл будет создан если его его не существует
 *  @param String принимакт название файла для записи
 *  @param Boolean перезаписать файл(false) или дополнить(true)
 *  */
  public static void WriteToFile (String str, String fileName, Boolean append) {
    try ( FileWriter fn = new FileWriter(fileName, append)){
      fn.write(str);
      fn.flush();
      fn.close();
    } 
    catch (Exception e) {

        Write(e.getMessage());
    }
  }
  ////////
  /**
 * запись строки в файл с перезаписью содержимого
 * файл будет создан если его его не существует
 *  @param String принимаем строку которую надо записать в файл
 *  @param String принимакт название файла для записи
 *  */
  public static void WriteToFile (String str, String fileName){
    WriteToFile(str, fileName, false);
  }
  ////////
  /**
 * запись строки в  файл "file.txt" с перезаписью содержимого
 * файл будет создан если его его не существует
 *  @param String принимаем строку которую надо записать в файл

 *  */
  public static void WriteToFile (String str){
    WriteToFile(str,"file.txt");
  }
  /////////////////////////////////////////////////////////////////
  public static Boolean IsCharNumber(char a) {
   // if (a=='1'||a=='2'||a=='3'||a=='4'||a=='5') {  
   // }
    switch (a) {
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
      case '.':


        return true;

      default:
        return false;
        
    }
  }
}
/////////////////////////////////////////////////////////////////////
