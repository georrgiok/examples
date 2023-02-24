using calc.program.controller;



namespace calc.program.view{
    public class EnterScreen{
        private ExecController ExecController;
        public EnterScreen(ExecController ExecController)
        {
            this.ExecController = ExecController;
        }

        public void see(){
            Console.WriteLine("Введите уравнение");

           this.ExecController.Take(Console.ReadLine());
        }


    }
}