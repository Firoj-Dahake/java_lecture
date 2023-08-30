import java.util.Scanner;

public class practiceset {
    public static void main(String[] args) {
        //Question 01
     /*   float [] marks={45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum=0;
        for (float element:marks){
            sum=sum+element;
        }

        System.out.println("The value of sum is"+sum);*/


        //Question 02 is the element is present in the given array
        Scanner sc=new Scanner(System.in);
        /*int [] number={45,56,78,91,31,34};
        System.out.print("Ente the finding element :");
        int find=sc.nextInt();
       for (int i=0;i< number.length;i++){
           if (find==number[i]){
               System.out.println("The element is present in the array");
               break;
           }
           else{
               System.out.println("The element is not present in the array");
               break;
           }

       }*/

        //Question 03 find the sum of all marks
        /*float [] marks1={45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1=0;
        for (float element:marks1){
            sum1=sum1+element;
        }
        System.out.println("The  Average marks of Physics is :"+sum1/marks.length);
*/
        //Question 04
        int [][] mat1={{1,2,3},
                       {3,4,5}};
        int [][] mat2={{6,7,8},
                       {9,10,11}};
        int [][] result={{0,0,0},
                         {0,0,0}};
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j< mat1[1].length;j++){
                System.out.format("Setting value for i=%d and j=%d \n", i, j);
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        for (int i=0;i< mat1.length;i++){
            for (int j=0;j< mat1[1].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.print("\n");
        }



        //question 05
       /* int [] value={1,23,34,45,5,7,3,48};
        System.out.println("Array is in reverse order");
        for (int i=value.length-1;i>=0;i--){
            System.out.println(value[i]);
        }*/

        /*int [] index={200,201,202,203,204,205,206};
        for (int i= index.length-1;i>=0;i--){
            System.out.println(index[i]);
        }*/

    }
}
