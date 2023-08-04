import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileread {
    public static void main(String[] args) {
        try{
            FileReader FR = new FileReader("C:\\Users\\pradeep\\IdeaProjects\\brocode\\src\\helo.txt");
            int data=FR.read();
            while (data!=-1){
                System.out.print((char) data);
                data= FR.read();
            }
            FR.close();
        }
        catch (FileNotFoundException F){
            F.printStackTrace();
        }
        catch (IOException IO){
            IO.printStackTrace();
        }
    }
}
