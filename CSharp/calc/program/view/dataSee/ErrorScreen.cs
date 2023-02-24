namespace calc.program.view.dataSee{


    public class ErrorScreen : IDataSee{

        public void see(string data)
        {
            Console.WriteLine("Ошибка: "+data);
        }
    }
}