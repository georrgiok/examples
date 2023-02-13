package jav.E10.model.MathActions;

public class Division extends Action implements ActionInterface {
    @Override
    public Double result() {
        
        return this.x/this.y;
    }

}

