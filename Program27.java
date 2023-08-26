import java.util.Scanner;

public class Program27 {

    int a,b,sum;

    void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Num-1 : ");
        a = sc.nextInt();
        System.out.print("Enter Num-2 : ");
        b = sc.nextInt();
    }

    void setData(){
        sum = a + b;
        System.out.println("Addition is : "+sum);
    }

    public static void main(String[] args){
        Program27 add = new Program27();    //object creation

        //calling the method
        add.getData();
        add.setData();
    }

}
//Demonstration of class and object
