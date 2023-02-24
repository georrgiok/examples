

namespace calc.program.model {
   
    public class ActionList {
        public List<char> GetListOper(){//возможные знаки вывод
            List<char> a = new List<char>();
            a.Add('+');
            a.Add('-');
            a.Add('*');
            a.Add('/');
            return a;

        }
        public BaseAction GetAction(Char znak){
            
            switch (znak){
                case '+':
                    return new Sumn();
                case '-':
                    return new Minus();
                case '*':
                    return new Multiply();
                case '/':
                    return new Divide();    
                default:
                    return null;
            }
            
            
        }    
    
    }
}