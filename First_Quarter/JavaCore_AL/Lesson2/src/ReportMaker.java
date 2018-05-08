import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ReportMaker {
    public static void makeReportPDF(String str, String path) throws IOException{
            PrintWriter pw = new PrintWriter("Z:/1.txt");
            pw.println(str);
            pw.close();

    }
}
