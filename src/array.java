import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int [] marks=new int[5]; //declaration+memori-allocation //array is object
        Scanner sc=new Scanner(System.in);
        int [] marks; //declarization
        marks=new int[5]; //memori-allocation
        marks[0]=100;
        marks[1]=85;
        marks[2]=96;
        marks[3]=83;
        marks[4]=79;
        int [] marks={78,87,95,70,99};//Decleration+Memory-Allocation+Initialization
        System.out.println(marks[3]);
    }
}
