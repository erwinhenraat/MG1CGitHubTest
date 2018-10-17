import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Henk",
                "Kees",
                "Frits",
                "Hans",
                "Bertje"};


        //x aantal keer code uitvoert
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }

        for (String item : names){
            System.out.println(item);
        }


        //code uitvoert zolang iets waar is

    }
}
