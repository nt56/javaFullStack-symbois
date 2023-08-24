import java.util.Scanner;

public class Program16 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements : ");
        int i,count=0;

        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter The Key You Want to Find: ");
        int key = sc.nextInt();

        for(i=0; i<size; i++){
            if(arr[i] == key){
                count ++;
            }
        }

        System.out.print(key+ " Occurs " +count+ " times");
    }

}
//WAP to calculate the frequency of an array element
//step-1 --> take an input and store all the elements in array using first for loop
//step-2 --> take an input key from user to find
//step-3 --> In second for loop check the current element is equal to the key
//step-4 --> If key match with current element increment the count until loop ends
//step-5 --> print msg
