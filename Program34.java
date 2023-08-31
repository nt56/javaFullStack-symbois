import java.util.Scanner;

public class Program34 {

    public static  void main (String[] args){

        String s1 = new String();
        String s2 = new String();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String-1 : ");
        s1 = sc.next();
        System.out.print("Enter String-2 : ");
        s2 = sc.next();

//        if(s1.compareTo(s2) == 0){
//            System.out.println("Equal");
//        } else if (s1.compareTo(s2) > 0) {
//            System.out.println(s1+ " is Greater");
//        } else if (s1.compareTo(s2) < 0) {
//            System.out.println(s2+ " is Smaller");
//        }

        int result = s1.compareTo(s2);
        if (result == 0){
            System.out.println("Equal");
        } else if (result > 0) {
            System.out.println(s1+ " is Greater");
        } else {
            System.out.println(s2+ " is Greater");
        }

    }

}
//Demonstrate the compareTo() method
