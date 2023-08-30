import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class selfbroblem {
    public static void main(String[] args) {
        //Question 01 : take input (lenghth and breadth) from the user and check wheather this is square or not
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Enter the value of Length");
        int length=sc.nextInt();
        System.out.println("Enter the value of Bradth");
        int breadth=sc.nextInt();
        if (length==breadth){
            System.out.println("This is the square");
        }
        else {
            System.out.println("This is rectangle");
        }*/

        //Question 02 : take 2 int value from user and print greatest amoung them
        /*int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b){
            System.out.println(" a is breater than b");
        }
        else {
            System.out.println("b is greater than a");
        }*/

        //Question 03 : a shop will give disvcount of 10% if the cost of purches quantity is more than
        // 1000 ask user for quantity supuse 1 unit will cost 100 judge and print total cost for user
        /*System.out.println("Enter the quantity");
        float quantity=sc.nextFloat();
              quantity=quantity*100;
        float discount=0;
        if(quantity>1000){
            discount=discount+0.1f*quantity;
            System.out.println("The total discount is"+discount+" and the total cost is --"+ (discount-quantity));
        }
        else {
            System.out.println("You have to much bill to get discount");
        }
*/
        //question 03 :Check Gread Based on marks as input
       /* System.out.print("Enter the Input as marks");
        int marks=sc.nextInt();

        if (marks<25){
            System.out.println("Result is fail");

        }else if(marks>=25 && marks<=45){
            System.out.println("Result is Gread : E");
        }
        else if(marks>45 && marks<=50){
            System.out.println("Result is Gread : D");
        }
        else if(marks>50 && marks<=60){
            System.out.println("Result is Gread: C");
        }
        else if(marks>60 && marks<=80){
            System.out.println("Result is Gread : B");
        }
        else if(marks >80){
            System.out.println("Result is Gread 1");
        }
        else {
            System.out.println("Invalid Entry ");
        }*/

        //qusetion 04 :take input of 3 person and check who is youngest and oldest
        /*System.out.println("Enter the Age of 1ts perseon ");
        int age1=sc.nextInt();
        System.out.println("Enter the Age of 2nd perseon ");
        int age2=sc.nextInt();
        System.out.println("Enter the Age of 3rd perseon ");
        int age3=sc.nextInt();
        if (age1>age2){
            if(age1>age3){
                System.out.println("1st person is oldest");
            }
            else{
                System.out.println("1st person is youngest");
            }
            else{
                if()
            }
        }*/

        //question 05 : take inpet of attendence of student and check whether student is elegiable for exam or not
        /*System.out.print("Entet the duaration of session :");
        float total=sc.nextFloat();
        System.out.print("Enter the Attendence of student : ");
        float attaidance =sc.nextFloat();

        float per=(attaidance*100)/total;
        if (per>75){
            System.out.println("Allow, Student to take exam and total attedence is "+per+"%");
        }
        else {
            System.out.println("Student is not allowed to take exam");
        }*/


        //question 06: to check wherter the given character is in upper or lower case
        System.out.println("// Checking for uppercase character or lower case  //");
                char value='K';
        System.out.println("The given character is  "+value);
        if (Character.isUpperCase(value)){
            System.out.println("The given character is in Upper Case");
        }
        else{
            System.out.println("The given character is Lower Case");
        }




    }
}
