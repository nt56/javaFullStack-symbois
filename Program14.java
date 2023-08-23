import java.util.Scanner;

public class Program14 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter The Elements : ");

        //this for loop is used for storing the array elements entered by the user
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        //this for loop is used for printing the array elements
        for(int i=arr.length-1; i>=0; i--){
            System.out.print( +arr[i] +" ");
        }

    }

}
//WAP for print the reverse of an array
