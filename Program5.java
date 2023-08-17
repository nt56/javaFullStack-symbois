
import java.util.Scanner;
public class Program5 {
    static int sub(int a, int b){
        return a - b;
    }

    public static  void main (String[] args){

        Scanner sc = new Scanner(System.in);    //Scanner class object

        //Taking input from the user
        System.out.print("Enter num1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();

        //calling the function without the help of object
        System.out.println("Addition of two number is : " +sub(num1,num2));

    }

}

//If you want to call the function directly in main method we can use static keyword.
//With the help of 'static' keyword there is no need of creating the object.
