import sun.rmi.runtime.Log;


import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author valentin
 */

public class LogData {

    private String path = "";
    private boolean appendToFile = true;
    FileWriter writer;

    public LogData(String fileName, boolean append){
        //setup the parameters: file name/path and if overwrite
        this.appendToFile = append;
        this.path = System.getProperty("user.home") + "/" + fileName;
    }

    public void writeToFile (String lineToWrite) throws IOException {
        this.writer = new FileWriter(this.path,this.appendToFile);
        PrintWriter printLine = new PrintWriter(writer);
        printLine.printf("%s" + "%n",lineToWrite);
        printLine.close();
    }

    public void readFile () throws  IOException {
        File fileToRead = new File(this.path);
        Scanner sc = new Scanner(fileToRead);

        sc.useDelimiter("\t");
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
    }

}
