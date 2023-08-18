
//Writing program for swapping the numbers without using the third variable
public class Program8 {

    public static void main(String[] args){

        int a = 20;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a : " +a+ "b : " +b);

    }

}
