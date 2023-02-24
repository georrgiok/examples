
using calc.program.model;




namespace calc.program.controller {
    
    public class ActionListController : IReturnController<string> {

        private ActionList actionsModel;
        private String acrionsStr;

        public ActionListController(ActionList a) {
            this.actionsModel = a;
            this.acrionsStr = "";
        }


        public String getActions() {
            List<char> a = this.actionsModel.getList();
            String c = "";
            foreach (char b in a){
                c +=b+" ";
            }
            this.acrionsStr = c;
            return c;
        }

        public string getData()
        {
            if (this.acrionsStr.Length == 0) this.getActions();
            return this.acrionsStr;
           
        }
    }
}