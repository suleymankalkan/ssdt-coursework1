package ssdt.cw1;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void WriteOnTxtFile(String nameOfFile,String codeInFile)
    {
        try {
            FileWriter myObj = new FileWriter(nameOfFile+".txt");
            myObj.write(codeInFile);
            myObj.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}