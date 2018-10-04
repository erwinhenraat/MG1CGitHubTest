import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //statement
        int a;

        boolean rijbewijsBehaald =true;
        //Operator
        //Operation
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        //Conditional
        //if(){}else if(){}else{}

        if(a > 50){
            System.out.println("hallo");
        }else if(a == 5){
            System.out.println("hoi");
        }else if(a == 6){
            System.out.println("doei");
        }else if(a == 18){
            if(rijbewijsBehaald){
                System.out.println("gefeliciteerd met je rijbewijs");
            }

        }


    }
}
