using  calc.program.controller;

namespace calc.program.view{
    public class DScreen{
        public static void see(ActionListController a ){

        
            Console.WriteLine("Список возможных операций "+a.getActions());//список действий для пользователя 

        
        }  
       
    }
}