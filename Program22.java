import java.util.Scanner;

public class Program22 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i,j;
        int sum1=0, sum2=0;

        System.out.print("Enter Row : ");
        int r = sc.nextInt();
        System.out.print("Enter Col : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.print("Enter Elements : ");

        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        for(i=0; i<r; i++){
            for(j=0; j<c; j++){

                //for diagonal
                if(i == j){
                    sum1 = sum1+arr[i][j];
                }

                //for anti-diagonal
                if(i+j == arr.length-1){
                    sum2 = sum2+arr[i][j];
                }

            }
        }

        System.out.println("Sum Of Diagonal : " +sum1);
        System.out.println("Sum Of Anti-Diagonal : "+sum2);

    }

}
//WAP for print 2D array by User Input
