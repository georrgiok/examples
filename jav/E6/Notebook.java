package jav.E6;
import jav.Lib_folder.Lib;

public class Notebook { // class
    String brand; // pole
    String model;
    Double price;
    String os;
    Integer diagonal;
    Integer memory;
    Integer storage;
    String cpu;
    String gpu;
    String color;
    
    public Notebook(String brand, String model) {   //constructor
        this.brand = brand;
        this.model = model;
                


    }

    public void see() {
 
        String a = "notebook\n| ";
        if (this.brand!=null){
            a = a+this.brand+" | ";
        }
        if (this.model!=null){
            a+=this.model+" | ";
        }
        if (this.price!=null){
            a+= this.price+" | ";
        }
        if (this.os!=null){
            a+= this.os+" | ";
        }
        if (this.diagonal!=null){
            a+= this.diagonal+"\" | ";
        }
        if (this.memory!=null){
            a+= "RAM "+this.memory+" Gb | ";
        }if (this.storage!=null){
            a+= this.storage+" Gb | ";
        }if (this.cpu!=null){
            a+= this.cpu+" | ";
        }
        if (this.gpu!=null){
            a+= this.gpu+" | ";
        }
        if (this.color!=null){
            a+= this.color+" | ";
        }

        Lib.Write(a);
        
    }
    
}
