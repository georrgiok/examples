package jav.E2;
import jav.Lib_folder.*;
import java.util.Map;
//Дана строка sql-запроса "select * from students where ". 
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные для фильтрации приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Параметры для фильтрации: 
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// SELECT * FROM students WHERE name="Ivanov" AND country="Russia" AND city="Moscow"
//"{\"name\":\"Ivanov\", \"country\":\"Rusefesia\", \"city\":\"Moscow\", \"age\":\"null\"}"; //
public class E2_01 {
    public static void main(String[] args) {
    //String sql = "SELECT * FROM students WHERE ";
    StringBuilder sql2 = new StringBuilder("SELECT * FROM students WHERE ");
    String jsonInput =Lib.ReadFile("jav/E2/E2_01.json");
    Map<String, String> map=Lib.FromJsonToMap(jsonInput);
    
    Boolean i =false;
    for (Map.Entry<String, String> entry : map.entrySet()) { //перебирпает карту map построчно/ в энтри нах содержимое строки
      
      if (!entry.getValue().equals("null")){
        if (i) {
          sql2.append( "AND ");
        }
        else {
          i=true;
        }

        sql2.append(entry.getKey());
        sql2.append("=\"");
        sql2.append(entry.getValue());
        sql2.append("\" ");
        //sql+= entry.getKey()+"=\""+ entry.getValue() + "\" AND "; 
      }
      
    }
    Lib.Write(sql2.toString());
    //Lib.Write(sql.substring(0, sql.length() - 4));//(с какого индекса начала : скоолько символов отрезать)

  }  

}
