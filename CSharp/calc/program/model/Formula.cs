

namespace calc.program.model
{

    public class Formula : ICloneable
    {


        private Double res;
        private Boolean isResSet;
        private Double num1;
        private Double num2;
        private Char znak;

        public Formula(String str)
        {
            this.isResSet = false;
            this.FromString(str);
        }
        public Formula(Formula from)
        {
            this.num1 = from.getX();
            this.num2 = from.getY();
            this.znak = from.getZnak();
            if (from.resultIsSet())
            {
                this.setResult(from.getResult());
            }
        }

        public void FromString(String str)
        {
            String num1 = "";
            String num2 = "";
            Char znac = ' ';
            Boolean flag1 = true;
            for (int i = 0; i < str.Length; i++)
            {
                if (str[i] != ' ')
                {
                    Char a = str[i];

                    if (flag1)
                    {
                        if (!Char.IsDigit(a) && num1.Length == 0)
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
                    else
                    {
                        num2 += a;
                    }
                }



            }

            this.num1 = Double.Parse(num1);
            this.num2 = Double.Parse(num2);
            this.znak = znac;

        }

        public Double getX()
        {
            return this.num1;
        }
        public Double getY()
        {
            return this.num2;
        }
        public Char getZnak()
        {
            return this.znak;
        }
        public Double getResult()
        {
            return this.res;
        }
        public Boolean resultIsSet()
        {
            return this.isResSet;
        }

        public void setResult(Double number)
        {
            this.res = number;
            this.isResSet = true;
        }
        public Formula copy()
        {
            return (Formula)this.Clone();
        }
        public object Clone()
        {
            return new Formula(this);
        }

        public String toString()
        {

            return this.getX() + " " + this.getZnak() + " " + this.getY() + (this.isResSet ? (" = " + this.getResult()) : "");

        }


    }


}

