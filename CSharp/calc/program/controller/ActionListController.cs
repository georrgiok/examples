
using calc.program.model;




namespace calc.program.controller {
    
    public class ActionListController {

        private ActionList actions;

        public ActionListController(ActionList a) {
            this.actions = a;
        }






        public String getActions() {
            List<char> a = this.actions.GetListOper();
            String c = "";
            foreach (char b in a){
                c +=b+" ";
            }
            return c;
        }
    }
}