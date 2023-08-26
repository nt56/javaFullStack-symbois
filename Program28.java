import java.util.Scanner;

public class Program28 {
    int areaOfSquare(int a){
        return  a * a;
    }
    int parameterOfSquare(int a){
        return 4 * a;
    }

    public static void main (String[] args){

        //user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int s = sc.nextInt();

        //object creation
        Program28 square = new Program28();

        //calling method
        System.out.println("Area Of Square : " +square.areaOfSquare(s));
        System.out.println("Parameter Of Square : " +square.parameterOfSquare(s));
    }

}
//WAP calculate area and parameter of Square
