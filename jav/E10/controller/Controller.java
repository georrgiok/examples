package jav.E10.controller;

import java.util.HashMap;

import jav.E10.model.Formula;
import jav.E10.model.MathActions.ActionInterface;
import jav.E10.model.MathActions.Minus;
import jav.E10.model.MathActions.Multiplie;
import jav.E10.model.MathActions.Division;
import jav.E10.model.MathActions.Summ;
import jav.E10.view.ErrorScreen;
import jav.E10.view.ResultScreen;
import jav.E10.model.MathActions.ActionsList;

public class Controller {
    public void start(String userInput) {
        
        Formula formula = new Formula(userInput);
        String oper = formula.GetOper();

        ActionInterface c = (new ActionsList()).getAction(oper);

        if (c!=null){
          
            c.setX(formula.GetNum1());
            c.setY(formula.GetNum2());
            formula.SetResult(c.result());
            (new ResultScreen()).seeFormula(formula.toString());
        }
        else{
            (new ErrorScreen()).seeErrorOper(formula.GetOper());
        }
    }

}
