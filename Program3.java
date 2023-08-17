import java.util.Scanner;

public class Program3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Breadth : ");
        short b = sc.nextShort();
        System.out.print("Enter Length : ");
        short l = sc.nextShort();

        if (l < 200 && b <= 100){
            System.out.println("Area of Rectangle is : " +l*b);
        }
        else{
            System.out.println("Numbers Out of range");
        }

    }

}
