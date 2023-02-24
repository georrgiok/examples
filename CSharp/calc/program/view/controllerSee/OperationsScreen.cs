using  calc.program.controller;

namespace calc.program.view.controllerSee{
    public class OperationsScreen : IControllerSee{
        public void see(IReturnController<string> a)
        {
            Console.WriteLine("Список возможных операций "+a.getData());//список действий для пользователя 
        }
    }
}