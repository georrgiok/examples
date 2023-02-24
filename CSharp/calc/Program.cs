// See https://aka.ms/new-console-template for more information
using calc.program.view;
using calc.program.model;
using calc.program.controller;



HelloScreen.see();
ActionList al = new ActionList();
DScreen.see(new ActionListController(al));
EnterScreen a = new EnterScreen(new ExecController(
    al, 
    new Save(),    
    new ErrorScreen(),
    new ResScreen()
));
a.see();
Boolean ab = true;
while(ab)
{
    
    ab = ContinueScreen.see( 
        a,
        new ExitScreen(),
        new UserInputController(new UserInputsModel( ))
    );
}