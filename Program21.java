import java.util.Scanner;

public class Program21 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i,j;

        System.out.print("Enter Row : ");
        int r = sc.nextInt();
        System.out.print("Enter Col : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        int[][] transpose = new int[r][c];

        System.out.print("Enter Elements : ");

        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("Transpose of given array is : ");
        for(i=0; i<r; i++){
            for(j=0; j<c; j++){
                transpose[i][j] = arr[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }

    }

}
//WAP for print Transpose of array means row to col and col to row
