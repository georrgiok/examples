package jav.E10.model;

import jav.Lib_folder.Lib;

public class Formula {
    Double num1;
    Double num2;
    String oper;
    Double result;

    public Formula(String f){
        this.FromString(f);

    }
   
    public void FromString(String a) { //( 2.5+ 5)  // ( -11+21) -4434--21
        char b;
        String num1 = "", num2="", oper="";
        Boolean z = false;// писали мы что то в первое число
        Boolean x = false; // есть ли оператор
        Boolean y = false; // писали мы второе число
        for (int index = 0; index < a.length(); index++) {
            b=a.charAt(index);
            if (b == ' ') 
                continue;

            if (!z){
                if (x){
                    if(!Lib.IsCharNumber(b)&&y){
                        break;
                        
                    }
                    num2 += b;
                    y = true;
                }
                else{
                    num1 += b;
                    z = true;
                }
                continue; 
            }   
            if (Lib.IsCharNumber(b)) {
                num1 += b;
            }
            else {
                oper += b;
                z = false;
                x = true;
            }
        }
        this.num1 = Double.parseDouble(num1);
        this.num2 = Double.parseDouble(num2);
        this.oper = oper;   
    }
    public void see() {
        Lib.Write(this.toString());        
    }
    public String GetOper() {
        return this.oper;
    }
    public Double GetNum1() {
        return this.num1;
    }
    public Double GetNum2() {
        return this.num2;
    }
    public void SetResult(Double result) {
        this.result = result;
    }
    @Override
    public String toString() {
        if (this.result != null){
            return this.num1+" "+this.oper+" "+this.num2 + " = " + this.result;
        }
        else{
            return this.num1+" "+this.oper+" "+this.num2;
        }
        
    }

    
}
