import java.util.Scanner;

public class Program7 {

    static int check(int b2){
        if(b2 == 0){
            return 0;
        }
        else{
            return 1;
        }
    }

    static double division(double a1, double b1){
        return a1/b1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        if(check(b) == 1){
            System.out.println(division(a,b));
        }
        else{
            System.out.println("can't divide by zero");
        }

    }

}
