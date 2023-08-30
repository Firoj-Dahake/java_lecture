public class array_application {
    public static void main(String[] args) {
        /* float [] marks1={99.99f,98.12f,78.52f,87.00f,67.98f}; //Float Array
        System.out.println(marks1.length);
        System.out.println(marks1[0]);*/

        //String [] student={"firoj","pankaj","pranay", "Rohan", "Rahul"}; //String array
        //System.out.println(student.length);
        //System.out.println(student[2]);

        int [] marks = {100,98,78,87,67}; // Array traversal
        System.out.println("Printing in reverse order");
        for (int i=marks.length-1;i>=0;i--){
            System.out.println(marks[i]+"and index is "+i);
        }

       /* //for-each-loop
        System.out.println("Printing the array using for-each-loop");
        for(int element:marks){
            System.out.println(element);
        }*/


    }
}
