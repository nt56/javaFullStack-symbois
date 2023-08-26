import java.util.Scanner;

public class Program25 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet : ");
        char ch = sc.next().charAt(0);

        //method-1
       switch (ch){

           case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
           default -> System.out.println("Not a Vowel");

       }


        //method-2
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel");
                break;
        }

    }

}
//WAP check whether character is vowel or not
