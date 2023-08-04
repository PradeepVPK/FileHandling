import java.util.ArrayList;

public class arrlist2d {
    public static void main(String[] args) {
        ArrayList<String> goodboys= new ArrayList<String>();
        goodboys.add("Pradeep");
        goodboys.add("Sanjay pandi");

        ArrayList<String> kannilkaamam= new ArrayList<String>();
        kannilkaamam.add("Sivasundar");
        kannilkaamam.add("Prakash");

        ArrayList<String> agori= new ArrayList<String>();
        agori.add("Santhosh");


        ArrayList<String> littlelegs= new ArrayList<String>();
        littlelegs.add("Sabari");


        ArrayList<String> zip= new ArrayList<String>();
        zip.add("sanjeev");

        ArrayList<ArrayList<String>> Narikoottam = new ArrayList<>();
        Narikoottam.add(goodboys);
        Narikoottam.add(kannilkaamam);
        Narikoottam.add(agori);
        Narikoottam.add(littlelegs);
        Narikoottam.add(zip);

        for (ArrayList i:Narikoottam) {
            for (Object j:i.subList(0,i.size())
                 ) {
                System.out.println(j);

            }

        }
/*
        for (int i = 0; i <Narikoottam.size() ; i++) {
            for (int j = 0; j <Narikoottam.get(i).size() ; j++) {
                System.out.print(Narikoottam.get(i).get(j)+" ");
            }
            System.out.println();
        }

*/
    }
}
