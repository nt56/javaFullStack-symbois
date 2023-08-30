import java.util.Scanner;

public class Program32 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name-1 : ");
        String s = sc.next();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);   //fetching every character in string
            System.out.println(ch);
        }

        int len = s.length();   //calculates the length
        System.out.println("Length of Name : " +len);

        String upper = s.toUpperCase();     //returns uppercase
        System.out.println("Name in Uppercase : " +upper);

        String lower = s.toLowerCase();     //returns lowercase
        System.out.println("Name in Uppercase : " +lower);

        System.out.println("Enter Name-2 : ");
        String s1 = sc.next();

        boolean equal = s.equals(s1);
        System.out.println(equal);

    }

}
//WAP to demonstrate string methods
