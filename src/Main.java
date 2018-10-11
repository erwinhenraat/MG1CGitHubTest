import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String[] tegelMaten = new String[6];

        tegelMaten[0] = "10*10";
        tegelMaten[1] = "60*60";
        tegelMaten[2] = "80*80";
        tegelMaten[3] = "100*100";
        tegelMaten[4] = "200*40";
        tegelMaten[5] = "50*40";

        for(int i = 0; i < tegelMaten.length; i++){
            System.out.println(tegelMaten[i]);
        }

        int[] broekMaten = {32,30,28,26};

        for(int i = 0; i < broekMaten.length; i++){
            System.out.println(broekMaten[i]);
        }

        String naam = "";
        System.out.println(naam.isEmpty());
        if(naam.isEmpty()){
            System.out.println("vul je naam in");
            naam = s.next();
        }
        System.out.println(naam);
    }
}
