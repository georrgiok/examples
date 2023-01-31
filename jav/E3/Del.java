package jav.E3;
import java.util.ArrayList;
import java.util.Arrays;

import jav.Lib_folder.Lib;

public class Del {


    private ArrayList<Integer> mainList;


    public Del(String d) {

        mainList = new ArrayList<Integer>();

        d = d.replaceAll(" ", "");
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(d.split(",")));

        for (String s : arr) {
            mainList.add(Integer.parseInt(s));
        }

    }
    public void see() {
        Lib.Write(""+this.mainList);

    }


    private void dchet(Boolean isEven) {
 
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for (Integer i : this.mainList) {
            if ((i % 2 == 0) != isEven) {
                arr.add(i);
            }
        }

        this.mainList = arr;

    }

    public void chet() {
        this.dchet(true);
    }
    public void delOdd() {
        this.dchet(false);
    }


}