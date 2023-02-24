package jav.E10.model.MathActions;

import java.util.HashMap;


public class ActionsList {
    private  HashMap<String, ActionInterface> list;
    /*public  ActionsList(){        
        this.list = new HashMap<String, ActionInterface>();
        this.list.put("+",  new Summ());
        this.list.put("-", new Minus());
        this.list.put("*", new Multiplie());
        this.list.put("/", new Division());
    }*/
    public static ActionInterface getAction(String action) {
        switch (action) {
            case "+":
                return new Summ();
            case "-":
                return new Minus();
            case "*":
                return new Multiplie();
            case "/":
                return new Division();
            case "%":
                return new Procent();
                
        
            default: 
            return null;
                
        }
        
    }
}
