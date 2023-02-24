using calc.program.view;
using calc.program.controller;


namespace calc.program.view {

    public class ContinueScreen {

        public static Boolean see(EnterScreen trueScreen,ExitScreen falseScreen, UserInputController controller) {

            Console.WriteLine("Хотите ли вы продолжить в ответ укажите y/n");
            String userInput = Console.ReadLine();




            if (controller.convertToBool(userInput)){

                trueScreen.see();
                return true;
            }
            else{
                falseScreen.see();
                return false;
            }


        }


    }

}