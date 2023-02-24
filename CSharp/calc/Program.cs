using calc.program.view.dataReturnSee;
using calc.program.view.dataSee;
using calc.program.view.controllerSee;
using calc.program.view.plainSee;
using calc.program.model;
using calc.program.controller;


/////////////////////////models///////////////////////////////////////
ActionList actionsGetter = new ActionList();
//////////////////////////////////////////////////////////////////////
////////////////////////controller////////////////////////////////////
UserInputController userInput = new UserInputController(new UserInputsModel());

////////////////////////screens///////////////////////////////////////
EnterScreen taskEnter = new EnterScreen(new ExecController(
    actionsGetter,
    new Storage<Formula>(),
    new ErrorScreen(),
    new ResScreen()
));
ContinueScreen continueScr = new ContinueScreen();
ExitScreen exitScr = new ExitScreen();
////////////////////////////////////////////////////////////////////
new HelloScreen().see();

new OperationsScreen().see(new ActionListController(actionsGetter));

taskEnter.see();



Boolean isContinue = true;
while (isContinue)
{

    isContinue = continueScr.see(
        taskEnter,
        exitScr,
        userInput
    );
}