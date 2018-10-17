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
        Scanner s = new Scanner(System.in);
        String name;
        /*
        = s.nextLine();

        while(!name.equals("Erwin Henraat")){
            System.out.println("Jij bent Erwin Niet!!!! ");
            name = s.nextLine();
        }

        System.out.println("Hoera Erwin is er!!!!");
*/
        do{
            System.out.println("vul je naam in zolang het maar Erwin Henraat is.");
            name = s.nextLine();
        }while(!name.equals("Erwin Henraat"));
        System.out.println("Hoera Erwin is er!!!!");

    }
}
