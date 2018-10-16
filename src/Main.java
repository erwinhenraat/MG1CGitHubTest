import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //for loop
        //een aantal keer
        //Ik wil 10 x mijn naam invullen

        String[] names = {"Piet", "Klaas", "Jan", "Kees", "Barry", "Hendrik", "Annette", "Jaqueline", "Harry"};

/*
        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        for(String item : names){
            System.out.println(item);
        }
*/
        System.out.println("Wat is je naam? ");
        Scanner s = new Scanner(System.in);
        String name = s.next();

        for(int i = name.length()-1; i >= 0 ; i--){
            System.out.println("Hallo ");
            System.out.println(name.charAt(i));
        }



        while(!name.equals("Erwin")){
            System.out.println("je bent erwin niet,  vul je naam in");
            name = s.next();
        }

        System.out.println("Hoi Erwin");


        do{

        }while();



        //while loop
        //voorwaardelijk
        //ik wil mijn naam invullen zolang deze niet goed is ingevuld


    }
}
