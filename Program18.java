public class Program18 {

    public static void main (String[] args){

        int[][] arr = {
                {10,20,30},
                {20,40,80},
                {30,60,90}
        };

        for(int i=0; i< arr.length; i++){   //this equals to the row in our matrix.

            for(int j=0; j< arr.length; j++){   //this equals to the column in each row.

                System.out.print(arr[i][j] +" ");

            }
            System.out.println();   //change line on console as row comes to end in the matrix.

        }
    }

}


//logic
//1. i loop makes pointer points to first row i.e. i=0 condition true go to j loop
//2. j loop makes pointer points to first col of first roe i.e. j=0 condition true
//3. inside j loop, at first iteration array become arr[i][j] = arr[0][0] ---> insert 10 at first col
//4. j++ become 1, condition true array becomes arr[0][1] --> insert 20 at second col
//5. j++ become 2, condition true array becomes arr[0][2] --> insert 30 at second col
//6. j++ become 3, condition false out of j loop then pointer comes to next line because of println()
//7. i++ become 1, condition true go to j loop pointer points to 2nd row and 1st col
//8. arr[1][0] --> insert  20
//9. so on until array ends
