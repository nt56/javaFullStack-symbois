import java.util.Scanner;

public class Program26 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n1 = sc.nextInt();

        //method-1
        switch (n1 % 2) {
            case 0 -> System.out.println("Even Number");
            case 1 -> System.out.println("Odd Number");
        }


        //method-2
       switch (n1%2){
           case 0:
               System.out.println("Even Number");
               break;

           case 1:
               System.out.println("Odd Number");
               break;

       }

    }

}
//WAP check whether number is odd or even using switch case
