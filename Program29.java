import java.util.Scanner;

public class Program29 {

    int a,b;
    Program29(){    //default constructor
        a = 5;
        b = 5;

        int sum = a + b;
        System.out.println("Addition Using Constructor : "+sum);
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
    }

    void display(){
        int result = a + b;
        System.out.println("Addition Using Method : "+result);
    }

    public static void main (String[] args){

        Program29 p29 = new Program29();
        p29.input();
        p29.display();

    }

}
//WAP to demonstrate a constructor and method
