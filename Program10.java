import java.util.Scanner;

public class Program10 {

   public static void main (String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter The Value Of Base : ");
       int b = sc.nextInt();
       System.out.print("Enter The Value Of Power : ");
       int p = sc.nextInt();

       int pow = 1;

       for(int i=1; i<=p; i++){
           pow = pow * b;
       }

       System.out.println("Power of " +b+ " is " +pow);

   }

}
////WAP for print the power of given number method-1

/*
    logic:
    b=5,p=3
    i<=p --> 1<=3 (true)
    pow=1*5 -->5
    i++

    i<=p --> 2<=3 (true)
    pow=5*5  -->25
    i++

    i<=p --> 3<=3 (true)
    pow=25*5  -->125
    i++

    4<=3 (false) --> exit
*/

import java.util.Scanner;

public class Program10 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Value Of Base : ");
        int b = sc.nextInt();
        System.out.print("Enter The Value Of Power : ");
        int p = sc.nextInt();

        int pow = 1;

        while(p > 0){
            pow = pow * b;
            p--;
        }

        System.out.println("Power of " +b+ " is " +pow);

    }

}
//WAP for print the power of given number method-2
