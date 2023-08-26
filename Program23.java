import java.util.Scanner;

public class Program23 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Light : ");
        char ch = sc.next().charAt(0);

        //Basic
       switch (ch){
           case 'r':
               System.out.println("Stop");
               break;

           case 'y':
               System.out.println("See");
               break;

           case 'g':
               System.out.println("Go");
               break;

           default:
               System.out.println("Wrong input");
               break;
       }

        //Advance
        switch (ch) {
            case 'r' -> System.out.println("Stop");
            case 'y' -> System.out.println("Get Ready");
            case 'g' -> System.out.println("Go");
            default -> System.out.println("Wrong input");
        }

    }

}
//WAP traffic light program using switch case
