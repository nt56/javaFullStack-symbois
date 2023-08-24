import java.util.Scanner;

public class Program17 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Size : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter Elements : ");
        int i;

        for(i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter The Element You Want to Find: ");
        int ele = sc.nextInt();

        for(i=0; i<size; i++){
            if(arr[i] == ele){
                System.out.print("Element Found");
                break;
            }
        }

        if(i == size){
            System.out.print("Element Not Found");
        }
    }

}
//WAP to find the given element is available or not in an array using Linear Search
//logic
//step-1 --> take an input and store all the elements in array using first for loop
//step-2 --> take an input element from user to find
//step-3 --> In second for loop check the current element is equal to the entered element
//step-4 --> If Element match with current element then print msg and break
//step-5 --> If element not match traverse complete whole array and until element is equal to size of an array print msg
