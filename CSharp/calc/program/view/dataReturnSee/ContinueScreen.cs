using calc.program.view.plainSee;
using calc.program.controller;


namespace calc.program.view.dataReturnSee
{

    public class ContinueScreen : IDataReturnSee<Boolean>
    {

        public Boolean see(IPlainSee trueScreen, IPlainSee falseScreen, IDoubleController<String, Boolean> controller)
        {



            Console.WriteLine("Хотите ли вы продолжить в ответ укажите y/n");
            String userInput = Console.ReadLine();


            controller.takeData(userInput);

            if (controller.getData())
            {

                trueScreen.see();
                return true;
            }
            else
            {
                falseScreen.see();
                return false;
            }


        }


    }

}