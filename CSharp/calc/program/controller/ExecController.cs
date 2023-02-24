using calc.program.model;
using calc.program.view;
namespace calc.program.controller{

    public class ExecController{

        private ActionList actionList;
        private Save save;
        private ErrorScreen errorScreen;
        private ResScreen resScreen;

        public ExecController(ActionList actionList,Save save,ErrorScreen errorScreen,ResScreen resScreen){

            this.actionList = actionList;  
              this.save = save;
            this.errorScreen = errorScreen;
            this.resScreen = resScreen;

        }

        public void Take(String useerInput){

            Formula formula = new Formula(useerInput);

            Char znak = formula.getZnak();

            BaseAction action = this.actionList.GetAction(znak);

            action.setX(formula.getX());
            action.setY(formula.getY());

            formula.setResult(action.result());

            this.save.add(formula);

            this.resScreen.see(formula.toString());



        }
    }
}