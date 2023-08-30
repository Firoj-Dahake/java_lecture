import java.util.Scanner;

public class tex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       /* System.out.print("Enter your income in lakhs :");
        float income=sc.nextFloat();
        float tax=0;
        if (income<=2.5){
            tax=tax+0;
            System.out.println(tax);
        }
        else if (income>=2.5 && income<=5.0) {
            tax=tax+0.05f*(income-2.5f);
            System.out.println(tax);
        }
        else if (income>5.0 && income<=10.0){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(income-5.0f);
            System.out.println(tax);
        }
        else if (income>10.0f){
            tax=tax+0.05f*(5.0f-2.5f);
            tax=tax+0.2f*(10.0f-5.0f);
            tax=tax+0.3f*(income-10.0f);
            System.out.println(tax);
        }*/

        // System.out.print("Enter Number of Day :");
       /* int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error in the input");
        }*/
        //leap year
        System.out.println("Enter the website name :");
        String website=sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organizational website");

        }else if(website.endsWith(".com")){
            System.out.println("This is an commertial website ");

        } else if (website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else if (website.endsWith(".edu")){
            System.out.println("This is an Educational website");
        }


    }
}
