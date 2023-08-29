import java.util.Scanner;

public class Program29 {

    int a=5,b=5,sum;

    Program29(){    //default constructor
        sum = a + b;
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = sc.nextInt();
        System.out.print("Enter b : ");
        b = sc.nextInt();
    }

    void display(){
        int sum = a + b;
        System.out.println("Addition : "+sum);
    }

    public static void main (String[] args){

        Program29 p29 = new Program29();
        p29.display();
        p29.input();
        p29.display();

    }

}
//WAP to demonstrate a constructor and method
