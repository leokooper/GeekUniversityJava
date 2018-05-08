import java.io.FileOutputStream;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileOutputStream out = null;
        try{
            out = new FileOutputStream("1.txt");
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                out.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
