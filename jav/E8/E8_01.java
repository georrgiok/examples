package jav.E8;

import java.util.HashMap;
import java.util.Map;

public class E8_01 {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ключ", "значение");
            
     
        Unmutable tryToMutate = new Unmutable("string изначально не изменяемый", map);
        map.put("ключ 2", "не нужное значение");
       
        tryToMutate.getFieldMap().put("ключ 3", "не нужно");

        tryToMutate.see();
       



    }
}