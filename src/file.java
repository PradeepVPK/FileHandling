import java.io.File;

public class file {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\pradeep\\IdeaProjects\\brocode\\src\\helo.txt");

        if (f.exists()){
            System.out.println("file exists");
            System.out.println(f.getAbsolutePath());
            System.out.println(f.length());
        }
        else
            System.out.println("File not exists");
    }
}
