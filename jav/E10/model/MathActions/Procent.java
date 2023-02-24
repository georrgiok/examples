package jav.E10.model.MathActions;

public class Procent extends Action implements ActionInterface  {
    @Override
    public Double result() {
        
        return this.x/100*this.y;
    }

}
