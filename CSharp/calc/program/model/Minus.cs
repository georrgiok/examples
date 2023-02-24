namespace calc.program.model{


    public class Minus : BaseAction{
        public override Double result()
        {
            return this.x-this.y;
        }
    }
}