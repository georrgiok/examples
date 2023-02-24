

namespace calc.program.model{

    public class Formula{


        private Double res;
        private Boolean flag;
        private Double num1;
        private Double num2;
        private Char znak;

        public Formula(String str){
           
            this.flag = false;
            this.FromString(str);

        }

        public void FromString(String str){
            String num1="";
            String num2="";
            Char znac=' ';
            Boolean flag1 = true;
            for (int i = 0; i < str.Length; i++){
                if (str[i]!=' '){
                    Char a= str[i];
                    
                    if (flag1){
                        if (!Char.IsDigit(a)&&num1.Length==0)
                        {
                            num1 += a;
                            continue;
                        }
                        if (Char.IsDigit(a))
                        {
                            num1 += a;
                            continue;
                        }
                        if (!Char.IsDigit(a))
                        {
                            flag1 = false;
                            znac = a;
                        }

                    }
                    else{
                        num2 += a;
                    }                       
                }

                    

            }
            
            this.num1 = Double.Parse(num1);
            this.num2 = Double.Parse(num2);
            this.znak = znac;

        }

        public Double getX(){
            return this.num1;
        }
        public Double getY(){
            return this.num2;
        }
        public Char getZnak(){
            return this.znak;
        }
        public Double getResult(){
            return this.res;
        }
        public void setResult(Double aa){
            this.res = aa;
            this.flag = true;

            
        }

        
        public String toString(){



            if (this.flag)
            {
                return this.getX()+" "+this.getZnak()+" "+this.getY()+" = "+this.getResult();
            }
            else{
                return this.getX()+" "+this.getZnak()+" "+this.getY();
            }
 


            

        }

        
    }


}

