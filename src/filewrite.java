import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\pradeep\\IdeaProjects\\brocode\\src\\helo.txt");
            writer.write(" broo");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
