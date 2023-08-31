import java.util.Scanner;

public class Program35 {

    int rem,n,rev;

    Program35(int num){
        n = num;

        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem ;
            n = n / 10;
        }
    }

    void displayReverse(){
        System.out.println("Reverse : " +rev);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Series of number : ");
        int num = sc.nextInt();

        Program35 p35 = new Program35(num);
        p35.displayReverse();

    }

}
