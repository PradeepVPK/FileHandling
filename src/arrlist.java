import java.util.ArrayList;

public class arrlist {
    public static void main(String[] args) {
        ArrayList<String> narikootam = new ArrayList<String>();
        narikootam.add("Pradeep");
        narikootam.add("Prakash");
        narikootam.add("Sabari");
        narikootam.add("Sanjay");
        narikootam.add("Sanjeev");
        narikootam.add("Santhosh bro");
        narikootam.add("Sivasundar");

        System.out.println("Narikoottam Members");
     for (String i: narikootam) {
            System.out.println(i);
        }
    }
}
