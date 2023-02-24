using calc.program.model;


namespace calc.program.controller{
    
    public class UserInputController{

        private UserInputsModel userInput;


        public  UserInputController(UserInputsModel userInput){

            this.userInput = userInput;

        }

        public Boolean convertToBool(String userInputString){
            
           
            switch (this.userInput.takeData(userInputString)){
                
                case 1:
                    return true;
                case 0:
                case -1:
                    return false;
                default:
                    return false;

            }
        }
    }


}