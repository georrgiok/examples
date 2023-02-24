







namespace calc.program.model{
    public class UserInputsModel{
        
        private List<String> trueList;
        private List<String> falseList;

        public UserInputsModel()
        {
            this.trueList = new List<String>(){
                "yes",
                "y",
                "+",
                "да",
                "д"
            };

            this.falseList = new List<String>(){
                "no",
                "n",
                "-",
                "нет",
                "н"
            };

        }
        public int takeData(String userInputString){
            if(this.trueList.Contains(userInputString)){
                return 1;
            }
            if (this.falseList.Contains(userInputString)){
                return 0;
            }
            return -1;
        }
    }




    
}