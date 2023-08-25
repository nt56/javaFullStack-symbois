import java.util.Scanner;

public class Program20 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int i,j;

        //for Matrix -1
        System.out.print("Enter Row for M1 : ");
        int r1 = sc.nextInt();
        System.out.print("Enter Col for M1 : ");
        int c1 = sc.nextInt();
        int[][] M1 = new int[r1][c1];
        System.out.print("Enter Elements for M1: ");
        for(i=0; i<r1; i++){
            for(j=0; j<c1; j++){
                M1[i][j] = sc.nextInt();
                System.out.print(M1[i][j] +" ");
            }
            System.out.println();
        }

        //for Matrix -2
        System.out.print("Enter Row for M2 : ");
        int r2 = sc.nextInt();
        System.out.print("Enter Col for M2 : ");
        int c2 = sc.nextInt();
        int[][] M2 = new int[r1][c1];
        System.out.print("Enter Elements for M2: ");
        for(i=0; i<r2; i++){
            for(j=0; j<c2; j++){
                M2[i][j] = sc.nextInt();
                System.out.print(M2[i][j] +" ");
            }
            System.out.println();
        }

        //in Addition, of Matrix -1 and MMatrix-2
        System.out.println("Addition of two Matrix is : ");
        int[][] M3 = new int[r1][c1];
        for(i=0; i<r1; i++){
            for(j=0; j<c1; j++){
                M3[i][j] = M1[i][j] + M2[i][j];
                System.out.print(M3[i][j] +" ");
            }
            System.out.println();
        }
    }

}
//WAP for print addition of two matrix
