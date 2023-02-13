package jav.E10;

import jav.E10.controller.Controller;
import jav.E10.view.BaseScreen;
import jav.E10.view.EnterRequestScreen;

public class Main {
    public static void main(String[] args) {
        BaseScreen bs = new BaseScreen();
        bs.see();
        EnterRequestScreen ers = new EnterRequestScreen();
        ers.Enter(new Controller() );
         
    }
}
