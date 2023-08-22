import java.util.Scanner;

public class Program12 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("enter Number of Rows You Want : ");
        int r = sc.nextInt();

        for(int i=1; i<=r; i++){    //for row

            for(int j=r; j>=i; j--){    //for printing *

                System.out.print("*");

            }

            System.out.println();   //for next line

        }

    }

}
//WAP for print the pattern in descending order
/*
    logic:
    r=3

    i<=r --> 1<=3 (true) --> go to the j loop
    j>=i --> 3>=1 (true) --> prints 1 star
    j<=i --> 2>=1 (true) --> prints 1 star
    j<=i --> 1>=1 (true) --> prints 1 star
    condition false come out of j
    comes to the next row

    i<=r --> 2<=3 (true) --> go to the j loop
    j<=i --> 3>=2 (true) --> prints 1 star
    j<=i --> 2>=2 (true) --> prints 1 star
    condition false come out of j
    comes to the next row

    i<=r --> 3<=3 (true) --> go to the j loop
    j<=i --> 3>=3 (true) --> prints 1 star
    condition false come out of j
    condition false come out of i
*/
