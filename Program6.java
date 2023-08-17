import java.util.Scanner;

public class Program6 {

    //area of circle
    double areaOfCircle(double r){
        return Math.PI * r * r;
    }

    //area of circumference
    static double areaOfCircumference(double r){
        return 2 * Math.PI * r;
    }

    public static  void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //with object
        Program6 p6 = new Program6();
        System.out.print("Enter Radios of circle : ");
        double r1 = sc.nextDouble();
        System.out.println("Area of Circle is : " +p6.areaOfCircle(r1));

        //without object
        System.out.println("Area of Circumference is : " +areaOfCircumference(r1));

    }

}
