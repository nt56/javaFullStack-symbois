public class Program33 {

    int roll,age;
    String name;

    Program33(int r , int a , String n){
        roll=r;
        age=a;
        name=n;
    }

    void displayDetails(){
        System.out.println("Roll No : "+roll);
        System.out.println("Age : "+age);
        System.out.println("Name : "+name);
    }

    public static void main (String[] args){

        Program33 p1 = new Program33(1,20,"nagu");
        Program33 p2 = new Program33(2,18,"sagu");
        Program33 p3 = new Program33(3,23,"basu");

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

    }

}
//Print Student Details using parameterized constructor 
