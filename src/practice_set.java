import java.lang.reflect.Array;
import java.util.Arrays;
public class practice_set {
    public static void main(String[] args) {
       /* int [] value={12,43,1,9,35,54};
        String [] lang={"python"
                         ,"c++"
                         ,"C",
                         "PHP",
                         "Java" };
        System.out.println("The given array is "+ Arrays.toString(value));//for loop
        Arrays.sort(value); //to sort array
        System.out.println("sorted Array value is" +Arrays.toString(value));
        System.out.println("The original array is "+Arrays.toString(lang));
        Arrays.sort(lang);
        System.out.println("the sorted array is "+Arrays.toString(lang));
*/
        /*int [] value={1,4,6,3,89,5,3};
        int sum=0;
        for(int i=0;i<7;i++){
            sum=sum+value[i];
        }
        System.out.println("The total sum of the array value is "+sum);*/

        //question 03
        /*int [][] value=new int [10][10];
        for (int i=0;i<10;i++){
            for (int j=0;j<10;j++){
                System.out.print(value[i][j]+" ");
            }
            System.out.println();
        }
*/
        //question 04
        /*int [] value={1,3,4,6,4,6};
        int find=6;
        boolean cond=false;
        for (int i:value){
            if (i==find){
                cond=true;
                break;

            }
        }
        if (cond){
            System.out.println("The value is present in the array ");
        }
        else {
            System.out.println("The value is not present in the array");
        }
*/
        /*int[] arrays = {12, 4, 35, 75, 4, 5, 76};
        int indexof = 12;
        for (int i = 0; i < arrays.length; i++) {
            if (indexof == arrays[i]) {
                System.out.println("The index is"+i);
                break;
            } else {
                System.out.println("the value is not present in the array");
                break;
            }
        }*/

        // Array practice_set problem_no:5
        /*int [] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l,2);
        int temp;

        for (int i=0; i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for (int j=0;j<l;j++){
            System.out.print(arr[j]+ " ");
        }*/

       /* int [] a={1,55,86,34,34,123,90,56,89};
        int max=Integer.MIN_VALUE;
        for (int e:a){
            if (e>max){
                max=e;
            }
        }
        System.out.println("The value of the max element in the array is"+max);*/

        //Problem_NO: 7
       /* int [] arr={15,3,5,45,67,1,76,45,23,12,12,123};
        int min=Integer.MAX_VALUE;
        for (int e:arr){
            if (e<min){
                min=e;
            }
        }
        System.out.println("The min value in the given array is "+ min);*/

        //problem_no:8
       /* boolean isSorted=true;
        int [] arr={1,23,45,23,12,43,76};
        for (int i=0;i<arr.length;i++){
            if (arr[i]>arr[i+1]){ //for assending order
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The aray is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }*/
        int [] arr={1,23,45,23,12,43,76};
        for (int i=0;i<arr.length;i++){
            if (arr[i]<arr[i+1]){
                System.out.println("The given array is sorted");
                break;
            }
            else if (arr[i]>arr[i+1]){
                System.out.println("The given array is not sorted");
                break;
            }
        }
    }
}

