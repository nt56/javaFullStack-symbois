import java.util.Scanner;

public class Program19 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i,j;

        System.out.print("Enter Row : ");
        int r = sc.nextInt();
        System.out.print("Enter Col : ");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];

        System.out.print("Enter Elements : ");

        for(i=0; i<r; i++){   //this equals to the row in our matrix.

            for(j=0; j<c; j++){   //this equals to the column in each row.

                arr[i][j] = sc.nextInt();
                System.out.print(arr[i][j] +" ");

            }
            System.out.println();   //change line on console as row comes to end in the matrix.

        }

    }

}
//WAP for print 2D array by User Input
