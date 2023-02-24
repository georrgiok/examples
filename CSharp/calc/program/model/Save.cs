namespace calc.program.model{

    public class Save{
        private List<Formula> formula;

        public Save(){
            this.formula = new List<Formula>();
        }
        
        public void add(Formula formula){
            
            this.formula.Add(formula);
        }
        public List<Formula> getAll(){

            
            List<Formula> form = new List<Formula>();
            
            
            foreach (Formula item in this.formula)
            {
                form.Add(item);
            }
            return form;



        }
        public getLast(){
                formula.Last();
            }

    }
}