import java.util.Scanner;

public class if_else_if {
    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        int age;
        age=sc.nextInt();
        System.out.println("Enter your age here : ");
        switch (age){
            case 1:
                System.out.println();*/
       //Question_2 find wheather the student is pass or fail
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your marks in Physics : ");
        float sub1= sc.nextFloat();
        System.out.print("Enter you marks in Math's :");
        float sub2= sc.nextFloat();
        System.out.print("Enter your marks in Cheminstry :");
        float sub3= sc.nextFloat();
        float total=(sub1+sub2+sub3);
        float per=total/3f;
        if (per>=40 && sub1>=33 && sub2>=33 && sub3>=33){
            System.out.print("Congratulation you have been promoted and overall percentage is :"+per+"%");
        }
        else {
            System.out.println("Result : Fail, You may try next time");
        }

    }

}
