package jav.E10.model.MathActions;

public class Summ extends Action implements ActionInterface {
    @Override
    public Double result() {
        
        return this.x+this.y;
    }

}
