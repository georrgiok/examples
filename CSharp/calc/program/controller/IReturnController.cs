
using calc.program.model;




namespace calc.program.controller
{

    public interface IReturnController<T>
    {
        public T getData();
    }
}