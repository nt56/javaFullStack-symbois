
//Writing program for swapping the numbers without using the third variable
public class Program8 {

    public static void main(String[] args){

        int a = 20;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " +a+ "b : " +b);

    }

}


//Writing program for swapping the numbers using the third variable
import java.util.Scanner;
public class Program8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number-1 : ");
        int a = sc.nextInt();
        System.out.print("Enter Number-2 : ");
        int b = sc.nextInt();
        System.out.println("Before Swapping a : " +a+ "b : " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping a : " +a+ "b : " +b);

    }

}

/*
    logic:
    a=10,b=20
    temp=a --> temp=10
    a=b --> a=20
    b=temp --> b=10
*/
