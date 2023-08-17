
import java.util.Scanner;
public class Program4 {
    int add(int a, int b){
        return a + b;
    }

    public static  void main (String[] args){

        Scanner sc = new Scanner(System.in);    //Scanner class object

        Program4 p4 = new Program4();   //Object creation

        //Taking input from the user
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        //calling the function with the help of object
        System.out.println("Addition of two number is : " +p4.add(num1,num2));

    }

}
