

namespace calc.program.model {
   
    public class ActionList {
        public List<char> getList(){//возможные знаки вывод
            return new List<char>() {
                '+',
                '-',
                '*',
                '/'
            };

        }
        public BaseAction getAction(Char znak){
            
            switch (znak){
                case '-':
                    return new Minus();
                case '*':
                    return new Multiply();
                case '/':
                    return new Divide();    
                default:
                    return new Sumn();
            }
            
            
        }    
    
    }
}