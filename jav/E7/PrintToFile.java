import jav.Lib_folder.Lib;
public class PrintToFile implements Print{

    public String fileName;
    public PrintToFile(String fileName) {
        this.fileName=fileName;
    }

    public  void Print(String p) {


        Lib.WriteToFile("\n"+p, this.fileName, true);
        
    }
}

