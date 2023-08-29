import java.util.Scanner;

public class Program31 {

    int a,b;

    //parameterized constructor
    Program31(int x, int y){
        a = x;
        b = y;
    }

    void displaySum(){
        int sum = a + b;
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num-1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter Num-2 : ");
        int n2 = sc.nextInt();

        Program31 p31 = new Program31(n1,n2);
        p31.displaySum();

    }

}
//WAP for demonstrate parameterized constructor
