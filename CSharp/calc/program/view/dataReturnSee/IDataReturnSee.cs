
using calc.program.controller;
using calc.program.view.plainSee;


namespace calc.program.view.dataReturnSee
{

    public interface IDataReturnSee<T>
    {

        public T see(IPlainSee trueScreen, IPlainSee falseScreen, IDoubleController<String, Boolean> controller);
    }

}