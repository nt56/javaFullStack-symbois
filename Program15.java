import java.util.Scanner;

public class Program15 {

   public static void main(String[] args){

       Scanner sc = new Scanner(System.in);

       System.out.print("Enter The Size : ");
       int size = sc.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter The Elements : ");

       int sum = 0;

       //this for loop is used for storing the array elements entered by the user
       for(int i=0; i<=arr.length-1; i++){
           arr[i] = sc.nextInt();
       }

       //This For loop is for calculating the sum
       for(int i=0; i<=arr.length-1; i++){
           sum = sum + arr[i];
       }

       //this for loop is used for printing the array elements
       for(int i=0; i<=arr.length-1; i++){
           System.out.print( +arr[i] +" ");
       }

       System.out.println();
       System.out.println("Printing the Sum Of Array Elements : " +sum);
   }

}
////WAP for print the array by user input --> method-1


import java.util.Scanner;

public class Program15 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter The Elements : ");

        int sum = 0;

        //this for loop is used for storing the array elements and calculating the sum
        for(int i=0; i<=arr.length-1; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        //this for loop is used for printing the array elements
        for(int i=0; i<=arr.length-1; i++){
            System.out.print( +arr[i] +" ");
        }

        System.out.println();
        System.out.println("Printing the Sum Of Array Elements : " +sum);
    }

}
//WAP for print the array by user input --> method-2
