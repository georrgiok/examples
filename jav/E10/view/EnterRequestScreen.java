package jav.E10.view;

import jav.E10.controller.Controller;
import jav.Lib_folder.Lib;

public class EnterRequestScreen {
    String en;

    public EnterRequestScreen() {
        
    }
    public void Enter(Controller cont) {
        Lib.Write("Введите выражение ниже");
        this.en = Lib.Take();
        cont.start(en);
    }
    
}
