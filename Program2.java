public class Program2 {

    public static void main(String[] args){

        short n1 = 123;
        short n2 = 321;

        if(n1 >= -1000 && n1 <= 1000 && n2 >= -1000 && n2 <= 1000){
            if(n1 > n2){
                System.out.println(n1 - n2);
            }
            else{
                System.out.println(n1 + n2);
            }
        }

    }

}
