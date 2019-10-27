import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;

/**
 * @author valentin
 */

public class LogDataTest {

    @Test
    public void testWriteToFile() throws IOException {
        String lineToWrite = "";
        LogData test1 = new LogData("account_log.txt",true);
        String formatedDate = String.valueOf(new Date());

        formatedDate = formatedDate.substring(0,19);

        lineToWrite = "344AB" + "\t" + "34567" + "\t" + "Checking" + "\t" + "5.00" + "\t" + "12.00" + "\t" + formatedDate;

        test1.writeToFile(lineToWrite);
    }

    @Test
    public void testReadFile() throws IOException{
        LogData test1 = new LogData("account_log.txt",false);

        test1.readFile();
    }

}
