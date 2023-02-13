package jav.E8;

import java.util.HashMap;
import java.util.Map;

import jav.Lib_folder.Lib;

public class E8_01 {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ключ", "значение");
            
     
        Unmutable tryToMutate = new Unmutable("string изначально не изменяемый", map);
        map.put("ключ 2", "не нужное значение");
       
        tryToMutate.GetFieldMap().put("ключ 3", "не нужно");

        tryToMutate.See();
        Unmutable b = tryToMutate;
        Lib.Write(tryToMutate.toString());
        Lib.Write(""+b);
System.out.println();
        Lib.Write(""+new Unmutable("string изначально не изменяемый", map));
        Lib.Write(""+new Unmutable("string изначально не изменяемый", map));





    }
}