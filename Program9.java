import java.util.Scanner;

public class Program9 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        int flag = 0;

        if (num < 0 && num == 1){
            System.out.println("Number must greater than 2");
        }
        else {
            for (int i=2; i<=num/2; i++){
                if (num % i == 0){
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 1){
            System.out.println(num+ " is not a prime number");
        }
        else{
            System.out.println(num+ " is a prime number");
        }

    }

}

//Check weather the given number is prime or not
//logic
/*
    user enter = 15
    15/2 --> 7 (i goes upto 2,3,4,5,6,7)
    15%2==0 --> false then increment by 1
    15%3==0 --> truew flag will be 1
    not a prime number

    user enter = 13
    13/2 --> 6 (i goes upto 2,3,4,5,6)
    13%2==0 --> false then increment by 1
    13%3==0 --> false then increment by 1
    13%4==0 --> false then increment by 1
    13%5==0 --> false then increment by 1
    13%6==0 --> false then increment by 1
    all conditions are false so flag is 0 i.e. prime number
*/
