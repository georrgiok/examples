package jav.E8;
import java.util.HashMap;
import java.util.Map;


public final class Unmutable { //не наследоваемый 
    

    private final String field;
    private final Map<String, String> fieldMap;

    public Unmutable(String field, Map<String, String> fieldMap) {
        this.field = field;
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : fieldMap.keySet()) {       //
          deepCopy.put(key, fieldMap.get(key));
        }
        this.fieldMap = deepCopy;
    }
    public String GetField() {
        return ""+field;
    }
    public Map<String, String> GetFieldMap() {
        Map<String, String> deepCopy = new HashMap<String, String>();
        for(String key : this.fieldMap.keySet()) {           //this.fieldMap-контекстная переменная
          deepCopy.put(key, this.fieldMap.get(key));
        }
        return deepCopy;
    }

    public void See() {

        for (String e : this.fieldMap.keySet()) {
            System.out.println(e);
        }
    }
}