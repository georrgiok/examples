using calc.program.model;
using calc.program.view.dataSee;
namespace calc.program.controller{

    public class ExecController{

        private ActionList actionList;
        private Storage<Formula> storage;
        private IDataSee errorScreen;
        private IDataSee resScreen;

        public ExecController(ActionList actionList,Storage<Formula> storage,IDataSee errorScreen,IDataSee resScreen){

            this.actionList = actionList;  
            this.storage = storage;
            this.errorScreen = errorScreen;
            this.resScreen = resScreen;

        }

        public void Take(String useerInput){

            Formula formula = new Formula(useerInput);

            Char znak = formula.getZnak();

            BaseAction action = this.actionList.getAction(znak);

            action.setX(formula.getX());
            action.setY(formula.getY());
            formula.setResult(action.result());


            this.storage.add(formula);
            this.resScreen.see(formula.toString());



        }
    }
}