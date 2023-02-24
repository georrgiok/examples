using calc.program.model;


namespace calc.program.controller{
    
    public class UserInputController : IDoubleController<String,Boolean>{

        private UserInputsModel userInput;
        private String takedString;


        public  UserInputController(UserInputsModel userInput){
            this.userInput = userInput;
            this.takedString = "";
        }

        public Boolean convertToBool(){
            if (this.takedString == null) return false;
        
            switch (this.userInput.takeData(this.takedString)){
                
                case 1:
                    return true;
                case 0:
                case -1:
                    return false;
                default:
                    return false;

            }
        }

        public bool getData()
        {
            return this.convertToBool();
        }

        public void takeData(string data)
        {
            this.takedString = data;
        }
    }


}