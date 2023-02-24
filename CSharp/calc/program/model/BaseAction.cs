
namespace calc.program.model
{
    public abstract class BaseAction
    {

        protected Double y;
        protected Double x;
        public void setY(Double number){
            this.y = number;
        }
        public void setX(Double number){
            this.x = number;
        }

        public abstract Double result();
            

        
    }
}