import java.util.Scanner;

public class Program31 {

    double len,brd,sqr,square,rect;

    Program31(double a, double b){
        len = a;
        brd = b;
    }

    Program31(double s){
        sqr = s;
    }

    void areaOfRectangle(){
        rect = len * brd;
        System.out.println("Area of Rectangle : "+rect);
    }

    void areaOfSquare(){
        square = sqr * sqr;
        System.out.println("Area of Square : "+square);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //for rectangle
        System.out.print("Enter Length : ");
        double len = sc.nextDouble();
        System.out.print("Enter Breadth : ");
        double brd = sc.nextDouble();
        Program31 p31 = new Program31(len,brd);
        p31.areaOfRectangle();

        //for square
        System.out.print("Enter Square : ");
        double sqr = sc.nextDouble();
        Program31 p32 = new Program31(sqr);
        p32.areaOfSquare();

    }

}
//WAP to calculate Area of rectangle and square using constructor
