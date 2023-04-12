namespace calc.program.model{

    public class Storage<T>{
        private List<T> list;

        public Storage(){
            this.list = new List<T>();
        }
        
        public void add(T item){
            this.list.Add(item);
        }
        public List<T> getAll(){

            List<T> form = new List<T>();
            
            foreach (T item in this.list)
            {
                if (item is ICloneable)
                {
                    ICloneable i = (ICloneable)item;
                    form.Add((T)i.Clone());
                }
                else{
                    form.Add(item);
                }
                
            }
            return form;

        }
        public T getLast(){
                return this.list.Last();
        }

    }
}