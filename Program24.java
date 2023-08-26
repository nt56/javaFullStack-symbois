import java.util.Scanner;

public class Program24 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Num-2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter Choice : ");
        char ch = sc.next().charAt(0);


        //Basic
       switch (ch){
           case '+':
               System.out.println("Addition Is : "+(n1+n2));
               break;

           case '-':
               System.out.println("Subtraction Is : "+(n1-n2));
               break;

           case '*':
               System.out.println("Multiplication Is : "+(n1*n2));
               break;

           case '/':
               System.out.println("Division Is : "+(n1/n2));
               break;

           default:
               System.out.println("Wrong Input");
               break;
       }

        //Advance
        switch (ch) {
            case '+' -> System.out.println("Addition Is : " + (n1 + n2));
            case '-' -> System.out.println("Subtraction Is : " + (n1 - n2));
            case '*' -> System.out.println("Multiplication Is : " + (n1 * n2));
            case '/' -> System.out.println("Division Is : " + (n1 / n2));
            default -> System.out.println("Wrong Input");
        }

    }

}
//WAP create a calculator using switch case
